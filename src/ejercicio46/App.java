package ejercicio46;

public class App {
    public static void main(String[] args) {
        int ancho = Integer.parseInt(System.console().readLine("Por favor, introduzca la anchura del rectángulo (como mínimo 2): "));
        int altura = Integer.parseInt(System.console().readLine("Ahora introduzca la altura (como mínimo 2): "));
        if(ancho >=2 && altura>=2)
            for(int fila=1; fila<=altura; fila++){
                for(int columna = 1; columna<=ancho;columna++)
                    System.out.print((fila==1 || fila==altura || columna==1 || columna==ancho)?"* ":"  ");                
                System.out.println();
            }
        else
            System.out.print("Lo siento, los datos introducidos no son correctos, el valor mínimo para la anchura y la altura es 2.");                
    }
    
}
