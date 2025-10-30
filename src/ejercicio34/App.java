package ejercicio34;

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
        System.out.print("Por favor, introduzca un número: ");
        String num1 = System.console().readLine();
        System.out.print("introduzca otro número: ");
        String num2 = System.console().readLine();

        int invertido1 = invertirNumero(num1);
        int inverdido2 = invertirNumero(num2);
        int aux1 = invertido1;
        int aux2 = inverdido2;
        int pares = 0;
        int impares = 0;
        while(aux1!=0 || aux2!=0){
            if(aux1!=0){
                int digito1 = aux1 % 10;
                if(digito1%2==0)
                    pares =pares*10+digito1;
                else
                    impares = impares*10+digito1;
            }
            if(aux2!=0){
                int digito2 = aux2 % 10;
                if(digito2%2==0)
                    pares =pares*10+digito2;
                else
                    impares = impares*10+digito2;
            }            
            aux1/=10;
            aux2/=10;
        }
        System.out.printf("El número formado por los dígitos pares es %d%n", pares);
        System.out.printf("El número formado por los dígitos impares es %d%n", impares);


    }
}
