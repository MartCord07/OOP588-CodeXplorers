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
        jLabel10 = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Calisto MT", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 204));
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

        txtCedula.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtCedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCedulaKeyTyped(evt);
            }
        });

        txtNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        txtApellido.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoKeyTyped(evt);
            }
        });

        txtTelefono.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });

        rbtMasculino.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        rbtMasculino.setText("Maculino");
        rbtMasculino.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        rbtFemenino.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        rbtFemenino.setText("Femenino");
        rbtFemenino.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        fechaNacimiento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        fechaNacimiento.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                fechaNacimientoPropertyChange(evt);
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
        cbmHorario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " Seleccione horario", "8:00 am - 9:00 am", " 9:00 am -10:00 am", "10:00 am - 11:00 am", "11:00 am - 12:00 pm", "12:00 pm -13:00 pm", "14:00pm -15:00pm", "15:00pm -16:00pm", "16:00pm -17:00pm" }));
        cbmHorario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnRegistrarCita.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        btnRegistrarCita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/imagenes/espe/7952181_checklist_pen_tab_list_tick_icon.png"))); // NOI18N
        btnRegistrarCita.setText("Registrar cita");
        btnRegistrarCita.setBorder(new javax.swing.border.MatteBorder(null));
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
        btnConsultarCita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/imagenes/espe/5955449_find_glass_magnifier_search_zoom_icon.png"))); // NOI18N
        btnConsultarCita.setText("Consultar Cita");
        btnConsultarCita.setBorder(new javax.swing.border.MatteBorder(null));
        btnConsultarCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarCitaActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jLabel10.setText("Edad");

        txtEdad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEdadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel6))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(22, 22, 22)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(cmbDia, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(cbmHorario, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(txtTelefono))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(rbtMasculino)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(rbtFemenino))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel10)
                                                .addGap(34, 34, 34)
                                                .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(fechaNacimiento, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtApellido)
                                            .addComponent(txtCedula)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(txtNombre)))))
                        .addGap(94, 94, 94))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(btnRegistrarCita, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(btnConsultarCita, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(192, 192, 192))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(fechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(rbtMasculino)
                    .addComponent(rbtFemenino))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cmbDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addComponent(cbmHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConsultarCita, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistrarCita, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
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

    private void txtEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEdadActionPerformed

    }//GEN-LAST:event_txtEdadActionPerformed

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
    private javax.swing.JRadioButton rbtFemenino;
    private javax.swing.JRadioButton rbtMasculino;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
