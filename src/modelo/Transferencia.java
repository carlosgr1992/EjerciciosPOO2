package modelo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Transferencia {

    private Cuenta cuentaOrigen;
    private Cuenta cuentaDestino;
    private double cantidad;
    private LocalDate fechaTransferencia;
    private DateTimeFormatter FORMATO = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Transferencia(Cuenta cuentaOrigen, Cuenta cuentaDestino, double cantidad) {
        this.cuentaOrigen = cuentaOrigen;
        this.cuentaDestino = cuentaDestino;
        this.cantidad = cantidad;
        this.fechaTransferencia = LocalDate.now();
    }

    public String realizarTransferencia(){
        String texto;
        if(cuentaOrigen.retirar(cantidad)){
            cuentaDestino.ingresar(cantidad);
            texto = String.format("%s Ha hecho una transferencia de %.2f euros a %s el día %s",cuentaOrigen.getTitular().getNombre(),cantidad,cuentaDestino.getTitular().getNombre(),fechaTransferencia.format(FORMATO));
        }else  texto = "Imposible realizar la transferencia.";
        return texto;
    }


}
