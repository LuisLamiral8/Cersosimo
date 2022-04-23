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
public class BebidaAzucarada extends Bebidas {
    float PorcentajeAzucar;
    boolean Promo;

    public BebidaAzucarada(float PorcentajeAzucar, boolean Promo, String ID, float Cantidad, float Precio, String Marca) {
        super(ID, Cantidad, Precio, Marca);
        this.PorcentajeAzucar = PorcentajeAzucar;
        this.Promo = Promo;
    }

    



   

    public float getPorcentajeAzucar() {
        return PorcentajeAzucar;
    }

    public void setPorcentajeAzucar(float PorcentajeAzucar) {
        this.PorcentajeAzucar = PorcentajeAzucar;
    }

    public boolean isPromo() {
        return Promo;
    }

    public void setPromo(boolean Promo) {
        this.Promo = Promo;
    }
    
    
}
