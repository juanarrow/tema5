package ejerciciosprevios;

public class dowhile {
    public static void main(String[] args) {
        System.out.println("Por favor, vaya introduciendo números y pulsando INTRO.");
        System.out.println("Para terminar, introduzca un número negativo.");
        int numeroIntroducido = 0;
        int cuentaNumeros = 0;
        int suma = 0;
        numeroIntroducido = Integer.parseInt(System.console().readLine());
        if(numeroIntroducido>=0){
            do{
                cuentaNumeros++; // Incrementa en uno la variable
                suma += numeroIntroducido; // Equivale a suma = suma + NumeroIntroducido
                numeroIntroducido = Integer.parseInt(System.console().readLine());
            }while(numeroIntroducido >= 0);
            System.out.println("Has introducido " + (cuentaNumeros) + " números positivos.");
            System.out.println("La suma total de ellos es " + (suma));
        }
        else
            System.out.println("No has introducido ningún número positivo");
        
        int i = 320;
        do{
            System.out.println(i);    
            i-=20;
        }while(i>=160);
    }
    
}
