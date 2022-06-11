/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tony;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Iddot
 */
public class conexion {
    Connection con=null;
    public Connection conect(){
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/logintony","root","1234");
            // JOptionPane.showMessageDialog(null,"conexion exitosa");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.print("error de conexion");
            JOptionPane.showMessageDialog(null,"error de conexion "+e);
        }
        return con;
    }
}