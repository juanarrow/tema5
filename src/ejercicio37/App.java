package ejercicio37;

public class App {
    public static int digitos(long numero){        
        numero =Math.abs(numero);
        long aux = Long.parseLong(""+numero+"1");
        aux = Math.abs(aux);
        long invertido = 0;
        int digitos = 0;
        while(aux!=0){
            int digito = (int)(aux % 10);                    
            digitos++;
            invertido = (invertido * 10) + digito;
            aux /= 10;                        
        }
        digitos--;
        return digitos;
    }
    public static int digitos(int numero){        
        numero =Math.abs(numero);
        int aux = Integer.parseInt(""+numero+"1");
        aux = Math.abs(aux);
        int invertido = 0;
        int digitos = 0;
        while(aux!=0){
            int digito = aux % 10;                    
            digitos++;
            invertido = (invertido * 10) + digito;
            aux /= 10;                        
        }
        digitos--;
        return digitos;
    }
    public static int digitos(String numero){        
        if(numero.startsWith("-")){            
            numero = numero.substring(1);
        }        
        int aux = Integer.parseInt(""+numero+"1");
        aux = Math.abs(aux);
        int invertido = 0;
        int digitos = 0;
        while(aux!=0){
            int digito = aux % 10;                    
            digitos++;
            invertido = (invertido * 10) + digito;
            aux /= 10;                        
        }
        digitos--;
        return digitos;
    }
    
    public static int invertirNumero(String numero, boolean substractLastNumber){
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
        while(aux!=0){
            int digito = aux % 10;                    
            invertido = (invertido * 10) + digito;
            aux /= 10;                        
        }
        return negativo?-invertido/(substractLastNumber?10:1):invertido/(substractLastNumber?10:1);
    }
    
    public static void main(String[] args) {
        System.out.print("Por favor, introduzca un número entero positivo: ");
        long numero = Long.parseLong(System.console().readLine());

        int digitos = digitos(numero);
        System.out.printf("El %d en decimal es el ",numero);
        for(int i = 1; i<=digitos;i++){
            int digito = (int)(numero/Math.pow(10,digitos-i));
            String palotes = "";
            for(int j=1;j<=digito;j++)
                palotes+="|";
            System.out.printf("%s",palotes);
            numero %= Math.pow(10,digitos-i);
            if(i!=digitos)
                System.out.print("-");
        }
        
        
    }
}
