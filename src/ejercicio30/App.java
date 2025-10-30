package ejercicio30;
public class App {
    public static int solicitarDia(){
        int dia = 0;
        do{
                            
            dia = switch(System.console().readLine("  Día: ").toLowerCase()){
                case "1","lunes"->0;
                case "2","martes"->1;
                case "3","miércoles","miercoles"->2;
                case "4","jueves"->3;
                case "5","viernes"->4;
                case "6","sábado","sabado"->5;
                case "7","domingo"->6;
                default->-1;
            };                
            if(!(dia>=0 && dia<=6))
                System.out.println(" Día incorrecto. Introduzca un valor entre 1 y 7 o el nombre del día de la semana.");        
        }while(!(dia>=0 && dia<=6));
        return dia;
    }
    public static int solicitarHora(){
        int hora = 0;
        do{                
            hora = Integer.parseInt(System.console().readLine("  Hora: "));                
            if(!(hora>=0 && hora<=23))
                System.out.println(" Hora incorrecta. Introduzca un valor entre 0 y 23.");                
        }while(!(hora>=0 && hora<=23));
        return hora;
    }

    public static String diaSemana(int dia){
        return switch(dia){
            case 0->"lunes";
            case 1->"martes";
            case 2->"miércoles";
            case 3->"jueves";
            case 4->"viernes";
            case 5->"sábado";
            case 6->"domingo";
            default->"";
        };
    }
    public static void main(String[] args) {
        int dia1Int = 0;
        int hora1  = 0;        
        int dia2Int = 0;
        int hora2  = 0;        
        int horas1 = 0;
        int horas2 = 0;

        do{        
            System.out.println(" Por favor, introduzca la primera hora.");
            dia1Int = solicitarDia();            
            hora1 = solicitarHora();
            System.out.println(" Por favor, introduzca la segunda hora.");
            dia2Int = solicitarDia();            
            hora2 = solicitarHora();    
            horas1 = dia1Int*24 + hora1;
            horas2 = dia2Int*24 + hora2;                   
        }while(horas2 < horas1);
        
        System.out.printf("Entre las %d:00h del %s y las %d:00h del %s hay %d hora/s.%n",
            hora1, 
            diaSemana(dia1Int),
            hora2,
            diaSemana(dia2Int),
            horas2-horas1);
    }
}