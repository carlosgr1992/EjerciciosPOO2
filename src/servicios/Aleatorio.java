package servicios;

import java.util.Random;

public class Aleatorio {

    private static Random random = new Random();
    public static int generaAleatorioEnteroEntreDosNumeros(int num1, int num2){

        int aleatorio = random.nextInt(num2 - num1 + 1) + num1;
        return aleatorio;

    }
    public static double generaAleatorioEnteroEntreDosNumeros(double num1, double num2){

        double aleatorio = random.nextDouble(num2 - num1 + 1) + num1;
        return aleatorio;

    }

    public static double generaAleatorioReal(){

        double aleatorio = random.nextDouble(1,100);

        return aleatorio;
    }

    public static boolean generaAleatorioBooleano(){

        boolean booleano = random.nextBoolean();

        return booleano;
    }
}
