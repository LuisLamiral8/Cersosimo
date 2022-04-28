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
public class Datos {

    Bebidas[][] estanteria;

    public Datos() {
        this.estanteria = new Bebidas[4][4];
    }

    public boolean agregarProducto(Bebidas b) {
        boolean agragado = false;

        for (Bebidas[] estanteria1 : estanteria) {
            for (int j = 0; j < estanteria.length; j++) {
                if (estanteria1[j] == null) {
                    estanteria1[j] = b;
                    agragado=true;
                }
            }
        }
        
        return agragado;

    }
    
     public boolean eliminarProducto(Bebidas b) {
        boolean eliminado = false;

        for (Bebidas[] estanteria1 : estanteria) {
            for (int j = 0; j < estanteria.length; j++) {
                if (estanteria1[j] != null) {
                    estanteria1[j] = null;
                    eliminado=true;
                }
            }
        }
        
        return eliminado;
        
    }
     public boolean calcularTotal(Bebidas b) {
        double total=0;
        boolean eliminado;
        eliminado = false;
        for (Bebidas[] estanteria1 : estanteria) {
            for (int j = 0; j < estanteria.length; j++) {
                if (estanteria1[j].Precio += total) {
                    estanteria1[j] = null;
                    eliminado = true;
                }
            }
        }
        
        return eliminado;
        
    }
    

}
