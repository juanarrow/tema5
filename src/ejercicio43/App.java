package ejercicio43;

public class App {

    public static void main(String[] args) {
        System.out.print("Por favor, introduzca un número entero positivo: ");
        String numero = System.console().readLine();
        System.out.print("Introduzca la posición a partir de la cual quiere partir el número: ");
        int posicion = Integer.parseInt(System.console().readLine());
    
        boolean negativo = false;        
        if(numero.startsWith("-")){
            negativo = true;
            numero = numero.substring(1);
        }
        int aux = Integer.parseInt(""+numero+"1");        
        if(aux<0)
            negativo = true;
        aux = Math.abs(aux);
        int invertido = 0;
        int digitos = 0;
        while(aux!=0){
            digitos++;
            int digito = aux % 10;                    
            invertido = (invertido * 10) + digito;
            aux /= 10;                        
        }
        digitos--;
        invertido = negativo?-invertido:invertido;
        long primero = 0;
        long segundo = 0;
        if(digitos<2)
            System.out.print("Introduzca un número de al menos 2 digitos");
        else if(posicion > digitos)
            System.out.printf("Introduzca una posición entre 2 y %d", digitos);
        else{
            for(int i =1;i<=digitos;i++){
                int digito = invertido%10;
                if(i<posicion){
                    primero = primero*10+digito;
                }
                else{
                    segundo = segundo*10+digito;
                }
                invertido /=10;
            }
            System.out.printf("Los números partidos son el %d y el %d.", primero, segundo);

        }        
    }
    
}
