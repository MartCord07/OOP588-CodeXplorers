package proyecto.vista.perfil.espe;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import proyecto.modelo.espe.Perfil;
import proyecto.servicio.espe.PerfilServicio;

public class RegistrarUsuario extends javax.swing.JFrame {
    
    public RegistrarUsuario() {
        initComponents();
        txtPaciente.requestFocus();
        lblMensajeError.setVisible(false);
        lblmsusuario.setVisible(false);
        lblmsconfcontra.setVisible(false);
        lblmscontra.setVisible(false);
    }
    
    private void LimpiarDatos() {
        lblMensajeError.setVisible(false);
        txtPaciente.setText("");
        jContrasena.setText("");
        jConfContrasena.setText("");
        btnRegistrarUsuario.setSelected(false);
    }
    
    private void LimpiarRepetido() {
        txtPaciente.setText("");
        btnRegistrarUsuario.setSelected(false);
    }
    
    public static boolean validarcedula(String input) {
        
        if (input.matches("\\d{10}")) {
            int[] A = new int[10];
            int sumpares = 0, sumimpar = 0, s, mul, sumat;
            
            for (int i = 0; i < 10; i++) {
                A[i] = Character.getNumericValue(input.charAt(i));
            }
            
            for (int i = 0; i < 9; i += 2) {
                mul = A[i] * 2;
                if (mul > 9) {
                    mul -= 9;
                }
                sumpares += mul;
            }
            
            for (int i = 1; i < 9; i += 2) {
                sumimpar += A[i];
            }
            
            sumat = sumpares + sumimpar;
            s = 10 - (sumat % 10);
            
            if (s == 10) {
                s = 0;
            }
            
            return s == A[9];
        } else {
            return false;
        }
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
        lblmsconfcontra = new javax.swing.JLabel();
        lblmsusuario = new javax.swing.JLabel();
        lblmscontra = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jDesktopRegistro.setPreferredSize(new java.awt.Dimension(642, 481));
        jDesktopRegistro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setFont(new java.awt.Font("Cooper Black", 2, 20)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(0, 51, 255));
        lblTitulo.setText("Registrar Usuario");
        jDesktopRegistro.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(226, 58, 189, 62));

