package modelo;

public class Cuenta {

    private Persona titular;
    private double saldo;

    public Cuenta(Persona titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public Cuenta(Persona titular) {
        this.titular = titular;
        this.saldo = 0;
    }

    public Persona getTitular() {
        return titular;
    }

    public void setTitular(Persona titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean ingresar(double cantidad){
        boolean ingreso;

        if(cantidad > 0){
            this.saldo += cantidad;
            ingreso = true;
        }else ingreso = false;

        return ingreso;
    }

    public boolean retirar(double cantidad){
        boolean retiro;

        if(cantidad <= saldo){
            this.saldo -= cantidad;
            retiro = true;
        }else retiro = false;

        return retiro;
    }

    public boolean retirar(double cantidad, double porcentaje){
        boolean retiro;

        if(cantidad * porcentaje / 100 <= saldo){
            this.saldo -= cantidad;
            retiro = true;
        }else retiro = false;

        return retiro;
    }

    @Override
    public String toString() {
        return "Cuenta: " +
                "titular=" + titular.getNombre() +
                ", saldo=" + saldo;
    }
}
