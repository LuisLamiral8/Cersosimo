/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio10;

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

    public boolean modify(int SAL, int DEPTNO){
        boolean ins = false;
        sql = "update emp set SAL=SAL+? where DEPTNO=?;";
        try {
            ps = cn.prepareStatement(sql);
            ps.setInt(1, SAL);
            ps.setInt(2, DEPTNO);
            ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Error de registro: " + ex.toString());
        }
        return ins;
         
    }
}
