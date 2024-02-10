package proyecto.gui.espe;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import java.awt.event.KeyEvent;
import org.bson.Document;
import javax.swing.JOptionPane;
import proyecto.conexion.espe.Conexion;

public class LoginUsuario extends javax.swing.JFrame {

    Conexion conn = new Conexion();
    MongoDatabase database;

    public LoginUsuario() {
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
        btnRegresar = new javax.swing.JToggleButton();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        DesktopLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblBienvenido.setFont(new java.awt.Font("Kristen ITC", 3, 20)); // NOI18N
        lblBienvenido.setText("\"ALD - Salud y Bienestar\"");
        DesktopLogin.add(lblBienvenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 30, 290, -1));

        lblUsuario.setFont(new java.awt.Font("Cooper Black", 2, 14)); // NOI18N
        lblUsuario.setText("Usuario:");
        DesktopLogin.add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(573, 84, 76, -1));

        lblContraseña.setFont(new java.awt.Font("Cooper Black", 2, 14)); // NOI18N
        lblContraseña.setText("Contraseña:");
        DesktopLogin.add(lblContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(555, 148, 94, -1));

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
        DesktopLogin.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(667, 81, 229, -1));

        jContraseña.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jContraseñaFocusGained(evt);
            }
        });
        jContraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jContraseñaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jContraseñaKeyTyped(evt);
            }
        });
        DesktopLogin.add(jContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(667, 145, 229, -1));

        btnAcceder.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btnAcceder.setText("Acceder");
        btnAcceder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAccederMouseClicked(evt);
            }
        });
        DesktopLogin.add(btnAcceder, new org.netbeans.lib.awtextra.AbsoluteConstraints(689, 195, 120, -1));

        btnRegistrar.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btnRegistrar.setText("Registrarse");
        btnRegistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegistrarMouseClicked(evt);
            }
        });
        DesktopLogin.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(826, 293, -1, -1));

        lblErrorLogin.setBackground(new java.awt.Color(255, 51, 51));
        lblErrorLogin.setForeground(new java.awt.Color(255, 51, 51));
        lblErrorLogin.setText("Usuario o Contraseña incorrectos!");
        DesktopLogin.add(lblErrorLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(631, 230, -1, -1));

        lblRegistrar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblRegistrar.setText("¿No tienes cuenta aun?, regístrate aquí   –->");
        DesktopLogin.add(lblRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(533, 293, -1, -1));

        lblErrorUsuario.setForeground(new java.awt.Color(255, 0, 0));
        lblErrorUsuario.setText("Ingrese el Usuario.");
        DesktopLogin.add(lblErrorUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(667, 109, -1, -1));

        lblErrorContraseña.setForeground(new java.awt.Color(255, 0, 0));
        lblErrorContraseña.setText("Ingrese la Contraseña.");
        DesktopLogin.add(lblErrorContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(667, 173, -1, -1));

        btnRegresar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/iconos/espe/icono_volver48.png"))); // NOI18N
        btnRegresar.setText("    Atrás");
        btnRegresar.setContentAreaFilled(false);
        btnRegresar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnRegresar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnRegresar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/iconos/espe/icono_volver48.png"))); // NOI18N
        btnRegresar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/iconos/espe/icono_volver64.png"))); // NOI18N
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        DesktopLogin.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 263, 146, 83));

        lblFondo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/fondos/espe/fondo_login.jpg"))); // NOI18N
        DesktopLogin.add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DesktopLogin)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DesktopLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        DesktopLogin.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAccederMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAccederMouseClicked
        String nombreUsuario = txtUsuario.getText();
        char[] contrasenaChars = jContraseña.getPassword();
        String contrasena = new String(contrasenaChars);

        MongoCollection<Document> coleccion = database.getCollection("registros_usuarios");

        Document query = new Document("usuario", nombreUsuario)
                .append("contrasena", contrasena);

        try (MongoCursor<Document> cursor = coleccion.find(query).iterator()) {
            if (txtUsuario.getText().length() > 0 && jContraseña.getPassword().length > 0) {
                if (cursor.hasNext()) {
                    Usuario usuario = new Usuario();
                    usuario.setVisible(true);
                    usuario.setLocationRelativeTo(null);
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
        if (txtUsuario.getText().length() >= 20) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Se alcanzo el limite de carácteres permitidos.");
        }
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

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        dispose();
        MenuPrincipal menu = new MenuPrincipal();
        menu.setVisible(true);
        menu.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void jContraseñaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jContraseñaKeyTyped
        if (new String(jContraseña.getPassword()).length() >= 40) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Se alcanzo el limite de carácteres permitidos.");
        }
    }//GEN-LAST:event_jContraseñaKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane DesktopLogin;
    private javax.swing.JToggleButton btnAcceder;
    private javax.swing.JToggleButton btnRegistrar;
    private javax.swing.JToggleButton btnRegresar;
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
