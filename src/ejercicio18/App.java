package ejercicio18;

public class App {
    public static void main(String[] args) {
        System.out.print("Introduzca un número entero: ");
        int num1 = Integer.parseInt(System.console().readLine());
        System.out.println("Introduzca otro número entero distinto al anterior: ");
        int num2 = Integer.parseInt(System.console().readLine());
        if(num1 > num2){
            int aux = num1;
            num1 = num2;
            num2 = aux;
        }
        for(int i=num1; i<=num2; i+=7){
            System.out.print(i+" ");    
        }
    }
}
