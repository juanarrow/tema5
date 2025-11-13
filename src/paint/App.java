package paint;

public class App {
    public static final String CLEAN_SCREEN = "\033[H\033[2J";    
    public static void main(String[] args) throws Exception{
        System.out.print("Introduzca el ancho del canvas: ");
        int ancho = Integer.parseInt(System.console().readLine());
        System.out.print("Introduzca el alto del canvas: ");
        int alto = Integer.parseInt(System.console().readLine());
        int x = ancho/2;
        int y = alto/2;
        int vx = 0;
        int vy = 0;
        boolean auto = false;
        boolean salir = false;
        do{ 
            for(int i=1; i<=alto;i++){
                for(int j=1;j<=ancho;j++){
                    if(i==1 || j==1 || i==alto || j==ancho)
                        System.out.print("*");
                    else if (i==y && j==x)
                        System.out.print("O");
                    else
                        System.out.print(" ");
                }
                System.out.println();
            }
            if(!auto){
                System.out.println("W. Arriba");
                System.out.println("A. Izquierda");
                System.out.println("S. Abajo");        
                System.out.println("D. Derecha");
                System.out.println("X. Automático");
                char opcion = System.console().readLine().toUpperCase().charAt(0);
                switch(opcion){
                    case 'W':
                        //Arriba
                        y = Math.max(2, y-1);
                        break;
                    case 'A':
                        //Izquierda                                
                        x= Math.max(2, x-1);
                        break;
                    case 'S':
                        //Abajo
                        y = Math.min(alto-1, y+1);
                        break;
                    case 'D':
                        //Derecha
                        x= Math.min(ancho-1, x+1);
                        break;
                    case 'X':
                        do{
                            vx = ((int)(Math.random()*2+1))*((int)(Math.random()*3-1));
                            vy = ((int)(Math.random()*2+1))*((int)(Math.random()*3-1));
                        }while(vx==0 || vy==0);
                        auto = true;
                        break;
                }    
            }
            else{
                x+=vx;
                y+=vy;
                if((x<=1 && vx<0) || (x>=ancho && vx>0)){
                    x=vx<0?2:ancho-1;
                    vx*=-1;
                }
                if((y<=1 && vy<0) || (y>=alto && vy>0)){
                    y=vy<0?2:alto-1;
                    vy*=-1;
                }
               
            }         
            Thread.sleep(10);

            System.out.print(CLEAN_SCREEN);
        }while(!salir);
            
    }
}