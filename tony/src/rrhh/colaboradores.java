/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rrhh;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author padil
 */
public class colaboradores extends javax.swing.JFrame {

    public colaboradores() {
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

        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TABLADETRABAJADORES = new javax.swing.JTable();
        SALIR = new javax.swing.JButton();
        buscar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        BUSCAR = new javax.swing.JTextField();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TABLADETRABAJADORES.setBackground(new java.awt.Color(123, 104, 238));
        TABLADETRABAJADORES.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        TABLADETRABAJADORES.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        TABLADETRABAJADORES.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N° DE EMPLADO", "NOMBRE (S)", "APELLIDO PATERNO", "APELLIDO MATERNO", "FECHA DE NACIMIENTO", "DEPARTAMENTO", "SEXO", "FECHA DE INGRESO", "ANTIGUEDAD"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TABLADETRABAJADORES.setGridColor(new java.awt.Color(255, 255, 255));
        TABLADETRABAJADORES.setSelectionBackground(new java.awt.Color(123, 104, 238));
        TABLADETRABAJADORES.setSelectionForeground(new java.awt.Color(123, 104, 238));
        TABLADETRABAJADORES.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TABLADETRABAJADORESMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TABLADETRABAJADORES);
        if (TABLADETRABAJADORES.getColumnModel().getColumnCount() > 0) {
            TABLADETRABAJADORES.getColumnModel().getColumn(0).setResizable(false);
            TABLADETRABAJADORES.getColumnModel().getColumn(1).setResizable(false);
            TABLADETRABAJADORES.getColumnModel().getColumn(2).setResizable(false);
            TABLADETRABAJADORES.getColumnModel().getColumn(3).setResizable(false);
            TABLADETRABAJADORES.getColumnModel().getColumn(4).setResizable(false);
            TABLADETRABAJADORES.getColumnModel().getColumn(5).setResizable(false);
            TABLADETRABAJADORES.getColumnModel().getColumn(6).setResizable(false);
            TABLADETRABAJADORES.getColumnModel().getColumn(7).setResizable(false);
            TABLADETRABAJADORES.getColumnModel().getColumn(8).setResizable(false);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1499, 380));

        SALIR.setBackground(new java.awt.Color(123, 104, 238));
        SALIR.setText("SALIR");
        SALIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SALIRActionPerformed(evt);
            }
        });
        jPanel1.add(SALIR, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 400, 210, 70));

        buscar.setBackground(new java.awt.Color(123, 104, 238));
        buscar.setText("BUSCAR");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });
        jPanel1.add(buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 400, 270, 70));

        jLabel1.setText("NOMBRE");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 417, 150, 30));

        BUSCAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BUSCARActionPerformed(evt);
            }
        });
        jPanel1.add(BUSCAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 420, 198, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SALIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SALIRActionPerformed
 menuRRHH ob=new  menuRRHH();
        ob.setVisible(true);
        dispose();            // TODO add your handling code here:
    }//GEN-LAST:event_SALIRActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
String campo=BUSCAR.getText();
String where= "";
if (!"".equals(campo))
{
where = "WHERE NDEEMPLEADO ='"+campo+"'";
}
 try {
        DefaultTableModel modelo=new DefaultTableModel ();
        TABLADETRABAJADORES.setModel(modelo);
        PreparedStatement ps=null;
        ResultSet rs=null;
        RRHH Con=new RRHH();
        Connection con= Con.conect();
        
        String sql ="Select NDEEMPLEADO, NOMBRE, APELLIDO_PATERNO, APELLIDO_MATERNO,FECHA_DE_NACIMIENTO, "
                + "DEPARTAMENTO, SEXO, FECHA_DE_INGRESO, ANTIGUEDAD From contrato "+where;
       System.out.println(sql);
        ps= con.prepareStatement(sql);
        rs= ps.executeQuery();
        ResultSetMetaData rsMD= rs.getMetaData();
        int cantidadColumnas =rsMD.getColumnCount();
        modelo.addColumn("NDEEMPLEADO");
        modelo.addColumn("NOMBRE");
        modelo.addColumn("APELLIDO_PATERNO");
        modelo.addColumn("APELLIDO_MATERNO");
        modelo.addColumn("FECHA_DE_NACIMIENTO");
        modelo.addColumn("DEPARTAMENTO");
        modelo.addColumn("SEXO");
        modelo.addColumn("FECHA_DE_INGRESO");
        modelo.addColumn("ANTIGUEDAD");
        int[] anchos=  {100,100,100,50,100,20,50,50,60};
        for (int x=0;x<cantidadColumnas;x++)
        {
        TABLADETRABAJADORES.getColumnModel().getColumn(x).setPreferredWidth(anchos[x]);
        
        }
        while (rs.next()){
        Object [] filas =new Object[cantidadColumnas];
        for(int i=0; i<cantidadColumnas; i++)
        {filas [i] =rs.getObject(i + 1);
        }
        modelo.addRow(filas);
        }
        
        }
        catch(SQLException ex) {
        System.err.println(ex.toString());
        
        
        }


// TODO add your handling code here:
    }//GEN-LAST:event_buscarActionPerformed

    private void BUSCARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUSCARActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BUSCARActionPerformed

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1MouseClicked

    private void TABLADETRABAJADORESMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TABLADETRABAJADORESMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_TABLADETRABAJADORESMouseClicked
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
            java.util.logging.Logger.getLogger(colaboradores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(colaboradores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(colaboradores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(colaboradores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new colaboradores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BUSCAR;
    private javax.swing.JButton SALIR;
    private javax.swing.JTable TABLADETRABAJADORES;
    private javax.swing.JButton buscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
