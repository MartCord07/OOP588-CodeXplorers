/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyecto.gui.espe;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import static com.mongodb.client.model.Filters.eq;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import javax.swing.*;
import org.bson.Document;
import proyecto.conexion.espe.Conexion;

/**
 *
 * @author Xavier Celi
 */
public class Usuario extends javax.swing.JFrame {

    Conexion conn = new Conexion();
    MongoDatabase database;

    private String seleccionSexo = "";
    private MongoCollection<Document> usuario;
    private HashSet<String> cedulasValidas = new HashSet<>();

    public Usuario(MongoCollection<Document> usuario) {
        initComponents();
        this.usuario = usuario;

        btnRegistrarCita.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                registrarCita();
            }
        });
    }

    private void registrarCita() {
        String cedula = txtCedula.getText();
        if (cedulasValidas.contains(cedula)) {
            JOptionPane.showMessageDialog(this, "Cédula ya registrada");
            return;
        }
        cedulasValidas.add(cedula);

        Document documento = new Document("cedula", txtCedula.getText())
                .append("nombre", txtNombre.getText())
                .append("apellido", txtApellido.getText())
                .append("fechaNacimiento", fechaNacimiento.getDate())
                .append("genero", seleccionSexo)
                .append("telefono", txtTelefono.getText())
                .append("dia", cmbDia.getSelectedItem())
                .append("horario", cbmHorario.getSelectedItem());

        usuario.insertOne(documento);

        JOptionPane.showMessageDialog(this, "Cita registrada");

        limpiarCampos();
    }

    private void limpiarCampos() {
        txtCedula.setText("");
        txtNombre.setText("");
        txtApellido.setText("");
        fechaNacimiento.setDate(null);
        txtTelefono.setText("");
        botones.clearSelection();
        cmbDia.setSelectedIndex(0);
        cbmHorario.setSelectedIndex(0);

    }

    public Usuario() {
        if (conn != null) {
            conn = conn.crearConexion();
            database = conn.getDataB();
            this.usuario = database.getCollection("usuario", Document.class);
        }
        initComponents();
        cedulasValidas = new HashSet<>();
        cedulasValidas.add("1727095411");
        botones.add(rbtMasculino);
        botones.add(rbtFemenino);
        rbtMasculino.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                seleccionSexo = "M";
            }
        });

        rbtFemenino.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                seleccionSexo = "F";
            }
        });
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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botones = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        rbtMasculino = new javax.swing.JRadioButton();
        rbtFemenino = new javax.swing.JRadioButton();
        fechaNacimiento = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        cmbDia = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        cbmHorario = new javax.swing.JComboBox<>();
        btnRegistrarCita = new javax.swing.JToggleButton();
        btnConsultarCita = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Calisto MT", 1, 18)); // NOI18N
        jLabel1.setText("USUARIO");

        jLabel2.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jLabel2.setText("Cédula");

        jLabel3.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jLabel3.setText("Nombre");

        jLabel4.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jLabel4.setText("Apellido");

        jLabel5.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jLabel5.setText("Fecha de Nacimiento");

        jLabel6.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jLabel6.setText("Género");

        jLabel7.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jLabel7.setText("Teléfono");

        txtCedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCedulaKeyTyped(evt);
            }
        });

        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        txtApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoKeyTyped(evt);
            }
        });

        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });

        rbtMasculino.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        rbtMasculino.setText("Maculino");

        rbtFemenino.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        rbtFemenino.setText("Femenino");

        jLabel8.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jLabel8.setText("Día");

        cmbDia.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        cmbDia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione día", "Lunes", "Martes", "Miércoles", "Jueves ", "Viernes" }));

        jLabel9.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jLabel9.setText("Hora");

        cbmHorario.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        cbmHorario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " Seleccione horario", "8:00 am - 9:00 am", " 9:00 am -10:00 am", "10:00 am - 11:00 am", "11:00 am - 12:00 pm", "12:00 pm -13:00 pm", "14:00pm -15:00pm", "15:00pm -16:00pm", "16:00pm -17:00pm" }));

        btnRegistrarCita.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        btnRegistrarCita.setText("Registrar cita");
        btnRegistrarCita.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegistrarCitaMouseClicked(evt);
            }
        });
        btnRegistrarCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarCitaActionPerformed(evt);
            }
        });

        btnConsultarCita.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        btnConsultarCita.setText("Consultar Cita");
        btnConsultarCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarCitaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmbDia, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbmHorario, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnConsultarCita))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(rbtMasculino)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(rbtFemenino))
                            .addComponent(txtCedula, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtApellido, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(fechaNacimiento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(119, 119, 119))))
            .addGroup(layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(btnRegistrarCita)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(fechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbtMasculino)
                            .addComponent(rbtFemenino))
                        .addGap(18, 18, 18)
                        .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cmbDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(cbmHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrarCita)
                    .addComponent(btnConsultarCita))
                .addGap(51, 51, 51))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        char validacionNombre = evt.getKeyChar();
        if (Character.isDigit(validacionNombre)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "Ingrese solo letras");
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoKeyTyped
        char validacionApellido = evt.getKeyChar();
        if (Character.isDigit(validacionApellido)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "Ingrese solo letras");
        }
    }//GEN-LAST:event_txtApellidoKeyTyped

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
        char validacionTelefono = evt.getKeyChar();
        if (Character.isLetter(validacionTelefono)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "Ingrese solo digitos");
        }
    }//GEN-LAST:event_txtTelefonoKeyTyped

    private void txtCedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaKeyTyped
        char validacionID = evt.getKeyChar();
        if (Character.isLetter(validacionID)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "Ingrese solo dígitos");
        } else {
            // Concatenamos el dígito actual con el contenido actual del campo
            String cedulaIngresada = txtCedula.getText() + validacionID;

            // Realizamos la validación solo si la longitud de la cédula es 10
            if (cedulaIngresada.length() == 10 && !validarCedula(cedulaIngresada)) {
                getToolkit().beep();
                evt.consume();
                JOptionPane.showMessageDialog(null, "Cédula no válida");
            }
        }

    }//GEN-LAST:event_txtCedulaKeyTyped

    private void btnRegistrarCitaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarCitaMouseClicked


    }//GEN-LAST:event_btnRegistrarCitaMouseClicked

    private void btnRegistrarCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarCitaActionPerformed
        registrarCita();
    }//GEN-LAST:event_btnRegistrarCitaActionPerformed

    private void btnConsultarCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarCitaActionPerformed
        String cedulaConsulta = JOptionPane.showInputDialog(this, "Ingrese la cédula para consultar la cita:");
        Document consulta = usuario.find(eq("cedula", cedulaConsulta)).first();

        if (consulta != null) {
            String cedula = consulta.getString("cedula");
            String nombre = consulta.getString("nombre");
            String apellido = consulta.getString("apellido");
            Date fechaNacimiento = consulta.getDate("fechaNacimiento");
            String genero = consulta.getString("genero");
            String telefono = consulta.getString("telefono");
            String dia = consulta.getString("dia");
            String horario = consulta.getString("horario");

            StringBuilder mensaje = new StringBuilder();
            mensaje.append("====== INFORMACION CITA REGISTRADA ======\n");
            mensaje.append("Nombre: ").append(nombre).append("\n");
            mensaje.append("Apellido: ").append(apellido).append("\n");
            mensaje.append("Fecha de Nacimiento: ").append(fechaNacimiento).append("\n");
            mensaje.append("Género: ").append(genero).append("\n");
            mensaje.append("Teléfono: ").append(telefono).append("\n");
            mensaje.append("Día: ").append(dia).append("\n");
            mensaje.append("Horario: ").append(horario).append("\n");

            JOptionPane.showMessageDialog(this, mensaje.toString());
        } else {
            JOptionPane.showMessageDialog(this, "No se encontró la cita con la cédula proporcionada.");
        }

    }//GEN-LAST:event_btnConsultarCitaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup botones;
    private javax.swing.JToggleButton btnConsultarCita;
    private javax.swing.JToggleButton btnRegistrarCita;
    private javax.swing.JComboBox<String> cbmHorario;
    private javax.swing.JComboBox<String> cmbDia;
    private com.toedter.calendar.JDateChooser fechaNacimiento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton rbtFemenino;
    private javax.swing.JRadioButton rbtMasculino;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
