/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author info6
 */
public class principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        empleado e1 = new empleado();
        e1.setNombre("pepe");
        e1.setDni("123456");
        e1.setLegajo("1000");
        e1.setAntiguedad(7);
        e1.setSueldo(5000);
       
       // System.out.println(e1.getNombre());
        
       
       
       e1.CalcularSueldo(e1.getAntiguedad());
    
        System.out.println("empleado1:" + e1.getNombre() + " " + e1.getDni() + " " + e1.getLegajo() + " " + e1.getAntiguedad() + " " + e1.getSueldo());

    }
}
