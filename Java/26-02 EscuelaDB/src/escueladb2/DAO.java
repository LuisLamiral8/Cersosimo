/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package escueladb2;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Info7
 */
public class DAO {
    String sql = null;
    Connection cn = null;
    PreparedStatement ps;
    public DAO(){
        cn = getConexion();
    }

    private Connection getConexion() {
        String url = "jdbc:mysql://localhost:3306/db_alumnos";
        String user = "root";
        String password = "";
        
        try {    
            cn = DriverManager.getConnection(url, user, password);
            System.out.println("Conexion exitosa");
        } catch (SQLException ex) {
            System.out.println("Error de conexion: " + ex.toString());         
        }
        return cn;
    }
    public boolean insert(Alumno alumno){
        boolean ins = false;
        sql = "insert into alumno values(?, ?, ?, ?, ?)";
        try {
            ps = cn.prepareStatement(sql);
            ps.setInt(1, alumno.getId_alumno());
            ps.setString(2, alumno.getNombre());
            ps.setString(3, alumno.getApellidos());
            ps.setInt(4, alumno.getCurso());
            ps.setInt(5, alumno.getTitulacion());
            ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Error de registro: " + ex.toString());
        }
        return ins;
         
    }
    public boolean update(Alumno alumno){
        boolean upd = false;
        sql = "update alumno set apellidos=?, nombre=?, curso=?, titulacion=? where id_alumno=?";
        try {
            ps = cn.prepareStatement(sql);
            ps.setString(2, alumno.getNombre());
            ps.setString(1, alumno.getApellidos());
            ps.setInt(3, alumno.getCurso());
            ps.setInt(4, alumno.getTitulacion());
            ps.setInt(5, alumno.getId_alumno());
            ps.executeUpdate();
            
        } catch (SQLException ex) {
            System.out.println("Error de registro: " + ex.toString());
        }
        return upd;
    }
    public boolean delete(Alumno alumno){
        boolean del = false;
        sql ="delete from alumno where id_alumno=?";
        try {
            ps = cn.prepareStatement(sql);
            ps.setInt(1, alumno.getId_alumno());
            ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Error de registro: " + ex.toString());
        }
        return del;
    }
    public List listado() {
        List<Alumno> listAll = new ArrayList<>();
        Alumno alumno;
        sql = "select * from alumno";
        try {
            ps=cn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                alumno = new Alumno();
                alumno.setId_alumno(rs.getInt(1));
                alumno.setApellidos(rs.getString(2));
                alumno.setNombre(rs.getString(3));
                alumno.setCurso(rs.getInt(4));
                alumno.setTitulacion(rs.getInt(5));
                listAll.add(alumno);
            }
        } catch (SQLException ex) {
            System.out.println("Error de registro: " + ex.toString());
        }
        return listAll;
    }

}
