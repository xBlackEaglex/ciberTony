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

public class soporte extends javax.swing.JFrame {

     public void agregarTicket() {
    
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
                + "value(0,'','',0,''  ,0,'','',0,'',  0,'',0,  '','','','','','',  '','',0,  0,'',0,  '','','',  ?,?,?,?,?,?,? )";
        
    /* debo poner todos los campos de la tabla para que no marque error, los varchar llevan solo las comillas y los int llevan un cero **/
        try {
            
            PreparedStatement pst=cx.prepareStatement(SQL);
            
            pst.setString(1, ticlientee.getText()); 
            pst.setString(2, tiasuntoo.getText());
            pst.setString(3, titecnicoo.getText());
            pst.setString(4, tidescripcionn.getText());
            pst.setString(5, tiestadoo.getText());
            pst.setString(6, tifechainicioo.getText());
            pst.setString(7, tifechafinn.getText());
            
            
            pst.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Registro exitoso");
            
        } catch (Exception e) {
            
            
            JOptionPane.showMessageDialog(null, "Error de registro"+e.getMessage());
            
        } 
    }
    
    /**
     * Creates new form soporte
     */
    public soporte() {
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

        ticlientee = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        titecnicoo = new javax.swing.JTextField();
        tidescripcionn = new javax.swing.JTextField();
        tiestadoo = new javax.swing.JTextField();
        tifechainicioo = new javax.swing.JTextField();
        tifechafinn = new javax.swing.JTextField();
        tiasuntoo = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(ticlientee, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, 180, -1));

        jLabel3.setBackground(new java.awt.Color(123, 104, 238));
        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setText("Fecha de finalizacion:  ");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(5, 240, 122)));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, -1, -1));

        jLabel4.setBackground(new java.awt.Color(123, 104, 238));
        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setText("Cliente:");
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(5, 240, 122)));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 200, -1));

        jLabel5.setBackground(new java.awt.Color(123, 104, 238));
        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setText("Tecnico:");
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(5, 240, 122)));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 200, -1));

        jLabel6.setBackground(new java.awt.Color(123, 104, 238));
        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setText("Descripcion:");
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(5, 240, 122)));
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 200, -1));

        jLabel7.setBackground(new java.awt.Color(123, 104, 238));
        jLabel7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel7.setText("Estado:");
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(5, 240, 122)));
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 200, -1));

        jLabel8.setBackground(new java.awt.Color(123, 104, 238));
        jLabel8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel8.setText("Fecha de inicio:  ");
        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(5, 240, 122)));
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 200, -1));

        jLabel9.setBackground(new java.awt.Color(123, 104, 238));
        jLabel9.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel9.setText("Asunto:");
        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(5, 240, 122)));
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 200, -1));
        getContentPane().add(titecnicoo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 180, -1));
        getContentPane().add(tidescripcionn, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, 180, -1));
        getContentPane().add(tiestadoo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, 180, -1));
        getContentPane().add(tifechainicioo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, 180, -1));
        getContentPane().add(tifechafinn, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, 180, -1));
        getContentPane().add(tiasuntoo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 180, -1));

        jButton1.setBackground(new java.awt.Color(123, 104, 238));
        jButton1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\pauli\\Documents\\ventas_jp actualizado\\ventas_jp\\ventas_jp\\src\\galeria\\salir.png")); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 340, 140, 30));

        jButton3.setBackground(new java.awt.Color(123, 104, 238));
        jButton3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("LISTA TICKETS");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 210, 140, 30));

        jButton4.setBackground(new java.awt.Color(123, 104, 238));
        jButton4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("GUARDAR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 60, 140, 30));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setText("Generar ticket de reporte:");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(5, 240, 122)));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        init newframe = new init();

        newframe.setVisible(true);

        this.dispose();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        
        agregarTicket(); 
        JOptionPane.showMessageDialog(null, "Registro exitoso");
        
        ticlientee.setText(""); 
        tiasuntoo.setText("");
        titecnicoo.setText("");
        tidescripcionn.setText("");
        tiestadoo.setText("");
        tifechainicioo.setText("");
        tifechafinn.setText("");
        
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(soporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(soporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(soporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(soporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new soporte().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField tiasuntoo;
    private javax.swing.JTextField ticlientee;
    private javax.swing.JTextField tidescripcionn;
    private javax.swing.JTextField tiestadoo;
    private javax.swing.JTextField tifechafinn;
    private javax.swing.JTextField tifechainicioo;
    private javax.swing.JTextField titecnicoo;
    // End of variables declaration//GEN-END:variables
}
