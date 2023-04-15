/**
 * Classe que implementa o Trabalhar com Thread.
 * 
 * @author osmar
 */
public class Multiplicador implements Runnable {

    private int[] numeros;
    private int resultado;
    
    public Multiplicador(int[] numeros) {
        this.numeros = numeros;
    }
    
    public int getResultado(){
        return resultado;
    }

    @Override
    public void run() {
        resultado = 1;
        for (int i = 0; i < numeros.length; i++) {
            resultado = resultado * numeros[i];
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }        
        System.out.println("Thread " + Thread.currentThread().getName() + " resultado: " + resultado);
    }
}
