package proyecto.gui.espe;

public class MenuPrincipal extends javax.swing.JFrame {

    public MenuPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblBienvenidos = new javax.swing.JLabel();
        lblSesion = new javax.swing.JLabel();
        btnAdmin = new javax.swing.JToggleButton();
        btnDoctor = new javax.swing.JToggleButton();
        btnUsuario = new javax.swing.JToggleButton();
        lblDoctor = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        lblAdministrador = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblBienvenidos.setFont(new java.awt.Font("Bauhaus 93", 0, 28)); // NOI18N
        lblBienvenidos.setForeground(new java.awt.Color(255, 255, 255));
        lblBienvenidos.setText("Bienvenidos a \" ALD - Salud y Bienestar \"");
        jPanel1.add(lblBienvenidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 500, 30));

        lblSesion.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        lblSesion.setForeground(new java.awt.Color(255, 255, 255));
        lblSesion.setText("Iniciar sesión como :");
        jPanel1.add(lblSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, -1, -1));

        btnAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/iconos/espe/icono_admin72.png"))); // NOI18N
        btnAdmin.setContentAreaFilled(false);
        btnAdmin.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/iconos/espe/icono_admin72.png"))); // NOI18N
        btnAdmin.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/iconos/espe/icono_admin96.png"))); // NOI18N
        btnAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminActionPerformed(evt);
            }
        });
        jPanel1.add(btnAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 130, 120));

        btnDoctor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/iconos/espe/icono_medico72.png"))); // NOI18N
        btnDoctor.setContentAreaFilled(false);
        btnDoctor.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/iconos/espe/icono_medico72.png"))); // NOI18N
        btnDoctor.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/iconos/espe/icono_medico96.png"))); // NOI18N
        btnDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoctorActionPerformed(evt);
            }
        });
        jPanel1.add(btnDoctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 150, 120, 110));

        btnUsuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnUsuario.setForeground(new java.awt.Color(255, 255, 255));
        btnUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/iconos/espe/icono_usuario96.png"))); // NOI18N
        btnUsuario.setContentAreaFilled(false);
        btnUsuario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnUsuario.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/iconos/espe/icono_usuario96.png"))); // NOI18N
        btnUsuario.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/iconos/espe/icono_usuario128.png"))); // NOI18N
        btnUsuario.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(btnUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 110, 120));

        lblDoctor.setFont(new java.awt.Font("Imprint MT Shadow", 1, 17)); // NOI18N
        lblDoctor.setForeground(new java.awt.Color(255, 255, 255));
        lblDoctor.setText("Doctor/a");
        jPanel1.add(lblDoctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 270, 130, -1));

        lblUsuario.setFont(new java.awt.Font("Imprint MT Shadow", 1, 17)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lblUsuario.setText("Usuario/a");
        jPanel1.add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 100, -1));

        lblAdministrador.setFont(new java.awt.Font("Imprint MT Shadow", 1, 17)); // NOI18N
        lblAdministrador.setForeground(new java.awt.Color(255, 255, 255));
        lblAdministrador.setText("Administrador");
        jPanel1.add(lblAdministrador, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 270, 130, -1));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/fondos/espe/fondo_menu.jpg"))); // NOI18N
        jPanel1.add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuarioActionPerformed
        dispose();
        LoginUsuario usuario = new LoginUsuario();
        usuario.setVisible(true);
        usuario.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnUsuarioActionPerformed

    private void btnAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminActionPerformed
        dispose();
        LoginAdmin admin = new LoginAdmin();
        admin.setVisible(true);
        admin.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnAdminActionPerformed

    private void btnDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoctorActionPerformed
        dispose();
        LoginDoctor doctor = new LoginDoctor();
        doctor.setVisible(true);
    doctor.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnDoctorActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MenuPrincipal menu = new MenuPrincipal();
                menu.setLocationRelativeTo(null);
                menu.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnAdmin;
    private javax.swing.JToggleButton btnDoctor;
    private javax.swing.JToggleButton btnUsuario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAdministrador;
    private javax.swing.JLabel lblBienvenidos;
    private javax.swing.JLabel lblDoctor;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblSesion;
    private javax.swing.JLabel lblUsuario;
    // End of variables declaration//GEN-END:variables
}
