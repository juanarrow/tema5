package ejercicio52;

public class App {
    public static void main(String[] args) {
        System.out.print("Introduzca un número: ");
        long numero = Long.parseLong(System.console().readLine());
        long aux = numero*10+1;
        long volteado = 0;
        while(aux!=0){
            int digito = (int)(aux%10);
            volteado = volteado*10 +digito;
            aux/=10;
        }

        int ultimo = (int)(volteado % 10); // 1
        volteado /= 10;
        aux = volteado;
        volteado = 0;
        while(aux!=0){
            int digito = (int)(aux%10);
            volteado = volteado*10 +digito;
            aux/=10;
        }
        numero = (volteado/10)*10 + ultimo;
        System.out.printf("El número resultado es %d", numero);
       
    }
}
