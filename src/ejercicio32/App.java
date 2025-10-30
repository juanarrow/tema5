package ejercicio32;

public class App {
    public static int invertirNumero(String numero){
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
        return negativo?-invertido/10:invertido/10;
    }
    public static void main(String[] args) {
        System.out.print("Por favor, introduzca un número entero positivo: ");
        String numero = System.console().readLine();
        int invertido = invertirNumero(numero);
        int aux = invertido;
        int suma = 0;
        System.out.print("Dígitos pares: ");
        while(aux!=0){
            int digito = Math.abs(aux % 10);
            if(digito % 2 == 0){
                suma+=digito;
                System.out.print(digito+" ");
            }
            aux/=10;
        }
        System.out.println();
        System.out.printf("Suma de los dígitos pares: %d", suma);

        

    }
}
