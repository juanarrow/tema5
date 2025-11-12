package ejercicio48;

public class App {

    public static boolean aparece(int digito, long numero){        
        boolean aparece = false;
        while(numero!=0 && !aparece){
            int resto = (int)(numero % 10);
            aparece = (resto == digito);
            numero /= 10;
        }
        return aparece;
    }
    public static void main(String[] args) {
        System.out.print("Introduzca un número entero: ");
        long numero = Long.parseLong(System.console().readLine());
        System.out.print("Dígitos que aparecen en el número: ");
        //bucle
        for(int i=0; i<=9;i++){
            //comprueba si está el dígito i en el número           
            if(aparece(i,numero))
                System.out.print(i+ " ");
        }
        System.out.println();
        System.out.print("Dígitos que no aparecen: ");        
        //bucle
        for(int i=0; i<=9;i++){
           if(!aparece(i, numero))
                System.out.print(i+ " ");

        }
    }
}
