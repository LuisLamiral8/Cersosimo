/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package almacen;

/**
 *
 * @author info6
 */
public class AguaMineral extends Bebidas {
    String Origen;

    public AguaMineral(String Origen, String ID, float Cantidad, float Precio, String Marca) {
        super(ID, Cantidad, Precio, Marca);
        this.Origen = Origen;
    }

   

    public String getOrigen() {
        return Origen;
    }

    public void setOrigen(String Origen) {
        this.Origen = Origen;
    }
    
}
