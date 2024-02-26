package proyecto.gui.espe;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import org.bson.Document;
import proyecto.dao.espe.Conexion;

public class RegistrarUsuario extends javax.swing.JFrame {

    Conexion conn = new Conexion();
    MongoDatabase database;

    public RegistrarUsuario() {
        if (conn != null) {
            conn = conn.crearConexion();
            database = conn.getDataB();
        }
        initComponents();
        txtPaciente.requestFocus();
        lblMensajeError.setVisible(false);
    }

    private boolean verificarDatos() {
        boolean validar = false;
        if ((txtPaciente.getText().length() > 0) && (jContrasena.getPassword().length > 0) && (jConfContrasena.getPassword().length > 0)) {
            validar = true;
        }
        return validar;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopRegistro = new javax.swing.JDesktopPane();
        lblFondo = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        lblContra = new javax.swing.JLabel();
        lblConfirmarContra = new javax.swing.JLabel();
        btnRegistrarUsuario = new javax.swing.JToggleButton();
        txtPaciente = new javax.swing.JTextField();
        jContrasena = new javax.swing.JPasswordField();
        lblMensajeError = new javax.swing.JLabel();
        jConfContrasena = new javax.swing.JPasswordField();
        btnRegresar = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jDesktopRegistro.setPreferredSize(new java.awt.Dimension(642, 481));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/fondos/espe/fondo_registro.png"))); // NOI18N

        lblTitulo.setFont(new java.awt.Font("Cooper Black", 2, 20)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(0, 51, 255));
        lblTitulo.setText("Registrar Usuario");

        lblUsuario.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        lblUsuario.setText("Usuario");

        lblContra.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        lblContra.setText("Contraseña");

        lblConfirmarContra.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        lblConfirmarContra.setText("Confirmar Contraseña");

        btnRegistrarUsuario.setFont(new java.awt.Font("Berlin Sans FB", 0, 16)); // NOI18N
        btnRegistrarUsuario.setText("Registrar Nuevo Usuario");
        btnRegistrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarUsuarioActionPerformed(evt);
            }
        });

        txtPaciente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPacienteKeyTyped(evt);
            }
        });

        jContrasena.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jContrasenaFocusGained(evt);
            }
        });
        jContrasena.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jContrasenaKeyTyped(evt);
            }
        });

        lblMensajeError.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblMensajeError.setForeground(new java.awt.Color(204, 0, 255));
        lblMensajeError.setText("La contraseñas no coinciden.");

        jConfContrasena.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jConfContrasenaFocusGained(evt);
            }
        });
        jConfContrasena.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jConfContrasenaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jConfContrasenaKeyTyped(evt);
            }
        });

        btnRegresar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/iconos/espe/icono_volver48.png"))); // NOI18N
        btnRegresar.setText("  Volver");
        btnRegresar.setContentAreaFilled(false);
        btnRegresar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/iconos/espe/icono_volver48.png"))); // NOI18N
        btnRegresar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/iconos/espe/icono_volver64.png"))); // NOI18N
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        jDesktopRegistro.setLayer(lblFondo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopRegistro.setLayer(lblTitulo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopRegistro.setLayer(lblUsuario, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopRegistro.setLayer(lblContra, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopRegistro.setLayer(lblConfirmarContra, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopRegistro.setLayer(btnRegistrarUsuario, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopRegistro.setLayer(txtPaciente, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopRegistro.setLayer(jContrasena, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopRegistro.setLayer(lblMensajeError, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopRegistro.setLayer(jConfContrasena, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopRegistro.setLayer(btnRegresar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopRegistroLayout = new javax.swing.GroupLayout(jDesktopRegistro);
        jDesktopRegistro.setLayout(jDesktopRegistroLayout);
        jDesktopRegistroLayout.setHorizontalGroup(
            jDesktopRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopRegistroLayout.createSequentialGroup()
                .addGroup(jDesktopRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopRegistroLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(lblContra))
                    .addGroup(jDesktopRegistroLayout.createSequentialGroup()
                        .addGap(226, 226, 226)
                        .addComponent(lblMensajeError, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDesktopRegistroLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(lblConfirmarContra))
                    .addGroup(jDesktopRegistroLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDesktopRegistroLayout.createSequentialGroup()
                        .addGap(226, 226, 226)
                        .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDesktopRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jConfContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jDesktopRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jDesktopRegistroLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(txtPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jDesktopRegistroLayout.createSequentialGroup()
                                .addGap(226, 226, 226)
                                .addComponent(jContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jDesktopRegistroLayout.createSequentialGroup()
                        .addGap(209, 209, 209)
                        .addComponent(btnRegistrarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
            .addGroup(jDesktopRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jDesktopRegistroLayout.createSequentialGroup()
                    .addGap(1, 1, 1)
                    .addComponent(lblFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(2, 2, 2)))
        );
        jDesktopRegistroLayout.setVerticalGroup(
            jDesktopRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopRegistroLayout.createSequentialGroup()
                .addGroup(jDesktopRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopRegistroLayout.createSequentialGroup()
                        .addGap(209, 209, 209)
                        .addComponent(lblContra, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(jConfContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDesktopRegistroLayout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addComponent(jContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDesktopRegistroLayout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(txtPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jDesktopRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopRegistroLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(lblMensajeError)
                        .addGap(43, 43, 43)
                        .addComponent(btnRegistrarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(62, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopRegistroLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(jDesktopRegistroLayout.createSequentialGroup()
                .addGroup(jDesktopRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopRegistroLayout.createSequentialGroup()
                        .addGap(282, 282, 282)
                        .addComponent(lblConfirmarContra))
                    .addGroup(jDesktopRegistroLayout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDesktopRegistroLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jDesktopRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jDesktopRegistroLayout.createSequentialGroup()
                    .addGap(3, 3, 3)
                    .addComponent(lblFondo)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jDesktopRegistro.getAccessibleContext().setAccessibleDescription("");
        jDesktopRegistro.getAccessibleContext().setAccessibleParent(jDesktopRegistro);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarUsuarioActionPerformed
        if (verificarDatos()) {
            char[] contrasenaChars = jContrasena.getPassword();
            char[] confirmarContrasenaChars = jConfContrasena.getPassword();

            String contrasena = new String(contrasenaChars);
            String confirmarContrasena = new String(confirmarContrasenaChars);

            if (contrasena.equals(confirmarContrasena)) {
                MongoCollection coleccion = database.getCollection("registros_usuarios");

                Document filtro = new Document("usuario", txtPaciente.getText());
                long count = coleccion.countDocuments(filtro);

                if (count == 0) {
                    Document documento = new Document("usuario", txtPaciente.getText())
                            .append("contrasena", contrasena);
                    coleccion.insertOne(documento);

                    JOptionPane.showMessageDialog(rootPane, "Usuario Registrado Existosamente.");
                    dispose();
                    lblMensajeError.setVisible(false);
                    txtPaciente.setText("");
                    jContrasena.setText("");
                    jConfContrasena.setText("");
                    btnRegistrarUsuario.setSelected(false);
                    LoginUsuario logueo = new LoginUsuario();
                    logueo.setVisible(true);
                    logueo.setLocationRelativeTo(null);
                } else {
                    txtPaciente.setText("");
                    btnRegistrarUsuario.setSelected(false);
                    txtPaciente.requestFocus();
                    JOptionPane.showMessageDialog(null, "El usuario ya existe. Por favor, elija otro nombre de usuario.");
                }
            } else {
                lblMensajeError.setVisible(true);
                btnRegistrarUsuario.setSelected(false);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese todos los campos");
            btnRegistrarUsuario.setSelected(false);
        }
    }//GEN-LAST:event_btnRegistrarUsuarioActionPerformed

    private void txtPacienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPacienteKeyTyped
        char validacionPaciente = evt.getKeyChar();
        if (txtPaciente.getText().length() >= 20) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Se alcanzo el limite de carácteres permitidos.");
        }
        if (Character.isDigit(validacionPaciente)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "Ingrese solo letras");
        }
    }//GEN-LAST:event_txtPacienteKeyTyped

    private void jConfContrasenaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jConfContrasenaFocusGained
        lblMensajeError.setVisible(false);
    }//GEN-LAST:event_jConfContrasenaFocusGained

    private void jContrasenaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jContrasenaFocusGained
        lblMensajeError.setVisible(false);
    }//GEN-LAST:event_jContrasenaFocusGained

    private void jConfContrasenaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jConfContrasenaKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnRegistrarUsuarioActionPerformed(null);
        }
    }//GEN-LAST:event_jConfContrasenaKeyReleased

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        dispose();
        LoginUsuario logueo = new LoginUsuario();
        logueo.setVisible(true);
        logueo.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void jContrasenaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jContrasenaKeyTyped
        if (new String(jContrasena.getPassword()).length() >= 40) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Se alcanzo el limite de carácteres permitidos.");
        }
    }//GEN-LAST:event_jContrasenaKeyTyped

    private void jConfContrasenaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jConfContrasenaKeyTyped
        if (new String(jConfContrasena.getPassword()).length() >= 40) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Se alcanzo el limite de carácteres permitidos.");

        }
    }//GEN-LAST:event_jConfContrasenaKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnRegistrarUsuario;
    private javax.swing.JToggleButton btnRegresar;
    private javax.swing.JPasswordField jConfContrasena;
    private javax.swing.JPasswordField jContrasena;
    private javax.swing.JDesktopPane jDesktopRegistro;
    private javax.swing.JLabel lblConfirmarContra;
    private javax.swing.JLabel lblContra;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblMensajeError;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JTextField txtPaciente;
    // End of variables declaration//GEN-END:variables
}
