package ejercicio27;

public class App {

    public static int multiplicar(int a, int b){
        for(int i=1;i<b;i++){
            a+=a;
        }
        return a;
    }
    public static void main(String[] args) {
        System.out.print("Introduzca un número entero mayor que 1: ");
        int max = Integer.parseInt(System.console().readLine());
        int contador =0;
        int suma = 0;        
        int limite = (int)(Math.floor(max/3));
        for(int i = 1; i<=limite;i++){      
            int siguiente = i*3;
            suma+=siguiente;
            contador++;
            System.out.print(siguiente+" ");                        
        }
        System.out.println();
        System.out.printf("Desde 1 hasta %d hay %d múltiplos de %d y suman %d.", max, contador, 3, suma);
    }
}
