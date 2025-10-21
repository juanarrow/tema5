package ejerciciosprevios;

public class Bucles {
    public static void main(String[] args) {
        int i = 0;
        System.out.println("Con bucle for");
        for(i=1; i<=5; i++){
            System.out.println("Numero: " + i);
        }
        System.out.println("Con bucle while");
        i = 1;
        while(i<=5){
            System.out.println("Numero: " + i);
            i++;
        }
        System.out.println("Con bucle do while");
        i = 1;
        do{
            System.out.println("Numero: " + i);
            i++;  
        } while(i<=5);
        boolean valido = false;
        int numero = 0;
        do{
            System.out.println("Introduce un número: ");
            try{
                numero = Integer.parseInt(System.console().readLine());
                valido = true;
            }
            catch(NumberFormatException e){
                System.out.println("Debes introducir un número entero");
            }
            catch(Exception e){
                System.out.println("Lo siento ha ocurrido un error, intentalo denuevo");
            }
            
        } while(!valido);
        System.out.println("El número introducido es: "+numero);
        boolean salir = false;
        int opcion = 0;
        do{
            System.out.println("1. Opción 1");
            System.out.println("2. Opción 2");
            System.out.println("3. Opción 3");
            System.out.println("4. Salir");
            valido = false;
            
            do{
                System.out.println("Introduce una opción: ");
                try{
                    opcion = Integer.parseInt(System.console().readLine());
                    valido = true;
                }
                catch(NumberFormatException e){
                    System.out.println("Debes introducir una opción correcta: [1-3]");
                }
                catch(Exception e){
                    System.out.println("Lo siento ha ocurrido un error, intentalo denuevo");
                }
                
            } while(!valido);            
            switch(opcion){
                case 1->System.out.println("Has marcado la opción 1");
                case 2->System.out.println("Has marcado la opción 2");
                case 3->System.out.println("Has marcado la opción 3");
                case 4->salir = true;
                default->{}
            }

        }while(opcion != 4);
    }
}
