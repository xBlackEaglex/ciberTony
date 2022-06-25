
package produccion;
import java.sql.PreparedStatement;
import java.sql.Connection;
import javax.swing.JOptionPane;

/**
 *
 * @author Alitza Cervantes
 */
public class r_inventario extends javax.swing.JFrame {

    /**
     * Creates new form r_inventario
     */
    public r_inventario() {
        initComponents();
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
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        orden = new javax.swing.JTextField();
        descripcion = new javax.swing.JTextField();
        encargado = new javax.swing.JTextField();
        status = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        fecha = new javax.swing.JTextField();
        registrar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        inicio = new javax.swing.JMenu();
        menuP1 = new javax.swing.JMenuItem();
        ensamble1 = new javax.swing.JMenuItem();
        inventario1 = new javax.swing.JMenuItem();
        Trazabilidad = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setText("REGISTRO DE PRODUCTO TERMINADO");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, -1, -1));

        jLabel4.setText("Encargado");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, -1, -1));

        jLabel5.setText("Status");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, -1, -1));

        orden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ordenActionPerformed(evt);
            }
        });
        getContentPane().add(orden, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 115, -1));
        getContentPane().add(descripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 332, -1));
        getContentPane().add(encargado, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 332, -1));
        getContentPane().add(status, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 332, -1));

        jLabel6.setText("Fecha");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, -1, -1));

        fecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechaActionPerformed(evt);
            }
        });
        getContentPane().add(fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 70, 131, -1));

        registrar.setBackground(new java.awt.Color(123, 104, 238));
        registrar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        registrar.setForeground(new java.awt.Color(255, 255, 255));
        registrar.setText("Registrar");
        registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarActionPerformed(evt);
            }
        });
        getContentPane().add(registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 320, -1, -1));

        jLabel2.setText("No. de orden");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, -1, -1));

        jLabel3.setText("Descripccion");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, -1, -1));
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 380));

        inicio.setText("inicio");

        menuP1.setText("Menu Principal");
        menuP1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuP1ActionPerformed(evt);
            }
        });
        inicio.add(menuP1);

        ensamble1.setText("Ensamble");
        ensamble1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ensamble1ActionPerformed(evt);
            }
        });
        inicio.add(ensamble1);

        inventario1.setText("Inventario");
        inventario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inventario1ActionPerformed(evt);
            }
        });
        inicio.add(inventario1);

        Trazabilidad.setText("Trazabilidad");
        Trazabilidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TrazabilidadActionPerformed(evt);
            }
        });
        inicio.add(Trazabilidad);

        jMenuBar1.add(inicio);
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ordenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ordenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ordenActionPerformed

    private void fechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fechaActionPerformed

    private void registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarActionPerformed
conexion con =new conexion();
Connection reg=con.conect();

    try{
        PreparedStatement ps=reg.prepareStatement("INSERT INTO r_inventario (No_orden, fecha, descripcion, encargado, status) values (?,?,?,?,?)");
  
        ps.setString(1, orden.getText());
        ps.setString(2, fecha.getText());
        ps.setString(3, descripcion.getText());
        ps.setString(4, encargado.getText());
        ps.setString(5, status.getText());
       
        
      
       JOptionPane.showMessageDialog(null, "Registro exitoso");
        ps.executeUpdate();
          orden.setText("");
        fecha.setText("");
        descripcion.setText("");
        encargado.setText("");
        status.setText("");
    }
        catch (Exception e){
            
        } 
    }//GEN-LAST:event_registrarActionPerformed

    private void ensamble1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ensamble1ActionPerformed
Ensamble ob=new Ensamble ();
ob.setVisible(true);
dispose();       
    }//GEN-LAST:event_ensamble1ActionPerformed

    private void menuP1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuP1ActionPerformed
r_produccion ob=new r_produccion ();
ob.setVisible(true);
dispose();       
    }//GEN-LAST:event_menuP1ActionPerformed

    private void inventario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inventario1ActionPerformed
Inventario ob=new Inventario ();
ob.setVisible(true);
dispose();        
    }//GEN-LAST:event_inventario1ActionPerformed

    private void TrazabilidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TrazabilidadActionPerformed
Trazabilidad ob=new Trazabilidad ();
ob.setVisible(true);
dispose();  
    }//GEN-LAST:event_TrazabilidadActionPerformed

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
            java.util.logging.Logger.getLogger(r_inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(r_inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(r_inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(r_inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new r_inventario().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Trazabilidad;
    private javax.swing.JTextField descripcion;
    private javax.swing.JTextField encargado;
    private javax.swing.JMenuItem ensamble1;
    private javax.swing.JTextField fecha;
    private javax.swing.JLabel fondo;
    private javax.swing.JMenu inicio;
    private javax.swing.JMenuItem inventario1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem menuP1;
    private javax.swing.JTextField orden;
    private javax.swing.JButton registrar;
    private javax.swing.JTextField status;
    // End of variables declaration//GEN-END:variables
}
