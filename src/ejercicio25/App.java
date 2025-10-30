package ejercicio25;

public class App {
    public static void main(String[] args) {
        System.out.println("Introduzca un número entero: ");
        String numero = System.console().readLine();
        boolean negativo = false;
        if(numero.startsWith("-")){
            negativo = true;
            numero = numero.substring(1);
        }
        int aux = Integer.parseInt("1"+numero);        
        if(aux<0)
            negativo = true;
        aux = Math.abs(aux);
        int invertido = 0;
        while(aux!=0){
            int digito = aux % 10;                    
            invertido = (invertido * 10) + digito;
            aux /= 10;                        
        }

        System.out.print((negativo)?-invertido/10:invertido/10);

    }
}
