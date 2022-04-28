/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package almacen;

/**
 *
 * @author Luis Lamiral
 */
public class AppAlmacen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Bebidas agua = new AguaMineral("Mendoza", "3", 2, 20, "Manaos");
        
        Datos estanteria = new Datos();
        
       if ( estanteria.agregarProducto(agua)){
           System.out.println("Producto Agregado");
       }else{
           System.out.println("No Agregado");
       }
       
       
        if (estanteria.eliminarProducto(agua)) {
            System.out.println("Producto Eliminado");
        } else { System.out.println("Producto NO Eliminado");}
    }
}