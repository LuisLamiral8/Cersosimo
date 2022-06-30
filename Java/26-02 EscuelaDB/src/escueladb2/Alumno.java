/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package escueladb2;

/**
 *
 * @author Info7
 */
public class Alumno {
    int id_alumno;
    String apellidos;
    String nombre;
    int curso;
    int titulacion;

    public Alumno() {
    }
    public Alumno(int id_alumno, String apellidos, String nombre, int curso, int titulacion) {
        this.id_alumno = id_alumno;
        this.apellidos = apellidos;
        this.nombre = nombre;
        this.curso = curso;
        this.titulacion = titulacion;
    }

    public int getId_alumno() {
        return id_alumno;
    }

    public void setId_alumno(int id_alumno) {
        this.id_alumno = id_alumno;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCurso() {
        return curso;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }

    public int getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(int titulacion) {
        this.titulacion = titulacion;
    }

    @Override
    public String toString() {
        return "Alumno{" + "id_alumno=" + id_alumno + ", apellidos=" + apellidos + ", nombre=" + nombre + ", curso=" + curso + ", titulacion=" + titulacion + '}';
    }
    
    
}
