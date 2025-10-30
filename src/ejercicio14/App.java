package ejercicio14;

public class App {
    public static void main(String[] args) {
        System.out.println("Cálculo de una potencia");
        System.out.print("Introduzca la base: ");
        int base = Integer.parseInt(System.console().readLine());
        System.out.print("Introduzca el exponente: ");
        int exponente = Integer.parseInt(System.console().readLine());
        int resultado = 1;
        if(exponente != 0)
            for(int i = 1; i <= Math.abs(exponente); i++)
                resultado *= base;
        
        System.out.printf(base+"^"+exponente+" = %.2f", 
        ((exponente>=0)?resultado:(1.0/resultado)));
    }
}
