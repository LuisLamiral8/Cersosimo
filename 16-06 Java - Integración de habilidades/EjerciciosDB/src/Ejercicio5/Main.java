
import Ejercicio5.DAO;
import Ejercicio5.Depto;
import java.util.ArrayList;
import java.util.List;

 
/*
/*
/*
/*
/*
package Ejercicio5;

/**
 *
 * @author Luis
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DAO d = new DAO();
        List<Depto> lista = new ArrayList<>();
        lista= d.listado();
        
        for (Depto depto1 : lista) {
            System.out.println(depto1.toString());
        }
    }
    
}
