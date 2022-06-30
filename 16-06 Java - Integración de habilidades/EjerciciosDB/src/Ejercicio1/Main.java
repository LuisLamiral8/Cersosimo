/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio1;

import java.util.ArrayList;
import java.util.List;

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
        DAO d = new DAO();
        List<Depto> dep = new ArrayList<>();
        dep = d.listado();
        for (Depto depto : dep) {
            System.out.println(depto.toString());
        }

    }
}
