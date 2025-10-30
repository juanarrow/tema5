package ejercicio16;

public class App {
    public static void main(String[] args) {
        System.out.print("Introduzca un número entero y le diré si es primo: ");
        int numero = Integer.parseInt(System.console().readLine());
        boolean esPrimo = true;
        int divisor = 2;        
        while(esPrimo && divisor <= numero/2){
            if(numero % divisor == 0)
                esPrimo = false;
            divisor++;
        }        
        System.out.printf("El número introducido %d %ses primo.",
           numero, (esPrimo?"":"no "));

    }
}
