/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tony;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author rober
 */





public class index extends javax.swing.JFrame {

    
    conexion cc = new conexion();
    Connection cx = cc.conect(); 
    
    
    
    
    
    /**
     * Creates new form index
     */
    public index() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        
    }

    
    
    
    
    
    
    
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtuser = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        bLogin = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(5, 240, 122));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel1.setText("Soluciones Digitales y Hardware");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 260, 30));
        getContentPane().add(txtuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, 170, -1));

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel2.setText("Usuario");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel3.setText("Contraseña");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, -1, -1));

        bLogin.setBackground(new java.awt.Color(123, 104, 238));
        bLogin.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        bLogin.setForeground(new java.awt.Color(255, 255, 255));
        bLogin.setText("Login");
        bLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bLoginActionPerformed(evt);
            }
        });
        getContentPane().add(bLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 360, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/multimedia/IsoLogo (1).jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 390, 170));
        getContentPane().add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 300, 170, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/multimedia/fondo.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bLoginActionPerformed
        
        
        validarUsuario();
        
        
        
        // se documento el siguiente codigo
        // es para inicio del sistema sin DB
        
        
        
        /*

        char clave[]=password.getPassword();

        String clavedef=new String(clave);

        if (txtuser.getText().equals("Admin") && clavedef.equals("nopuedomarta")){

            this.dispose();

            JOptionPane.showMessageDialog(null, "Bienvenido\n"
                + "Has ingresado satisfactoriamente al sistema",   "Mensaje de bienvenida",
                JOptionPane.INFORMATION_MESSAGE);

            menu ven = new menu();
            ven.setVisible(true);

        }

        else if (txtuser.getText().equals("Alegria") && clavedef.equals("mucharisa")){

            this.dispose();

            JOptionPane.showMessageDialog(null, "Bienvenido\n"
                + "Has ingresado satisfactoriamente al sistema",   "Mensaje de bienvenida",
                JOptionPane.INFORMATION_MESSAGE);

            menuventa ven2 = new menuventa();
            ven2.setVisible(true);

        }

        else {

            JOptionPane.showMessageDialog(null, "Acceso denegado:\n"
                + "Por favor ingrese un usuario y/o contraseña correctos", "Acceso denegado",
                JOptionPane.ERROR_MESSAGE);

            txtuser.setText("");
            password.setText("");

        }

        
        
        */
        
        
        
    }//GEN-LAST:event_bLoginActionPerformed

    
    public void validarUsuario(){
    
        int resultado = 0;
        String pass1 = String.valueOf(password.getPassword());
        String user1 = txtuser.getText();
        String SQL = "select * from users where user='"+user1+"' and password='"+pass1+"' ";
        
        
        try {
            
            Statement st = cx.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            
            
            if (rs.next()) {
                
                resultado = 1;
                
                if (resultado==1) {
                    
                    menu ven = new menu();
                    ven.setVisible(true);
                    this.dispose();
                    
                }
                
            }
            
            
            else {
            
                JOptionPane.showMessageDialog(null, "Error de Acceso, Usuario o contraseña incorrectos");
            
            }
            
            
            
            
        } catch (Exception e) {
            
            
            JOptionPane.showMessageDialog(null, "Error de Inicio"+e.getMessage());
            
            
        }
    
    
    
    
    
    
    
    }
    
    
    
    
    
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new index().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField txtuser;
    // End of variables declaration//GEN-END:variables
}