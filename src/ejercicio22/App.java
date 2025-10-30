package ejercicio22;
public class App {
    public static void main(String[] args) {
        System.out.println("Números primos entre 2 y 100: ");
        for(int i=2; i<=100; i++){
            boolean esPrimo = true;
            for(int j=2; esPrimo && j<=i/2;j++){
                if(i%j == 0)
                    esPrimo = false;
            }            
            System.out.print((esPrimo?i+" ":""));            
        }
    }
}
