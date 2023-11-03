import java.util.Scanner;

public class Ejercicio3 {

    private final static String Relleno = "x";
    private final static String espcacio = " ";
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce un número impar mayor o igula a 1:");
        int num = entrada.nextInt();

        if (num % 2 != 0 && num >= 1){

            GenerarCruz(num);

        }else {

            System.out.println("Numero no valido");

        }

    }

    public static void GenerarCruz(int num) {
        if (num ==1){
            System.out.println(Relleno);
        }else {

            int mitad = num/2;

            for (int contador =0; contador < mitad; contador++){
                for (int contador2 =0;contador2 < mitad; contador2++){
                    System.out.print(espcacio);
                }
                System.out.println(Relleno);
            }

            for (int contador = 0; contador < num; contador++){
                System.out.print(Relleno);
            }
            System.out.print("\n");

            for (int contador =0; contador < mitad; contador++){
                for (int contador2 =0;contador2 < mitad; contador2++){
                    System.out.print(espcacio);
                }
                System.out.println(Relleno);
            }
        }
    }

}
