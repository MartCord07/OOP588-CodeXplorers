/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyecto.vista.paciente.espe;

import com.mongodb.client.MongoCollection;
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
import java.util.Set;
import javax.swing.JOptionPane;
import org.bson.Document;
import proyecto.modelo.espe.Paciente;
import proyecto.servicio.espe.PacienteServicio;
import proyecto.vista.perfil.espe.LoginUsuario;
import proyecto.vista.perfil.espe.MenuPrincipal;

/**
 *
 * @author Victoria
 */
public class PacienteVentana extends javax.swing.JFrame {

    private String seleccionGenero = "";
    private MongoCollection<Document> usuario;
    

    public PacienteVentana() {
        initComponents();
        String cedula = LoginUsuario.codCedula;
        txtCedula.setText(cedula);
        setResizable(false);
        setLocationRelativeTo(null);
        botones.add(masculino);
        botones.add(femenino);
        masculino.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                seleccionGenero = "M";
            }
        });

        femenino.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                seleccionGenero = "F";
            }
        });

    }

    public int calcularEdad(Date fechaNacimiento) {
        LocalDate fechaNac = fechaNacimiento.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate fechaActual = LocalDate.now();
        return Period.between(fechaNac, fechaActual).getYears();
    }

    public void limpiarDatos() {
        txtCedula.setText("");
        txtNombre.setText("");
        txtApellido.setText("");
        txtEdad.setText("");
        txtTelefono.setText("");
        cbmHorario.setSelectedIndex(0);
        cmbDia.setSelectedIndex(0);
        botones.clearSelection();

    }

    public void regresarLogin() {
        LoginUsuario menu = new LoginUsuario();
        menu.setVisible(true);
        setVisible(false);
    }
    private boolean isValidDate(Date date) {
        if (date == null) {
            return false;
        }

        Calendar calSistema = Calendar.getInstance();
        Calendar calSeleccionada = Calendar.getInstance();
        calSeleccionada.setTime(date);
        return !calSeleccionada.after(calSistema);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botones = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        femenino = new javax.swing.JRadioButton();
        masculino = new javax.swing.JRadioButton();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        fechaNacimiento = new com.toedter.calendar.JDateChooser();
        txtEdad = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        cmbDia = new javax.swing.JComboBox<>();
        cbmHorario = new javax.swing.JComboBox<>();
        btnRegistrarCita = new javax.swing.JToggleButton();
        btnConsultarCita = new javax.swing.JToggleButton();
        btnCerrarSesion = new javax.swing.JToggleButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(531, 676));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Britannic Bold", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 255));
        jLabel1.setText("PACIENTE");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 170, -1));

        txtCedula.setEditable(false);
        txtCedula.setEnabled(false);
        jPanel1.add(txtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 220, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel4.setText("Nombre");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel3.setText("Cédula");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel5.setText("Apellido");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, 20));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel6.setText("Fecha de Nacimiento");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, -1, 20));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel7.setText("Edad");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 340, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel8.setText("Teléfono");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel9.setText("Género");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, -1, -1));

        femenino.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        femenino.setText("Femenino");
        jPanel1.add(femenino, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, -1, -1));

        masculino.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        masculino.setText("Masculino");
        jPanel1.add(masculino, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, -1, -1));

        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 220, -1));

        txtApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoKeyTyped(evt);
            }
        });
        jPanel1.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 220, -1));

        fechaNacimiento.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                fechaNacimientoPropertyChange(evt);
            }
        });
        jPanel1.add(fechaNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 300, 150, -1));

        txtEdad.setEditable(false);
        txtEdad.setEnabled(false);
        jPanel1.add(txtEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 340, 80, -1));

        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });
        jPanel1.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 220, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel10.setText("Día");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel11.setText("Horario");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, -1, -1));

        cmbDia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione día", "Lunes", "Martes", "Miércoles", "Jueves", "Viernes" }));
        jPanel1.add(cmbDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 380, 140, -1));

        cbmHorario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione horario", "8:00 am-9:00 am", "9:00 am-10:00 am", "10:00 am-11:00 am", "11:00 am-12:00 pm", "12:00 pm-13:00 pm", "14:00pm-15:00pm", "15:00pm-16:00pm", "16:00pm-17:00pm" }));
        jPanel1.add(cbmHorario, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 420, 140, -1));

        btnRegistrarCita.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnRegistrarCita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/iconos/espe/registrar icon.png"))); // NOI18N
        btnRegistrarCita.setText("Registrar Cita");
        btnRegistrarCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarCitaActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistrarCita, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, 180, -1));

        btnConsultarCita.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnConsultarCita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/iconos/espe/consultar icon.png"))); // NOI18N
        btnConsultarCita.setText("Consultar Cita");
        btnConsultarCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarCitaActionPerformed(evt);
            }
        });
        jPanel1.add(btnConsultarCita, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 570, 180, -1));

        btnCerrarSesion.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnCerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/iconos/espe/cerrar sesion icon.png"))); // NOI18N
        btnCerrarSesion.setText("Cerrar Sesión");
        btnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSesionActionPerformed(evt);
            }
        });
        jPanel1.add(btnCerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 530, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/fondos/espe/fondo paciente (1).jpeg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 460, 680));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarCitaActionPerformed

        if ( !txtCedula.getText().equals("") && !txtApellido.getText().trim().equals("")
                && !txtNombre.getText().trim().equals("") 
                && !txtTelefono.getText().trim().equals("") && !txtEdad.getText().trim().equals("")
                && JOptionPane.showConfirmDialog(this, "¿Seguro de guardar los datos?", "Ingreso de Datos",
                        JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE) == 0
                && (masculino.isSelected() || femenino.isSelected())
                && cmbDia.getSelectedIndex() != 0
                && cbmHorario.getSelectedIndex() != 0) {

            Paciente insertarPaciente = new Paciente(
                    txtCedula.getText(),
                    txtNombre.getText(),
                    txtApellido.getText(),
                    seleccionGenero,
                    txtTelefono.getText(),
                    cmbDia.getSelectedItem().toString(),
                    cbmHorario.getSelectedItem().toString(),
                    txtEdad.getText(),
                    fechaNacimiento.getDate()
            );

            if (PacienteServicio.InsertarPaciente(insertarPaciente)) {
                JOptionPane.showMessageDialog(null, "Cita registrada correctamente");
                limpiarDatos();
            } else {
                JOptionPane.showMessageDialog(null, "Error al registrar cita");
            }
            

        }else{
            JOptionPane.showMessageDialog(null, "Ingrese todos los datos para registrar la cita");
        }

    }//GEN-LAST:event_btnRegistrarCitaActionPerformed

    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed
        LoginUsuario menu = new LoginUsuario();
        menu.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnCerrarSesionActionPerformed

    private void fechaNacimientoPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_fechaNacimientoPropertyChange
         if ("date".equals(evt.getPropertyName()) && fechaNacimiento.getDate() != null) {
            Date fechaSeleccionada = fechaNacimiento.getDate();

            if (isValidDate(fechaSeleccionada)) {
                int año = fechaNacimiento.getCalendar().get(Calendar.YEAR);
                Date fecha = new Date();
                SimpleDateFormat formato = new SimpleDateFormat("yyyy");
                String fechaSistema = formato.format(fecha);
                int anio = Integer.parseInt(fechaSistema), resta;
                resta = (anio - año);
                String edad = Integer.toString(resta);
                txtEdad.setText(edad);
            } else {
                JOptionPane.showMessageDialog(null, "La fecha seleccionada no es válida");
                fechaNacimiento.setDate(null);  
                txtEdad.setText("");  
            }
         }
    }//GEN-LAST:event_fechaNacimientoPropertyChange

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

    private void btnConsultarCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarCitaActionPerformed
        ConsultaPaciente consultaPac = new ConsultaPaciente();
        consultaPac.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnConsultarCitaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PacienteVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PacienteVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PacienteVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PacienteVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PacienteVentana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup botones;
    private javax.swing.JToggleButton btnCerrarSesion;
    private javax.swing.JToggleButton btnConsultarCita;
    private javax.swing.JToggleButton btnRegistrarCita;
    private javax.swing.JComboBox<String> cbmHorario;
    private javax.swing.JComboBox<String> cmbDia;
    private com.toedter.calendar.JDateChooser fechaNacimiento;
    private javax.swing.JRadioButton femenino;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton masculino;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
