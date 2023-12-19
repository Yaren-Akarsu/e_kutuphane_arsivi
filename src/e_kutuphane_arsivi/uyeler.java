package e_kutuphane_arsivi;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;

public class uyeler extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public uyeler() {
		setBackground(new Color(222, 184, 135));
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("  ÜYE İŞLEMLERİ");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel.setBounds(344, 35, 177, 49);
		add(lblNewLabel);
		
		JButton btnNewButton = new JButton("ÜYE EKLE");
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnNewButton.setBounds(66, 107, 150, 39);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton(" ÜYE BİLGİSİ GÜNCELLE");
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnNewButton_1.setBounds(66, 185, 259, 39);
		add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("ÜYE SİL");
		btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnNewButton_2.setBounds(66, 275, 150, 39);
		add(btnNewButton_2);

	}
}
