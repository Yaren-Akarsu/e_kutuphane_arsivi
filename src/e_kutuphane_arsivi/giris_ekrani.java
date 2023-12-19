package e_kutuphane_arsivi;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

public class giris_ekrani extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField jtex_kad;
	private JPasswordField jpass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					giris_ekrani frame = new giris_ekrani();
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
	public giris_ekrani() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 921, 638);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(189, 183, 107));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Kullanıcı Adı:");
		lblNewLabel.setBounds(37, 211, 119, 19);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Şifre:");
		lblNewLabel_1.setBounds(37, 279, 119, 21);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		contentPane.add(lblNewLabel_1);
		
		jtex_kad = new JTextField();
		jtex_kad.setBounds(168, 205, 131, 31);
		jtex_kad.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		contentPane.add(jtex_kad);
		jtex_kad.setColumns(10);
		
		JCheckBox cb_sifreyi_goster = new JCheckBox("Şifreyi Göster");
		cb_sifreyi_goster.setBounds(305, 274, 147, 31);
		cb_sifreyi_goster.setFont(new Font("Times New Roman", Font.BOLD, 18));
		contentPane.add(cb_sifreyi_goster);
		cb_sifreyi_goster.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (cb_sifreyi_goster.isSelected()) 
				{
					jpass.setEchoChar((char)0);
				}
				else {
					jpass.setEchoChar('*');
				}
			}
		});
		
		
		
		
		
		
		JButton btnGiri = new JButton("GİRİŞ");
		btnGiri.setBounds(112, 379, 96, 40);
		btnGiri.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String k_ad = "Admin";
				String password = "1234";
				
				if (jtex_kad.getText().equals(k_ad) && jpass.getText().equals(password))  
				{
					JOptionPane.showMessageDialog(null,  "GİRİŞ BAŞARILI");
					
				}
				
				else 
				{
					JOptionPane.showMessageDialog(null,  "KULLANICI ADI VEYA ŞİFRE HATALI!");
				}
				
				
				
				
				
			}
		});
		btnGiri.setForeground(new Color(0, 0, 0));
		btnGiri.setBackground(new Color(255, 255, 255));
		btnGiri.setFont(new Font("Times New Roman", Font.BOLD, 18));
		contentPane.add(btnGiri);
		
		jpass = new JPasswordField();
		jpass.setBounds(168, 274, 131, 31);
		jpass.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		contentPane.add(jpass);
		
		JLabel lblNewLabel_2 = new JLabel("   E-KÜTÜPHANE ARŞİVİ");
		lblNewLabel_2.setBounds(547, 222, 276, 52);
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 22));
		contentPane.add(lblNewLabel_2);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(222, 184, 135));
		panel.setBounds(0, 0, 471, 601);
		contentPane.add(panel);
	}
}
