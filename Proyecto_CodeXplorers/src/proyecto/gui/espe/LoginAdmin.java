
package proyecto.gui.espe;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import org.bson.Document;
import proyecto.conexion.espe.Conexion;


public class LoginAdmin extends javax.swing.JFrame {

    Conexion conn = new Conexion();
    MongoDatabase database;
    public LoginAdmin() {
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

        jPanelAdmin = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lbliconAdmin = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        SeparadadorUser = new javax.swing.JSeparator();
        lblErrorUsuario = new javax.swing.JLabel();
        iconUser = new javax.swing.JLabel();
        lblUsuario1 = new javax.swing.JLabel();
        SeparadorContra = new javax.swing.JSeparator();
        iconContra = new javax.swing.JLabel();
        lblErrorContraseña = new javax.swing.JLabel();
        btnAcceder = new javax.swing.JToggleButton();
        lblErrorLogin = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JToggleButton();
        jContraseña = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jPanelAdmin.setBackground(new java.awt.Color(112, 145, 255));
        jPanelAdmin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jPanelAdminKeyTyped(evt);
            }
        });

        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setText("Acceso  Admin");

        lbliconAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/iconos/espe/icono_admin96.png"))); // NOI18N

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

        lblErrorUsuario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblErrorUsuario.setForeground(new java.awt.Color(255, 0, 0));
        lblErrorUsuario.setText("Ingrese Usuario");

        iconUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/iconos/espe/icono_user.png"))); // NOI18N

        lblUsuario1.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        lblUsuario1.setForeground(new java.awt.Color(255, 255, 255));
        lblUsuario1.setText("Contraseña:");

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

        javax.swing.GroupLayout jPanelAdminLayout = new javax.swing.GroupLayout(jPanelAdmin);
        jPanelAdmin.setLayout(jPanelAdminLayout);
        jPanelAdminLayout.setHorizontalGroup(
            jPanelAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAdminLayout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(jPanelAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(iconUser)
                    .addComponent(iconContra))
                .addGap(12, 12, 12)
                .addGroup(jPanelAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelAdminLayout.createSequentialGroup()
                        .addComponent(lblErrorLogin)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAdminLayout.createSequentialGroup()
                        .addGap(0, 12, Short.MAX_VALUE)
                        .addGroup(jPanelAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAdminLayout.createSequentialGroup()
                                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(94, 94, 94))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAdminLayout.createSequentialGroup()
                                .addComponent(lbliconAdmin)
                                .addGap(163, 163, 163))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAdminLayout.createSequentialGroup()
                                .addComponent(lblUsuario)
                                .addGap(187, 187, 187))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAdminLayout.createSequentialGroup()
                                .addComponent(lblUsuario1)
                                .addGap(167, 167, 167))))
                    .addGroup(jPanelAdminLayout.createSequentialGroup()
                        .addGroup(jPanelAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SeparadadorUser)
                            .addGroup(jPanelAdminLayout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(jPanelAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblErrorUsuario)
                                    .addComponent(lblErrorContraseña)
                                    .addGroup(jPanelAdminLayout.createSequentialGroup()
                                        .addGap(36, 36, 36)
                                        .addComponent(btnAcceder)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtUsuario)
                            .addComponent(jContraseña)
                            .addComponent(SeparadorContra))
                        .addGap(70, 70, 70))))
            .addGroup(jPanelAdminLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btnRegresar)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanelAdminLayout.setVerticalGroup(
            jPanelAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAdminLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbliconAdmin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(iconUser)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SeparadadorUser, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblErrorUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblUsuario1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(iconContra)
                    .addComponent(jContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SeparadorContra, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblErrorContraseña)
                .addGap(18, 18, 18)
                .addComponent(btnAcceder)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblErrorLogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(btnRegresar)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAccederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccederActionPerformed
        String nombreUsuario = txtUsuario.getText();
        char[] contrasenaChars = jContraseña.getPassword();
        String contrasena = new String(contrasenaChars);

        MongoCollection<Document> coleccion = database.getCollection("registros_admins");

        Document query = new Document("usuario", nombreUsuario)
                .append("contrasena", contrasena);

        try (MongoCursor<Document> cursor = coleccion.find(query).iterator()) {
            if (txtUsuario.getText().length() > 0 && jContraseña.getPassword().length > 0) {
                if (cursor.hasNext()) {
                    Admin admin = new Admin();
                    admin.setVisible(true);
                    admin.setLocationRelativeTo(null);
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

    private void txtUsuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsuarioFocusGained
       lblErrorLogin.setVisible(false);
        lblErrorUsuario.setVisible(false);
    }//GEN-LAST:event_txtUsuarioFocusGained

    private void jContraseñaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jContraseñaFocusGained
        lblErrorLogin.setVisible(false);
        lblErrorContraseña.setVisible(false);
    }//GEN-LAST:event_jContraseñaFocusGained

    private void jPanelAdminKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPanelAdminKeyTyped
        char validacionAdmin = evt.getKeyChar();
        if (Character.isDigit(validacionAdmin)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "Ingrese solo letras");
        }
    }//GEN-LAST:event_jPanelAdminKeyTyped

    private void jContraseñaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jContraseñaKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnAccederActionPerformed(null);
        }
    }//GEN-LAST:event_jContraseñaKeyReleased

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        dispose();
        MenuPrincipal menu = new MenuPrincipal();
        menu.setVisible(true);
        menu.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void txtUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyTyped
        char validacionAdmin = evt.getKeyChar();
        if (txtUsuario.getText().length() >= 20) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Se alcanzo el limite de carácteres permitidos.");
        }
        if (Character.isDigit(validacionAdmin)) {
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
    private javax.swing.JSeparator SeparadadorUser;
    private javax.swing.JSeparator SeparadorContra;
    private javax.swing.JToggleButton btnAcceder;
    private javax.swing.JToggleButton btnRegresar;
    private javax.swing.JLabel iconContra;
    private javax.swing.JLabel iconUser;
    private javax.swing.JPasswordField jContraseña;
    private javax.swing.JPanel jPanelAdmin;
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
