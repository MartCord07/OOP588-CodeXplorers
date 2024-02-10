package proyecto.gui.espe;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.result.DeleteResult;
import com.mongodb.client.result.UpdateResult;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import org.bson.Document;
import org.bson.types.ObjectId;

public class Admin extends javax.swing.JFrame {

    int filaSeleccionada = -1;

    public Admin() {
        initComponents();
  

 
        actualizarcita.setVisible(false);
        Eliminar.setVisible(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSlider1 = new javax.swing.JSlider();
        sexo = new javax.swing.ButtonGroup();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Actualizar = new javax.swing.JButton();
        Eliminarbtn = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        opciones = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        actualizarcita = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Eliminar = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        jLabel7.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        jLabel7.setText("Cedula:");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Cambria Math", 1, 24)); // NOI18N
        jLabel2.setText("Opciones");

        Actualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/iconos/espe/Actualizar 48.png"))); // NOI18N
        Actualizar.setText("Actualizar");
        Actualizar.setContentAreaFilled(false);
        Actualizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Actualizar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/iconos/espe/Actualizar 48.png"))); // NOI18N
        Actualizar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/iconos/espe/Actualizar 72.png"))); // NOI18N
        Actualizar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Actualizar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarActionPerformed(evt);
            }
        });

        Eliminarbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/iconos/espe/Eliminar 48.png"))); // NOI18N
        Eliminarbtn.setText("Eliminar");
        Eliminarbtn.setContentAreaFilled(false);
        Eliminarbtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Eliminarbtn.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/iconos/espe/Eliminar 48.png"))); // NOI18N
        Eliminarbtn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/iconos/espe/Eliminar 72.png"))); // NOI18N
        Eliminarbtn.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Eliminarbtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Eliminarbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(37, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Eliminarbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel2)
                .addGap(43, 43, 43)
                .addComponent(Actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(Eliminarbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(198, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 563));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/fondos/espe/cita_admin.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 910, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 563, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 0, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/fondos/espe/cita_admin.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 36)); // NOI18N
        jLabel4.setText("Cita Medica");

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/fondos/espe/cita_admin.png"))); // NOI18N

        javax.swing.GroupLayout actualizarcitaLayout = new javax.swing.GroupLayout(actualizarcita);
        actualizarcita.setLayout(actualizarcitaLayout);
        actualizarcitaLayout.setHorizontalGroup(
            actualizarcitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(actualizarcitaLayout.createSequentialGroup()
                .addGap(281, 281, 281)
                .addComponent(jLabel4)
                .addContainerGap(389, Short.MAX_VALUE))
            .addGroup(actualizarcitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(actualizarcitaLayout.createSequentialGroup()
                    .addGap(12, 12, 12)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 896, Short.MAX_VALUE)
                    .addGap(12, 12, 12)))
        );
        actualizarcitaLayout.setVerticalGroup(
            actualizarcitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(actualizarcitaLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel4)
                .addContainerGap(491, Short.MAX_VALUE))
            .addGroup(actualizarcitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(actualizarcitaLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 548, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel5.setText("Eliminar");

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/fondos/espe/cita_admin.png"))); // NOI18N

        javax.swing.GroupLayout EliminarLayout = new javax.swing.GroupLayout(Eliminar);
        Eliminar.setLayout(EliminarLayout);
        EliminarLayout.setHorizontalGroup(
            EliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EliminarLayout.createSequentialGroup()
                .addGap(367, 367, 367)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(357, Short.MAX_VALUE))
            .addGroup(EliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(EliminarLayout.createSequentialGroup()
                    .addGap(12, 12, 12)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 910, Short.MAX_VALUE)
                    .addGap(12, 12, 12)))
        );
        EliminarLayout.setVerticalGroup(
            EliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EliminarLayout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jLabel5)
                .addContainerGap(433, Short.MAX_VALUE))
            .addGroup(EliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(EliminarLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 563, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout opcionesLayout = new javax.swing.GroupLayout(opciones);
        opciones.setLayout(opcionesLayout);
        opcionesLayout.setHorizontalGroup(
            opcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 920, Short.MAX_VALUE)
            .addGroup(opcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(actualizarcita, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(opcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Eliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(opcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 920, Short.MAX_VALUE))
        );
        opcionesLayout.setVerticalGroup(
            opcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 560, Short.MAX_VALUE)
            .addGroup(opcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(actualizarcita, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(opcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Eliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(opcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(opcionesLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 554, Short.MAX_VALUE)))
        );

        getContentPane().add(opciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 920, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarActionPerformed
        actualizarcita.setVisible(true);
    }//GEN-LAST:event_ActualizarActionPerformed

    private void EliminarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarbtnActionPerformed
        Eliminar.setVisible(true);
    }//GEN-LAST:event_EliminarbtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Actualizar;
    private javax.swing.JPanel Eliminar;
    private javax.swing.JButton Eliminarbtn;
    private javax.swing.JPanel actualizarcita;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JPanel opciones;
    private javax.swing.ButtonGroup sexo;
    // End of variables declaration//GEN-END:variables
}
