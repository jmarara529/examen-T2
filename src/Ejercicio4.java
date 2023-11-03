import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {

        int anterior;
        int actual;
        int diferencia = 0;

        Scanner entrada = new Scanner(System.in);
        System.out.println("introduce el recorrido del ascensor:");
        actual = entrada.nextInt();
        while (actual != -1){
            anterior = actual;
            actual = entrada.nextInt();
            if (actual != -1) {
                if (actual != anterior) {
                    if (actual < anterior) {
                        for (int recorrido = 0; (recorrido + actual) <= anterior; recorrido++) {
                            diferencia += recorrido;
                        }
                    } else {

                        for (int recorrido = 0; (recorrido + anterior) <= actual; recorrido++) {
                            diferencia += recorrido;
                        }

                    }
                }
            }

        }

        System.out.println(diferencia);


    }

}
