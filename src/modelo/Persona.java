package modelo;

import controlador.App;
import enumerados.Sexo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Persona {

    private String nombre;
    private LocalDate fechaNacimiento;
    private DNI DNI;
    private Sexo sexo;
    private double peso;
    private double altura;

    private static final String NOMBRE_DEFECTO = "Sin nombre";

    public Persona(String nombre, LocalDate fechaNacimiento, DNI DNI, Sexo sexo, double peso, double altura) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        setDNI(DNI);
        setSexo(sexo);
        this.peso = peso;
        this.altura = altura;
    }

    public Persona(String nombre, LocalDate fechaNacimiento, Sexo sexo) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        setSexo(sexo);
        this.DNI = new DNI();
    }

    public Persona(String nombre, LocalDate fechaNacimiento, DNI DNI) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        setDNI(DNI);
        setSexo(sexo);
    }

    public Persona() {
        this.nombre = NOMBRE_DEFECTO;
        this.fechaNacimiento = fechaNacimiento;
        this.DNI = new DNI();
        setSexo(sexo);
        this.peso = 0;
        this.altura = 0;
    }

    public double calcularIMC(){

        return getPeso() / (getAltura() * getAltura());

    }

    public boolean mayorEdad(){

        return getEdad() >= 18;

    }

    public int getEdad(){

        return (int) ChronoUnit.YEARS.between(fechaNacimiento,LocalDate.now());

    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public DNI getDNI() {
        return DNI;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setDNI(DNI DNI) {

            DNI.generaDNI();

        this.DNI = DNI;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = (sexo != null) ? sexo : Sexo.NS_NC;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        return sb.append(String.format("Nombre: %s \n Fecha de nacimiento: %s \n DNI: %s \n Sexo: %s \n Peso: %.2f \n Altura: %.2f ",
                nombre,fechaNacimiento.format(App.FORMATO),DNI,sexo,peso,altura)).toString();
    }

    public String toStringEdad() {
        StringBuilder sb = new StringBuilder();

        return sb.append(String.format("Nombre: %s \n Fecha de nacimiento: %s \n DNI: %s \n Sexo: %s \n Peso: %.2f \n Altura: %.2f \n Mayor de edad: %s \n",
                nombre,fechaNacimiento.format(App.FORMATO),DNI,sexo,peso,altura, mayorEdad() ? "Sí" : "No")).toString();
    }
}
