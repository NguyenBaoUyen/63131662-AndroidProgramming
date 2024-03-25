package ntu.nguyenbaouyen63131662;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
	Vector<Object> dong;
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
		dong = new Vector<>();
	    dong.add(sp.getMsp());
	    dong.add(sp.getTensp());
	    dong.add(sp.getDongia());
	    dong.add(sp.getSoluong());
	    float thanhTien = sp.tinhtien(); // Tính toán thành tiền
	    dong.add(thanhTien);
	    noiDung.add(dong);
	    tongTien += thanhTien; // Cập nhật tổng tiền
	    hienThiTongTien(); // Gọi phương thức hiển thị tổng tiền
	}
	void hienThiTongTien() {
	    lblTongTien.setText(String.valueOf(tongTien)); // Hiển thị tổng tiền lên giao diện
	}

	/**
	 * Launch the application.
	 */
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


	/**
	 * Create the frame.
	 */
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
		
		
		comboBox.setModel(new DefaultComboBoxModel<>(new String[] {"Điện thoại", "Máy Tính"}));
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
				if(comboBox.getSelectedIndex() == 0) {
					sp = new DienThoai(maSP, tenSP, soLuong, donGia);
				}
				if(comboBox.getSelectedIndex() == 1) {
					sp = new MayTinh(maSP, tenSP, soLuong, donGia);
				}
				lblTongTien.setText("" + tongTien);
				nhapSanPham(sp);
				dtm.setDataVector(noiDung, tieuDe);
				table.setModel(dtm);
			}
		});
		btnThem.setBounds(95, 239, 109, 32);
		contentPane.add(btnThem);
		//Xử lý xóa
		
		JButton btnXoa = new JButton("Xóa");
		btnXoa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtDonGia.setText("");
				txtMaSP.setText("");
				txtSoLuong.setText("");
				txtTenSP.setText("");
				dong.clear();
				dtm.setDataVector (noiDung, tieuDe);
				table.setModel(dtm);
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
			new Object[][] {
				{null, null, null, null, null},
			},
			new String[] {
				"M\u00E3 SP", "T\u00EAn SP", "S\u1ED1 L\u01B0\u1EE3ng", "Th\u00E0nh ti\u1EC1n", "\u0110\u01A1n gi\u00E1"
			}
		));
		scrollPane.setViewportView(table);
		
		JLabel lblTongTienLabel = new JLabel("Tổng tiền");
		lblTongTienLabel.setBounds(320, 470, 61, 32);
		contentPane.add(lblTongTienLabel);
		
		lblTongTien.setForeground(new Color(255, 0, 0));
		lblTongTien.setBounds(417, 476, 125, 17);
		contentPane.add(lblTongTien);
	}
}