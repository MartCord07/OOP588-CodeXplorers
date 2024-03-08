/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyecto.vista.admin.espe;

/**
 *
 * @author Aliss
 */
public class inicioAdmin extends javax.swing.JFrame {

    public inicioAdmin() {
        initComponents();
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        labelNombreAdmin = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Citas = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel2.setText("Escoge una opcion: ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 210, -1));

        labelNombreAdmin.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        getContentPane().add(labelNombreAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, 80, 30));

        jLabel3.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jLabel3.setText("Bienvendio ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 120, -1));

        Citas.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        Citas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/iconos/espe/Cita_Registradas64.png"))); // NOI18N
        Citas.setText("Citas registradas");
        Citas.setBorderPainted(false);
        Citas.setContentAreaFilled(false);
        Citas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Citas.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Citas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Citas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CitasActionPerformed(evt);
            }
        });
        getContentPane().add(Citas, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/fondos/espe/fondo_inicioAdmin.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 600, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CitasActionPerformed
       
    }//GEN-LAST:event_CitasActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new inicioAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Citas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel labelNombreAdmin;
    // End of variables declaration//GEN-END:variables
}
