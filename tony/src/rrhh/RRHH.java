
package rrhh;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

   
public class RRHH {
    public static void main(String[] args) {
        // TODO code application logic here
    }
   Connection Con=null;
    public Connection conect(){
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Con=DriverManager.getConnection("jdbc:mysql://localhost/logintony","root","1234");
           //JOptionPane.showMessageDialog(null,"conexion exitosa");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.print("error de conexion");
            JOptionPane.showMessageDialog(null,"error de conexion "+e);
        }
        return Con;
    }    // TODO code application logic here
    }
    

