/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio6;

/**
 *
 * @author Info7
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Depto depto;
        
        DAO d = new DAO();
        depto = d.listado(40);
        System.out.println(depto);
        
    }
    
}
