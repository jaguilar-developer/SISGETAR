/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package utp.edu.pe.app.recarga;

import java.awt.BorderLayout;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import utp.edu.pe.dao.daoCarnes;
import utp.edu.pe.dao.daoRecargas;
import utp.edu.pe.entity.Carne;
import utp.edu.pe.entity.Recarga;
import static utp.edu.pe.app.frmPrincipal.content;
import static utp.edu.pe.app.frmPrincipal.lblRol;

/**
 *
 * @author Jerry Aguilar - U21229611
 */
public class recargarCarne extends javax.swing.JPanel {

    /**
     * Creates new form recargarCarne
     */
    
    static Boolean rolPasajero = lblRol.getText().equals("PASAJERO");
    
    public recargarCarne() {        
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
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        txtNroCarne = new javax.swing.JTextField();
        txtSaldo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtMontoRecarga = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JLabel();
        txtNroDocumento = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(770, 700));
        setMinimumSize(new java.awt.Dimension(770, 700));
        setPreferredSize(new java.awt.Dimension(770, 700));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        jLabel1.setText("Recargar Carne");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        jLabel2.setText("NRO CARNE:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 95, -1, -1));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 41, 758, 10));

        jLabel3.setText("SALDO ACTUAL:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 175, -1, -1));
        add(txtNroCarne, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 117, 687, 40));
        add(txtSaldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 197, 320, 40));

        jLabel4.setText("MONTO RECARGA:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 175, -1, -1));
        add(txtMontoRecarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 197, 320, 40));

        jLabel9.setText("DESCRIPCION :");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));
        add(txtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 687, 40));

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/utp/edu/pe/resources/salvar.png"))); // NOI18N
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGuardarMouseClicked(evt);
            }
        });
        add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 610, -1, -1));

        txtNroDocumento.setText("txtNroDocumento");
        add(txtNroDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseClicked
        recargarCarne();
        limpiarCajas();
        
        mainRecarga mainRecarga = new mainRecarga();
        mainRecarga.setSize(770, 700);
        mainRecarga.setLocation(0,0);
        
        mainRecarga.buscarPasajero(txtNroDocumento.getText());
        
        content.removeAll();
        content.add(mainRecarga, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_btnGuardarMouseClicked
    
    public void recargarCarne() {        
        Recarga objRecarga = new Recarga();        
        daoRecargas daoRecargas = new daoRecargas();
        String msjRespuesta = "";
        String pago = "";
        
        objRecarga.setNroCarne(Integer.valueOf(txtNroCarne.getText()));
        objRecarga.setMontoRecarga(Float.valueOf(txtMontoRecarga.getText()));
        
        if(rolPasajero){
            pago = JOptionPane.showInputDialog(this, "Ingrese el numero de pago", "Pago", JOptionPane.YES_OPTION);
        }
        
        if(rolPasajero && pago.length()>=1){
            msjRespuesta = daoRecargas.crearRecarga(objRecarga);
        }
        
        if (!rolPasajero) {
            msjRespuesta = daoRecargas.crearRecarga(objRecarga);
        }
        
        JOptionPane.showMessageDialog(this, msjRespuesta);        
    }
    
    public void cargarCarne(int nroCarne, String nroDocumento) {        
        
        daoCarnes daoCarne = new daoCarnes();
        Carne objCarne = daoCarne.buscarCarne(nroCarne);
        
        txtNroCarne.setText(objCarne.getNroCarne().toString());
        txtDescripcion.setText(objCarne.getDescripcion());
        txtSaldo.setText(objCarne.getSaldo().toString());
        
        txtNroDocumento.setVisible(false);
        txtNroDocumento.setText(nroDocumento);
        
        txtNroCarne.setEnabled(false);
        txtDescripcion.setEnabled(false);
        txtSaldo.setEnabled(false);
        
    }
    
    private void limpiarCajas() {
        JTextField caja;
        for(int i = 0; i < this.getComponentCount(); i++) {
            if(this.getComponent(i).getClass().getName().equals("javax.swing.JTextField")){
                caja = (JTextField)this.getComponent(i);
                caja.setText(null);
            }
        }
        
        JComboBox combo;
        for(int i = 0; i < this.getComponentCount(); i++) {
            if(this.getComponent(i).getClass().getName().equals("javax.swing.JComboBox")) {
                combo = (JComboBox)this.getComponent(i);
                combo.setSelectedIndex(0);
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtMontoRecarga;
    private javax.swing.JTextField txtNroCarne;
    private javax.swing.JLabel txtNroDocumento;
    private javax.swing.JTextField txtSaldo;
    // End of variables declaration//GEN-END:variables
}
