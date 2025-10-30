package ejercicio17;

public class App {
    public static void main(String[] args) {
        System.out.println("Introduzca un número entero positivo: ");
        int numero = Integer.parseInt(System.console().readLine());
        int suma = numero;
        for (int i = 1; i <= numero; i++) {
            suma += numero + i;
        }
        System.out.printf("La suma de los 100 números siguientes a %d es %d.", numero, suma);
    }
}
