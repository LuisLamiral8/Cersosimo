/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Posnet;

public class Posnet {

    public static final double RECARGO_POR_CUOTA = 0.03;
    public static final int MIN_CANT_CUOTA = 1 ;
    public static final int MAX_CANT_CUOTA = 6;
    private double montoAbonar;

    Ticket efectuarPago(TarjetaDeCredito tarjetadecredito, double montoAbonar, int cantCuotas) {
        Ticket ticket = null;
        
        if (validarDatos (tarjetadecredito, montoAbonar, cantCuotas)){
            double montoFinal = montoAbonar + recargoPorCuota(cantCuotas)*montoAbonar;
                if (tarjetadecredito.tieneSaldoDisponible(montoFinal)){
                tarjetadecredito.Descontar (montoFinal);
                }
            String NombreCompleto = tarjetadecredito.getNombreCompleto();
            
            double montoPorCuota = montoFinal/cantCuotas;
            ticket = new Ticket (NombreCompleto, montoFinal, montoPorCuota);
        }
        return ticket;
    }
        private boolean validarDatos(TarjetaDeCredito tarjetadecredito, double montoAbonar, int cantCuotas){
            
            boolean istarjetaValida = false;
            if(tarjetadecredito != null){
                istarjetaValida = true;
            }
            
            boolean ismontoAbonar = false;
            if(montoAbonar >= 0){
                ismontoAbonar = true;
            }
            boolean isCantCuota = false;
            if(cantCuotas >= MIN_CANT_CUOTA && cantCuotas <= MAX_CANT_CUOTA){
                isCantCuota = true;
            }
            
            return istarjetaValida && ismontoAbonar && isCantCuota;
            
        }

    private double recargoPorCuota(int cantCuotas) {
        return cantCuotas-1*RECARGO_POR_CUOTA;
    }
    } 