/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

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
    
    public List listado() {
        List<Depto> listAll = new ArrayList<>();
        Depto depto;
        sql = "select DEPTNO, DNAME from dept";
        try {
            ps = cn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                depto = new Depto();
                depto.setDEPTNO(rs.getInt(1));
                depto.setDNAME(rs.getString(2));
                listAll.add(depto);
            }
        } catch (SQLException ex) {
            System.out.println("Error de registro: " + ex.toString());
        }
        return listAll;
    }

}
