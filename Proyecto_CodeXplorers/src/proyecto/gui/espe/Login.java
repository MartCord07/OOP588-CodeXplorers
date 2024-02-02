package proyecto.gui.espe;


import java.util.Date;
import javax.swing.JOptionPane;
import proyecto.conexion.espe.Conexion;


public class Login extends javax.swing.JFrame {

    public Login() {     
        initComponents();
        lblErrorLogin.setVisible(false);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        lblBienvenido = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        lblContraseña = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jContraseña = new javax.swing.JPasswordField();
        btnAcceder = new javax.swing.JToggleButton();
        btnRegistrar = new javax.swing.JToggleButton();
        lblErrorLogin = new javax.swing.JLabel();

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

        lblErrorLogin.setBackground(new java.awt.Color(255, 51, 51));
        lblErrorLogin.setForeground(new java.awt.Color(255, 51, 51));
        lblErrorLogin.setText("Usuario o Contraseña incorrectos!");

        jDesktopPane1.setLayer(lblBienvenido, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(lblUsuario, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(lblContraseña, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(txtUsuario, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jContraseña, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btnAcceder, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btnRegistrar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(lblErrorLogin, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(btnAcceder, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnRegistrar))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblErrorLogin)
                                    .addComponent(jContraseña, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                                    .addComponent(txtUsuario)))))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(lblBienvenido, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lblBienvenido)
                .addGap(37, 37, 37)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsuario)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblContraseña)
                    .addComponent(jContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblErrorLogin)
                .addGap(26, 26, 26)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAcceder)
                    .addComponent(btnRegistrar))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
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
    private javax.swing.JToggleButton btnAcceder;
    private javax.swing.JToggleButton btnRegistrar;
    private javax.swing.JPasswordField jContraseña;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel lblBienvenido;
    private javax.swing.JLabel lblContraseña;
    private javax.swing.JLabel lblErrorLogin;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
