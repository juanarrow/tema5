package ejerciciosprevios;

public class BuclesAnidados {
    public static void main(String[] args) {
        
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                System.out.printf("%d",(i==j)   || //diagonal izq 
                                              (i+j==9) || //diagonal dch
                                              (i==0)   || //lado sup
                                              (i==9)   || //lado inf
                                              (j==0)   || //lado izq
                                              (j==9)      //lado dch
                                              ?1:0);                
            }
            System.out.println();
        }
        final String BLANCO = "\033[47m";
        final String ROJO = "\033[41m";
        final String NEGRO = "\033[0m";
        System.out.println(NEGRO);        
        for(int i = 1;i<=10;i++){
            for(int j = 1; j<=10; j++){
                if(i==1 || i==10 || j==1 || j==10){
                    System.out.print(ROJO+"  "+NEGRO);
                }
                else{
                    
                    System.out.print(""+(((i+j)%2==0)?BLANCO:NEGRO)+"  ");
                }
                
            }
            System.out.println(NEGRO);
        }
    }
    
}
