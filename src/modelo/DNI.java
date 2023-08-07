package modelo;

import servicios.Aleatorio;

public class DNI {

    private int numeros;
    private char letra;

    public DNI(String numerosStr, char letra) {
        int numeros = Integer.parseInt(numerosStr);
        setNumeros(numeros);
        this.letra = letra;
    }

    public DNI(int numeros, char letra) {
        this.numeros = numeros;
        this.letra = letra;
    }

    public DNI() {
        this.numeros = 0;
        this.letra = ' ';
    }

    public char generaLetraDni(int numeros) {

        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        int indice = numeros % 23;
        return letras.charAt(indice);
    }

    public int generaNumeroDniAleatorio(){

        return Aleatorio.generaAleatorioEnteroEntreDosNumeros(1, 99999999);
    }


    public void generaDNI(){

        if(numeros == 0){
            letra = ' '; //Una validación redundante por si en vez de entrar por el constructor de DNI entra por el setDNI de Persona, el ejercicio dice que lo quite, pero yo he preferido meterle esta validación extra para que no pueda modificar el dato mas de lo que yo le permita
        }
            this.numeros = Integer.parseInt(String.format("%08d",getNumeros()));
    }
    public char generaDNI(int numeros){

        if(numeros == 0){
            letra = ' '; //Una validación redundante por si en vez de entrar por el constructor de DNI entra por el setDNI de Persona, el ejercicio dice que lo quite, pero yo he preferido meterle esta validación extra para que no pueda modificar el dato mas de lo que yo le permita
        }
        char letra = generaLetraDni(numeros);

        return letra;
    }

    public int getNumeros() {
        return numeros;
    }

    public void setNumeros(int numeros) {

        this.numeros = numeros;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    @Override
    public String toString() {
        return String.format("%08d%s", numeros, Character.toString(letra).toUpperCase());
    }

}
