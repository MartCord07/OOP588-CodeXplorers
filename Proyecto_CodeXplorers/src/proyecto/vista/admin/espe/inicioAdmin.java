/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyecto.vista.admin.espe;

import proyecto.modelo.espe.Perfil;
import proyecto.vista.perfil.espe.LoginUsuario;

/**
 *
 * @author Aliss
 */
public class inicioAdmin extends javax.swing.JFrame {
    String cedula = null;
    public inicioAdmin() {
        initComponents();
        LoginUsuario CI = new LoginUsuario();
        cedula = CI.codCedula;
        txtNombre.setEnabled(false);
    }
    public void cargarDatos() {
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Citas = new javax.swing.JButton();
        txtNombre = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel2.setText("Cedula de registro");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 210, -1));

        jLabel3.setFont(new java.awt.Font("Berlin Sans FB", 0, 48)); // NOI18N
        jLabel3.setText("Bienvendio ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 250, -1));

        Citas.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        Citas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/iconos/espe/Cita_Registradas64.png"))); // NOI18N
        Citas.setText("Citas registradas");
        Citas.setBorderPainted(false);
        Citas.setContentAreaFilled(false);
        Citas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Citas.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/iconos/espe/Cita_Registradas64.png"))); // NOI18N
        Citas.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/iconos/espe/Cita_Registradas96.png"))); // NOI18N
        Citas.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Citas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Citas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CitasActionPerformed(evt);
            }
        });
        getContentPane().add(Citas, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 150, 130));

        txtNombre.setEditable(false);
        txtNombre.setBorder(null);
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 160, 30));

        jButton2.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/iconos/espe/Usuarioregistrado 64.png"))); // NOI18N
        jButton2.setText("Usuarios registrados ");
        jButton2.setContentAreaFilled(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/iconos/espe/UsuarioRegistrado_96.png"))); // NOI18N
        jButton2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/iconos/espe/UsuarioRegistrado_96.png"))); // NOI18N
        jButton2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, 210, 130));

        jLabel4.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel4.setText("Escoge una opcion: ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 210, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/fondos/espe/fondo_inicioAdmin.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 600, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CitasActionPerformed
       
    }//GEN-LAST:event_CitasActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new inicioAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Citas;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
