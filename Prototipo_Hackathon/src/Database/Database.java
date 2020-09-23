/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Administrador
 */
public class Database {
    private Connection conexion;
    private Statement st;
    private ResultSet rs;
    // TODO Database!!!
    public Connection DataBaseConnection(){
        if(conexion == null){
            String url = "jdbc:mysql://localhost/";
            String nombreDB = "hackathon";
            String driver = "com.mysql.jdbc.Driver";
            String user = "root";
            String pass = "";
            try{
                Class.forName(driver);
                this.conexion = (Connection)DriverManager.getConnection(url+nombreDB, user, pass);
                System.out.println("Conexión Exitosa!");
            }
            catch(ClassNotFoundException | SQLException sqle){       
                System.out.println("Conexión Fallida! primero arranque XAMPP");
                System.exit(0);
            }
        } 
        return conexion;
    }
    
    
}
