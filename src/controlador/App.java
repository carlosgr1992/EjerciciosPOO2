package controlador;

import enumerados.Sexo;
import modelo.DNI;
import modelo.Persona;

import java.time.LocalDate;

public class App {

    public static void main(String[] args) {

        DNI dniPersona = new DNI(8124,'C');
        Persona persona = new Persona("Carlos", LocalDate.of(1992,01,27),dniPersona );
        System.out.println(persona.toString());

    }

}
