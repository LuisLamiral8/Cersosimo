/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package escueladb2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Info7
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DAO d = new DAO();
        Alumno alumno = new Alumno(4, "New", "New", 1, 5); 
        //Alumno alumno2 = new Alumno(4, "New", "New", 1, 1);
        //d.insert(alumno);
        //d.update(alumno2);
        //d.delete(alumno);
        System.out.println(d.listado());
        
        List<Alumno> lista = new ArrayList<>();
        
        lista= d.listado();
        
        for (Alumno alumno1 : lista) {
            System.out.println(alumno1.toString());
        }
        
       
       
        
        
        
    }
    
}
