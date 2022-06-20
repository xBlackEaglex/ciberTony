
package produccion;

/**
 *
 * @author Alitza Cervantes
 */
public class r_produccion extends javax.swing.JFrame {

    /**
     * Creates new form r_produccion
     */
    public r_produccion() {
        initComponents();
        this.setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        Ensamble1 = new javax.swing.JButton();
        Trazabilidad1 = new javax.swing.JButton();
        Inventario1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(5, 240, 122));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Ensamble1.setBackground(new java.awt.Color(123, 104, 238));
        Ensamble1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Ensamble1.setForeground(new java.awt.Color(255, 255, 255));
        Ensamble1.setText("Ensamble");
        Ensamble1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ensamble1ActionPerformed(evt);
            }
        });
        jPanel2.add(Ensamble1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        Trazabilidad1.setBackground(new java.awt.Color(123, 104, 238));
        Trazabilidad1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Trazabilidad1.setForeground(new java.awt.Color(255, 255, 255));
        Trazabilidad1.setText("Trazabilidad");
        Trazabilidad1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Trazabilidad1ActionPerformed(evt);
            }
        });
        jPanel2.add(Trazabilidad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, -1, -1));

        Inventario1.setBackground(new java.awt.Color(123, 104, 238));
        Inventario1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Inventario1.setForeground(new java.awt.Color(255, 255, 255));
        Inventario1.setText("Inventario");
        Inventario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Inventario1ActionPerformed(evt);
            }
        });
        jPanel2.add(Inventario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, -1, -1));
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jButton1.setBackground(new java.awt.Color(123, 104, 238));
        jButton1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Registro de inventario");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, -1, -1));

        fondo.setBackground(new java.awt.Color(153, 0, 153));
        fondo.setForeground(new java.awt.Color(0, 204, 204));
        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/multimedia/fondo.jpg"))); // NOI18N
        jPanel2.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 4, 580, 400));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 253, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Ensamble1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ensamble1ActionPerformed
Ensamble ob= new Ensamble();

ob.setVisible(true);

dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_Ensamble1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
r_inventario ob =new r_inventario ();
ob.setVisible(true);
dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void Inventario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Inventario1ActionPerformed
Inventario ob=new Inventario ();
ob.setVisible(true);
dispose();
// TODO add your handling code here:
    }//GEN-LAST:event_Inventario1ActionPerformed

    private void Trazabilidad1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Trazabilidad1ActionPerformed
Trazabilidad ob=new Trazabilidad ();
ob.setVisible(true);
dispose();
// TODO add your handling code here:
    }//GEN-LAST:event_Trazabilidad1ActionPerformed

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
            java.util.logging.Logger.getLogger(r_produccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(r_produccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(r_produccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(r_produccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new r_produccion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Ensamble1;
    private javax.swing.JButton Inventario1;
    private javax.swing.JButton Trazabilidad1;
    private javax.swing.JLabel fondo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
