package serpiente;

public class App {
    public static final String CLEAN_SCREEN = "\033[H\033[2J";
    public static void main(String[] args) throws Exception{
        int desplazamiento = 10;
        int ultimaPosicion = desplazamiento;
        int altura = 30;
        long angulo = 0;
        long radio = 5;
        do{
            
            for(int i=1;i<ultimaPosicion;i++){
                System.out.print(" ");
            }
            System.out.println("@");
            for(int i=1;i<=altura-1;i++){
                
                int posicion = ultimaPosicion + (int)(radio*Math.sin(Math.toRadians(angulo)));
                for(int j=1;j<posicion;j++){
                    System.out.print(" ");
                }
                System.out.println("*");
                ultimaPosicion = posicion;
                angulo +=(360/(altura));
                
            }

            Thread.sleep(50);
            System.out.print(CLEAN_SCREEN);
        }while(true);
    }
    
}
