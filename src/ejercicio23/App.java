package ejercicio23;

public class App {
    public static void main(String[] args) {
        System.out.println("""
            Por favor, vaya introduciendo números.
            El programa terminará cuando la suma de los números sea mayor que 10000.
            """);
        int suma = 0;
        int cantidad = 0;
        do{
            int numero = Integer.parseInt(System.console().readLine());
            suma += numero;
            cantidad++;
        }while(suma<=10000);
        System.out.printf("Ha introducido un total de %d números.%n", cantidad);
        System.out.printf("La suma total es %d.%n", suma);
        System.out.printf("La media es %.1f.%n", (double)suma/cantidad);


    }
}
