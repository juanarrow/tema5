package ejercicio24;

public class App {
    

    public static void main(String[] args) {        
        System.out.println("""
            Este programa pinta una pirámide hecha a base de números.
            Por favor, introduzca la altura de la pirámide: 
            """);
        int altura = Integer.parseInt(System.console().readLine());
        int digitos = (""+altura).length();
        for(int fila=1; fila<=altura; fila++){
            for(int espacios=1; espacios<=(altura-fila);espacios++){
                System.out.printf("%"+digitos+"s","");
            }            
            for(int contador=1; contador<=fila;contador++){
                System.out.print(String.format("%"+((digitos-(""+contador).length())==0?"":(digitos-(""+contador).length()))+"s","")+contador);
            }
            for(int contador=fila-1;contador>=1;contador--){
                System.out.print(String.format("%"+((digitos-(""+contador).length())==0?"":(digitos-(""+contador).length()))+"s","")+contador);
            }
            System.out.println();
        }
    }
}
