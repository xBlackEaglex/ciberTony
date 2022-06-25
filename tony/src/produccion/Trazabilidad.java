
package produccion;

import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Alitza Cervantes
 */
public class Trazabilidad extends javax.swing.JFrame {

    /**
     * Creates new form Trazabilidad
     */
    public Trazabilidad() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondo = new javax.swing.JLabel();
        imprimir = new javax.swing.JButton();
        impresion1 = new produccion.impresion();
        Fondo1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        Rinventario = new javax.swing.JMenu();
        menu = new javax.swing.JMenuItem();
        Ensamble = new javax.swing.JMenuItem();
        inventario = new javax.swing.JMenuItem();
        rinventario = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imprimir.setBackground(new java.awt.Color(123, 104, 238));
        imprimir.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        imprimir.setForeground(new java.awt.Color(255, 255, 255));
        imprimir.setText("Imprimir");
        imprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imprimirActionPerformed(evt);
            }
        });
        getContentPane().add(imprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 360, -1, -1));
        getContentPane().add(impresion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 440, 290));
        getContentPane().add(Fondo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 400));

        Rinventario.setText("Inicio");

        menu.setText("Menu Principal");
        menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuActionPerformed(evt);
            }
        });
        Rinventario.add(menu);

        Ensamble.setText("Ensamble");
        Ensamble.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnsambleActionPerformed(evt);
            }
        });
        Rinventario.add(Ensamble);

        inventario.setText("Inventario");
        inventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inventarioActionPerformed(evt);
            }
        });
        Rinventario.add(inventario);

        rinventario.setText("Registro de inventario");
        rinventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rinventarioActionPerformed(evt);
            }
        });
        Rinventario.add(rinventario);

        jMenuBar1.add(Rinventario);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void imprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imprimirActionPerformed
        PrinterJob job=PrinterJob.getPrinterJob();
        job.setPrintable(impresion1);
        
        if (job.printDialog()){
            try {
                job.print();
            } catch (PrinterException ex) {

            }
        } else{
            JOptionPane.showMessageDialog(this, "La impresion se cancelo");
        }
    
        
    }//GEN-LAST:event_imprimirActionPerformed

    private void menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuActionPerformed
r_produccion ob=new r_produccion();
ob.setVisible(true);
dispose();

    }//GEN-LAST:event_menuActionPerformed

    private void rinventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rinventarioActionPerformed
r_inventario ob=new r_inventario();
ob.setVisible(true);
dispose();
    }//GEN-LAST:event_rinventarioActionPerformed

    private void inventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inventarioActionPerformed
Inventario ob=new Inventario();
ob.setVisible(true);
dispose();
    }//GEN-LAST:event_inventarioActionPerformed

    private void EnsambleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnsambleActionPerformed
Ensamble ob=new Ensamble ();
ob.setVisible(true);
dispose();          // TODO add your handling code here:
    }//GEN-LAST:event_EnsambleActionPerformed

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
            java.util.logging.Logger.getLogger(Trazabilidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Trazabilidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Trazabilidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Trazabilidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Trazabilidad().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Ensamble;
    private javax.swing.JLabel Fondo1;
    private javax.swing.JMenu Rinventario;
    private javax.swing.JLabel fondo;
    private produccion.impresion impresion1;
    private javax.swing.JButton imprimir;
    private javax.swing.JMenuItem inventario;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem menu;
    private javax.swing.JMenuItem rinventario;
    // End of variables declaration//GEN-END:variables
}
