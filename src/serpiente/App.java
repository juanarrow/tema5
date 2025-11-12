package serpiente;

public class App {
    public static final String CLEAN_SCREEN = "\033[H\033[2J";
    public static void main(String[] args) throws Exception{
        int desplazamiento = 10;
        int ultimaPosicion = desplazamiento;
        int altura = 10;
        do{
            for(int i=0;i<ultimaPosicion;i++){
                System.out.print(" ");
            }
            System.out.println("@");
            for(int i=1;i<=altura-1;i++){
                
                int posicion = Math.min(30,
                Math.max(0,ultimaPosicion+((int)(Math.round(Math.random()*2)))-1));
                for(int j=1;j<posicion;j++){
                    System.out.print(" ");
                }
                System.out.println("*");
                ultimaPosicion = posicion;
                
            }

            Thread.sleep(100);
            System.out.print(CLEAN_SCREEN);
        }while(true);
    }
    
}
