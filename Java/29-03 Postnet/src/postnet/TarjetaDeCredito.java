
package Postnet;

/**
 *
 * @author Luis Lamiral
 */
public class TarjetaDeCredito {
    private final String EntidadBancaria;
    private final String numeroTarjeta;
    private final double Saldo;
    public EntidadFinanciera entidadFinanciera;
    public Persona titular;
    public String getNombreCompleto(){
    return titular.getNombre()+ titular.getApellido();
    }
            
    public TarjetaDeCredito(String EntidadBancaria, String numeroTarjeta, double Saldo, EntidadFinanciera entidadFinanciera, Persona titular) {
        this.EntidadBancaria = EntidadBancaria;
        this.numeroTarjeta = numeroTarjeta;
        this.Saldo = Saldo;
        this.entidadFinanciera = entidadFinanciera;
        this.titular = titular;
    }

    @Override
    public String toString() {
        return "TarjetaDeCredito{" + "EntidadBancaria=" + EntidadBancaria + ", numeroTarjeta=" + numeroTarjeta + ", Saldo=" + Saldo + ", entidadFinanciera=" + entidadFinanciera + ", titular=" + titular + '}';
    }

    public boolean tieneSaldoDisponible(double montoFinal) {
        return Saldo>=montoFinal;
    }

    void Descontar(double montoFinal) {
        
    }


    
}
