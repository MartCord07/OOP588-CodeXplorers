
package proyecto.gui.espe;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import org.bson.Document;
import proyecto.conexion.espe.Conexion;


public class LoginDoctor extends javax.swing.JFrame {

    Conexion conn = new Conexion();
    MongoDatabase database;
    
    public LoginDoctor() {
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

        jPanel1 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lbliconAdmin = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        SeparadadorUser = new javax.swing.JSeparator();
        iconUser = new javax.swing.JLabel();
        lblErrorUsuario = new javax.swing.JLabel();
        lblUsuario1 = new javax.swing.JLabel();
        jContraseña = new javax.swing.JPasswordField();
        SeparadadorContra = new javax.swing.JSeparator();
        iconContra = new javax.swing.JLabel();
        lblErrorContraseña = new javax.swing.JLabel();
        btnAcceder = new javax.swing.JToggleButton();
        lblErrorLogin = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(112, 145, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(409, 464));

        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setText("Acceso  Doctor");

        lbliconAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/iconos/espe/icono_medico96.png"))); // NOI18N

        lblUsuario.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lblUsuario.setText("Usuario:");

        txtUsuario.setBackground(new java.awt.Color(112, 145, 255));
        txtUsuario.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(255, 255, 255));
        txtUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUsuario.setBorder(null);
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

        iconUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/iconos/espe/icono_user.png"))); // NOI18N

        lblErrorUsuario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblErrorUsuario.setForeground(new java.awt.Color(255, 0, 0));
        lblErrorUsuario.setText("Ingrese Usuario");

        lblUsuario1.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        lblUsuario1.setForeground(new java.awt.Color(255, 255, 255));
        lblUsuario1.setText("Contraseña:");

        jContraseña.setBackground(new java.awt.Color(112, 145, 255));
        jContraseña.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        jContraseña.setForeground(new java.awt.Color(255, 255, 255));
        jContraseña.setBorder(null);
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

        iconContra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/iconos/espe/icono_contraseña.png"))); // NOI18N

        lblErrorContraseña.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblErrorContraseña.setForeground(new java.awt.Color(255, 0, 0));
        lblErrorContraseña.setText("Ingrese Contraseña");

        btnAcceder.setBackground(new java.awt.Color(60, 78, 234));
        btnAcceder.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        btnAcceder.setForeground(new java.awt.Color(255, 255, 255));
        btnAcceder.setText("Acceder");
        btnAcceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAccederActionPerformed(evt);
            }
        });

        lblErrorLogin.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblErrorLogin.setForeground(new java.awt.Color(255, 0, 0));
        lblErrorLogin.setText("Usuario o Contraseña Incorrectos");

        btnRegresar.setBackground(new java.awt.Color(60, 78, 234));
        btnRegresar.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        btnRegresar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/iconos/espe/icono_regresarad.png"))); // NOI18N
        btnRegresar.setText("Atrás");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(lblErrorUsuario))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(lblUsuario1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(lblErrorContraseña))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(lblErrorLogin))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnRegresar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(lbliconAdmin))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(lblUsuario))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(btnAcceder))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(iconContra)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jContraseña)
                                    .addComponent(SeparadadorContra, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(iconUser)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(SeparadadorUser)
                                    .addComponent(txtUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE))))))
                .addGap(79, 79, 79))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbliconAdmin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(iconUser))
                .addGap(8, 8, 8)
                .addComponent(SeparadadorUser, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblErrorUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblUsuario1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(iconContra))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SeparadadorContra, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16)
                .addComponent(lblErrorContraseña)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAcceder)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblErrorLogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRegresar)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsuarioFocusGained
        lblErrorLogin.setVisible(false);
        lblErrorUsuario.setVisible(false);
    }//GEN-LAST:event_txtUsuarioFocusGained

    private void jContraseñaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jContraseñaFocusGained
        lblErrorLogin.setVisible(false);
        lblErrorContraseña.setVisible(false);
    }//GEN-LAST:event_jContraseñaFocusGained

    private void jContraseñaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jContraseñaKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnAccederActionPerformed(null);
        }
    }//GEN-LAST:event_jContraseñaKeyReleased

    private void btnAccederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccederActionPerformed
        String nombreUsuario = txtUsuario.getText();
        char[] contrasenaChars = jContraseña.getPassword();
        String contrasena = new String(contrasenaChars);

        MongoCollection<Document> coleccion = database.getCollection("registros_doctores");

        Document query = new Document("usuario", nombreUsuario)
        .append("contrasena", contrasena);

        try (MongoCursor<Document> cursor = coleccion.find(query).iterator()) {
            if (txtUsuario.getText().length() > 0 && jContraseña.getPassword().length > 0) {
                if (cursor.hasNext()) {
                    Doctor doctor = new Doctor();
                    doctor.setVisible(true);
                    doctor.setLocationRelativeTo(null);
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
    }//GEN-LAST:event_btnAccederActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        dispose();
        MenuPrincipal menu = new MenuPrincipal();
        menu.setVisible(true);
        menu.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void txtUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyTyped
        char validacionDoctor = evt.getKeyChar();
        if (txtUsuario.getText().length() >= 20) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Se alcanzo el limite de carácteres permitidos.");
        }
        if (Character.isDigit(validacionDoctor)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "Ingrese solo letras");
        }
    }//GEN-LAST:event_txtUsuarioKeyTyped

    private void jContraseñaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jContraseñaKeyTyped
        if (new String(jContraseña.getPassword()).length() >= 40) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Se alcanzo el limite de carácteres permitidos.");
        }
    }//GEN-LAST:event_jContraseñaKeyTyped

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSeparator SeparadadorContra;
    private javax.swing.JSeparator SeparadadorUser;
    private javax.swing.JToggleButton btnAcceder;
    private javax.swing.JToggleButton btnRegresar;
    private javax.swing.JLabel iconContra;
    private javax.swing.JLabel iconUser;
    private javax.swing.JPasswordField jContraseña;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblErrorContraseña;
    private javax.swing.JLabel lblErrorLogin;
    private javax.swing.JLabel lblErrorUsuario;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JLabel lblUsuario1;
    private javax.swing.JLabel lbliconAdmin;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
