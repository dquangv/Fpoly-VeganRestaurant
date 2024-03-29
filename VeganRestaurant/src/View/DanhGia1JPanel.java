/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View;

import Controller.DanhGia_DAO;
import Model.DanhGia;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hoang
 */
public class DanhGia1JPanel extends javax.swing.JPanel {

    DanhGia_DAO dg_DAO = new DanhGia_DAO();
    int row = -1;
    
    /**
     * Creates new form DanhGiaJPanel
     */
    public DanhGia1JPanel() {
        initComponents();
        this.themVaoTableCTDG();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    void themVaoTableCTDG() {
        DefaultTableModel model = (DefaultTableModel) tblChiTietDanhGia.getModel();
        model.setRowCount(0);
        try {
            List<DanhGia> list = dg_DAO.selectAll();
            for (DanhGia dg : list) {
                Object[] row = {
                    
                    dg.getMaHoaDon(),
                    dg.getNgayLap(),
                    dg.getTenMonAn(),
                    dg.getHinhAnh(),
                    dg.getMaDanhGia(),
                    dg.getDanhGia(),
                    dg.getTenKhachHang()
                        
                };

                model.addRow(row);
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblChiTietDanhGia = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        tblChiTietDanhGia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "null5", "null6", "null7"
            }
        ));
        jScrollPane1.setViewportView(tblChiTietDanhGia);

        jButton1.setText("Phản Hồi");

        jButton2.setText("Xem Chi Tiết");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 859, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblChiTietDanhGia;
    // End of variables declaration//GEN-END:variables
}
