package servicios;

import java.util.Scanner;

public class Entrada {

    private static Scanner sc = new Scanner(System.in);

    public static int pideEntero(String mensaje){

        System.out.println(mensaje);
        int numero = Integer.parseInt(sc.nextLine());

        return numero;
    }

    public static double pideDouble(String mensaje){

        System.out.println(mensaje);
        double numero = Double.parseDouble(sc.nextLine());

        return numero;
    }

    public static String pideTexto(String mensaje){

        System.out.println(mensaje);
        String texto = sc.nextLine();

        return texto;
    }

}
