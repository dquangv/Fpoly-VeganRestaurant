/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package View;

import Controller.DatBanDao;
import static Controller.DatBanDao.Trong;
import java.awt.Color;
import java.util.List;
import javax.swing.JButton;

/**
 *
 * @author Võ Thanh Tùng
 */
public class JDialogTrangThaiDatBan extends javax.swing.JDialog {

    DatBanDao dbDAO = new DatBanDao();
  
    /**
     * Creates new form JDialogTrangThaiDatBan
     */
    public JDialogTrangThaiDatBan(java.awt.Frame parent, boolean modal) {
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

        lbHuyDatBan = new javax.swing.JLabel();
        lbMaBan = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbTrangThai = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lbHuyDatBan.setBackground(new java.awt.Color(51, 255, 0));
        lbHuyDatBan.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbHuyDatBan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/da dat.png"))); // NOI18N
        lbHuyDatBan.setText("Hũy đặt bàn");
        lbHuyDatBan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbHuyDatBan.setFocusTraversalPolicyProvider(true);
        lbHuyDatBan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbHuyDatBanMouseClicked(evt);
            }
        });

        lbMaBan.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbMaBan.setText("Bàn  1");

        jLabel4.setBackground(new java.awt.Color(51, 255, 0));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Dang phuc vu.png"))); // NOI18N
        jLabel4.setText("Bất đầu phục vụ");
        jLabel4.setFocusTraversalPolicyProvider(true);

        lbTrangThai.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbTrangThai.setForeground(new java.awt.Color(255, 0, 51));
        lbTrangThai.setText("Trạng thái: Đã đặt trước");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Tên khách hàng: Dương Quang Nghĩa");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("SDT: 0932211424");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbMaBan)
                            .addComponent(jLabel4)
                            .addComponent(lbHuyDatBan)
                            .addComponent(lbTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbMaBan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(lbHuyDatBan)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbHuyDatBanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbHuyDatBanMouseClicked
        String maBan = lbMaBan.getText().substring(5);
        thayDoiTrangThai(maBan);
        System.out.println(maBan);
        this.setVisible(false);
    }//GEN-LAST:event_lbHuyDatBanMouseClicked

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
            java.util.logging.Logger.getLogger(JDialogTrangThaiDatBan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDialogTrangThaiDatBan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDialogTrangThaiDatBan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDialogTrangThaiDatBan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDialogTrangThaiDatBan dialog = new JDialogTrangThaiDatBan(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lbHuyDatBan;
    private javax.swing.JLabel lbMaBan;
    private javax.swing.JLabel lbTrangThai;
    // End of variables declaration//GEN-END:variables
     public void thayDoiTrangThai(String maBan) {
        dbDAO.updateTrangThai(Trong, maBan);
    }
}
