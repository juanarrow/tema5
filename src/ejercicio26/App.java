package ejercicio26;

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
        System.out.println("Introduzca un número entero: ");
        String numero = System.console().readLine();
        System.out.print("Introduzca un dígito: ");
        int buscar = Integer.parseInt(System.console().readLine());        
        //invierte el número
        int aux = invertirNumero(numero);        
        System.out.printf("Contando de izquierda a derecha, el %d aparece dentro de %s%n", buscar, numero);
        System.out.print("en las siguientes posiciones: ");
        int posicion = 0;
        while(aux!=0){
            int digito = aux % 10;
            posicion++;
            if(digito == buscar)
                System.out.print(posicion+" ");
            aux/=10;
        }        
    }
}