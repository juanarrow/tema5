package ejercicio7;

public class App {
    public static void main(String[] args) {
        final int CLAVE_SECRETA = 8888;                
        int clave = 0;
        int reintentos = 0;
        do{
            try{
                clave = Integer.parseInt(System.console().readLine("Introduzca la clave de la caja fuerte: "));
                if(clave != CLAVE_SECRETA)
                    System.out.println("Clave Incorrecta"); 
                reintentos++;
            }
            catch(NumberFormatException e){
                System.out.println("Debes introducir un número");
            }
            catch(Exception e){
                System.out.println("Ha ocurrido un error inesperado, intenta denuevo");
            }            
        }while(clave!=CLAVE_SECRETA && reintentos < 4);
        if(reintentos>=4 && clave != CLAVE_SECRETA)
            System.out.println("Lo siento, ha agotado las 4 oportunidades.");
        else
            System.out.println("Ha abierto la caja fuerte.");
    }
}
