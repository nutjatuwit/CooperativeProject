/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.Connection;  
import java.sql.DriverManager;  
import java.sql.ResultSet;  
import java.sql.Statement;  
/**
 *
 * @author NUT
 */
public class DatabaseConnection extends HttpServlet {
Connection conn;  
Statement stmt;  
ResultSet res; 
 public DatabaseConnection() {

    }
   
    public Connection setConnection() {
        try {
            System.out.println("access connection");
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbHosDemo", "root", "");
            
            System.out.println("Connected to the database");
        } catch (Exception e) {

        }
        return conn;
    }


    public ResultSet getResult(String sql, Connection conn) {
        this.conn = conn;
        try {
            stmt = conn.createStatement();
            res = stmt.executeQuery(sql);
            System.out.println(sql);
        } catch (Exception e) {

        }
        return res;
    }
}

