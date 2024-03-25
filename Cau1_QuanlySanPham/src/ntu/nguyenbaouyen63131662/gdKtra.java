package ntu.nguyenbaouyen63131662;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class gdKtra extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField txtMaSP;
    private JTextField txtTenSP;
    private JTextField txtSoLuong;
    private JTextField txtDonGia;
    JComboBox<String> comboBox = new JComboBox<>();
    JLabel lblTongTien = new JLabel("");
    private JTable table;

    Vector<String> tieuDe = new Vector<>();
    Vector<Vector<Object>> noiDung = new Vector<>();
    float tongTien = 0;

    DefaultTableModel dtm = new DefaultTableModel();

    void khoiTaoTieuDe() {
        tieuDe.add("Mã SP");
        tieuDe.add("Tên SP");
        tieuDe.add("Đơn giá");
        tieuDe.add("Số lượng");
        tieuDe.add("Thành tiền");
    }

    void nhapSanPham(SanPham sp) {
        Vector<Object> dong = new Vector<>();
        dong.add(sp.getMsp());
        dong.add(sp.getTensp());
        dong.add(sp.getDongia());
        dong.add(sp.getSoluong());
        float thanhTien = sp.tinhtien();
        dong.add(thanhTien);
        noiDung.add(dong);
        tongTien += thanhTien;
        hienThiTongTien();
    }

    void hienThiTongTien() {
        lblTongTien.setText(String.valueOf(tongTien));
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    gdKtra frame = new gdKtra();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public gdKtra() {
        khoiTaoTieuDe();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 642, 541);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblTieuDe = new JLabel(" SẢN PHẨM");
        lblTieuDe.setBounds(20, 11, 125, 32);
        contentPane.add(lblTieuDe);

        comboBox.setModel(new DefaultComboBoxModel<>(new String[]{"Điện thoại", "Máy Tính"}));
        comboBox.setBounds(20, 54, 156, 32);
        contentPane.add(comboBox);

        JLabel lblMaSP = new JLabel("Mã SP");
        lblMaSP.setBounds(205, 54, 61, 32);
        contentPane.add(lblMaSP);

        txtMaSP = new JTextField();
        txtMaSP.setBounds(276, 57, 156, 27);
        contentPane.add(txtMaSP);
        txtMaSP.setColumns(10);

        JLabel lblTenSP = new JLabel("Tên SP");
        lblTenSP.setBounds(205, 88, 61, 32);
        contentPane.add(lblTenSP);

        txtTenSP = new JTextField();
        txtTenSP.setColumns(10);
        txtTenSP.setBounds(276, 91, 156, 27);
        contentPane.add(txtTenSP);

        JLabel lblSoLuong = new JLabel("Số Lượng");
        lblSoLuong.setBounds(205, 126, 61, 32);
        contentPane.add(lblSoLuong);

        txtSoLuong = new JTextField();
        txtSoLuong.setColumns(10);
        txtSoLuong.setBounds(276, 129, 156, 27);
        contentPane.add(txtSoLuong);

        JLabel lblDonGia = new JLabel("Đơn giá");
        lblDonGia.setBounds(205, 166, 61, 32);
        contentPane.add(lblDonGia);

        txtDonGia = new JTextField();
        txtDonGia.setColumns(10);
        txtDonGia.setBounds(276, 169, 156, 27);
        contentPane.add(txtDonGia);

        JButton btnThem = new JButton("Thêm");
        btnThem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                SanPham sp = null;
                String maSP = txtMaSP.getText();
                String tenSP = txtTenSP.getText();
                float soLuong = Float.parseFloat(txtSoLuong.getText());
                float donGia = Float.parseFloat(txtDonGia.getText());
                if (comboBox.getSelectedIndex() == 0) {
                    sp = new DienThoai(maSP, tenSP, soLuong, donGia);
                }
                if (comboBox.getSelectedIndex() == 1) {
                    sp = new MayTinh(maSP, tenSP, soLuong, donGia);
                }
                nhapSanPham(sp);
                dtm.setDataVector(noiDung, tieuDe);
                table.setModel(dtm);
            }
        });
        btnThem.setBounds(95, 239, 109, 32);
        contentPane.add(btnThem);

        JButton btnXoa = new JButton("Xóa");
        btnXoa.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int selectedRow = table.getSelectedRow();
                if (selectedRow != -1) {
                    float thanhTien = (float) noiDung.get(selectedRow).get(4);
                    tongTien -= thanhTien;
                    noiDung.remove(selectedRow);
                    hienThiTongTien();
                    dtm.setDataVector(noiDung, tieuDe);
                    table.setModel(dtm);
                } else {
                    JOptionPane.showMessageDialog(contentPane, "Vui lòng chọn một sản phẩm để xóa.");
                }
            }
        });
        btnXoa.setBounds(254, 239, 109, 32);
        contentPane.add(btnXoa);

        JButton btnThoat = new JButton("Thoát");
        btnThoat.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        btnThoat.setBounds(415, 239, 109, 32);
        contentPane.add(btnThoat);

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(20, 292, 598, 179);
        contentPane.add(scrollPane);
        table = new JTable();
        table.setModel(new DefaultTableModel(
                new Object[][]
                		{
                    {null, null, null, null, null},
                },
                new String[]{
                    "Mã SP", "Tên SP", "Số Lượng", "Thành Tiền", "Đơn Giá"
                }
                ));
                scrollPane.setViewportView(table);

                JLabel lblTongTienLabel = new JLabel("Tổng tiền");
                lblTongTienLabel.setBounds(320, 470, 61, 32);
                contentPane.add(lblTongTienLabel);

                lblTongTien.setForeground(new Color(255, 0, 0));
                lblTongTien.setBounds(417, 476, 125, 17);
                contentPane.add(lblTongTien);

                // Thêm bộ lắng nghe sự kiện cho bảng
                table.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        super.mouseClicked(e);
                        int row = table.getSelectedRow();
                        if (row != -1 && e.getClickCount() == 2) {
                            float thanhTien = (float) noiDung.get(row).get(4);
                            tongTien -= thanhTien;//trừ tiền mà sản phẩm bị xóa
                            noiDung.remove(row);//xóa dòng được chọn
                            hienThiTongTien();//cập nhập lại tổng tiền sau khi xóa
                            dtm.setDataVector(noiDung, tieuDe);//cập nhập dữ liệu trong bảng
                            table.setModel(dtm);
                        }
                    }
                });
         	}
          }

