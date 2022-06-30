/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio7;

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

    public DAO() {
        cn = getConexion();
    }

    private Connection getConexion() {
        String url = "jdbc:mysql://localhost:3306/demodb";
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
     public boolean insert(Depto depto){
        boolean ins = false;
        sql = "update dept set DNAME=?, LOC=? where DEPTNO=?;";
        try {
            ps = cn.prepareStatement(sql);
            ps.setString(1, depto.getDNAME());
            ps.setString(2, depto.getLOC());
            ps.setInt(3, depto.getDEPTNO());
            ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Error de registro: " + ex.toString());
        }
        return ins;
         
    }
}
