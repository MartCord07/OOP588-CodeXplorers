/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyecto.vista.admin.espe;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
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
        txt_cedula.setText(cedula);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

    }

    private void abrirConsultarCitas() {
        ConsultarCitas cita = new ConsultarCitas();
        this.setVisible(false);

        cita.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                inicioAdmin.this.setVisible(true);
            }

            @Override
            public void windowClosed(WindowEvent e) {
                inicioAdmin.this.setVisible(true);
            }
        });

        cita.setVisible(true);
        cita.setLocationRelativeTo(null);
    }

    private void abrirConsultarRegistro() {
        ConsultarUsuario usuario = new ConsultarUsuario();
        this.setVisible(false);

        usuario.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                inicioAdmin.this.setVisible(true);
            }

            @Override
            public void windowClosed(WindowEvent e) {
                inicioAdmin.this.setVisible(true);
            }
        });

        usuario.setVisible(true);
        usuario.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        labelNombreAdmin = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Citas = new javax.swing.JButton();
        btnUsuarios = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnsalir = new javax.swing.JButton();
        txt_cedula = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel2.setText("Escoge una opcion: ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 210, -1));

        labelNombreAdmin.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        getContentPane().add(labelNombreAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, 80, 30));

        jLabel3.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jLabel3.setText("Bienvendio ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 120, -1));

        Citas.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
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
        getContentPane().add(Citas, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 140, 120));

        btnUsuarios.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        btnUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/iconos/espe/Usuarioregistrado 64.png"))); // NOI18N
        btnUsuarios.setText("Usuarios registrados");
        btnUsuarios.setContentAreaFilled(false);
        btnUsuarios.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnUsuarios.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/iconos/espe/Usuarioregistrado 64.png"))); // NOI18N
        btnUsuarios.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/iconos/espe/UsuarioRegistrado_96.png"))); // NOI18N
        btnUsuarios.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnUsuarios.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuariosActionPerformed(evt);
            }
        });
        getContentPane().add(btnUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 180, 160, 110));

        jLabel4.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel4.setText("Usted ingreso con la cedula:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 230, -1));

        btnsalir.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        btnsalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/iconos/espe/icono_volver48.png"))); // NOI18N
        btnsalir.setText("Salir");
        btnsalir.setContentAreaFilled(false);
        btnsalir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnsalir.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnsalir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 250, 60, 80));

        txt_cedula.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        getContentPane().add(txt_cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, 120, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/fondos/espe/fondo_inicioAdmin.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 600, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CitasActionPerformed
        abrirConsultarCitas();
    }//GEN-LAST:event_CitasActionPerformed

    private void btnUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuariosActionPerformed
        abrirConsultarRegistro();
    }//GEN-LAST:event_btnUsuariosActionPerformed

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        dispose();
        LoginUsuario menu = new LoginUsuario();
        menu.setVisible(true);
        menu.setLocationRelativeTo(null);
        setVisible(false);
    }//GEN-LAST:event_btnsalirActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new inicioAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Citas;
    private javax.swing.JButton btnUsuarios;
    private javax.swing.JButton btnsalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel labelNombreAdmin;
    private javax.swing.JLabel txt_cedula;
    // End of variables declaration//GEN-END:variables
}
