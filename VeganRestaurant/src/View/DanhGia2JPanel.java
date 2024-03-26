/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View;

import Controller.DanhGia_DAO;
import Model.DanhGia;

/**
 *
 * @author hoang
 */
public class DanhGia2JPanel extends javax.swing.JPanel {

    DanhGia_DAO dg_DAO = new DanhGia_DAO();
//    DanhGia dg = new DanhGia();
    
    /**
     * Creates new form DanhGia2JPanel
     */
    public DanhGia2JPanel() {
        initComponents();
        thietlapFormDanhGia();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    void thietlapFormDanhGia(){        
        
        txtNgay.setText("");
        txtMaHoaDon.setText("");
        jLabel5.setText("");
        //txtHinhAnh.setIcon("");
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        txtNgay = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtMaHoaDon = new javax.swing.JLabel();
        txtTenKhach = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtHinhAnh = new javax.swing.JLabel();
        chk1Sao = new javax.swing.JCheckBox();
        chk2Sao = new javax.swing.JCheckBox();
        chk3Sao = new javax.swing.JCheckBox();
        chk4Sao = new javax.swing.JCheckBox();
        chk5Sao = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();

        jLabel1.setText("Ngày Đánh Giá:");

        txtNgay.setText("...");

        jLabel3.setText("Mã Hóa Đơn:");

        txtMaHoaDon.setText("...");

        txtTenKhach.setText("...");

        jLabel5.setText("Khách Hàng:");

        txtHinhAnh.setText("Hình Món");
        txtHinhAnh.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        buttonGroup1.add(chk1Sao);
        chk1Sao.setText("1 Sao");

        buttonGroup1.add(chk2Sao);
        chk2Sao.setText("2 Sao");

        buttonGroup1.add(chk3Sao);
        chk3Sao.setText("3 Sao");

        buttonGroup1.add(chk4Sao);
        chk4Sao.setText("4 Sao");

        buttonGroup1.add(chk5Sao);
        chk5Sao.setText("5 Sao");

        jButton1.setText("Quay lại");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNgay)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMaHoaDon)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTenKhach))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtHinhAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(chk1Sao)
                        .addGap(18, 18, 18)
                        .addComponent(chk2Sao)
                        .addGap(18, 18, 18)
                        .addComponent(chk3Sao)
                        .addGap(18, 18, 18)
                        .addComponent(chk4Sao)
                        .addGap(18, 18, 18)
                        .addComponent(chk5Sao)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNgay)
                    .addComponent(jLabel3)
                    .addComponent(txtMaHoaDon)
                    .addComponent(txtTenKhach)
                    .addComponent(jLabel5)
                    .addComponent(jButton1))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHinhAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chk1Sao)
                    .addComponent(chk2Sao)
                    .addComponent(chk3Sao)
                    .addComponent(chk4Sao)
                    .addComponent(chk5Sao))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox chk1Sao;
    private javax.swing.JCheckBox chk2Sao;
    private javax.swing.JCheckBox chk3Sao;
    private javax.swing.JCheckBox chk4Sao;
    private javax.swing.JCheckBox chk5Sao;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel txtHinhAnh;
    private javax.swing.JLabel txtMaHoaDon;
    private javax.swing.JLabel txtNgay;
    private javax.swing.JLabel txtTenKhach;
    // End of variables declaration//GEN-END:variables
}
