package modelo;

import enumerados.Sexo;

import java.time.LocalDate;

public class Persona {

    private String nombre;
    private LocalDate fechaNacimiento;
    private DNI DNI;
    private Sexo sexo;
    private double peso;
    private double altura;

    public Persona(String nombre, LocalDate fechaNacimiento, DNI DNI, Sexo sexo, double peso, double altura) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.DNI = DNI;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public Persona(String nombre, LocalDate fechaNacimiento, Sexo sexo) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.sexo = sexo;
    }

    public Persona(String nombre, LocalDate fechaNacimiento, DNI DNI) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        setDNI(DNI);
    }

    public Persona() {
        this.nombre = "";
        this.fechaNacimiento = fechaNacimiento;
        this.DNI = new DNI();
        this.sexo = (sexo != null) ? sexo : Sexo.NS_NC;
        this.peso = 0;
        this.altura = 0;
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
        this.sexo = sexo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", DNI='" + DNI + '\'' +
                ", sexo=" + sexo +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }
}
