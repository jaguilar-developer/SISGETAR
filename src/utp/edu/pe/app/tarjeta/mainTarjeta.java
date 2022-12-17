/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package utp.edu.pe.app.tarjeta;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import static utp.edu.pe.app.frmPrincipal.content;
import utp.edu.pe.dao.daoCarnes;
import utp.edu.pe.dao.daoTarjetas;
import utp.edu.pe.entity.Carne;
import utp.edu.pe.entity.Tarjeta;

/**
 *
 * @author Jerry Aguilar - U21229611
 */
public class mainTarjeta extends javax.swing.JPanel {

    /**
     * Creates new form listarEmpleado
     */
    public mainTarjeta() {
        initComponents();
        cargarTarjetas();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblTarjetas = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        btnNuevaTarjeta = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnActualizarTarjeta = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(770, 700));
        setMinimumSize(new java.awt.Dimension(770, 700));

        tblTarjetas.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        tblTarjetas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Servicio", "Pasaje (S/.)", "Descripcion"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblTarjetas.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblTarjetas);
        if (tblTarjetas.getColumnModel().getColumnCount() > 0) {
            tblTarjetas.getColumnModel().getColumn(0).setResizable(false);
            tblTarjetas.getColumnModel().getColumn(1).setResizable(false);
            tblTarjetas.getColumnModel().getColumn(2).setResizable(false);
        }

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        jLabel1.setText("Tarjetas");

        jPanel1.setBackground(new java.awt.Color(0, 102, 204));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.setMaximumSize(new java.awt.Dimension(100, 40));
        jPanel1.setMinimumSize(new java.awt.Dimension(100, 40));
        jPanel1.setPreferredSize(new java.awt.Dimension(100, 40));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnNuevaTarjeta.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        btnNuevaTarjeta.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevaTarjeta.setText("NUEVO");
        btnNuevaTarjeta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNuevaTarjetaMouseClicked(evt);
            }
        });
        jPanel1.add(btnNuevaTarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jPanel2.setBackground(new java.awt.Color(0, 102, 204));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnActualizarTarjeta.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        btnActualizarTarjeta.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizarTarjeta.setText("ACTUALIZAR");
        btnActualizarTarjeta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnActualizarTarjetaMouseClicked(evt);
            }
        });
        jPanel2.add(btnActualizarTarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 8, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(269, 269, 269)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(16, 16, 16))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevaTarjetaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevaTarjetaMouseClicked

    }//GEN-LAST:event_btnNuevaTarjetaMouseClicked

    private void btnActualizarTarjetaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarTarjetaMouseClicked

    }//GEN-LAST:event_btnActualizarTarjetaMouseClicked

    private void cargarTarjetas() {
        DefaultTableModel modeloTabla = (DefaultTableModel) tblTarjetas.getModel();
        modeloTabla.setRowCount(0);
        
        daoTarjetas tarjetaDatos = new daoTarjetas();
        List<Tarjeta> lstTarjetas = tarjetaDatos.listaTarjetas();
        String datos[] = new String[3];
        
        for (int i=0;i<lstTarjetas.size();i++) {
            datos[0] = lstTarjetas.get(i).getServicio();
            datos[1] = String.valueOf(lstTarjetas.get(i).getMontoPasaje());
            datos[2] = lstTarjetas.get(i).getDescripcion();
            modeloTabla.addRow(datos);
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnActualizarTarjeta;
    private javax.swing.JLabel btnNuevaTarjeta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tblTarjetas;
    // End of variables declaration//GEN-END:variables
}
