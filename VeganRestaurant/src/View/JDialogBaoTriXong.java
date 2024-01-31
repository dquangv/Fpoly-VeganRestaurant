/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package View;

import Controller.DatBanDao;
import static Controller.DatBanDao.Trong;
import Utils.MsgBox;
import javax.swing.JFrame;

/**
 *
 * @author Võ Thanh Tùng
 */
public class JDialogBaoTriXong extends javax.swing.JDialog {
        DatBanDao dbDAO = new DatBanDao();
    /**
     * Creates new form JDialogBaoTriXong
     */
    public JDialogBaoTriXong(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(parent);
    }

    
    public void setBan(String maBan) {
        lbMaBan.setText("Bàn: " + maBan);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbMaBan = new javax.swing.JLabel();
        lbTrangThai = new javax.swing.JLabel();
        lbBaoTriXong = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lbMaBan.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbMaBan.setText("Bàn  1");

        lbTrangThai.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbTrangThai.setForeground(new java.awt.Color(255, 0, 51));
        lbTrangThai.setText("Trạng thái: Đang Bảo trì");

        lbBaoTriXong.setBackground(new java.awt.Color(51, 255, 0));
        lbBaoTriXong.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbBaoTriXong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/trong.png"))); // NOI18N
        lbBaoTriXong.setText("Bảo trì xong");
        lbBaoTriXong.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbBaoTriXong.setFocusTraversalPolicyProvider(true);
        lbBaoTriXong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbBaoTriXongMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbMaBan)
                    .addComponent(lbTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbBaoTriXong))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbMaBan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbBaoTriXong)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbBaoTriXongMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbBaoTriXongMouseClicked
        String maBan = lbMaBan.getText().substring(5);
        MsgBox.alert(this, "Đã bảo trì xong");
        thayDoiTrangThai(maBan);
        
        this.setVisible(false);
    }//GEN-LAST:event_lbBaoTriXongMouseClicked

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
            java.util.logging.Logger.getLogger(JDialogBaoTriXong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDialogBaoTriXong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDialogBaoTriXong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDialogBaoTriXong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDialogBaoTriXong dialog = new JDialogBaoTriXong(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbBaoTriXong;
    private javax.swing.JLabel lbMaBan;
    private javax.swing.JLabel lbTrangThai;
    // End of variables declaration//GEN-END:variables
     public void thayDoiTrangThai(String maBan) {
        dbDAO.updateTrangThai(Trong, maBan);
    }
}