        lblUsuario.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        lblUsuario.setText("Cédula");
        jDesktopRegistro.add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 156, 70, 28));

        lblContra.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        lblContra.setText("Contraseña");
        jDesktopRegistro.add(lblContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 209, -1, 41));

        lblConfirmarContra.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        lblConfirmarContra.setText("Confirmar Contraseña");
        jDesktopRegistro.add(lblConfirmarContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 282, -1, -1));

        btnRegistrarUsuario.setFont(new java.awt.Font("Berlin Sans FB", 0, 16)); // NOI18N
        btnRegistrarUsuario.setText("Registrar Nuevo Usuario");
        btnRegistrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarUsuarioActionPerformed(evt);
            }
        });
        jDesktopRegistro.add(btnRegistrarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 384, 210, 38));

        txtPaciente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPacienteFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPacienteFocusLost(evt);
            }
        });
        txtPaciente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPacienteKeyTyped(evt);
            }
        });
        jDesktopRegistro.add(txtPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(226, 162, 253, -1));

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
        jDesktopRegistro.add(jContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(226, 208, 253, -1));

        lblMensajeError.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblMensajeError.setForeground(new java.awt.Color(255, 51, 51));
        lblMensajeError.setText("Error!, La contraseñas no coinciden.");
        jDesktopRegistro.add(lblMensajeError, new org.netbeans.lib.awtextra.AbsoluteConstraints(226, 321, 260, -1));

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
        jDesktopRegistro.add(jConfContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(226, 265, 253, -1));

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
        jDesktopRegistro.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(467, 409, 161, 75));

        lblmsconfcontra.setFont(new java.awt.Font("Footlight MT Light", 1, 12)); // NOI18N
        lblmsconfcontra.setForeground(new java.awt.Color(255, 51, 51));
        lblmsconfcontra.setText("* campo obligatorio");
        jDesktopRegistro.add(lblmsconfcontra, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 270, -1, -1));

        lblmsusuario.setFont(new java.awt.Font("Footlight MT Light", 1, 12)); // NOI18N
        lblmsusuario.setForeground(new java.awt.Color(255, 51, 51));
        lblmsusuario.setText("* campo obligatorio");
        jDesktopRegistro.add(lblmsusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 170, -1, -1));

        lblmscontra.setFont(new java.awt.Font("Footlight MT Light", 1, 12)); // NOI18N
        lblmscontra.setForeground(new java.awt.Color(255, 51, 51));
        lblmscontra.setText("* campo obligatorio");
        jDesktopRegistro.add(lblmscontra, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 220, -1, -1));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/fondos/espe/fondo_registro.png"))); // NOI18N
        jDesktopRegistro.add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 3, 650, -1));

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
        if ((txtPaciente.getText().length() > 0) && (jContrasena.getPassword().length > 0) && (jConfContrasena.getPassword().length > 0)) {
            char[] contrasenaChars = jContrasena.getPassword();
            char[] confirmarContrasenaChars = jConfContrasena.getPassword();
            
            String contrasenaa = new String(contrasenaChars);
            String confirmarContrasena = new String(confirmarContrasenaChars);
            
            if (contrasenaa.equals(confirmarContrasena)) {
                Perfil RegistrarPaciente = new Perfil(
                        txtPaciente.getText(),
                        contrasenaa);
                if (PerfilServicio.RegistrarPerfil(RegistrarPaciente)) {
                    JOptionPane.showMessageDialog(rootPane, "Usuario Registrado Existosamente.");
                    LimpiarDatos();
                    this.dispose();
                    LoginUsuario logueo = new LoginUsuario();
                    logueo.setVisible(true);
                    logueo.setLocationRelativeTo(null);
                } else {
                    LimpiarRepetido();
                    JOptionPane.showMessageDialog(null, "La cédula ya esta registrada, ingresa otra cédula.");
                }
            } else {
                lblMensajeError.setVisible(true);
                btnRegistrarUsuario.setSelected(false);
            }
        }
        if (txtPaciente.getText().length() > 0) {
            lblmsusuario.setVisible(false);
            btnRegistrarUsuario.setSelected(false);
        } else {
            lblmsusuario.setVisible(true);
            btnRegistrarUsuario.setSelected(false);
        }
        if (jConfContrasena.getPassword().length > 0) {
            lblmsconfcontra.setVisible(false);
            btnRegistrarUsuario.setSelected(false);
        } else {
            lblmsconfcontra.setVisible(true);
            btnRegistrarUsuario.setSelected(false);
        }
        if (jContrasena.getPassword().length > 0) {
            lblmscontra.setVisible(false);
            btnRegistrarUsuario.setSelected(false);
        } else {
            lblmscontra.setVisible(true);
            btnRegistrarUsuario.setSelected(false);
        }
        if (jContrasena.getPassword().length == 0 && (jConfContrasena.getPassword().length == 0 && txtPaciente.getText().length() == 0)) {
            lblmsusuario.setVisible(true);
            lblmsconfcontra.setVisible(true);
            lblmscontra.setVisible(true);
            btnRegistrarUsuario.setSelected(false);
        }
    }//GEN-LAST:event_btnRegistrarUsuarioActionPerformed

    private void txtPacienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPacienteKeyTyped
        char validacionPaciente = evt.getKeyChar();
        if (txtPaciente.getText().length() >= 20) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Se alcanzo el limite de carácteres permitidos.");
        }
        if (Character.isLetter(validacionPaciente)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "Ingrese solo letras");
        }
    }//GEN-LAST:event_txtPacienteKeyTyped

    private void jConfContrasenaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jConfContrasenaFocusGained
        lblMensajeError.setVisible(false);
        lblmsconfcontra.setVisible(false);
    }//GEN-LAST:event_jConfContrasenaFocusGained

    private void jContrasenaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jContrasenaFocusGained
        lblMensajeError.setVisible(false);
        lblmscontra.setVisible(false);
    }//GEN-LAST:event_jContrasenaFocusGained

    private void jConfContrasenaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jConfContrasenaKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnRegistrarUsuarioActionPerformed(null);
        }
    }//GEN-LAST:event_jConfContrasenaKeyReleased

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        this.dispose();
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

    private void txtPacienteFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPacienteFocusGained
        lblmsusuario.setVisible(false);
    }//GEN-LAST:event_txtPacienteFocusGained

    private void txtPacienteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPacienteFocusLost
        if (!validarcedula(txtPaciente.getText().trim())) {
            JOptionPane.showMessageDialog(null, "Ingrese una cédula valida.");
            txtPaciente.requestFocus();
        }
    }//GEN-LAST:event_txtPacienteFocusLost

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
    private javax.swing.JLabel lblmsconfcontra;
    private javax.swing.JLabel lblmscontra;
    private javax.swing.JLabel lblmsusuario;
    private javax.swing.JTextField txtPaciente;
    // End of variables declaration//GEN-END:variables
}
