package ejercicio28;

import java.math.BigDecimal;

public class App {
    public static void main(String[] args) {        
        System.out.print("Por favor, introduzca un número entero: ");
        int numero = Integer.parseInt(System.console().readLine());
        System.out.printf("%d! = ", numero);
        double factorial = 1;
        for(int i=2;i<=numero;i++)
            factorial *= i;        
        System.out.print(factorial);
    }
}
