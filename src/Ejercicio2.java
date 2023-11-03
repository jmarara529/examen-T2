import java.util.Scanner;

public class Ejercicio2 {
    public static double SumaNotas = 0;
    public static double ContarNotas = 0;
    public static int Aprobados = 0;
    public static int Suspensos = 0;
   // public static double Media = (SumaNotas / ContarNotas);

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int nota = 0;

        for (;nota != -1 ; ContarNotas++) {
            System.out.println("Introduce nota:");
            nota = entrada.nextInt();

            if (nota != -1) {
                SumaNotas += nota;

                if (nota < 5) {
                    Suspensos++;
                } else {
                    Aprobados++;
                }

            }
        }
        entrada.close();

        if (ContarNotas !=0) {

            System.out.println("La nota media es "+ (SumaNotas/ContarNotas) );
            System.out.println("Aprobados: "+ Aprobados +" - Suspensos: "+ Suspensos);

        }else {

            System.out.println("No se han introducido calificaciones.");

        }
    }
}
