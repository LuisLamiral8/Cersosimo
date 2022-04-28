
package Postnet;

/**
 *
 * @author Luis Lamiral
 */
public class Principal {

    public static void main(String[] args) {
    
    Postnet posnet = new Postnet();
    Persona titular = new Persona("192.18.3.2","Jose","Perez","1234567","perez@gmail.com"); 
    TarjetaDeCredito tarjetadecredito = new TarjetaDeCredito("BBVA","5555",15000,EntidadFinanciera.VISA,titular);
    
        System.out.println(titular);
        System.out.println(tarjetadecredito);
        
        Ticket ticket = posnet.efectuarPago(tarjetadecredito,10000,5);
        
    }
    
}
