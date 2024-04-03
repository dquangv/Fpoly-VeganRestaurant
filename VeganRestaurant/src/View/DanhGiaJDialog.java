/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package View;

import Controller.DanhGia_DAO;
import Model.DanhGia;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

/**
 *
 * @author hoang
 */
public class DanhGiaJDialog extends javax.swing.JDialog {

    DanhGia_DAO dg_DAO = new DanhGia_DAO();

    /**
     * Creates new form DanhGiaJDialog
     */
    public DanhGiaJDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        //chiTietDanhGia();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnQuayLai = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtPhieuDatBan = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtMaHoaDon = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtTenKhach = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        pnlDanhGia = new javax.swing.JPanel();
        btnLuuDG = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        btnQuayLai.setText("Quay lại");
        btnQuayLai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuayLaiActionPerformed(evt);
            }
        });

        jLabel1.setText("Phiếu Đặt Bàn");

        txtPhieuDatBan.setText("...");

        jLabel3.setText("Mã Hóa Đơn:");

        txtMaHoaDon.setText("...");

        jLabel5.setText("Khách Hàng:");

        txtTenKhach.setText("...");

        javax.swing.GroupLayout pnlDanhGiaLayout = new javax.swing.GroupLayout(pnlDanhGia);
        pnlDanhGia.setLayout(pnlDanhGiaLayout);
        pnlDanhGiaLayout.setHorizontalGroup(
            pnlDanhGiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 949, Short.MAX_VALUE)
        );
        pnlDanhGiaLayout.setVerticalGroup(
            pnlDanhGiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 435, Short.MAX_VALUE)
        );

        jScrollPane2.setViewportView(pnlDanhGia);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2))
        );

        btnLuuDG.setText("Lưu");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnQuayLai)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLuuDG)
                        .addGap(236, 236, 236)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMaHoaDon)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTenKhach)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPhieuDatBan)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnQuayLai)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(txtMaHoaDon)
                    .addComponent(jLabel5)
                    .addComponent(txtTenKhach)
                    .addComponent(btnLuuDG)
                    .addComponent(txtPhieuDatBan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        chiTietDanhGia(Integer.parseInt(txtMaHoaDon.getText().substring(2)));
        //chiTietDanhGia();
    }//GEN-LAST:event_formWindowOpened

    private void btnQuayLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuayLaiActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnQuayLaiActionPerformed

    void layMaHoaDon(int mahd) {
        txtMaHoaDon.setText("HD" + mahd);
    }

    void chiTietDanhGia(int mahd) {
        List<DanhGia> ds_DanhGia = dg_DAO.selectByMaHD(mahd);
        List<JLabel> ds_TenMon = new ArrayList<>();
        List<JCheckBox> ds_sao = new ArrayList<>();

        pnlDanhGia.setLayout(new GridLayout(1, 2));
        //pnlDanhGia.setBorder(new LineBorder(Color.yellow));

        JPanel pnlTrai = new JPanel();
        JPanel pnlPhai = new JPanel();

        pnlTrai.setLayout(new GridLayout(ds_DanhGia.size(), 1));
        pnlPhai.setLayout(new GridLayout(ds_DanhGia.size(), 1));

        //pnlTrai.setBackground(Color.red);
        //pnlPhai.setBackground(Color.BLUE);
        pnlDanhGia.add(pnlTrai);
        pnlDanhGia.add(pnlPhai);

        for (DanhGia dg : ds_DanhGia) {
            try {
                txtTenKhach.setText(dg.getTenKhachHang());
                txtPhieuDatBan.setText("PDB" + dg.getMaPhieuDatBan());

                JPanel pnlConT = new JPanel();
                //pnlConT.setBackground(Color.red);
                pnlConT.setLayout(new BorderLayout());

                JPanel pnlConP = new JPanel();
                //pnlConP.setBackground(Color.BLUE);
                pnlConP.setLayout(new GridLayout(1, 1));

                JButton btnNew = new JButton("Đánh giá");
                JLabel lblTenMon = new JLabel(dg.getTenMonAn());
                JLabel lblHinh = new JLabel();

                ds_TenMon.add(lblTenMon);

                ButtonGroup btnGroup = new ButtonGroup();
                for (int i = 1; i <= 5; i++) {
                    JCheckBox chkSao = new JCheckBox(i + " Sao");
                    ds_sao.add(chkSao);

                    if (dg.getMaDanhGia() != null) {
                        if (i == dg.getMaDanhGia()) {
                            chkSao.setSelected(true); // Chọn checkbox nếu giá trị checkbox trùng với MaDanhGia
                        }
                    }

                    btnGroup.add(chkSao);
                    pnlConP.add(chkSao);
                }

                String imgPath = "/Image/menu/" + dg.getHinhAnh();
                InputStream inputStream = getClass().getResourceAsStream(imgPath);
                BufferedImage originalImage = ImageIO.read(inputStream);

                int scaledWidth = 200;
                int scaledHeight = (int) (((double) scaledWidth / originalImage.getWidth()) * originalImage.getHeight());
                Image scaledImage = originalImage.getScaledInstance(scaledWidth, scaledHeight, Image.SCALE_SMOOTH);
                ImageIcon scaledIcon = new ImageIcon(scaledImage);

                lblHinh.setIcon(scaledIcon);

                lblTenMon.setFont(new java.awt.Font("Segoe UI", 1, 20));

                pnlConT.add(lblTenMon, BorderLayout.NORTH);
                pnlConT.add(lblHinh, BorderLayout.CENTER);
                pnlConT.add(btnNew, BorderLayout.WEST);

                pnlTrai.add(pnlConT);
                pnlPhai.add(pnlConP);
            } catch (IOException ex) {
                Logger.getLogger(DanhGiaJDialog.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        for (JLabel lbl : ds_TenMon) {
            System.out.println(lbl.getText());
        }

        for (JCheckBox chk : ds_sao) {
            if (ds_DanhGia.isEmpty()) {
                return;
            }
            else{
            if (chk.isSelected()) {
                // Xử lý khi checkbox được chọn ở đây
                System.out.println(chk.getText().substring(0, 2));
            } else {
                // Xử lý khi checkbox không được chọn ở đây 
                System.out.println(chk);
            }
            }

        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLuuDG;
    private javax.swing.JButton btnQuayLai;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel pnlDanhGia;
    private javax.swing.JLabel txtMaHoaDon;
    private javax.swing.JLabel txtPhieuDatBan;
    private javax.swing.JLabel txtTenKhach;
    // End of variables declaration//GEN-END:variables
}
