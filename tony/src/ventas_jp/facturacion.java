/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventas_jp;

/**
 *
 * @author pauli
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement; 
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class facturacion extends javax.swing.JFrame {

    public void agregarFactura() {
    
    conexion cc = new conexion();
        Connection cx = cc.conect();
       
        String SQL = "insert into tabla_general (pno_nota,pcliente,pentrega,pcantidad,pdetalles,"
                + "cofolio,cocliente,coproductos,cono_piezas,cofecha,"
                + "pvcantidad,pvproducto,pvprecio,"
                + "fanombre,faapellidos,farfc,facfdi,fadomicilio,facorreo,"
                + "prclave,prdescripcion,prprecio,"
                + "seide,sedetalles,secosto, "
                + "clnombre,clapellidos,cldireccion,"
                + "ticliente,tiasunto,titecnico,tidescripcion,tiestado,tifechainicio,tifechafin) "
                + "value(0,'','',0,''  ,0,'','',0,'',  0,'',0,  ?,?,?,?,?,?,  '','',0,  0,'',0,  '','','',  '','','','','','','' )";
        
    /* debo poner todos los campos de la tabla para que no marque error, los varchar llevan solo las comillas y los int llevan un cero **/
        try {
            
            PreparedStatement pst=cx.prepareStatement(SQL);
            
            pst.setString(1, fanombree.getText()); 
            pst.setString(2, faapellidoss.getText());
            pst.setString(3, farfcc.getText());
            pst.setString(4, facfdii.getText());
            pst.setString(5, fadomicilioo.getText());
            pst.setString(6, facorreoo.getText());
            
            pst.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Registro exitoso");
            
        } catch (Exception e) {
            
            
            JOptionPane.showMessageDialog(null, "Error de registro"+e.getMessage());
            
        } 
    
    }
    
    
    /**
     * Creates new form facturacion
     */
    public facturacion() {
        initComponents();
        setLocationRelativeTo(null);
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
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        regresarfact = new javax.swing.JButton();
        registrarfact = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        facorreoo = new javax.swing.JTextField();
        fadomicilioo = new javax.swing.JTextField();
        facfdii = new javax.swing.JTextField();
        farfcc = new javax.swing.JTextField();
        faapellidoss = new javax.swing.JTextField();
        fanombree = new javax.swing.JTextField();

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setBackground(new java.awt.Color(123, 104, 238));
        jLabel5.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel5.setText("FACTURACION");
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(5, 240, 122)));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 240, 30));

        jButton1.setBackground(new java.awt.Color(123, 104, 238));
        jButton1.setText("CONSULTAR");
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 290, -1, -1));

        jButton2.setBackground(new java.awt.Color(123, 104, 238));
        jButton2.setText("REIMPRIMIR");
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 180, -1, -1));

        regresarfact.setBackground(new java.awt.Color(123, 104, 238));
        regresarfact.setIcon(new javax.swing.ImageIcon("C:\\Users\\pauli\\Documents\\ventas_jp actualizado\\ventas_jp\\ventas_jp\\src\\galeria\\salir.png")); // NOI18N
        regresarfact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarfactActionPerformed(evt);
            }
        });
        getContentPane().add(regresarfact, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        registrarfact.setBackground(new java.awt.Color(123, 104, 238));
        registrarfact.setText("REGISTRAR");
        registrarfact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarfactActionPerformed(evt);
            }
        });
        getContentPane().add(registrarfact, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 100, -1, -1));

        jLabel2.setText("NOMBRE");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        jLabel3.setText("APELLIDOS");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        jLabel4.setText("RFC");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));

        jLabel6.setText("CFDI");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, -1));

        jLabel7.setText("DOMICILIO");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, -1));

        jLabel8.setText("CORREO");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, -1, -1));
        getContentPane().add(facorreoo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, 250, -1));
        getContentPane().add(fadomicilioo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 250, -1));
        getContentPane().add(facfdii, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 250, -1));
        getContentPane().add(farfcc, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 250, -1));
        getContentPane().add(faapellidoss, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 250, -1));
        getContentPane().add(fanombree, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 250, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void regresarfactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarfactActionPerformed
        ventass newframe = new ventass();

        newframe.setVisible(true);

        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_regresarfactActionPerformed

    private void registrarfactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarfactActionPerformed
        agregarFactura(); 
        JOptionPane.showMessageDialog(null, "Registro exitoso"); 
        
        fanombree.setText(""); 
        faapellidoss.setText("");
        farfcc.setText("");
        facfdii.setText("");
        fadomicilioo.setText("");
        facorreoo.setText("");
        
    }//GEN-LAST:event_registrarfactActionPerformed

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
            java.util.logging.Logger.getLogger(facturacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(facturacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(facturacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(facturacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new facturacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField faapellidoss;
    private javax.swing.JTextField facfdii;
    private javax.swing.JTextField facorreoo;
    private javax.swing.JTextField fadomicilioo;
    private javax.swing.JTextField fanombree;
    private javax.swing.JTextField farfcc;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JButton registrarfact;
    private javax.swing.JButton regresarfact;
    // End of variables declaration//GEN-END:variables
}
