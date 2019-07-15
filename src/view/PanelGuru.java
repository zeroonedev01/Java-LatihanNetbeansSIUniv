/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import javax.swing.ImageIcon;
import view.login;
import view.crud;
import javax.swing.JOptionPane;

/**
 *
 * @author Ammar Dragneel
 */
public class PanelGuru extends javax.swing.JFrame {

    /**
     * Creates new form PanelGuru
     */
    public PanelGuru() {
        initComponents();
        initComponents();
         ImageIcon ico = new ImageIcon("src/view/logo.png");
         setIconImage(ico.getImage());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        namaguru = new javax.swing.JLabel();
        b_student = new javax.swing.JButton();
        b_jadwal = new javax.swing.JButton();
        keluar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Panel Guru");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        panel.setBackground(new java.awt.Color(204, 204, 255));

        namaguru.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        namaguru.setText("Welcome,");

        b_student.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        b_student.setText("Edit Profile");
        b_student.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_studentActionPerformed(evt);
            }
        });

        b_jadwal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        b_jadwal.setText("Class Schedule");
        b_jadwal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_jadwalActionPerformed(evt);
            }
        });

        keluar1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        keluar1.setText("Logout");
        keluar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(namaguru))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(b_student, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(b_jadwal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(keluar1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(112, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(namaguru)
                .addGap(52, 52, 52)
                .addComponent(b_student)
                .addGap(18, 18, 18)
                .addComponent(b_jadwal)
                .addGap(18, 18, 18)
                .addComponent(keluar1)
                .addContainerGap(91, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(416, 339));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void b_studentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_studentActionPerformed
        new edit_guru1().show();
        dispose();// TODO add your handling code here:
    }//GEN-LAST:event_b_studentActionPerformed

    private void b_jadwalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_jadwalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b_jadwalActionPerformed

    private void keluar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluar1ActionPerformed
        int konfirmasi = JOptionPane.showConfirmDialog(null,"Yakin ingin LogOut","Confrirm",JOptionPane.YES_NO_OPTION); 
        if (konfirmasi==0) {
        new login().show();
        this.dispose();
      } else {
        
        }
        
        // TODO add your handling code here:
    }//GEN-LAST:event_keluar1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        namaguru.setText("Welcome, "+login.nama());// TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(PanelGuru.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PanelGuru.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PanelGuru.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PanelGuru.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PanelGuru().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_jadwal;
    private javax.swing.JButton b_student;
    private javax.swing.JButton keluar1;
    private javax.swing.JLabel namaguru;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables
}