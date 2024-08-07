/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View;

import Controller.ChiTietDatBan_DAO;
import Controller.DatBanDao;
import static Controller.DatBanDao.BAO_TRI;
import static Controller.DatBanDao.DANG_PHUC_VU;
import Controller.KhachHangDAO;
import Controller.KhachHangDBDao;
import Controller.PhieuDatBanDao;
import Model.ChiTietDatBan;
import Model.PhieuDatBan;
import Utils.MsgBox;
import java.awt.Color;
import java.awt.FlowLayout;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableColumnModel;
import javax.swing.SwingConstants;
import javax.swing.table.JTableHeader;

/**
 *
 * @author Võ Thanh Tùng
 */
public class JPanelDatBan extends javax.swing.JPanel {

    static DatBanDao dBDao = new DatBanDao();
    KhachHangDBDao khDBDAO = new KhachHangDBDao();
    KhachHangDAO khDAO = new KhachHangDAO();
    PhieuDatBanDao pdbDAO = new PhieuDatBanDao();
    ChiTietDatBan_DAO ctdbdao = new ChiTietDatBan_DAO();

//    public static List<JButton> list = new ArrayList<>();
//   
//    public static void thayDoiMauButton(JButton btn[]) {
//        for (int i = 0; i < 36; i++) {
//            if (list.contains(btn[i])) {
//                btn[i].setBackground(Color.yellow);
//            } else {
//                btn[i].setBackground(UIManager.getColor("Button.backgrund"));
//            }
//        }
//    }
//    public static void setButton(int maBan){
//         JButton button = timButtonByMaBan(maBan);
//          if (button != null) { 
//        if (list.contains(button)) {
//            list.remove(button);
//            System.out.println("Đã xóa bàn " + maBan);
//        } else {
//            list.add(button);
//            System.out.println("Đã thêm bàn " + maBan);
//        }
//        thayDoiMauButton(new JButton[]{button}); // Truyền vào mảng chứa button
//    } else {
//        System.out.println("Không tìm thấy button với mã bàn " + maBan);
//    }
//        for (JButton jButton : list) {
//            jButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                JButton clickedButton = (JButton) e.getSource();
//                if (!list.contains(clickedButton)) {
//                    list.add(clickedButton);
//                    System.out.println("Da them " + clickedButton.getText());
//                } else {
//                    list.remove(clickedButton);
//                    System.out.println("Da xoa " + clickedButton.getText());
//                }
//                updateButtonBackgrounds(new JButton[]{jButton});
//                System.out.println(list);
//            }
//        });
//        }
//    }
    /**
     * Creates new form NewJPanel
     */
    public JPanelDatBan() {
        initComponents();
        fillToTable();
        fillComboBoxTang();
        setIcon();
        // Tạo renderer cho nội dung của ô
        formartTable();
    }

    void formartTable() {
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);

        // Tạo renderer cho tiêu đề của các cột
        JTableHeader header = tblDatBan.getTableHeader();
        DefaultTableCellRenderer headerRenderer = (DefaultTableCellRenderer) header.getDefaultRenderer();
        headerRenderer.setHorizontalAlignment(SwingConstants.CENTER);

        // Lặp qua tất cả các cột và thiết lập renderer cho nội dung và tiêu đề của mỗi cột
        TableColumnModel columnModel = tblDatBan.getColumnModel();
        for (int columnIndex = 0; columnIndex < columnModel.getColumnCount(); columnIndex++) {
            columnModel.getColumn(columnIndex).setCellRenderer(centerRenderer);
            columnModel.getColumn(columnIndex).setHeaderRenderer(headerRenderer);
        }
    }

    void setIcon() {
        ImageIcon iconuser = new ImageIcon("Logos/reserve.png");
        btnDatBan.setIcon(iconuser);
        ImageIcon iconuser1 = new ImageIcon("Logos/serving-dish.png");
        jButton3.setIcon(iconuser1);
        ImageIcon iconuser2 = new ImageIcon("Logos/maintenance.png");
        jButton4.setIcon(iconuser2);

        btnDatBan.setBackground(Color.decode("#F06666"));
        jButton3.setBackground(Color.GREEN);
        jButton4.setBackground(Color.decode("#605E5E"));

    }
