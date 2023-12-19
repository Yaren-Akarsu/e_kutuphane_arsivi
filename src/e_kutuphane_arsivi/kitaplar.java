package e_kutuphane_arsivi;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JList;
import java.awt.Color;

public class kitaplar extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public kitaplar() {
		setBackground(new Color(222, 184, 135));
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("    KİTAP İŞLEMLERİ");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel.setBounds(353, 32, 219, 49);
		add(lblNewLabel);
		
		JButton btnNewButton = new JButton("KİTAP EKLE");
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnNewButton.setBounds(20, 100, 152, 40);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton(" KİTAP BİLGİSİ GÜNCELLE");
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnNewButton_1.setBounds(20, 181, 282, 40);
		add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("KİTAP SİL");
		btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnNewButton_2.setBounds(20, 265, 152, 40);
		add(btnNewButton_2);

	}
}
