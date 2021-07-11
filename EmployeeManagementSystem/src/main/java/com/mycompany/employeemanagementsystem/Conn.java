/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.employeemanagementsystem;

/**
 *
 * @author dev
 */
import java.sql.*;

public class Conn {
    public Connection c;
    public Statement s;
    
    public Conn() {
        try {
            //Class.forName("com.sql.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost/project2","root","");
            s = c.createStatement();
            //String sqlQuery = "insert into login (username,password)" +
            //        "values ('admin','admin')";
            //s.executeUpdate(sqlQuery);
            //System.out.print("Built finally");
        } catch(Exception e) {
            e.printStackTrace();
        };
    }
}
