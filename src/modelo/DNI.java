package modelo;

public class DNI {

    private int numeros;
    private char letra;

    public DNI(int numeros, char letra) {
        this.numeros = numeros;
        this.letra = letra;
    }

    public DNI() {
        this.numeros = 0;
        this.letra = ' ';
    }

    public void generaDNI(){

            this.numeros = Integer.parseInt(String.format("%08d",getNumeros()));
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
        return String.format("%08d", numeros);
    }

}
