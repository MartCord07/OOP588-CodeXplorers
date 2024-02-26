/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyecto.vista.espe;

import proyecto.vista.espe.CitaVista;

/**
 *
 * @author Aliss
 */
public class inicioAdmin extends javax.swing.JFrame {

    /**
     * Creates new form inicioAdmin
     */
    public inicioAdmin() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Admin = new javax.swing.JButton();
        Cita = new javax.swing.JButton();
        Doctor = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        jLabel2.setText("Bienvenido");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, -1, -1));

        Admin.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        Admin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/iconos/espe/admin_64.png"))); // NOI18N
        Admin.setText("Añadir Admin");
        Admin.setContentAreaFilled(false);
        Admin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Admin.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/iconos/espe/admin_64.png"))); // NOI18N
        Admin.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/iconos/espe/admin_96.png"))); // NOI18N
        Admin.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Admin.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(Admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, 150, 140));

        Cita.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        Cita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/iconos/espe/Cita_64.png"))); // NOI18N
        Cita.setText("Cita Medica");
        Cita.setContentAreaFilled(false);
        Cita.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Cita.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/iconos/espe/Cita_64.png"))); // NOI18N
        Cita.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/iconos/espe/Cita_96.png"))); // NOI18N
        Cita.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Cita.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Cita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CitaActionPerformed(evt);
            }
        });
        jPanel1.add(Cita, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, 160, 170));

        Doctor.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        Doctor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/iconos/espe/Doctor_64.png"))); // NOI18N
        Doctor.setText("Añadir Doctor");
        Doctor.setContentAreaFilled(false);
        Doctor.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Doctor.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/iconos/espe/Doctor_64.png"))); // NOI18N
        Doctor.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/iconos/espe/Doctor_96.png"))); // NOI18N
        Doctor.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Doctor.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(Doctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 150, 150));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/fondos/espe/fondo_inicioAdmin.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, 600, 340));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 607, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CitaActionPerformed
        ConsultarCitaAD cita = new ConsultarCitaAD();
        cita.setVisible(true);
        cita.setLocationRelativeTo(null);
    }//GEN-LAST:event_CitaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Admin;
    private javax.swing.JButton Cita;
    private javax.swing.JButton Doctor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
