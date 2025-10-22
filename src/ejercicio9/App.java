package ejercicio9;

public class App {
    public static void main(String[] args) {        
        boolean correcto = false;
        int numero = 0;
        do{
            try {
                System.out.print("Introduzca un número entero y le diré cuántos dígitos tiene: ");    
                numero = Integer.parseInt(System.console().readLine());
                correcto = true;
            } catch (NumberFormatException e) {
                System.out.println("Debes introducir un número entero");
            } catch (Exception e) {
                System.out.println("Ocurrió un error inesperado");
            }            
        }while(!correcto);
        int digitos = 0;        
        int aux = numero;
        do{            
            aux = aux / 10;            
            digitos++;
        }while(aux != 0);
        System.out.printf("%d tiene %d digito/s.", numero, digitos);
    }
}
