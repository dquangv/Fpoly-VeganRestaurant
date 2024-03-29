/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package View;

import Controller.ChuyenManHinh;
import Controller.DatBanDao;
import Utils.MsgBox;
import javax.swing.JDialog;

/**
 *
 * @author Võ Thanh Tùng
 */
public class JDiaLogDangPhucVu extends javax.swing.JDialog {

    DatBanDao dbDAO = new DatBanDao();

    /**
     * Creates new form JDiaLogDangPhucVu
     */
    public JDiaLogDangPhucVu(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(parent);
    }

    public void setBan(int maBan) {
        lbmaBan.setText("Bàn: " + maBan);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbmaBan = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbThemMon = new javax.swing.JLabel();
        lbThanhToans = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lbmaBan.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lbmaBan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbmaBan.setText("Ban: 1");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 255, 51));
        jLabel2.setText("Trạng thái: Đang Phục vụ");

        lbThemMon.setBackground(new java.awt.Color(51, 255, 0));
        lbThemMon.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbThemMon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/da dat.png"))); // NOI18N
        lbThemMon.setText("Thêm món");
        lbThemMon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbThemMon.setFocusTraversalPolicyProvider(true);
        lbThemMon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbThemMonMouseClicked(evt);
            }
        });

        lbThanhToans.setBackground(new java.awt.Color(51, 255, 0));
        lbThanhToans.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbThanhToans.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/bao tri.png"))); // NOI18N
        lbThanhToans.setText("Thanh Toán");
        lbThanhToans.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbThanhToans.setFocusTraversalPolicyProvider(true);
        lbThanhToans.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbThanhToansMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbThemMon))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbThanhToans))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(lbmaBan, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(lbmaBan, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbThemMon)
                .addGap(18, 18, 18)
                .addComponent(lbThanhToans)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbThemMonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbThemMonMouseClicked
        String maBan = lbmaBan.getText().substring(5);
        System.out.println(maBan);
        this.setVisible(false);
        GoiMon dialogGoiMon = new GoiMon();
        JDialog dialog = new JDialog();
        dialog.getContentPane().add(dialogGoiMon);
        dialog.pack();
        dialog.setLocationRelativeTo(null);
        dialog.setVisible(true);
        dialogGoiMon.setBan(maBan);
    }//GEN-LAST:event_lbThemMonMouseClicked

    private void lbThanhToansMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbThanhToansMouseClicked
        String maBan = lbmaBan.getText().substring(5);
        MsgBox.alert(this,"Đã thanh toán");
//        Main main = new Main();
//        main.
//                ChuyenManHinh control = new ChuyenManHinh();

        thayDoiTrangThai(maBan);
        this.setVisible(false);
        
    }//GEN-LAST:event_lbThanhToansMouseClicked

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
            java.util.logging.Logger.getLogger(JDiaLogDangPhucVu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDiaLogDangPhucVu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDiaLogDangPhucVu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDiaLogDangPhucVu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDiaLogDangPhucVu dialog = new JDiaLogDangPhucVu(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lbThanhToans;
    private javax.swing.JLabel lbThemMon;
    private javax.swing.JLabel lbmaBan;
    // End of variables declaration//GEN-END:variables
     public void thayDoiTrangThai(String maBan) {
        dbDAO.updateTrangThai(DatBanDao.Trong, maBan);
    }
}
