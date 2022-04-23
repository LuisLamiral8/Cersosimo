/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author info6
 */
public class empleado {
    private String nombre;
    private String dni;
    private String legajo;
    private int antiguedad;
    private int sueldo; 

    public empleado() {
        
    }

    public empleado(String nombre, String dni, String legajo, int antiguedad) {
        this.nombre = nombre;
        this.dni = dni;
        this.legajo = legajo;
        this.antiguedad = antiguedad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setLegajo(String legajo) {
        this.legajo = legajo;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public String getLegajo() {
        return legajo;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public int getSueldo() {
        return sueldo;
    }
    
   public float CalcularSueldo(int antiguedad){
       if (antiguedad >= 1 && antiguedad <= 5){
           sueldo = sueldo + sueldo * 5/100;
       }if(antiguedad>= 6 && antiguedad <= 10){
               sueldo = sueldo + sueldo * 10/100;
    
           }else{
           
           sueldo = sueldo + sueldo * 30/100;
   }
        return sueldo;

}

    @Override
    public String toString() {
        return "empleado{" + "nombre=" + nombre + ", dni=" + dni + ", legajo=" + legajo + ", antiguedad=" + antiguedad + ", sueldo=" + sueldo + '}';
    }
   
   
   
   
   
}