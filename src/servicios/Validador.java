package servicios;

public class Validador {

    public static boolean estaEntre(int numero,int min, int max){

        return numero >= min && numero <= max;
    }

    public static boolean estaEntre(double numero,double min, double max){

        return numero >= min && numero <= max;
    }

    public static boolean tieneContenido(String texto){

        return !texto.isBlank();

    }

    public static boolean esNumero(String texto){

        return texto.matches("^\\d+$");

    }

    public static boolean mayorQueCero(int numero){

        return numero > 0;
    }

}
