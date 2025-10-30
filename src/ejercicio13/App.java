package ejercicio13;

public class App {
    public static void main(String[] args) {
        System.out.println("Por favor, introduzca 10 números enteros: ");
        int contadorPositivos = 0;
        int contadorNegativos = 0;
        for(int i=1; i<=10; i++){
            int numero = Integer.parseInt(System.console().readLine());
            contadorPositivos += (numero>=0)?1:0;
            contadorNegativos += (numero<0)?1:0;            
        }
        System.out.println("Ha introducido "+ contadorPositivos + " números positivos y "+ contadorNegativos + " números negativos.");        
    }   
}
