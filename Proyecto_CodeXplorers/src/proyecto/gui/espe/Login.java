package proyecto.gui.espe;


import java.util.Date;
import javax.swing.JOptionPane;
import proyecto.conexion.espe.Conexion;


public class Login extends javax.swing.JFrame {

    public Login() {     
        initComponents();
        DesktopRegistrar.setVisible(false);
        lblErrorLogin.setVisible(false);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DesktopLogin = new javax.swing.JDesktopPane();
        lblBienvenido = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        lblContraseña = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jContraseña = new javax.swing.JPasswordField();
        btnAcceder = new javax.swing.JToggleButton();
        btnRegistrar = new javax.swing.JToggleButton();
        lblErrorLogin = new javax.swing.JLabel();
        DesktopRegistrar = new javax.swing.JDesktopPane();
        lblTitulo = new javax.swing.JLabel();
        lblRegistroUsuario = new javax.swing.JLabel();
        lblRegistroContraseña = new javax.swing.JLabel();
        lblRegisContraseñaConf = new javax.swing.JLabel();
        txtUsuarioRegistro = new javax.swing.JTextField();
        txtContraseñaRegistro = new javax.swing.JTextField();
        txtRegisContraseñaConf = new javax.swing.JTextField();
        jToggleButton1 = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblBienvenido.setFont(new java.awt.Font("Kristen ITC", 3, 14)); // NOI18N
        lblBienvenido.setForeground(new java.awt.Color(153, 255, 255));
        lblBienvenido.setText("Bienvenidos a \"ALD - Salud y Bienestar\"");

        lblUsuario.setFont(new java.awt.Font("Cooper Black", 2, 12)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(102, 255, 102));
        lblUsuario.setText("Usuario:");

        lblContraseña.setFont(new java.awt.Font("Cooper Black", 2, 12)); // NOI18N
        lblContraseña.setForeground(new java.awt.Color(102, 255, 102));
        lblContraseña.setText("Contraseña:");

        txtUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUsuarioFocusGained(evt);
            }
        });

        jContraseña.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jContraseñaFocusGained(evt);
            }
        });

        btnAcceder.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btnAcceder.setText("Acceder");
        btnAcceder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAccederMouseClicked(evt);
            }
        });

        btnRegistrar.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btnRegistrar.setText("Registrase");
        btnRegistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegistrarMouseClicked(evt);
            }
        });

        lblErrorLogin.setBackground(new java.awt.Color(255, 51, 51));
        lblErrorLogin.setForeground(new java.awt.Color(255, 51, 51));
        lblErrorLogin.setText("Usuario o Contraseña incorrectos!");

        DesktopLogin.setLayer(lblBienvenido, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DesktopLogin.setLayer(lblUsuario, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DesktopLogin.setLayer(lblContraseña, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DesktopLogin.setLayer(txtUsuario, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DesktopLogin.setLayer(jContraseña, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DesktopLogin.setLayer(btnAcceder, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DesktopLogin.setLayer(btnRegistrar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DesktopLogin.setLayer(lblErrorLogin, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout DesktopLoginLayout = new javax.swing.GroupLayout(DesktopLogin);
        DesktopLogin.setLayout(DesktopLoginLayout);
        DesktopLoginLayout.setHorizontalGroup(
            DesktopLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DesktopLoginLayout.createSequentialGroup()
                .addGroup(DesktopLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DesktopLoginLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(DesktopLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DesktopLoginLayout.createSequentialGroup()
                                .addComponent(btnAcceder, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnRegistrar))
                            .addGroup(DesktopLoginLayout.createSequentialGroup()
                                .addGroup(DesktopLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(DesktopLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblErrorLogin)
                                    .addComponent(jContraseña, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                                    .addComponent(txtUsuario)))))
                    .addGroup(DesktopLoginLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(lblBienvenido, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        DesktopLoginLayout.setVerticalGroup(
            DesktopLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DesktopLoginLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lblBienvenido)
                .addGap(37, 37, 37)
                .addGroup(DesktopLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsuario)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(DesktopLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblContraseña)
                    .addComponent(jContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblErrorLogin)
                .addGap(26, 26, 26)
                .addGroup(DesktopLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAcceder)
                    .addComponent(btnRegistrar))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        lblTitulo.setText("Registrar Usuario");

        lblRegistroUsuario.setText("Usuario");

        lblRegistroContraseña.setText("Contraseña");

        lblRegisContraseñaConf.setText("Repita Contraseña");

        DesktopRegistrar.setLayer(lblTitulo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DesktopRegistrar.setLayer(lblRegistroUsuario, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DesktopRegistrar.setLayer(lblRegistroContraseña, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DesktopRegistrar.setLayer(lblRegisContraseñaConf, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DesktopRegistrar.setLayer(txtUsuarioRegistro, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DesktopRegistrar.setLayer(txtContraseñaRegistro, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DesktopRegistrar.setLayer(txtRegisContraseñaConf, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DesktopRegistrar.setLayer(jToggleButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout DesktopRegistrarLayout = new javax.swing.GroupLayout(DesktopRegistrar);
        DesktopRegistrar.setLayout(DesktopRegistrarLayout);
        DesktopRegistrarLayout.setHorizontalGroup(
            DesktopRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DesktopRegistrarLayout.createSequentialGroup()
                .addGroup(DesktopRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DesktopRegistrarLayout.createSequentialGroup()
                        .addGap(203, 203, 203)
                        .addComponent(lblTitulo))
                    .addGroup(DesktopRegistrarLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(DesktopRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblRegistroUsuario)
                            .addComponent(lblRegisContraseñaConf)
                            .addComponent(lblRegistroContraseña))
                        .addGap(29, 29, 29)
                        .addGroup(DesktopRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtContraseñaRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRegisContraseñaConf, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUsuarioRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(199, Short.MAX_VALUE))
        );
        DesktopRegistrarLayout.setVerticalGroup(
            DesktopRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DesktopRegistrarLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(lblTitulo)
                .addGap(18, 18, 18)
                .addGroup(DesktopRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRegistroUsuario)
                    .addComponent(txtUsuarioRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(DesktopRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRegistroContraseña)
                    .addComponent(txtContraseñaRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(DesktopRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRegisContraseñaConf)
                    .addComponent(txtRegisContraseñaConf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DesktopLogin)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(DesktopRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DesktopLogin)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(DesktopRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAccederMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAccederMouseClicked
        String usuario = "paciente", admin = "admin", doctor = "doctor";
        String contraseñaUs = "123", contraseñaAd = "456", contraseñaDc = "789";

        String contra = new String(jContraseña.getPassword());
        if (txtUsuario.getText().equals(usuario) && contra.equals(contraseñaUs)) {
            Usuario paciente = new Usuario();
            paciente.setVisible(true);
            paciente.setLocationRelativeTo(null);
            txtUsuario.setText("");
            jContraseña.setText("");
        } else if (txtUsuario.getText().equals(admin) && contra.equals(contraseñaAd)) {
            Admin recepcionista = new Admin();
            recepcionista.setVisible(true);
            recepcionista.setLocationRelativeTo(null);
            txtUsuario.setText("");
            jContraseña.setText("");

        } else if (txtUsuario.getText().equals(doctor) && contra.equals(contraseñaDc)) {
            Doctor doc = new Doctor();
            doc.setVisible(true);
            doc.setLocationRelativeTo(null);
            txtUsuario.setText("");
            jContraseña.setText("");
            
        } else {
            lblErrorLogin.setVisible(true);
            btnAcceder.setSelected(false);
        }
    }//GEN-LAST:event_btnAccederMouseClicked

    private void jContraseñaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jContraseñaFocusGained
        lblErrorLogin.setVisible(false);
    }//GEN-LAST:event_jContraseñaFocusGained

    private void txtUsuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsuarioFocusGained
        lblErrorLogin.setVisible(false);
    }//GEN-LAST:event_txtUsuarioFocusGained

    private void btnRegistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarMouseClicked
        DesktopRegistrar.setVisible(true);
    }//GEN-LAST:event_btnRegistrarMouseClicked

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Login loginFrame = new Login();
                loginFrame.setLocationRelativeTo(null);
                loginFrame.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane DesktopLogin;
    private javax.swing.JDesktopPane DesktopRegistrar;
    private javax.swing.JToggleButton btnAcceder;
    private javax.swing.JToggleButton btnRegistrar;
    private javax.swing.JPasswordField jContraseña;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel lblBienvenido;
    private javax.swing.JLabel lblContraseña;
    private javax.swing.JLabel lblErrorLogin;
    private javax.swing.JLabel lblRegisContraseñaConf;
    private javax.swing.JLabel lblRegistroContraseña;
    private javax.swing.JLabel lblRegistroUsuario;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JTextField txtContraseñaRegistro;
    private javax.swing.JTextField txtRegisContraseñaConf;
    private javax.swing.JTextField txtUsuario;
    private javax.swing.JTextField txtUsuarioRegistro;
    // End of variables declaration//GEN-END:variables
}
