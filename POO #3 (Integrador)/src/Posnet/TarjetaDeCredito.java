/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Posnet;

public class TarjetaDeCredito {

   private String entidadBancaria;
   private String numeroTarjeta;
   private double saldo;
   public EntidadFinanciera entidadFinanciera;
   public Persona titular;
   
   public String getNombreCompleto(){
       return titular.getNombre()+titular.getApellido();
   }
   
    public TarjetaDeCredito(String entidadBancaria, String numeroTarjeta, double saldo, EntidadFinanciera entidadFinanciera, Persona titular) {
        this.entidadBancaria = entidadBancaria;
        this.numeroTarjeta = numeroTarjeta;
        this.saldo = saldo;
        this.entidadFinanciera = entidadFinanciera;
        this.titular = titular;
    }


    @Override
    public String toString() {
        return "TarjetaDeCredito{" + "entidadBancaria=" + entidadBancaria + ", numeroTarjeta=" + numeroTarjeta + ", saldo=" + saldo + ", entidadFinanciera=" + entidadFinanciera + ", titular=" + titular + '}';
    }

    public boolean tieneSaldoDisponible(double montoFinal) {
           return saldo >= montoFinal;
    }

    void Descontar(double montoFinal) {
            
    }
    
    void getNombreCompleto() {

    }

}
