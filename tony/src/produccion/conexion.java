
package produccion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Alitza Cervantes
 */
public class conexion {
    Connection con;
    
    public Connection conect(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/logintony","root", "1234");
        }
        catch (ClassNotFoundException | SQLException e){
            System.out.print("error de conexion");
            JOptionPane.showMessageDialog(null, "Error de conexion" +e);
            
        }
        return con;
    }

    Statement createStatement() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
