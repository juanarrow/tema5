package ejercicio47;

public class App {
    public static void main(String[] args) {
        final int ANCHO = 6;
        System.out.print("Por favor, introduzca la altura (número impar mayor o igual a 5): ");
        int altura = Integer.parseInt(System.console().readLine());
        if(altura >= 5 && altura%2!=0)
            for(int fila=1; fila<=altura; fila++){
                for(int columna=1; columna<=ANCHO; columna++)
                    System.out.print((fila==1 || fila==altura || fila == (altura/2)+1 || columna==1 || columna==ANCHO)?"M ":"  ");                                    
                System.out.println();
            }        
        else
            System.out.print("La altura introducida no es correcta.");        
    }
}
