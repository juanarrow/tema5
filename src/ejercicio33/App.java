package ejercicio33;

public class App {
    public static void main(String[] args) {
        int altura =0;
        do{
            System.out.print("Introduzca la altura de la U: ");
            altura = Integer.parseInt(System.console().readLine());
            if(altura<=2) System.out.println("Por favor introduzca una altura mayor que 2.");
    
        }while(altura <= 2);
        int base = altura -2;
        
        for(int i=1; i<=altura-1;i++)
            System.out.printf(" *%"+(base*2)+"s *%n","");
        System.out.print("  ");
        for(int i=1; i<=base;i++)
            System.out.print(" *");        
    }
}
