
/**
 * Programa principal.
 *
 * @author osmar
 */
public class Principal {

    public static void main(String args[]) {

        int[] numeros1 = {2, 4, 6};
        int[] numeros2 = {1, 3, 5};
        int[] numeros3 = {7, 8, 9};

        Multiplicador m1 = new Multiplicador(numeros1);
        Multiplicador m2 = new Multiplicador(numeros2);
        Multiplicador m3 = new Multiplicador(numeros3);

        Thread t1 = new Thread(m1);
        Thread t2 = new Thread(m2);
        Thread t3 = new Thread(m3);

        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join(); // espera a thread t1 concluir
            t2.join(); // espera a thread t2 concluir
            t3.join(); // espera a thread
        } catch (InterruptedException ie) {
            System.out.println("Excecao: " + ie.getMessage());
        }

        int resultadoFinal = m1.getResultado() * m2.getResultado() * m3.getResultado();
        System.out.println("Resultado Final: " + resultadoFinal);
    }
}
