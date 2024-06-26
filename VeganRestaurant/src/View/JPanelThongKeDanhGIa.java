/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View;

import Controller.ThongKeDAO;
import Utils.MsgBox;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Paint;
import java.awt.geom.AffineTransform;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import org.jfree.chart.plot.DefaultDrawingSupplier;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.ui.RefineryUtilities;
import org.jfree.util.Rotation;

/**
 *
 * @author Võ Thanh Tùng
 */
public class JPanelThongKeDanhGIa extends javax.swing.JPanel {

    ThongKeDAO tkDAO = new ThongKeDAO();
    int row = -1;

    /**
     * Creates new form JPanelThongKeDanhGIa4
     */
    public JPanelThongKeDanhGIa() {
        initComponents();
        fillToTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblDanhGia = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnBieuDo = new javax.swing.JButton();

        tblDanhGia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Số sao", "Số lượng đánh giá"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDanhGia.setRowHeight(50);
        tblDanhGia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDanhGiaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDanhGia);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Thông kê đánh giá");

        btnBieuDo.setBackground(new java.awt.Color(255, 102, 153));
        btnBieuDo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnBieuDo.setText("Biểu đồ");
        btnBieuDo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBieuDoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 269, Short.MAX_VALUE)
                        .addComponent(btnBieuDo, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                    .addComponent(btnBieuDo, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tblDanhGiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDanhGiaMouseClicked
        int row = tblDanhGia.getSelectedRow();
        if (row != -1) {
            this.row = (int) tblDanhGia.getValueAt(row, 0);
            JFrame parentFrame = new JFrame(); 
            JdialogChiTietDanhGia dialog = new JdialogChiTietDanhGia(parentFrame, true); 
            dialog.getRow(row + 1);
            dialog.setVisible(true); 

        }

    }//GEN-LAST:event_tblDanhGiaMouseClicked

    private void btnBieuDoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBieuDoActionPerformed
        List<Object[]> danhGiaData = getDanhGia();
        showPieChartDialog(danhGiaData);
    }//GEN-LAST:event_btnBieuDoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBieuDo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDanhGia;
    // End of variables declaration//GEN-END:variables

    void fillToTable() {
        DefaultTableModel model = (DefaultTableModel) tblDanhGia.getModel();
        model.setRowCount(0);
        int i = 1;
        List<Object[]> list = tkDAO.getDSDanhGia();
        for (Object[] row : list) {
            model.addRow(new Object[]{i, row[0]});
            i++;
        }
    }

    List<Object[]> getDanhGia() {
        List<Object[]> list = tkDAO.sp_laySao();
        List<Object[]> danhGiaData = new ArrayList<>();
        for (Object[] row : list) {
            int soSao = (int) row[0];
            int soLuongDanhGia = (int) row[1];
            danhGiaData.add(new Object[]{soSao, soLuongDanhGia});
        }
        return danhGiaData;
    }

    private void showPieChartDialog(List<Object[]> danhGiaData) {
        DefaultPieDataset dataset = new DefaultPieDataset();
        for (Object[] row : danhGiaData) {
            int soSao = (int) row[0];
            int soLuongDanhGia = (int) row[1];
            dataset.setValue(soSao + " sao", soLuongDanhGia);
        }

        JFreeChart chart = ChartFactory.createPieChart3D(
                "Biểu đồ đánh giá",
                dataset,
                true,
                true,
                false
        );

        PiePlot plot = (PiePlot) chart.getPlot();
        plot.setLabelGenerator(new StandardPieSectionLabelGenerator("{0}:({2})", NumberFormat.getInstance(), NumberFormat.getPercentInstance()));
        plot.setLabelFont(new Font("Arial", Font.PLAIN, 22));
        ChartPanel chartPanel = new ChartPanel(chart);

        // Tạo một JFrame mới và thêm ChartPanel vào đó
        JFrame frame = new JFrame("Biểu đồ đánh giá");
        frame.setSize(1100, 700);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Đóng frame khi bấm nút đóng
        frame.getContentPane().add(chartPanel, BorderLayout.CENTER);

        frame.pack(); // Đảm bảo kích thước phù hợp với nội dung
        frame.setLocationRelativeTo(null); // Hiển thị frame ở trung tâm màn hình
        frame.setVisible(true); // Hiển thị frame
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Thống kê món ăn");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new JPanelThongKeDanhGIa());
        frame.pack();
        frame.setVisible(true);
    }
}
