package ejercicio15;

public class App {
    public static void main(String[] args) {
        System.out.print("Introduzca la base: ");
        int base = Integer.parseInt(System.console().readLine());
        System.out.print("Introduzca el exponente máximo: ");
        int exponente = Integer.parseInt(System.console().readLine());                
        for(int i = 1; i<=exponente; i++){
            double resultado = 1;            
            for(int j = 1; j <= i; j++)
                resultado *= base;
            System.out.printf(base+"^"+i+" = %.0f%n", resultado);
        }        
    }    
}
