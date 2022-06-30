/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio7;

import Ejercicio4.*;
import Ejercicio1.*;

/**
 *
 * @author Info7
 */
public class Depto {
    int DEPTNO;
    String DNAME;
    String LOC;

    public Depto() {
    }

    public Depto(int DEPTNO, String DNAME, String LOC) {
        this.DEPTNO = DEPTNO;
        this.DNAME = DNAME;
        this.LOC = LOC;
    }

    public int getDEPTNO() {
        return DEPTNO;
    }

    public void setDEPTNO(int DEPTNO) {
        this.DEPTNO = DEPTNO;
    }

    public String getDNAME() {
        return DNAME;
    }

    public void setDNAME(String DNAME) {
        this.DNAME = DNAME;
    }

    public String getLOC() {
        return LOC;
    }

    public void setLOC(String LOC) {
        this.LOC = LOC;
    }

    @Override
    public String toString() {
        return "Depto{" + "DEPTNO=" + DEPTNO + ", DNAME=" + DNAME + ", LOC=" + LOC + '}';
    }
    
}
