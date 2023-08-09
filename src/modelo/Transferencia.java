package modelo;

import controlador.App;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Transferencia {

    private Cuenta cuentaOrigen;
    private Cuenta cuentaDestino;
    private double cantidad;
    private LocalDateTime fechaTransferencia;
    private DateTimeFormatter FORMATO = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Transferencia(Cuenta cuentaOrigen, Cuenta cuentaDestino, double cantidad) {
        this.cuentaOrigen = cuentaOrigen;
        this.cuentaDestino = cuentaDestino;
        this.cantidad = cantidad;
        this.fechaTransferencia = LocalDateTime.now();
    }

    public String realizarTransferencia(){
        String texto;
        if(cuentaOrigen.retirar(cantidad)){
            cuentaDestino.ingresar(cantidad);
            texto = String.format("\n%s Ha hecho una transferencia de %.2f euros a %s el día %s a las %s",cuentaOrigen.getTitular().getNombre(),cantidad,cuentaDestino.getTitular().getNombre(),fechaTransferencia.format(App.FORMATO_FECHA),fechaTransferencia.format(App.FORMATO_HORA));
        }else  texto = "Imposible realizar la transferencia.";
        return texto;
    }


}
