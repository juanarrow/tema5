package ejercicio20;

public class App {
    public static void main(String[] args) {
        
        System.out.print("Por favor, introduzca la altura de la pirámide: ");
        int altura = Integer.parseInt(System.console().readLine());
        System.out.println("Introduzca el carácter de relleno: ");
        char relleno = System.console().readLine().charAt(0);
        for(int i = 1; i <= altura; i++){
            //espacios altura - i espacios 5, 4, 3, 2, 1 espacios
            for(int j = 1; j<=altura-i; j++)
                System.out.print(" ");                
            // asterisco primero
            System.out.print(relleno);            
            for(int j = 1; j<=(2*i)-3;j++)                
                System.out.print((i!=altura)?" ":relleno);            
            // excepto la primera fila
            if(i!=1)
                //asterisco último
                System.out.print(relleno); 
            System.out.println();  
        }
    }
    
}
