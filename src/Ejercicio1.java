import java.util.Scanner;

public class Ejercicio1 {

    private static int minimo = 10;
    private static int maximo = 0;
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("introduce un numero superior a "+ minimo +" :");
        maximo = entrada.nextInt();

        if (maximo < minimo){

            System.out.println("el numero introducido es menor a " + minimo);

        } else {

            if (maximo % 2 == 0) {
                NumPar();
            }else {
                NumInp();
            }
        }

    }

    private static void NumPar() {

        while (minimo <= maximo){

            System.out.println(minimo);

            minimo +=5;

        }

    }
    private static void NumInp() {

        while (minimo <= maximo){

            System.out.println(minimo);

            minimo += 3;
        }

    }

}
