package controlador;

import enumerados.Sexo;
import modelo.DNI;
import modelo.Persona;
import servicios.Entrada;
import servicios.Validador;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.HashMap;
import java.util.Map;

public class App {

    private static final int SALIR = 0;
    private static final int MIN_OPCION = 1;
    private static final int MAX_OPCION = 5;
    private static Map<DNI,Persona> diccionarioPersonas;
    public static DateTimeFormatter FORMATO = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private static void inicializar() {

        diccionarioPersonas = new HashMap<>();

        DNI dniPersona = new DNI();
        Persona persona = new Persona("Carlos", LocalDate.of(2000,01,27),dniPersona );
        Persona prueba = new Persona("Juan",LocalDate.of(1990,05,20),new DNI("1000",'c'),Sexo.HOMBRE,77,1.78);

        DNI dniAleatorio = new DNI();
        int numeroDni = dniAleatorio.generaNumeroDniAleatorio();
        char letraDNI = dniAleatorio.generaLetraDni(numeroDni);
        Persona prueba2 = new Persona("Jose",LocalDate.of(1990,05,20),new DNI(numeroDni,letraDNI),Sexo.HOMBRE,77,1.78);

        diccionarioPersonas.put(prueba.getDNI(),prueba);
        diccionarioPersonas.put(prueba2.getDNI(),prueba2);

    }

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

    private static void muestraMenu() {

        StringBuilder sb = new StringBuilder();
        sb.append("-----MENU-----\n");
        sb.append("1.Mostrar personas.\n");
        sb.append("2.Crear persona nueva con todos los datos.\n");
        sb.append("3.Crear persona con pocos datos.\n");
        sb.append("4.Modificar la altura sabiendo el DNI.\n");
        sb.append("5.Mostrar mayores de edad.\n");
        sb.append(String.format("%d.Salir de la app.",SALIR));

        System.out.println(sb.toString());

    }
    private static void gestionaMenu(int opcion) {

        switch (opcion){
            case 1 -> muestraPersonas();
            case 2 -> creaPersonaCompleto();
        }
    }

    private static void creaPersonaCompleto() {

        String nombre = Entrada.pideTexto("Introduce nombre:");
        try {
            String fechaStr = Entrada.pideTexto("Introduce fecha de nacimiento (dd-MM-yyyy):");
            LocalDate fecha = LocalDate.parse(fechaStr, FORMATO);

        int numeroDni = Entrada.pideEntero("Introduce un DNI (solo números)");
        String letraDni = Entrada.pideTexto("Introduce la letra del DNI");
        String sexo = Entrada.pideTexto("¿Hombre o mujer?");
        Sexo sexoPersona;
        if (sexo.equalsIgnoreCase("hombre")) {
            sexoPersona = Sexo.HOMBRE;
        } else sexoPersona = Sexo.MUJER;
        double peso = Entrada.pideDouble("Introduzca su peso");
        double altura = Entrada.pideDouble("Introduzca su altura en metros (Ej: 1.78)");
        DNI dniPersona = new DNI(numeroDni,letraDni.charAt(0));

        Persona personaNueva = new Persona(nombre,fecha,dniPersona,sexoPersona,peso,altura);

        diccionarioPersonas.put(personaNueva.getDNI(),personaNueva);

        }catch (DateTimeParseException ex){
            System.out.println("El formato introducido no es correcto.");
        }
    }

    private static void muestraPersonas() {

        diccionarioPersonas.forEach((dni, persona) -> {
            System.out.println(persona);
        });

    }

    private static void ejercicio2() {

        int opcion = 0;
        boolean esValido;

        do{
            muestraMenu();
            try {
                opcion = Entrada.pideEntero("Introduce una opción del menú:");
                esValido = Validador.estaEntre(opcion, MIN_OPCION, MAX_OPCION);
                if (!esValido) {
                    System.out.printf("Las opción debe estar entre el %d y el %d", MIN_OPCION, MAX_OPCION);
                }
                gestionaMenu(opcion);
            }catch (NumberFormatException ex){
                System.out.println("El valor introducido no es un número, inténtelo de nuevo");
            }

        }while(opcion != SALIR);

    }


    public static void main(String[] args) {

        inicializar();

        ejercicio1();
        ejercicio2();

    }



}
