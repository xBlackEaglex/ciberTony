/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tony;

import java.io.Console;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Iddot
 */
public class admin extends javax.swing.JFrame {

    conexion cc = new conexion();
    Connection cx = cc.conect();

    /**
     * Creates new form admin
     */
    
    
    int contador = 0;
    
    
    
    
    public admin() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.listaUsers.removeAllItems();

        try {

            Statement Sent = cx.createStatement();
            ResultSet rs = Sent.executeQuery("select * from users");

            while (rs.next()) {
                this.listaUsers.addItem(rs.getString("user"));

            }
            
            contador ++;

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Error en Lista " + e);

        }

    }

    //Inicio de variables
    public int checkVenta1 = 0;
    public int checkAlmacen1 = 0;
    public int checkRRHH1 = 0;
    public int checkProduccion1 = 0;
    
    public String seleccion = "";
    

    public void agregarPermisos() {

        if (checkVenta.isSelected()) {

            checkVenta1 = 1;

        } else {

            checkVenta1 = 0;

        }

        if (checkAlmacen.isSelected()) {

            checkAlmacen1 = 1;

        } else {

            checkAlmacen1 = 0;

        }

        if (checkRRHH.isSelected()) {

            checkRRHH1 = 1;

        } else {

            checkRRHH1 = 0;

        }

        if (checkProduccion.isSelected()) {

            checkProduccion1 = 1;

        } else {

            checkProduccion1 = 0;

        }

        String SQL = "insert into users (ventas,almacen,RRHH,produccion) value(?,?,?,?)";

        try {

            PreparedStatement pst = cx.prepareStatement(SQL);

            pst.setInt(1, checkVenta1);
            pst.setInt(2, checkAlmacen1);
            pst.setInt(3, checkRRHH1);
            pst.setInt(4, checkProduccion1);

            pst.executeUpdate();

            JOptionPane.showMessageDialog(null, "Registro exitoso");

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Error de registro" + e.getMessage());

        }

        
        
        
        
        
        
        
        
        /*    if (checkVenta1 == 1) {
            
           System.out.println("check ventas es 1");
            
        }
        
        
        else if (checkVenta1 == 0) {
            
            System.out.println("check ventas es 0");
            
        }
      
     
        
        
        
         */
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        checkAlmacen = new javax.swing.JCheckBox();
        checkRRHH = new javax.swing.JCheckBox();
        checkProduccion = new javax.swing.JCheckBox();
        checkVenta = new javax.swing.JCheckBox();
        listaUsers = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jTextArea1 = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        checkAlmacen.setText("Almacen");
        getContentPane().add(checkAlmacen, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 240, -1, -1));

        checkRRHH.setText("RRHH");
        getContentPane().add(checkRRHH, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 270, -1, -1));

        checkProduccion.setText("Producción");
        getContentPane().add(checkProduccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 300, -1, -1));

        checkVenta.setText("Ventas");
        checkVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkVentaActionPerformed(evt);
            }
        });
        getContentPane().add(checkVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 210, -1, -1));

        listaUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaUsersActionPerformed(evt);
            }
        });
        getContentPane().add(listaUsers, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 150, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Administración de Usuarios");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, -20, 550, 110));

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("1. Seleccione un usuario\n2. Seleccione los permisos\n3. de click en el botón Guardar");
        jTextArea1.setFocusable(false);
        getContentPane().add(jTextArea1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 220, 70));

        jButton2.setText("Nuevo Usuario");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 360, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/multimedia/flecha back.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/multimedia/flecha back big.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 100, 60));

        jButton3.setText("Guardar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 360, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/multimedia/fondo.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void listaUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaUsersActionPerformed

    
        
        
        seleccion = (String)listaUsers.getSelectedItem();
        
        System.out.println(seleccion);
        
        
        
        
        
        
        
        /*
        
        try {
            
            
            if (this.contador>0){

            Statement sent1 = cx.createStatement();
            ResultSet rs1 = sent1.executeQuery("select * from users where user = '"+this.listaUsers.getSelectedItem()+"' ");  
            rs1.next();
            seleccion = String.valueOf(rs1.getInt("user"));
            
            
            System.out.println(seleccion);
                    
            }
            
            
            
        } catch (Exception e) {
            
            
            JOptionPane.showMessageDialog(null, "Error de captura de lista" + e.getMessage());
            
            
        }
        
        
        
        */
        
        
        
        
        
        
        
        
        
        
        
        
        

        // documetado para arreglos  
        /*  if ("Admin".equals(listaUsers.getSelectedItem().toString())){

             checkVenta.setSelected(true);
             checkAlmacen.setSelected(true);
             checkRRHH.setSelected(true);
             checkProduccion.setSelected(true);

         }


        else if ("Alegria".equals(listaUsers.getSelectedItem().toString())){

             checkVenta.setSelected(true);
             checkAlmacen.setSelected(false);
             checkRRHH.setSelected(false);
             checkProduccion.setSelected(false);

         }
        
        
        else if ("Cecilia".equals(listaUsers.getSelectedItem().toString())){

             checkVenta.setSelected(false);
             checkAlmacen.setSelected(false);
             checkRRHH.setSelected(false);
             checkProduccion.setSelected(true);

         }


        else {

            checkVenta.setSelected(false);
            checkAlmacen.setSelected(false);
            checkRRHH.setSelected(false);
            checkProduccion.setSelected(false);

        }
     
        
        
         */

    }//GEN-LAST:event_listaUsersActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        this.dispose();

        nuevoUser ven2 = new nuevoUser();
        ven2.setVisible(true);


    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        this.dispose();

        menu ven4 = new menu();
        ven4.setVisible(true);


    }//GEN-LAST:event_jButton1ActionPerformed

    private void checkVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkVentaActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_checkVentaActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:

        agregarPermisos();


    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox checkAlmacen;
    private javax.swing.JCheckBox checkProduccion;
    private javax.swing.JCheckBox checkRRHH;
    private javax.swing.JCheckBox checkVenta;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JComboBox<String> listaUsers;
    // End of variables declaration//GEN-END:variables
}
