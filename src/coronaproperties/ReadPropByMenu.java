/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coronaproperties;

import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 *
 * @author Melvin K
 */
public class ReadPropByMenu extends javax.swing.JFrame {
    /**
     * Creates new form ReadPropByMenu
     */
    public ReadPropByMenu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnViewAll = new javax.swing.JButton();
        btnViewByCity = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        lblHeading = new javax.swing.JLabel();
        btnViewByStatus = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setPreferredSize(new java.awt.Dimension(800, 600));

        btnViewAll.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        btnViewAll.setText("View All Property");
        btnViewAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewAllActionPerformed(evt);
            }
        });

        btnViewByCity.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        btnViewByCity.setText("View By City");
        btnViewByCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewByCityActionPerformed(evt);
            }
        });

        btnCancel.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        lblHeading.setFont(new java.awt.Font("Arial", 1, 25)); // NOI18N
        lblHeading.setText("Corona Properties");

        btnViewByStatus.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        btnViewByStatus.setText("View By Status");
        btnViewByStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewByStatusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(293, 293, 293)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblHeading)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(btnCancel))
                            .addComponent(btnViewAll)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(315, 315, 315)
                        .addComponent(btnViewByCity))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(303, 303, 303)
                        .addComponent(btnViewByStatus)))
                .addContainerGap(289, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblHeading)
                .addGap(70, 70, 70)
                .addComponent(btnViewAll)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 123, Short.MAX_VALUE)
                .addComponent(btnViewByStatus)
                .addGap(87, 87, 87)
                .addComponent(btnViewByCity)
                .addGap(99, 99, 99)
                .addComponent(btnCancel)
                .addGap(44, 44, 44))
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        int option = JOptionPane.showConfirmDialog(null, "Do you really want to cancel?", "Are you sure", JOptionPane.YES_NO_OPTION);
        /*
         * 0 = yes
         * 1 = no
         */
        if (option == 0) {
            this.dispose();

            //Back to main menu
            MainMenu menu = new MainMenu();

            menu.setTitle("Corona Main Menu");
            menu.setOpacity((float) 0.9);
            menu.setBackground(new Color(0, 0, 0, 0));
            menu.setIconImage(Toolkit.getDefaultToolkit().
                    getImage(SetJFrame_Icon.class.getResource("/icons/icons8_House_100px.png")));
            menu.setLocationRelativeTo(null);
            menu.setVisible(true);

            System.gc();
        }
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnViewAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewAllActionPerformed
        ReadPropAll aReadProp = new ReadPropAll();
    }//GEN-LAST:event_btnViewAllActionPerformed

    private void btnViewByStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewByStatusActionPerformed
        String constructionStatus = JOptionPane.showInputDialog("Enter construction status(Completed or Not Complete): ");
        ReadPropByStatus aReadPropByStatus = new ReadPropByStatus(constructionStatus);
    }//GEN-LAST:event_btnViewByStatusActionPerformed

    private void btnViewByCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewByCityActionPerformed
        String addressCity = JOptionPane.showInputDialog("Enter city (Eg: Durban, Kimberley): ");
        ReadPropByCity aReadPropByCity = new ReadPropByCity(addressCity);
    }//GEN-LAST:event_btnViewByCityActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ReadPropByMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReadPropByMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReadPropByMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReadPropByMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReadPropByMenu().setVisible(true);
            }

        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnViewAll;
    private javax.swing.JButton btnViewByCity;
    private javax.swing.JButton btnViewByStatus;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblHeading;
    // End of variables declaration//GEN-END:variables
}
