/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio7;

/**
 *
 * @author Info7
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DAO d = new DAO();
        Depto depto = new Depto(40, "OPERATIONS", "BOSTON");
        Depto depto2 = new Depto(40, "Braaaaaasil", "Braaaasil");
        d.insert(depto);
        
    }
    
}
