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
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import javax.swing.*;

import org.bson.Document;

import proyecto.dao.espe.Conexion;

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

    public int calcularEdad(Date fechaNacimiento) {
        LocalDate fechaNac = fechaNacimiento.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate fechaActual = LocalDate.now();
        return Period.between(fechaNac, fechaActual).getYears();
    }

    private boolean validarCampos() {
        if (txtCedula.getText().isEmpty() || txtNombre.getText().isEmpty()
                || txtApellido.getText().isEmpty() || fechaNacimiento.getDate() == null
                || (rbtMasculino.isSelected() == false && rbtFemenino.isSelected() == false)
                || txtTelefono.getText().isEmpty() || cmbDia.getSelectedIndex() == 0
                || cbmHorario.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos antes de registrar la cita.");
            return false;
        }
        return true;

    }

    private boolean cedulaYaRegistrada(String cedula) {
        Document documento = usuario.find(eq("cedula", cedula)).first();
        return documento != null;
    }

    private void registrarCita() {
        if (!validarCampos()) {
            return;
        }
        String cedula = txtCedula.getText();

        if (cedulaYaRegistrada(cedula)) {
            JOptionPane.showMessageDialog(this, "Esta cédula ya está registrada. No se puede registrar la cita.");
            return;
        }

        cedulasValidas.add(cedula);

        Document documento = new Document("cedula", txtCedula.getText())
                .append("nombre", txtNombre.getText())
                .append("apellido", txtApellido.getText())
                .append("fechaNacimiento", fechaNacimiento.getDate())
                .append("edad", txtEdad.getText())
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
        txtEdad.setText("");
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
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cmbDia = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        cbmHorario = new javax.swing.JComboBox<>();
        btnRegistrarCita = new javax.swing.JToggleButton();
        btnConsultarCita = new javax.swing.JToggleButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        rbtMasculino = new javax.swing.JRadioButton();
        rbtFemenino = new javax.swing.JRadioButton();
        fechaNacimiento = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 153, 0));

        jLabel1.setFont(new java.awt.Font("Arial Black", 3, 24)); // NOI18N
        jLabel1.setText("USUARIO");

        jLabel2.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jLabel2.setText("Cédula");

        txtCedula.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtCedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCedulaKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jLabel3.setText("Nombre");

        txtNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jLabel4.setText("Apellido");

        txtApellido.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jLabel5.setText("Fecha de Nacimiento");

        jLabel10.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jLabel10.setText("Edad");

        txtEdad.setEditable(false);
        txtEdad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtEdad.setEnabled(false);

        jLabel7.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jLabel7.setText("Teléfono");

        txtTelefono.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jLabel8.setText("Día");

        cmbDia.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        cmbDia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione día", "Lunes", "Martes", "Miércoles", "Jueves ", "Viernes" }));
        cmbDia.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel9.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jLabel9.setText("Hora");

        cbmHorario.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        cbmHorario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione horario", "8:00 am - 9:00 am", " 9:00 am -10:00 am", "10:00 am - 11:00 am", "11:00 am - 12:00 pm", "12:00 pm -13:00 pm", "14:00pm -15:00pm", "15:00pm -16:00pm", "16:00pm -17:00pm" }));
        cbmHorario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnRegistrarCita.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        btnRegistrarCita.setText("Registrar cita");
        btnRegistrarCita.setBorder(new javax.swing.border.MatteBorder(null));
        btnRegistrarCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarCitaActionPerformed(evt);
            }
        });

        btnConsultarCita.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        btnConsultarCita.setText("Consultar Cita");
        btnConsultarCita.setBorder(new javax.swing.border.MatteBorder(null));
        btnConsultarCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarCitaActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jLabel6.setText("Género");

        rbtMasculino.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        rbtMasculino.setText("Masculino");
        rbtMasculino.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        rbtFemenino.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        rbtFemenino.setText("Femenino");
        rbtFemenino.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbtMasculino)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(rbtFemenino)
                .addGap(22, 22, 22))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtMasculino)
                    .addComponent(rbtFemenino))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        fechaNacimiento.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                fechaNacimientoPropertyChange(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(145, 145, 145)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cbmHorario, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cmbDia, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(btnRegistrarCita, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(btnConsultarCita, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addGap(18, 18, 18)
                                                .addComponent(txtTelefono))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel2)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGap(4, 4, 4)
                                                        .addComponent(jLabel4))
                                                    .addComponent(jLabel3))
                                                .addGap(22, 22, 22)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(txtCedula, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                                                    .addComponent(txtApellido)
                                                    .addComponent(txtNombre)))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addGap(27, 27, 27)
                                                .addComponent(fechaNacimiento, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)))
                                        .addGap(75, 75, 75)
                                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel8)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(332, 332, 332)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(90, 90, 90)
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel3)
                                        .addGap(27, 27, 27)
                                        .addComponent(jLabel4))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(37, 37, 37)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(fechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(213, 213, 213)
                                .addComponent(jLabel5)))
                        .addGap(31, 31, 31)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cmbDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addComponent(cbmHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConsultarCita, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistrarCita, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
            
            String cedulaIngresada = txtCedula.getText() + validacionID;

            
            if (cedulaIngresada.length() == 10 && !validarCedula(cedulaIngresada)) {
                getToolkit().beep();
                evt.consume();
                JOptionPane.showMessageDialog(null, "Cédula no válida");
            }
        }

    }//GEN-LAST:event_txtCedulaKeyTyped

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
            String edad=consulta.getString("edad");
            String genero = consulta.getString("genero");
            String telefono = consulta.getString("telefono");
            String dia = consulta.getString("dia");
            String horario = consulta.getString("horario");

            StringBuilder mensaje = new StringBuilder();
            mensaje.append("====== INFORMACION CITA REGISTRADA ======\n");
            mensaje.append("Nombre: ").append(nombre).append("\n");
            mensaje.append("Apellido: ").append(apellido).append("\n");
            mensaje.append("Fecha de Nacimiento: ").append(fechaNacimiento).append("\n");
            mensaje.append("Edad: ").append(edad).append("\n");
            mensaje.append("Género: ").append(genero).append("\n");
            mensaje.append("Teléfono: ").append(telefono).append("\n");
            mensaje.append("Día: ").append(dia).append("\n");
            mensaje.append("Horario: ").append(horario).append("\n");

            JOptionPane.showMessageDialog(this, mensaje.toString());
        } else {
            JOptionPane.showMessageDialog(this, "No se encontró la cita con la cédula proporcionada.");
        }

    }//GEN-LAST:event_btnConsultarCitaActionPerformed

    private void fechaNacimientoPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_fechaNacimientoPropertyChange
        if ("date".equals(evt.getPropertyName()) && fechaNacimiento.getDate() != null) {
            int año = fechaNacimiento.getCalendar().get(Calendar.YEAR);
            Date fecha = new Date();
            SimpleDateFormat formato = new SimpleDateFormat("yyyy");
            String fechaSistema = formato.format(fecha);
            int anio = Integer.parseInt(fechaSistema), resta;
            resta = (anio - año);
            String edad = Integer.toString(resta);
            txtEdad.setText(edad);

        }
    }//GEN-LAST:event_fechaNacimientoPropertyChange


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup botones;
    private javax.swing.JToggleButton btnConsultarCita;
    private javax.swing.JToggleButton btnRegistrarCita;
    private javax.swing.JComboBox<String> cbmHorario;
    private javax.swing.JComboBox<String> cmbDia;
    private com.toedter.calendar.JDateChooser fechaNacimiento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton rbtFemenino;
    private javax.swing.JRadioButton rbtMasculino;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
