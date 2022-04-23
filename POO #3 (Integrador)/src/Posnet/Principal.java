/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Posnet;

public class Principal {
    
    public static void main(String[] args) {

    Posnet posnet = new Posnet();
    Persona titular = new Persona ("192.168.3.2", "José", "Perez", "1234567", "perze@gmail.com");
    TarjetaDeCredito tarjetadecredito = new TarjetaDeCredito ("BBVA", "5555", 15000, EntidadFinanciera.MASTERCARD, titular);    
     
        System.out.println(titular);
        System.out.println(tarjetadecredito);
        
        Ticket ticket = posnet.efectuarPago(tarjetadecredito, 10000, 5);

    }
    
}