//    public void capNhatTable() {
//        class TrangThaitable extends Thread {
//
//            @Override
//            public void run() {
//                while (true) {
//                    fillToTable();
//                    try {
//                        Thread.sleep(1000);
//                    } catch (InterruptedException ex) {
//                        ex.printStackTrace();
//                    }
//                }
//            }
//        }
//
//        TrangThaitable thread = new TrangThaitable();
//        thread.start();
//    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cbTang = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDatBan = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        txtTimKIem = new javax.swing.JTextField();
        btnDatBan = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        cbTang.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cbTang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tầng 1" }));
        cbTang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTangActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/phieu.png"))); // NOI18N

        jLabel2.setBackground(new java.awt.Color(51, 255, 0));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/da dat.png"))); // NOI18N
        jLabel2.setText("Đã đặt");
        jLabel2.setFocusTraversalPolicyProvider(true);

        jLabel4.setBackground(new java.awt.Color(51, 255, 0));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Dang phuc vu.png"))); // NOI18N
        jLabel4.setText("Đang phục vụ");
        jLabel4.setFocusTraversalPolicyProvider(true);

        jLabel3.setBackground(new java.awt.Color(51, 255, 0));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/trong.png"))); // NOI18N
        jLabel3.setText("Trống");
        jLabel3.setFocusTraversalPolicyProvider(true);

        jLabel5.setBackground(new java.awt.Color(51, 255, 0));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/bao tri.png"))); // NOI18N
        jLabel5.setText("Bảo trì");
        jLabel5.setFocusTraversalPolicyProvider(true);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 354, Short.MAX_VALUE)
        );

        tblDatBan.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tblDatBan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã phiêu đặt bàn", "Mã bàn", "Tên khách hàng", "Số điện thoai", "Thời gian", "Trạng thái"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDatBan.setRowHeight(40);
        jScrollPane1.setViewportView(tblDatBan);
        if (tblDatBan.getColumnModel().getColumnCount() > 0) {
            tblDatBan.getColumnModel().getColumn(1).setMinWidth(50);
            tblDatBan.getColumnModel().getColumn(1).setPreferredWidth(100);
            tblDatBan.getColumnModel().getColumn(4).setMinWidth(180);
            tblDatBan.getColumnModel().getColumn(4).setPreferredWidth(180);
            tblDatBan.getColumnModel().getColumn(4).setMaxWidth(180);
        }

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Danh sách đặt bàn");

        txtTimKIem.setBorder(javax.swing.BorderFactory.createTitledBorder("Tìm kiếm"));
        txtTimKIem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimKIemActionPerformed(evt);
            }
        });
        txtTimKIem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTimKIemKeyReleased(evt);
            }
        });

        btnDatBan.setBackground(new java.awt.Color(204, 204, 204));
        btnDatBan.setText("Đặt bàn ");
        btnDatBan.setBorder(null);
        btnDatBan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDatBanActionPerformed(evt);
            }
        });

        jButton3.setText("Phục vụ");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Bảo trì");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(51, 255, 0));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Chon.png"))); // NOI18N
        jLabel7.setText("Chọn");
        jLabel7.setFocusTraversalPolicyProvider(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbTang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel5))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(btnDatBan, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 11, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTimKIem))
                        .addGap(12, 12, 12))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbTang, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel4)
                        .addComponent(jLabel3)
                        .addComponent(jLabel5)
                        .addComponent(jLabel6)
                        .addComponent(jLabel7)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDatBan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtTimKIem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addGap(19, 19, 19))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cbTangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTangActionPerformed
        JComboBox<String> comboBox = (JComboBox<String>) evt.getSource();
        if (comboBox == cbTang && comboBox.getSelectedItem() != null) {

            String selectedTang = (String) comboBox.getSelectedItem();
            switch (selectedTang) {
                case "Tầng 1":
                    jPanel3.removeAll();
                    jPanel3.add(new JPanelTang1());
//                    JPanelTang1.thayDoiMauButton(JPanelTang1.listBT);
                    jPanel3.updateUI();
                    jPanel3.setLayout(new FlowLayout());
                    break;
                case "Tầng 2":
                    jPanel3.removeAll();
                    jPanel3.add(new JPanelTang2());
//                    JPanelTang1.thayDoiMauButton(JPanelTang1.listBT);
                    jPanel3.updateUI();
                    jPanel3.setLayout(new FlowLayout());
                    break;
                case "Tầng 3":
                    jPanel3.removeAll();
                    jPanel3.add(new JPanelTang3());
                    jPanel3.updateUI();
                    jPanel3.setLayout(new FlowLayout());
                    break;
                // Thêm các case khác tương ứng với các tầng khác
                default:
                    break;
            }

        }
    }//GEN-LAST:event_cbTangActionPerformed

    private void txtTimKIemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimKIemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTimKIemActionPerformed

    private void txtTimKIemKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimKIemKeyReleased
        String test = txtTimKIem.getText();
        if (test.equalsIgnoreCase("")) {
            fillToTable();
        }else{
            fillToTableTimKiem();
        }
    }//GEN-LAST:event_txtTimKIemKeyReleased

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        if (JPanelTang1.listSo.isEmpty()) {
            MsgBox.alert(this, "Bạn chưa chọn bàn để phục vụ");
        } else {
            MsgBox.alert(this, "Bất đầu phục vụ");
            thayDoiTrangThaiBatDauPhucVu(JPanelTang1.listSo);
            int maKHMax = insertKHnull();
            int maPDBMax = insertPDB(maKHMax);
            for (Integer maBan : JPanelTang1.listSo) {
                insert(maKHMax, maPDBMax, maBan);
            }
            JPanelDatBan.fillToTable();
            JPanelTang1.TrangThaiBan();
            JPanelTang2.TrangThaiBan();
            JPanelTang3.TrangThaiBan();
            JPanelTang1.listSo.clear();
            JPanelTang1.listBT.clear();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnDatBanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDatBanActionPerformed
        if (JPanelTang1.listSo.isEmpty()) {
            MsgBox.alert(this, "Bạn chưa chọn bàn để đặt");
        } else {

            JFrame parentFrame = (JFrame) SwingUtilities.getRoot(this); // Tìm JFrame cha của JPanel
            for (Integer so : JPanelTang1.listSo) {
                System.out.println("");
                System.out.print(" " + so);
            }
            JDiaLogNhapThongTin dialog = new JDiaLogNhapThongTin(parentFrame, true); // Tạo dialog với JFrame cha
            dialog.setBan(JPanelTang1.listSo);

            dialog.setVisible(true);

        }
    }//GEN-LAST:event_btnDatBanActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if (JPanelTang1.listSo.isEmpty()) {
            MsgBox.alert(this, "Bạn chưa chọn bàn để bảo trì");
        } else {
            for (Integer ma : JPanelTang1.listSo) {
                thayDoiTrangThai(ma.toString());
            }
            MsgBox.alert(this, "Các bàn " + JPanelTang1.listSo + "đã chuyên sang bảo trì");
            JPanelTang1.TrangThaiBan();
            JPanelTang2.TrangThaiBan();
            JPanelTang3.TrangThaiBan();
            JPanelTang1.listSo.clear();
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    public void insert(int maMaxKH, int maMaxPbd, int maBan) {
        ChiTietDatBan ctdb = new ChiTietDatBan();
        ctdb.setMaBan(maBan);
        ctdb.setMaPhieuDat(maMaxPbd + 1);
        ctdbdao.insert(ctdb.getMaBan() + "", ctdb.getMaPhieuDat());
    }

    public void thayDoiTrangThaiBatDauPhucVu(List<Integer> listSo) {

        for (Integer maBan : listSo) {
            dBDao.updateTrangThai(DANG_PHUC_VU, maBan + "");
        }
    }

    public int insertPDB(int maMaxKH) {
        PhieuDatBan pdb = new PhieuDatBan();
        int maMaxPbd = pdbDAO.SelectMaxPDB();
        pdbDAO.setMaxPDB(maMaxPbd);
        pdb.setThoiGianDat(new Date());
        pdb.setMaKhachHang(maMaxKH + 1);
        pdbDAO.insert_null(pdb);
        return maMaxPbd;
    }

    public int insertKHnull() {
        Model.KhachHang kh = new Model.KhachHang();
        int maMaxKH = khDBDAO.SelectMaxkH();
        khDBDAO.setMaxKh(maMaxKH);
        khDAO.insertNull(kh);
        return maMaxKH;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDatBan;
    private javax.swing.JComboBox<String> cbTang;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable tblDatBan;
    public static javax.swing.JTextField txtTimKIem;
    // End of variables declaration//GEN-END:variables
   static public void fillToTable() {
        DefaultTableModel model = (DefaultTableModel) tblDatBan.getModel();
        model.setRowCount(0);
        try {
            List<Object[]> list = dBDao.LoadThongTin("");
            for (Object[] obj : list) {
                model.addRow(obj);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static public void fillToTableTimKiem() {
        DefaultTableModel model = (DefaultTableModel) tblDatBan.getModel();
        model.setRowCount(0);
        try {
            String key = txtTimKIem.getText();
            List<Object[]> list = dBDao.LoadThongTin(key);
            for (Object[] obj : list) {
                model.addRow(obj);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void fillComboBoxTang() {
        DefaultComboBoxModel model = (DefaultComboBoxModel) cbTang.getModel();
        model.removeAllElements();
        List<String> list = dBDao.selectTang();
        for (String tang : list) {
            model.addElement(tang);
        }
    }

    static public void KiemTraXacNhan(int kt) {
        if (kt == 1) {
            JPanelDatBan.fillToTable();
            kt = 0;
        }
    }

    public void thayDoiTrangThai(String maBan) {
        dBDao.updateTrangThai(BAO_TRI, maBan);
    }
}
