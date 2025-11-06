package ejercicio35;

public class App {
    public static void main(String[] args) {
        int altura = 5;
        
        boolean rellena = true;
        boolean reloj = false;
        boolean rombo = true;
        boolean invertir = false;
        int fila = reloj?altura/2 + 1:(invertir)?altura:1;
        int paso = rombo?1:(reloj?-1:invertir?-1:1);
        for(int i=1; i<=altura;i++){
            for(int j=1;j<=((reloj||rombo)?(altura/2.0+1):altura)-fila;j++)
                System.out.print(" ");
            for(int j=1;j<=2*fila-1;j++)
                System.out.printf("%s", (j==1||j==2*fila-1 || rellena)?"*":" ");
            System.out.println();            
            if(i==Math.ceil((double)altura/2) && (reloj || rombo))
                paso = (rombo)?-1:1;
            fila+=paso;
        }
    }    
}
