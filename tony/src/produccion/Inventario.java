/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package produccion;

/**
 *
 * @author Alitza Cervantes
 */
public class Inventario extends javax.swing.JFrame {

    /**
     * Creates new form Inventario
     */
    public Inventario() {
        initComponents();
        this.setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        registrar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        fondo = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        menu = new javax.swing.JMenu();
        principal = new javax.swing.JMenuItem();
        ensamble = new javax.swing.JMenuItem();
        trazabilidad = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        registrar.setBackground(new java.awt.Color(123, 104, 238));
        registrar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        registrar.setForeground(new java.awt.Color(255, 255, 255));
        registrar.setText("Registrar nuevo");
        registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarActionPerformed(evt);
            }
        });
        getContentPane().add(registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 340, 120, -1));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "No_orden", "fecha", "descripcion", "encargado", "status"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 380));
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 400));

        menu.setText("Inicio");

        principal.setText("Menu Principal");
        principal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                principalActionPerformed(evt);
            }
        });
        menu.add(principal);

        ensamble.setText("Ensamble");
        ensamble.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ensambleActionPerformed(evt);
            }
        });
        menu.add(ensamble);

        trazabilidad.setText("Trazabilidad");
        trazabilidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trazabilidadActionPerformed(evt);
            }
        });
        menu.add(trazabilidad);

        jMenuBar2.add(menu);

        setJMenuBar(jMenuBar2);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void principalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_principalActionPerformed
r_produccion ob=new r_produccion ();
ob.setVisible(true);
dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_principalActionPerformed

    private void ensambleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ensambleActionPerformed
Ensamble ob=new Ensamble ();
ob.setVisible(true);
dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_ensambleActionPerformed

    private void trazabilidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trazabilidadActionPerformed
Trazabilidad ob=new Trazabilidad ();
ob.setVisible(true);
dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_trazabilidadActionPerformed

    private void registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarActionPerformed
r_inventario ob =new r_inventario();
ob.setVisible(true);
dispose();
// TODO add your handling code here:
    }//GEN-LAST:event_registrarActionPerformed

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
            java.util.logging.Logger.getLogger(Inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inventario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ensamble;
    private javax.swing.JLabel fondo;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JMenu menu;
    private javax.swing.JMenuItem principal;
    private javax.swing.JButton registrar;
    private javax.swing.JMenuItem trazabilidad;
    // End of variables declaration//GEN-END:variables
}
