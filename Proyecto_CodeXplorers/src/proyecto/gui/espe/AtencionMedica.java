package proyecto.gui.espe;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import org.bson.Document;
import org.bson.types.ObjectId;
import proyecto.conexion.espe.Conexion;

public class AtencionMedica extends javax.swing.JFrame {

    Conexion conn = new Conexion();
    MongoDatabase database;
    private MongoCollection<Document> usuario;

    public AtencionMedica() {
        if (conn != null) {
            conn = conn.crearConexion();
            database = conn.getDataB();
            this.usuario = database.getCollection("usuario", Document.class);

            initComponents();
            diagnosticoTextArea = new JTextArea();
            observacionesTextArea = new JTextArea();
            cmxMedico.setEnabled(false);

            cargarNombresMedicos();
            txtCedula.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    buscarYMostrarEdad();
                }
            });

        }
    }

    private void buscarYMostrarEdad() {
        String cedula = txtCedula.getText();

        Document usuarioEncontrado = usuario.find(new Document("cedula", cedula)).first();

        if (usuarioEncontrado != null) {
            Object edadObject = usuarioEncontrado.get("edad");

            ObjectId objectId = usuarioEncontrado.getObjectId("_id");

            txtId.setText("" + objectId);

            String tipoMedico;
            if (edadObject != null) {
                int edad = Integer.parseInt(edadObject.toString());
                if (edad >= 0 && edad <= 18) {
                    tipoMedico = "Pediatria";
                } else if (edad >= 19 && edad <= 60) {
                    tipoMedico = "Medicina Familiar";
                } else {
                    tipoMedico = "Geriatría";
                }

                lblMedico.setText("" + tipoMedico);

                cmxMedico.setEnabled(!tipoMedico.equals("Geriatría"));

                if (edadObject instanceof Integer) {
                    lblEdad.setText("Edad: " + edadObject.toString());
                } else if (edadObject instanceof String) {
                    try {
                        lblEdad.setText("" + edad);
                    } catch (NumberFormatException e) {
                        lblEdad.setText("Edad no válida");
                    }
                } else {
                    lblEdad.setText("Edad en formato inválido");
                }
            } else {
                lblMedico.setText("Médico no disponible");
                lblEdad.setText("Edad no disponible");

                cmxMedico.setEnabled(false);
            }
        } else {
            lblMedico.setText("Usuario no encontrado");
            lblEdad.setText("Edad no disponible");

            cmxMedico.setEnabled(false);
        }
    }

    private void cargarNombresMedicos() {

        MongoCursor<Document> cursor = database.getCollection("medico").find().iterator();
        try {

            cmxMedico.removeAllItems();

            while (cursor.hasNext()) {
                Document medicoDocumento = cursor.next();
                String nombreMedico = medicoDocumento.getString("nombre");
                String apellidoMedico = medicoDocumento.getString("apellido");
                String nombreCompleto = nombreMedico + " " + apellidoMedico;
                cmxMedico.addItem(nombreCompleto);
            }
        } finally {
            cursor.close();
        }
    }

    private boolean validarCedula(String cedula) {
        if (cedula.length() != 10 || !cedula.matches("\\d{10}")) {
            return false;
        }

        int suma = 0;
        for (int i = 0; i < 9; i++) {
            int digito = Character.getNumericValue(cedula.charAt(i));
            digito = (i % 2 == 0) ? digito * 2 : digito;
            digito = (digito > 9) ? digito - 9 : digito;
            suma += digito;
        }

        int ultimoDigito = Character.getNumericValue(cedula.charAt(9));
        int residuo = suma % 10;

        return (residuo == 0 && ultimoDigito == 0) || (10 - residuo == ultimoDigito);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        diagnosticoTextArea = new javax.swing.JTextArea();
        btnHistorial = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        observacionesTextArea = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        txtId = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        lblEdad = new javax.swing.JLabel();
        lblMedico = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cmxMedico = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel5.setText("Edad paciente");

        jLabel6.setText("Area encargada");

        jLabel1.setFont(new java.awt.Font("Dosis SemiBold", 0, 18)); // NOI18N
        jLabel1.setText("ATENCION MEDICA");

        diagnosticoTextArea.setColumns(20);
        diagnosticoTextArea.setRows(5);
        jScrollPane1.setViewportView(diagnosticoTextArea);

        btnHistorial.setText("Generar Historial");
        btnHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHistorialActionPerformed(evt);
            }
        });

        jLabel3.setText("Diagnostico");

        jLabel2.setText("Id de la consulta:");

        observacionesTextArea.setColumns(20);
        observacionesTextArea.setRows(5);
        jScrollPane2.setViewportView(observacionesTextArea);

        jLabel4.setText("Observaciones");

        jLabel7.setText("CI paciente");

        txtCedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCedulaKeyTyped(evt);
            }
        });

        jLabel8.setText("Medicos disponibles");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 26, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 563, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(cmxMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(lblMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGap(122, 122, 122)
                                                    .addComponent(jLabel1))))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnHistorial, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(260, 260, 260))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5))
                    .addComponent(lblEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmxMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(47, 47, 47)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnHistorial)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistorialActionPerformed

        Historial his = new Historial();
        his.setVisible(true);
        his.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnHistorialActionPerformed

    private void txtCedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaKeyTyped
        char validacionID = evt.getKeyChar();
        if (Character.isLetter(validacionID)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "Ingrese solo dígitos");
        } else {

            String cedulaIngresada = txtCedula.getText() + validacionID;

            if (cedulaIngresada.length() == 10 && !validarCedula(cedulaIngresada)) {
                getToolkit().beep();
                evt.consume();

            }
        }
    }//GEN-LAST:event_txtCedulaKeyTyped

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHistorial;
    private javax.swing.JComboBox<String> cmxMedico;
    private javax.swing.JTextArea diagnosticoTextArea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblEdad;
    private javax.swing.JLabel lblMedico;
    private javax.swing.JTextArea observacionesTextArea;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JLabel txtId;
    // End of variables declaration//GEN-END:variables
}
