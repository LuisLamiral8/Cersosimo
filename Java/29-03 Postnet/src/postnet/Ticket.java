
package Postnet;

/**
 *
 * @author Luis Lamiral
 */
public class Ticket {
 private final String nombreApellido;
 private final double montoTotal;
 private final double montoPorCuota;

    public Ticket(String nombreApellido, double montoTotal, double montoPorCuota) {
        this.nombreApellido = nombreApellido;
        this.montoTotal = montoTotal;
        this.montoPorCuota = montoPorCuota;
    }
 
}
