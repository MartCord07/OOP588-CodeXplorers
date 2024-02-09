package proyecto.gui.espe;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import java.awt.event.KeyEvent;
import org.bson.Document;
import javax.swing.JOptionPane;
import proyecto.conexion.espe.Conexion;

public class Login extends javax.swing.JFrame {

    Conexion conn = new Conexion();
    MongoDatabase database;

    public Login() {
        if (conn != null) {
            conn = conn.crearConexion();
            database = conn.getDataB();
        }
        initComponents();
        txtUsuario.requestFocus();
        lblErrorLogin.setVisible(false);
        lblErrorContraseña.setVisible(false);
        lblErrorUsuario.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DesktopLogin = new javax.swing.JDesktopPane();
        lblFondo = new javax.swing.JLabel();
        lblBienvenido = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        lblContraseña = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jContraseña = new javax.swing.JPasswordField();
        btnAcceder = new javax.swing.JToggleButton();
        btnRegistrar = new javax.swing.JToggleButton();
        lblErrorLogin = new javax.swing.JLabel();
        lblRegistrar = new javax.swing.JLabel();
        lblErrorUsuario = new javax.swing.JLabel();
        lblErrorContraseña = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblFondo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/fondos/espe/fondo_login.jpg"))); // NOI18N

        lblBienvenido.setFont(new java.awt.Font("Kristen ITC", 3, 18)); // NOI18N
        lblBienvenido.setText("Bienvenidos a \"ALD - Salud y Bienestar\"");

        lblUsuario.setFont(new java.awt.Font("Cooper Black", 2, 14)); // NOI18N
        lblUsuario.setText("Usuario:");

        lblContraseña.setFont(new java.awt.Font("Cooper Black", 2, 14)); // NOI18N
        lblContraseña.setText("Contraseña:");

        txtUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUsuarioFocusGained(evt);
            }
        });
        txtUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUsuarioKeyTyped(evt);
            }
        });

        jContraseña.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jContraseñaFocusGained(evt);
            }
        });
        jContraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jContraseñaKeyReleased(evt);
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
        btnRegistrar.setText("Registrarse");
        btnRegistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegistrarMouseClicked(evt);
            }
        });

        lblErrorLogin.setBackground(new java.awt.Color(255, 51, 51));
        lblErrorLogin.setForeground(new java.awt.Color(255, 51, 51));
        lblErrorLogin.setText("Usuario o Contraseña incorrectos!");

        lblRegistrar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblRegistrar.setText("¿No tienes cuenta aun?, regístrate aquí   –->");

        lblErrorUsuario.setForeground(new java.awt.Color(255, 0, 0));
        lblErrorUsuario.setText("Ingrese el Usuario.");

        lblErrorContraseña.setForeground(new java.awt.Color(255, 0, 0));
        lblErrorContraseña.setText("Ingrese la Contraseña.");

        DesktopLogin.setLayer(lblFondo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DesktopLogin.setLayer(lblBienvenido, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DesktopLogin.setLayer(lblUsuario, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DesktopLogin.setLayer(lblContraseña, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DesktopLogin.setLayer(txtUsuario, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DesktopLogin.setLayer(jContraseña, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DesktopLogin.setLayer(btnAcceder, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DesktopLogin.setLayer(btnRegistrar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DesktopLogin.setLayer(lblErrorLogin, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DesktopLogin.setLayer(lblRegistrar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DesktopLogin.setLayer(lblErrorUsuario, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DesktopLogin.setLayer(lblErrorContraseña, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout DesktopLoginLayout = new javax.swing.GroupLayout(DesktopLogin);
        DesktopLogin.setLayout(DesktopLoginLayout);
        DesktopLoginLayout.setHorizontalGroup(
            DesktopLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DesktopLoginLayout.createSequentialGroup()
                .addGap(537, 537, 537)
                .addComponent(lblRegistrar))
            .addGroup(DesktopLoginLayout.createSequentialGroup()
                .addGap(667, 667, 667)
                .addComponent(lblErrorContraseña))
            .addGroup(DesktopLoginLayout.createSequentialGroup()
                .addGap(631, 631, 631)
                .addComponent(lblErrorLogin))
            .addGroup(DesktopLoginLayout.createSequentialGroup()
                .addGap(667, 667, 667)
                .addComponent(lblErrorUsuario))
            .addGroup(DesktopLoginLayout.createSequentialGroup()
                .addGap(555, 555, 555)
                .addComponent(lblContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(DesktopLoginLayout.createSequentialGroup()
                .addGap(689, 689, 689)
                .addComponent(btnAcceder, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(DesktopLoginLayout.createSequentialGroup()
                .addGap(667, 667, 667)
                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(DesktopLoginLayout.createSequentialGroup()
                .addGap(826, 826, 826)
                .addComponent(btnRegistrar))
            .addGroup(DesktopLoginLayout.createSequentialGroup()
                .addGap(667, 667, 667)
                .addComponent(jContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(DesktopLoginLayout.createSequentialGroup()
                .addGap(537, 537, 537)
                .addComponent(lblBienvenido, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(DesktopLoginLayout.createSequentialGroup()
                .addGap(573, 573, 573)
                .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(lblFondo)
        );
        DesktopLoginLayout.setVerticalGroup(
            DesktopLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DesktopLoginLayout.createSequentialGroup()
                .addGap(290, 290, 290)
                .addComponent(lblRegistrar))
            .addGroup(DesktopLoginLayout.createSequentialGroup()
                .addGap(173, 173, 173)
                .addComponent(lblErrorContraseña))
            .addGroup(DesktopLoginLayout.createSequentialGroup()
                .addGap(230, 230, 230)
                .addComponent(lblErrorLogin))
            .addGroup(DesktopLoginLayout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(lblErrorUsuario))
            .addGroup(DesktopLoginLayout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addComponent(lblContraseña))
            .addGroup(DesktopLoginLayout.createSequentialGroup()
                .addGap(195, 195, 195)
                .addComponent(btnAcceder))
            .addGroup(DesktopLoginLayout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(DesktopLoginLayout.createSequentialGroup()
                .addGap(287, 287, 287)
                .addComponent(btnRegistrar))
            .addGroup(DesktopLoginLayout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addComponent(jContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(DesktopLoginLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(lblBienvenido))
            .addGroup(DesktopLoginLayout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(lblUsuario))
            .addComponent(lblFondo)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DesktopLogin)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DesktopLogin)
        );

        DesktopLogin.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAccederMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAccederMouseClicked
        String nombreUsuario = txtUsuario.getText();
        char[] contrasenaChars = jContraseña.getPassword();
        String contrasena = new String(contrasenaChars);

        MongoCollection<Document> coleccion = database.getCollection("registros");
        Document query = new Document("paciente", nombreUsuario)
                .append("contrasena", contrasena);

        try (MongoCursor<Document> cursor = coleccion.find(query).iterator()) {
            if (txtUsuario.getText().length() > 0 && jContraseña.getPassword().length > 0) {
                if (cursor.hasNext()) {
                    String tipoUsuario = cursor.next().getString("tipo");

                    switch (tipoUsuario) {
                        case "paciente":
                            Usuario paciente = new Usuario();
                            paciente.setVisible(true);
                            paciente.setLocationRelativeTo(null);
                            btnAcceder.setSelected(false);
                            break;
                        case "admin":
                            Admin recepcionista = new Admin();
                            recepcionista.setVisible(true);
                            recepcionista.setLocationRelativeTo(null);
                            btnAcceder.setSelected(false);
                            break;
                        case "doctor":
                            AtencionMedica doc = new AtencionMedica();
                            doc.setVisible(true);
                            doc.setLocationRelativeTo(null);
                            btnAcceder.setSelected(false);
                            break;
                    }
                    txtUsuario.setText("");
                    jContraseña.setText("");
                    lblErrorLogin.setVisible(false);
                } else {
                    lblErrorLogin.setVisible(true);
                    btnAcceder.setSelected(false);
                }
            } else if (txtUsuario.getText().length() == 0 && jContraseña.getPassword().length == 0) {
                lblErrorContraseña.setVisible(true);
                lblErrorUsuario.setVisible(true);
                btnAcceder.setSelected(false);
            } else if (txtUsuario.getText().length() > 0 && jContraseña.getPassword().length == 0) {
                lblErrorContraseña.setVisible(true);
                btnAcceder.setSelected(false);
            } else if (txtUsuario.getText().length() == 0 && jContraseña.getPassword().length > 0) {
                lblErrorUsuario.setVisible(true);
                btnAcceder.setSelected(false);
            }
        }
    }//GEN-LAST:event_btnAccederMouseClicked

    private void jContraseñaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jContraseñaFocusGained
        lblErrorLogin.setVisible(false);
        lblErrorContraseña.setVisible(false);
        
    }//GEN-LAST:event_jContraseñaFocusGained

    private void txtUsuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsuarioFocusGained
        lblErrorLogin.setVisible(false);
        lblErrorUsuario.setVisible(false);
    }//GEN-LAST:event_txtUsuarioFocusGained

    private void btnRegistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarMouseClicked
        dispose();
        RegistrarUsuario registro = new RegistrarUsuario();
        registro.setVisible(true);
        registro.setLocationRelativeTo(null);
        btnRegistrar.setSelected(false);
        txtUsuario.requestFocus();
    }//GEN-LAST:event_btnRegistrarMouseClicked

    private void txtUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyTyped
        char validacionPaciente = evt.getKeyChar();
        if (Character.isDigit(validacionPaciente)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "Ingrese solo letras");
        }
    }//GEN-LAST:event_txtUsuarioKeyTyped

    private void jContraseñaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jContraseñaKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnAccederMouseClicked(null);
        }
    }//GEN-LAST:event_jContraseñaKeyReleased

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
    private javax.swing.JToggleButton btnAcceder;
    private javax.swing.JToggleButton btnRegistrar;
    private javax.swing.JPasswordField jContraseña;
    private javax.swing.JLabel lblBienvenido;
    private javax.swing.JLabel lblContraseña;
    private javax.swing.JLabel lblErrorContraseña;
    private javax.swing.JLabel lblErrorLogin;
    private javax.swing.JLabel lblErrorUsuario;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblRegistrar;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
