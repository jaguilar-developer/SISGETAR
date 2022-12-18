/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package utp.edu.pe.app;

import java.awt.BorderLayout;
import java.awt.Color;
import utp.edu.pe.app.empleado.mainEmpleado;
import utp.edu.pe.app.pasajero.mainPasajero;
import utp.edu.pe.app.recarga.mainRecarga;
import utp.edu.pe.app.tarjeta.mainTarjeta;
import utp.edu.pe.app.usuario.mainUsuario;
import utp.edu.pe.entity.Usuario;

/**
 *
 * @author Jerry Aguilar - U21229611
 */
public class frmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form frmPrincipal
     */
    public frmPrincipal() {
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

        Background = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        panelEmpleados = new javax.swing.JPanel();
        btnEmpleados = new javax.swing.JLabel();
        panelPasajeros = new javax.swing.JPanel();
        btnPasajeros = new javax.swing.JLabel();
        panelRecargas = new javax.swing.JPanel();
        btnRecargas = new javax.swing.JLabel();
        panelTarjetas = new javax.swing.JPanel();
        btnTarjetas = new javax.swing.JLabel();
        panelUsuarios = new javax.swing.JPanel();
        btnUsuarios = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        lblRol = new javax.swing.JLabel();
        lblNroDoc = new javax.swing.JLabel();
        content = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1000, 700));
        setMinimumSize(new java.awt.Dimension(1000, 700));
        setResizable(false);
        setSize(new java.awt.Dimension(1000, 700));

        Background.setBackground(new java.awt.Color(255, 255, 255));
        Background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 102, 204));

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SISGETAR");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/utp/edu/pe/resources/pago.png"))); // NOI18N

        panelEmpleados.setBackground(new java.awt.Color(0, 102, 204));
        panelEmpleados.setMaximumSize(new java.awt.Dimension(230, 40));
        panelEmpleados.setMinimumSize(new java.awt.Dimension(230, 40));
        panelEmpleados.setPreferredSize(new java.awt.Dimension(230, 40));
        panelEmpleados.setRequestFocusEnabled(false);

        btnEmpleados.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        btnEmpleados.setForeground(new java.awt.Color(255, 255, 255));
        btnEmpleados.setText("EMPELADOS");
        btnEmpleados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEmpleados.setMaximumSize(new java.awt.Dimension(230, 40));
        btnEmpleados.setMinimumSize(new java.awt.Dimension(230, 40));
        btnEmpleados.setPreferredSize(new java.awt.Dimension(230, 40));
        btnEmpleados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEmpleadosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEmpleadosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEmpleadosMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelEmpleadosLayout = new javax.swing.GroupLayout(panelEmpleados);
        panelEmpleados.setLayout(panelEmpleadosLayout);
        panelEmpleadosLayout.setHorizontalGroup(
            panelEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEmpleadosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelEmpleadosLayout.setVerticalGroup(
            panelEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnEmpleados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panelPasajeros.setBackground(new java.awt.Color(0, 102, 204));
        panelPasajeros.setMaximumSize(new java.awt.Dimension(230, 40));
        panelPasajeros.setMinimumSize(new java.awt.Dimension(230, 40));
        panelPasajeros.setPreferredSize(new java.awt.Dimension(230, 40));

        btnPasajeros.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        btnPasajeros.setForeground(new java.awt.Color(255, 255, 255));
        btnPasajeros.setText("PASAJEROS");
        btnPasajeros.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPasajeros.setMaximumSize(new java.awt.Dimension(230, 40));
        btnPasajeros.setMinimumSize(new java.awt.Dimension(230, 40));
        btnPasajeros.setPreferredSize(new java.awt.Dimension(230, 40));
        btnPasajeros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPasajerosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPasajerosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnPasajerosMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelPasajerosLayout = new javax.swing.GroupLayout(panelPasajeros);
        panelPasajeros.setLayout(panelPasajerosLayout);
        panelPasajerosLayout.setHorizontalGroup(
            panelPasajerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPasajerosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnPasajeros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelPasajerosLayout.setVerticalGroup(
            panelPasajerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnPasajeros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panelRecargas.setBackground(new java.awt.Color(0, 102, 204));
        panelRecargas.setMaximumSize(new java.awt.Dimension(230, 40));
        panelRecargas.setMinimumSize(new java.awt.Dimension(230, 40));
        panelRecargas.setPreferredSize(new java.awt.Dimension(230, 40));

        btnRecargas.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        btnRecargas.setForeground(new java.awt.Color(255, 255, 255));
        btnRecargas.setText("CARNE / RECARGAS");
        btnRecargas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRecargas.setMaximumSize(new java.awt.Dimension(230, 40));
        btnRecargas.setMinimumSize(new java.awt.Dimension(230, 40));
        btnRecargas.setPreferredSize(new java.awt.Dimension(230, 40));
        btnRecargas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRecargasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRecargasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRecargasMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelRecargasLayout = new javax.swing.GroupLayout(panelRecargas);
        panelRecargas.setLayout(panelRecargasLayout);
        panelRecargasLayout.setHorizontalGroup(
            panelRecargasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRecargasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnRecargas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelRecargasLayout.setVerticalGroup(
            panelRecargasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRecargasLayout.createSequentialGroup()
                .addComponent(btnRecargas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        panelTarjetas.setBackground(new java.awt.Color(0, 102, 204));
        panelTarjetas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelTarjetas.setMaximumSize(new java.awt.Dimension(230, 40));
        panelTarjetas.setMinimumSize(new java.awt.Dimension(230, 40));
        panelTarjetas.setPreferredSize(new java.awt.Dimension(230, 40));
        panelTarjetas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelTarjetasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelTarjetasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelTarjetasMouseExited(evt);
            }
        });

        btnTarjetas.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        btnTarjetas.setForeground(new java.awt.Color(255, 255, 255));
        btnTarjetas.setText("TARJETAS");
        btnTarjetas.setMaximumSize(new java.awt.Dimension(230, 40));
        btnTarjetas.setMinimumSize(new java.awt.Dimension(230, 40));
        btnTarjetas.setPreferredSize(new java.awt.Dimension(230, 40));

        javax.swing.GroupLayout panelTarjetasLayout = new javax.swing.GroupLayout(panelTarjetas);
        panelTarjetas.setLayout(panelTarjetasLayout);
        panelTarjetasLayout.setHorizontalGroup(
            panelTarjetasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTarjetasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnTarjetas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelTarjetasLayout.setVerticalGroup(
            panelTarjetasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnTarjetas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panelUsuarios.setBackground(new java.awt.Color(0, 102, 204));
        panelUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelUsuarios.setMaximumSize(new java.awt.Dimension(230, 40));
        panelUsuarios.setMinimumSize(new java.awt.Dimension(230, 40));
        panelUsuarios.setPreferredSize(new java.awt.Dimension(230, 40));

        btnUsuarios.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        btnUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        btnUsuarios.setText("USUARIOS");
        btnUsuarios.setMaximumSize(new java.awt.Dimension(230, 40));
        btnUsuarios.setMinimumSize(new java.awt.Dimension(230, 40));
        btnUsuarios.setPreferredSize(new java.awt.Dimension(230, 40));
        btnUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUsuariosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnUsuariosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnUsuariosMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelUsuariosLayout = new javax.swing.GroupLayout(panelUsuarios);
        panelUsuarios.setLayout(panelUsuariosLayout);
        panelUsuariosLayout.setHorizontalGroup(
            panelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelUsuariosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelUsuariosLayout.setVerticalGroup(
            panelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelUsuariosLayout.createSequentialGroup()
                .addComponent(btnUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        lblUsuario.setFont(new java.awt.Font("Roboto", 2, 10)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lblUsuario.setText("lblUsuario");

        lblRol.setFont(new java.awt.Font("Roboto", 2, 10)); // NOI18N
        lblRol.setForeground(new java.awt.Color(255, 255, 255));
        lblRol.setText("lblRol");

        lblNroDoc.setText("jLabel3");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(89, 89, 89))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblRol, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNroDoc)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(panelEmpleados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelPasajeros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelRecargas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelTarjetas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel1)))
                .addGap(39, 39, 39)
                .addComponent(panelEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelPasajeros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelRecargas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelTarjetas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 337, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRol, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblNroDoc))
                .addContainerGap())
        );

        Background.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 700));

        content.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 770, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );

        Background.add(content, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 770, 700));
        content.getAccessibleContext().setAccessibleName("");
        content.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEmpleadosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEmpleadosMouseEntered
        panelEmpleados.setBackground(Color.WHITE);
        btnEmpleados.setForeground(new Color(0,102,204));
    }//GEN-LAST:event_btnEmpleadosMouseEntered

    private void btnEmpleadosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEmpleadosMouseExited
        panelEmpleados.setBackground(new Color(0,102,204));
        btnEmpleados.setForeground(Color.WHITE);
    }//GEN-LAST:event_btnEmpleadosMouseExited

    private void btnEmpleadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEmpleadosMouseClicked
        mainEmpleado lstEmpleado = new mainEmpleado();
        lstEmpleado.setSize(770,700);
        lstEmpleado.setLocation(0,0); 
        
        content.removeAll();
        content.add(lstEmpleado, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_btnEmpleadosMouseClicked

    private void btnPasajerosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPasajerosMouseEntered
        panelPasajeros.setBackground(Color.WHITE);
        btnPasajeros.setForeground(new Color(0,102,204));
    }//GEN-LAST:event_btnPasajerosMouseEntered

    private void btnPasajerosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPasajerosMouseExited
        panelPasajeros.setBackground(new Color(0,102,204));
        btnPasajeros.setForeground(Color.WHITE);
    }//GEN-LAST:event_btnPasajerosMouseExited

    private void btnPasajerosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPasajerosMouseClicked
        mainPasajero lstPasajero = new mainPasajero();
        lstPasajero.setSize(770,700);
        lstPasajero.setLocation(0,0); 
        
        content.removeAll();
        content.add(lstPasajero, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_btnPasajerosMouseClicked

    private void btnRecargasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRecargasMouseEntered
        panelRecargas.setBackground(Color.WHITE);
        btnRecargas.setForeground(new Color(0,102,204));
    }//GEN-LAST:event_btnRecargasMouseEntered

    private void btnRecargasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRecargasMouseExited
        panelRecargas.setBackground(new Color(0,102,204));
        btnRecargas.setForeground(Color.WHITE);
    }//GEN-LAST:event_btnRecargasMouseExited

    private void btnRecargasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRecargasMouseClicked
        mainRecarga mainRecarga = new mainRecarga();
        mainRecarga.setSize(770,700);
        mainRecarga.setLocation(0,0);
        
        if(lblRol.getText().equals("PASAJERO")) {
            mainRecarga.buscarPasajero(lblNroDoc.getText());            
        }
        
        content.removeAll();
        content.add(mainRecarga, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_btnRecargasMouseClicked

    private void panelTarjetasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelTarjetasMouseExited
        panelTarjetas.setBackground(new Color(0,102,204));
        btnTarjetas.setForeground(Color.WHITE);
    }//GEN-LAST:event_panelTarjetasMouseExited

    private void panelTarjetasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelTarjetasMouseEntered
        panelTarjetas.setBackground(Color.WHITE);
        btnTarjetas.setForeground(new Color(0,102,204));
    }//GEN-LAST:event_panelTarjetasMouseEntered

    private void panelTarjetasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelTarjetasMouseClicked
        mainTarjeta lstTarjeta = new mainTarjeta();
        lstTarjeta.setSize(770,700);
        lstTarjeta.setLocation(0,0); 
        
        content.removeAll();
        content.add(lstTarjeta, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_panelTarjetasMouseClicked

    private void btnUsuariosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUsuariosMouseEntered
        panelUsuarios.setBackground(Color.WHITE);
        btnUsuarios.setForeground(new Color(0,102,204));
    }//GEN-LAST:event_btnUsuariosMouseEntered

    private void btnUsuariosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUsuariosMouseExited
        panelUsuarios.setBackground(new Color(0,102,204));
        btnUsuarios.setForeground(Color.WHITE);
    }//GEN-LAST:event_btnUsuariosMouseExited

    private void btnUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUsuariosMouseClicked
        mainUsuario lstUsuario = new mainUsuario();
        lstUsuario.setSize(770,700);
        lstUsuario.setLocation(0,0); 
        
        content.removeAll();
        content.add(lstUsuario, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_btnUsuariosMouseClicked

    public void cargarPerfil(Usuario objUsuario) {
        if (objUsuario.getRol().toUpperCase().equals("PASAJERO")) {
            panelEmpleados.setVisible(false);
            panelPasajeros.setVisible(false);
            panelTarjetas.setVisible(false);
        }
        
        lblUsuario.setText(objUsuario.getUsuario());
        lblRol.setText(objUsuario.getRol());
        lblNroDoc.setText(objUsuario.getNumeroDocumento());
        lblNroDoc.setVisible(false);
    }
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
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JLabel btnEmpleados;
    private javax.swing.JLabel btnPasajeros;
    private javax.swing.JLabel btnRecargas;
    private javax.swing.JLabel btnTarjetas;
    private javax.swing.JLabel btnUsuarios;
    public static javax.swing.JPanel content;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    public static javax.swing.JLabel lblNroDoc;
    public static javax.swing.JLabel lblRol;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPanel panelEmpleados;
    private javax.swing.JPanel panelPasajeros;
    private javax.swing.JPanel panelRecargas;
    private javax.swing.JPanel panelTarjetas;
    private javax.swing.JPanel panelUsuarios;
    // End of variables declaration//GEN-END:variables
}
