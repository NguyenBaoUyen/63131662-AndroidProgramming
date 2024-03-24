package ntu.nguyenbaouyen63131662;
import java.awt.BorderLayout;
import java.awt.EventQueue;

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

public class gdKtra extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtmasp;
	private JTextField txttensp;
	private JTextField txtsoluong;
	private JTextField txtdongia;
	private JTable table;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 642, 541);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel(" SẢN PHẨM");
		lblNewLabel.setBounds(20, 11, 125, 32);
		contentPane.add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Điện thoại", "Máy Tính"}));
		comboBox.setBounds(20, 54, 156, 32);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel_1 = new JLabel("Mã sp");
		lblNewLabel_1.setBounds(205, 54, 61, 32);
		contentPane.add(lblNewLabel_1);
		
		txtmasp = new JTextField();
		txtmasp.setBounds(276, 57, 156, 27);
		contentPane.add(txtmasp);
		txtmasp.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Tên sp");
		lblNewLabel_1_1.setBounds(205, 88, 61, 32);
		contentPane.add(lblNewLabel_1_1);
		
		txttensp = new JTextField();
		txttensp.setColumns(10);
		txttensp.setBounds(276, 91, 156, 27);
		contentPane.add(txttensp);
		
		JLabel lblNewLabel_1_2 = new JLabel("Số Lượng");
		lblNewLabel_1_2.setBounds(205, 126, 61, 32);
		contentPane.add(lblNewLabel_1_2);
		
		txtsoluong = new JTextField();
		txtsoluong.setColumns(10);
		txtsoluong.setBounds(276, 129, 156, 27);
		contentPane.add(txtsoluong);
		
		JLabel lblNewLabel_1_3 = new JLabel("Đơn giá");
		lblNewLabel_1_3.setBounds(205, 166, 61, 32);
		contentPane.add(lblNewLabel_1_3);
		
		txtdongia = new JTextField();
		txtdongia.setColumns(10);
		txtdongia.setBounds(276, 169, 156, 27);
		contentPane.add(txtdongia);
		
		JButton btnNewButton = new JButton("Thêm");
		btnNewButton.setBounds(95, 239, 109, 32);
		contentPane.add(btnNewButton);
		
		JButton btnXa = new JButton("Xóa");
		btnXa.setBounds(254, 239, 109, 32);
		contentPane.add(btnXa);
		
		JButton btnThot = new JButton("Thoát");
		btnThot.setBounds(415, 239, 109, 32);
		contentPane.add(btnThot);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 286, 598, 179);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null},
			},
			new String[] {
				"M\u00E3 sp", "T\u00EAn sp", "Lo\u1EA1i sp", "S\u1ED1 l\u01B0\u1EE3ng", "\u0110\u01A1n gi\u00E1", "Th\u00E0nh ti\u1EC1n"
			}
		));
		scrollPane.setViewportView(table);
		
		JLabel lblNewLabel_1_4 = new JLabel("Tổng tiền");
		lblNewLabel_1_4.setBounds(320, 470, 61, 32);
		contentPane.add(lblNewLabel_1_4);
		
		JLabel lbltt = new JLabel("");
		lbltt.setForeground(new Color(255, 0, 0));
		lbltt.setBounds(417, 476, 49, 14);
		contentPane.add(lbltt);
	}
}
