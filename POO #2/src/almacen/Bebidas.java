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
abstract class Bebidas {
    String ID;
    float Cantidad;
    float Precio;
    String Marca;
    
    Bebidas(){};
    
    Bebidas(String ID, float Cantidad, float Precio, String Marca){
        this.ID=ID;
          this.Cantidad=Cantidad;
      this.Precio=Precio;
      this.Marca=Marca;
};

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public float getCantidad() {
        return Cantidad;
    }

    public void setCantidad(float Cantidad) {
        this.Cantidad = Cantidad;
    }

    public float getPrecio() {
        return Precio;
    }

    public void setPrecio(float Precio) {
        this.Precio = Precio;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }
   
}

