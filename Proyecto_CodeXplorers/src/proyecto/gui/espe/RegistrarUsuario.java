package proyecto.gui.espe;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import org.bson.Document;
import proyecto.conexion.espe.Conexion;

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
        jLabel1 = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        lblContra = new javax.swing.JLabel();
        lblConfirmarContra = new javax.swing.JLabel();
        txtPaciente = new javax.swing.JTextField();
        btnRegistrarUsuario = new javax.swing.JToggleButton();
        lblMensajeError = new javax.swing.JLabel();
        jContrasena = new javax.swing.JPasswordField();
        jConfContrasena = new javax.swing.JPasswordField();
        btnRegresar = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jDesktopRegistro.setPreferredSize(new java.awt.Dimension(833, 481));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/fondos/espe/fondo_registro.png"))); // NOI18N

        lblTitulo.setFont(new java.awt.Font("Cooper Black", 2, 20)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(0, 51, 255));
        lblTitulo.setText("Registrar Usuario");

        lblUsuario.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        lblUsuario.setText("Usuario");

        lblContra.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        lblContra.setText("Contraseña");

        lblConfirmarContra.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        lblConfirmarContra.setText("Confirmar Contraseña");

        txtPaciente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPacienteKeyTyped(evt);
            }
        });

        btnRegistrarUsuario.setFont(new java.awt.Font("Berlin Sans FB", 0, 16)); // NOI18N
        btnRegistrarUsuario.setText("Registrar Nuevo Usuario");
        btnRegistrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarUsuarioActionPerformed(evt);
            }
        });

        lblMensajeError.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblMensajeError.setForeground(new java.awt.Color(204, 0, 255));
        lblMensajeError.setText("La contraseñas no coinciden.");

        jContrasena.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jContrasenaFocusGained(evt);
            }
        });

        jConfContrasena.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jConfContrasenaFocusGained(evt);
            }
        });
        jConfContrasena.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jConfContrasenaKeyReleased(evt);
            }
        });

        btnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/iconos/espe/icono_regresar.png"))); // NOI18N
        btnRegresar.setContentAreaFilled(false);
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        jDesktopRegistro.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopRegistro.setLayer(lblTitulo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopRegistro.setLayer(lblUsuario, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopRegistro.setLayer(lblContra, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopRegistro.setLayer(lblConfirmarContra, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopRegistro.setLayer(txtPaciente, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopRegistro.setLayer(btnRegistrarUsuario, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopRegistro.setLayer(lblMensajeError, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopRegistro.setLayer(jContrasena, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopRegistro.setLayer(jConfContrasena, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopRegistro.setLayer(btnRegresar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopRegistroLayout = new javax.swing.GroupLayout(jDesktopRegistro);
        jDesktopRegistro.setLayout(jDesktopRegistroLayout);
        jDesktopRegistroLayout.setHorizontalGroup(
            jDesktopRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopRegistroLayout.createSequentialGroup()
                .addGap(226, 226, 226)
                .addComponent(jContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jDesktopRegistroLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(lblContra))
            .addGroup(jDesktopRegistroLayout.createSequentialGroup()
                .addGap(209, 209, 209)
                .addComponent(btnRegistrarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jDesktopRegistroLayout.createSequentialGroup()
                .addGap(518, 518, 518)
                .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jDesktopRegistroLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(lblConfirmarContra))
            .addGroup(jDesktopRegistroLayout.createSequentialGroup()
                .addGap(226, 226, 226)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jDesktopRegistroLayout.createSequentialGroup()
                .addGap(226, 226, 226)
                .addComponent(lblMensajeError, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jDesktopRegistroLayout.createSequentialGroup()
                .addGap(226, 226, 226)
                .addComponent(jConfContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jDesktopRegistroLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(lblUsuario)
                .addGap(127, 127, 127)
                .addComponent(txtPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 737, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jDesktopRegistroLayout.setVerticalGroup(
            jDesktopRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jDesktopRegistroLayout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(lblContra, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(lblConfirmarContra))
            .addGroup(jDesktopRegistroLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(txtPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jDesktopRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopRegistroLayout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(btnRegistrarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDesktopRegistroLayout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(lblMensajeError))
                    .addGroup(jDesktopRegistroLayout.createSequentialGroup()
                        .addGroup(jDesktopRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopRegistroLayout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jDesktopRegistroLayout.createSequentialGroup()
                                .addGap(81, 81, 81)
                                .addComponent(jConfContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(123, 123, 123)
                        .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopRegistro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 599, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                MongoCollection coleccion = database.getCollection("registros");

                Document filtro = new Document("paciente", txtPaciente.getText());
                long count = coleccion.countDocuments(filtro);

                if (count == 0) {
                    Document documento = new Document("paciente", txtPaciente.getText())
                            .append("contrasena", contrasena)
                            .append("tipo", "paciente");
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnRegistrarUsuario;
    private javax.swing.JToggleButton btnRegresar;
    private javax.swing.JPasswordField jConfContrasena;
    private javax.swing.JPasswordField jContrasena;
    private javax.swing.JDesktopPane jDesktopRegistro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblConfirmarContra;
    private javax.swing.JLabel lblContra;
    private javax.swing.JLabel lblMensajeError;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JTextField txtPaciente;
    // End of variables declaration//GEN-END:variables
}
