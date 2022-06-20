
package rrhh;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import tony.conexion;

/**
 *
 * @author padil
 */
public class CONTRATO_DE_PERSONAL extends javax.swing.JFrame {
    
    conexion cc = new conexion();
    Connection cx = cc.conect();
    
    

    /**
     * Creates new form CONTRATO_DE_PERSONAL
     */
    public CONTRATO_DE_PERSONAL() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        NOMBRE = new javax.swing.JTextField();
        APATERNO = new javax.swing.JTextField();
        SEXO = new javax.swing.JTextField();
        DEPARTAMENTO = new javax.swing.JTextField();
        AMATERNO = new javax.swing.JTextField();
        guardar = new javax.swing.JButton();
        nuevo = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        FNACIMIENTO = new javax.swing.JTextField();
        FINGRESO = new javax.swing.JTextField();
        ANTIGUEDAD = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(5, 240, 122));
        jLabel1.setFont(new java.awt.Font("Arial", 0, 38)); // NOI18N
        jLabel1.setText("CONTRATO DE PERSONAL");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 8, 500, 30));

        jLabel2.setBackground(new java.awt.Color(123, 104, 238));
        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("NOMBRE (S):");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 109, 170, 30));

        jLabel3.setBackground(new java.awt.Color(123, 104, 238));
        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("APELLIDO PATERNO:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 152, 170, 30));

        jLabel4.setBackground(new java.awt.Color(123, 104, 238));
        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("APELLIDO MATERNO:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 189, 170, 30));

        jLabel5.setBackground(new java.awt.Color(123, 104, 238));
        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setText("FECHA DE NACIMIENTO:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 236, 170, 30));

        jLabel6.setBackground(new java.awt.Color(123, 104, 238));
        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setText("DEPARTAMENTO:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 285, 170, 30));

        jLabel7.setBackground(new java.awt.Color(123, 104, 238));
        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setText("SEXO:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 329, 170, 30));

        jLabel8.setBackground(new java.awt.Color(123, 104, 238));
        jLabel8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel8.setText("FECHA DE INGRESO:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 373, 170, 30));

        jLabel9.setBackground(new java.awt.Color(123, 104, 238));
        jLabel9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel9.setText("ANTIGUEDAD");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 140, 20));

        NOMBRE.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(NOMBRE, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 250, 30));

        APATERNO.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(APATERNO, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 250, 30));

        SEXO.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(SEXO, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, 250, 30));

        DEPARTAMENTO.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(DEPARTAMENTO, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, 250, 30));

        AMATERNO.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(AMATERNO, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 250, 30));

        guardar.setBackground(new java.awt.Color(123, 104, 238));
        guardar.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        guardar.setForeground(java.awt.Color.white);
        guardar.setText("GUARDAR");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });
        jPanel1.add(guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 340, 100, 50));

        nuevo.setBackground(new java.awt.Color(123, 104, 238));
        nuevo.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        nuevo.setForeground(java.awt.Color.white);
        nuevo.setText("NUEVO");
        nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoActionPerformed(evt);
            }
        });
        jPanel1.add(nuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 220, 100, 50));

        salir.setBackground(new java.awt.Color(123, 104, 238));
        salir.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        salir.setForeground(java.awt.Color.white);
        salir.setText("SALIR");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        jPanel1.add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 110, 100, 50));
        jPanel1.add(FNACIMIENTO, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 250, 30));
        jPanel1.add(FINGRESO, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 370, 250, 30));
        jPanel1.add(ANTIGUEDAD, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 420, 250, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 658, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 468, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoActionPerformed
NOMBRE.setText("");
APATERNO.setText("");
AMATERNO.setText("");
FNACIMIENTO.setText("");
DEPARTAMENTO.setText("");
SEXO.setText("");
FINGRESO.setText("");
ANTIGUEDAD.setText("");
    }//GEN-LAST:event_nuevoActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
 menuRRHH ob=new  menuRRHH();
        ob.setVisible(true);
        dispose();       // TODO add your handling code here:
    }//GEN-LAST:event_salirActionPerformed

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed


try{
PreparedStatement ps=cx.prepareStatement("insert into contrato (NOMBRE, APELLIDO_PATERNO, "
        + "APELLIDO_MATERNO,FECHA_DE_NACIMIENTO, DEPARTAMENTO, "
        + "SEXO, FECHA_DE_INGRESO, ANTIGUEDAD) values (?,?,?,?,?,?,?,?)");
ps.setString(1, NOMBRE.getText());
ps.setString(2, APATERNO.getText());
ps.setString(3, AMATERNO.getText());
ps.setString(4, FNACIMIENTO.getText());
ps.setString(5, DEPARTAMENTO.getText());
ps.setString(6, SEXO.getText());
ps.setString(7, FINGRESO.getText());
ps.setString(8, ANTIGUEDAD.getText());
ps.executeUpdate();

    JOptionPane.showMessageDialog(this, "Registro Exitoso");


}
catch(Exception e){
    
    
    System.out.println("<Error al llenar campos "+e);
    
    
}    }//GEN-LAST:event_guardarActionPerformed

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
            java.util.logging.Logger.getLogger(CONTRATO_DE_PERSONAL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CONTRATO_DE_PERSONAL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CONTRATO_DE_PERSONAL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CONTRATO_DE_PERSONAL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CONTRATO_DE_PERSONAL().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AMATERNO;
    private javax.swing.JTextField ANTIGUEDAD;
    private javax.swing.JTextField APATERNO;
    private javax.swing.JTextField DEPARTAMENTO;
    private javax.swing.JTextField FINGRESO;
    private javax.swing.JTextField FNACIMIENTO;
    private javax.swing.JTextField NOMBRE;
    private javax.swing.JTextField SEXO;
    private javax.swing.JButton guardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton nuevo;
    private javax.swing.JButton salir;
    // End of variables declaration//GEN-END:variables
}
