package proyecto.gui.espe;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
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
        lblMensajeError.setVisible(false);
    }

    private boolean verificarDatos() {
        boolean validar = false;
        if ((txtPaciente.getText().length() > 0) && (txtContra.getText().length() > 0) && (txtConfirmarContra.getText().length() > 0)) {
            validar = true;
        }
        return validar;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        lblTitulo = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        lblContra = new javax.swing.JLabel();
        lblConfirmarContra = new javax.swing.JLabel();
        txtPaciente = new javax.swing.JTextField();
        txtConfirmarContra = new javax.swing.JTextField();
        txtContra = new javax.swing.JTextField();
        btnRegistrarUsuario = new javax.swing.JToggleButton();
        lblMensajeError = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblTitulo.setFont(new java.awt.Font("Cooper Black", 2, 12)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 0, 51));
        lblTitulo.setText("Registrar Usuario");

        lblUsuario.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(255, 153, 0));
        lblUsuario.setText("Usuario");

        lblContra.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblContra.setForeground(new java.awt.Color(255, 153, 0));
        lblContra.setText("Contraseña");

        lblConfirmarContra.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblConfirmarContra.setForeground(new java.awt.Color(255, 153, 0));
        lblConfirmarContra.setText("Confirmar Contraseña");

        txtPaciente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPacienteKeyTyped(evt);
            }
        });

        txtConfirmarContra.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtConfirmarContraFocusGained(evt);
            }
        });

        txtContra.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtContraFocusGained(evt);
            }
        });

        btnRegistrarUsuario.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        btnRegistrarUsuario.setForeground(new java.awt.Color(255, 102, 0));
        btnRegistrarUsuario.setText("Regisrtar Nuevo Usuario");
        btnRegistrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarUsuarioActionPerformed(evt);
            }
        });

        lblMensajeError.setForeground(new java.awt.Color(255, 102, 102));
        lblMensajeError.setText("La contraseñas no coinciden.");

        jDesktopPane1.setLayer(lblTitulo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(lblUsuario, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(lblContra, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(lblConfirmarContra, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(txtPaciente, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(txtConfirmarContra, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(txtContra, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btnRegistrarUsuario, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(lblMensajeError, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUsuario)
                            .addComponent(lblConfirmarContra)
                            .addComponent(lblContra))
                        .addGap(44, 44, 44)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(lblMensajeError, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 13, Short.MAX_VALUE))
                            .addComponent(txtContra)
                            .addComponent(txtPaciente)
                            .addComponent(txtConfirmarContra))))
                .addGap(93, 93, 93))
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addComponent(btnRegistrarUsuario)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lblTitulo)
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsuario)
                    .addComponent(txtPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtContra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(lblContra, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtConfirmarContra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblConfirmarContra))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMensajeError)
                .addGap(29, 29, 29)
                .addComponent(btnRegistrarUsuario)
                .addContainerGap(35, Short.MAX_VALUE))
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

    private void btnRegistrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarUsuarioActionPerformed
        if (verificarDatos()) {
        if (txtContra.getText().equals(txtConfirmarContra.getText())) {
            MongoCollection coleccion = database.getCollection("registros");

            Document filtro = new Document("paciente", txtPaciente.getText());
            long count = coleccion.countDocuments(filtro);

            if (count == 0) {
                Document documento = new Document("paciente", txtPaciente.getText())
                        .append("contrasena", txtContra.getText())
                        .append("confirmarcontrasena", txtConfirmarContra.getText())
                        .append("tipo", "paciente");
                coleccion.insertOne(documento);

                dispose();
                JOptionPane.showMessageDialog(rootPane, "Usuario Registrado Existosamente.");
                lblMensajeError.setVisible(false);
                txtPaciente.setText("");
                txtContra.setText("");
                txtConfirmarContra.setText("");
            } else {
                txtPaciente.setText("");
                JOptionPane.showMessageDialog(null, "El usuario ya existe. Por favor, elija otro nombre de usuario.");
            }
        } else {
            lblMensajeError.setVisible(true);
        }
    } else {
        JOptionPane.showMessageDialog(null, "Ingrese todos los campos");
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

    private void txtConfirmarContraFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtConfirmarContraFocusGained
        lblMensajeError.setVisible(false);
    }//GEN-LAST:event_txtConfirmarContraFocusGained

    private void txtContraFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtContraFocusGained
        lblMensajeError.setVisible(false);
    }//GEN-LAST:event_txtContraFocusGained


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnRegistrarUsuario;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel lblConfirmarContra;
    private javax.swing.JLabel lblContra;
    private javax.swing.JLabel lblMensajeError;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JTextField txtConfirmarContra;
    private javax.swing.JTextField txtContra;
    private javax.swing.JTextField txtPaciente;
    // End of variables declaration//GEN-END:variables
}
