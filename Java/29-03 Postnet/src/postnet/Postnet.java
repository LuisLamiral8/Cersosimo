package Postnet;
/**
 *
 * @author Luis Lamiral
 */
public class Postnet {    
    public static final double RECARGO_POR_CUOTA= 0.03;
    public static final int MIN_CANT_CUOTA=1;
    public static final int MAX_CANT_CUOTA=6;
    
            
    Ticket efectuarPago(TarjetaDeCredito tarjetadecredito, double montoAbonar, int cantCuotas) {
        Ticket ticket = null;
        
    if(validarDatos(tarjetadecredito, montoAbonar, cantCuotas)){
        double montoFinal= montoAbonar + recargoPorCuota(cantCuotas)* montoAbonar;
        if(tarjetadecredito.tieneSaldoDisponible(montoFinal)){
        tarjetadecredito.Descontar(montoFinal);
        
        String NombreCompleto = tarjetadecredito.getNombreCompleto();
        double montoPorCuota = montoFinal/cantCuotas;
        
        ticket = new Ticket(NombreCompleto, montoFinal, montoPorCuota);
        
        }
    }
           return ticket; }

    private boolean validarDatos(TarjetaDeCredito tarjetadecredito, double montoAbonar, int cantCuotas) {
        boolean isTarjetaValida = false;
        boolean ismontoAbonar = false;
        boolean iscantCuotas = false;
        
        if(tarjetadecredito != null){
        isTarjetaValida = true;
        }
        if(montoAbonar >= 0 ){
         ismontoAbonar = true;
        }
        
        if(cantCuotas >= MIN_CANT_CUOTA && cantCuotas <= MAX_CANT_CUOTA){
    iscantCuotas = true;
        }
        return isTarjetaValida && ismontoAbonar && iscantCuotas;
    }

    private double recargoPorCuota(int cantCuotas) {
            return cantCuotas-1*RECARGO_POR_CUOTA;

    }
    }