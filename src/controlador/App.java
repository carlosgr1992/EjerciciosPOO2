package controlador;

import enumerados.Sexo;
import modelo.DNI;
import modelo.Persona;

import java.time.LocalDate;

public class App {

    private static void ejercicio1(){

        DNI dniPersona = new DNI();
        Persona persona = new Persona("Carlos", LocalDate.of(2000,01,27),dniPersona );
        System.out.println(persona.toString());

        Persona prueba = new Persona("Juan",LocalDate.of(1990,05,20),new DNI("1000",'c'),Sexo.HOMBRE,77,1.78);
        //System.out.println(String.format("%.1f",prueba.calcularIMC()));
        //System.out.println(persona.getEdad());
        //System.out.println(persona.mayorEdad());
        DNI dniAleatorio = new DNI();
        int numeroDni = dniAleatorio.generaNumeroDniAleatorio();
        char letraDNI = dniAleatorio.generaLetraDni(numeroDni);
        //probando el crear un DNI aleatorio

        Persona prueba2 = new Persona("Jose",LocalDate.of(1990,05,20),new DNI(numeroDni,letraDNI),Sexo.HOMBRE,77,1.78);
        //System.out.println(prueba2.toString());

    }

    public static void main(String[] args) {

        ejercicio1();

    }

}
