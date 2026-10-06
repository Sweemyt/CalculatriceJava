package calculatrice;


import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.border.LineBorder;
import java.awt.Cursor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculatrice extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculatrice frame = new Calculatrice();
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
	public Calculatrice() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 360, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("0");
		lblNewLabel.setBorder(null);
		lblNewLabel.setBounds(10, 39, 328, 41);
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel.setForeground(Color.WHITE);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton_1 = new JButton("7");
		btnNewButton_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_1.setBorder(new LineBorder(new Color(0, 0, 0), 0, true));
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setForeground(Color.BLACK);
		btnNewButton_1.setFont(new Font("Segoe UI", Font.BOLD, 20));
		btnNewButton_1.setBounds(18, 102, 70, 29);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("8");
		btnNewButton_1_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_1_1.setBorder(new LineBorder(new Color(0, 0, 0), 0, true));
		btnNewButton_1_1.setForeground(Color.BLACK);
		btnNewButton_1_1.setFont(new Font("Segoe UI", Font.BOLD, 20));
		btnNewButton_1_1.setBackground(Color.WHITE);
		btnNewButton_1_1.setBounds(98, 102, 70, 29);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_1_1 = new JButton("9");
		btnNewButton_1_1_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_1_1_1.setBorder(new LineBorder(new Color(0, 0, 0), 0, true));
		btnNewButton_1_1_1.setForeground(Color.BLACK);
		btnNewButton_1_1_1.setFont(new Font("Segoe UI", Font.BOLD, 20));
		btnNewButton_1_1_1.setBackground(Color.WHITE);
		btnNewButton_1_1_1.setBounds(178, 102, 70, 29);
		contentPane.add(btnNewButton_1_1_1);
		
		JButton btnNewButton_1_1_2 = new JButton("÷");
		btnNewButton_1_1_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_1_1_2.setBorder(new LineBorder(new Color(0, 0, 0), 0, true));
		btnNewButton_1_1_2.setForeground(Color.BLACK);
		btnNewButton_1_1_2.setFont(new Font("Segoe UI", Font.BOLD, 20));
		btnNewButton_1_1_2.setBackground(Color.WHITE);
		btnNewButton_1_1_2.setBounds(258, 102, 70, 29);
		contentPane.add(btnNewButton_1_1_2);
		
		JButton btnNewButton_1_1_2_1 = new JButton("x");
		btnNewButton_1_1_2_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_1_1_2_1.setBorder(new LineBorder(new Color(0, 0, 0), 0, true));
		btnNewButton_1_1_2_1.setForeground(Color.BLACK);
		btnNewButton_1_1_2_1.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		btnNewButton_1_1_2_1.setBackground(Color.WHITE);
		btnNewButton_1_1_2_1.setBounds(258, 142, 70, 29);
		contentPane.add(btnNewButton_1_1_2_1);
		
		JButton btnNewButton_1_1_1_1 = new JButton("6");
		btnNewButton_1_1_1_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_1_1_1_1.setBorder(new LineBorder(new Color(0, 0, 0), 0, true));
		btnNewButton_1_1_1_1.setForeground(Color.BLACK);
		btnNewButton_1_1_1_1.setFont(new Font("Segoe UI", Font.BOLD, 20));
		btnNewButton_1_1_1_1.setBackground(Color.WHITE);
		btnNewButton_1_1_1_1.setBounds(178, 142, 70, 29);
		contentPane.add(btnNewButton_1_1_1_1);
		
		JButton btnNewButton_1_1_3 = new JButton("5");
		btnNewButton_1_1_3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_1_1_3.setBorder(new LineBorder(new Color(0, 0, 0), 0, true));
		btnNewButton_1_1_3.setForeground(Color.BLACK);
		btnNewButton_1_1_3.setFont(new Font("Segoe UI", Font.BOLD, 20));
		btnNewButton_1_1_3.setBackground(Color.WHITE);
		btnNewButton_1_1_3.setBounds(98, 142, 70, 29);
		contentPane.add(btnNewButton_1_1_3);
		
		JButton btnNewButton_1_2 = new JButton("4");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_1_2.setBorder(new LineBorder(new Color(0, 0, 0), 0, true));
		btnNewButton_1_2.setForeground(Color.BLACK);
		btnNewButton_1_2.setFont(new Font("Segoe UI", Font.BOLD, 20));
		btnNewButton_1_2.setBackground(Color.WHITE);
		btnNewButton_1_2.setBounds(18, 142, 70, 29);
		contentPane.add(btnNewButton_1_2);
		
		JButton btnNewButton_1_1_2_2 = new JButton("-");
		btnNewButton_1_1_2_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_1_1_2_2.setBorder(new LineBorder(new Color(0, 0, 0), 0, true));
		btnNewButton_1_1_2_2.setForeground(Color.BLACK);
		btnNewButton_1_1_2_2.setFont(new Font("Segoe UI", Font.BOLD, 20));
		btnNewButton_1_1_2_2.setBackground(Color.WHITE);
		btnNewButton_1_1_2_2.setBounds(258, 182, 70, 29);
		contentPane.add(btnNewButton_1_1_2_2);
		
		JButton btnNewButton_1_1_1_2 = new JButton("3");
		btnNewButton_1_1_1_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_1_1_1_2.setBorder(new LineBorder(new Color(0, 0, 0), 0, true));
		btnNewButton_1_1_1_2.setForeground(Color.BLACK);
		btnNewButton_1_1_1_2.setFont(new Font("Segoe UI", Font.BOLD, 20));
		btnNewButton_1_1_1_2.setBackground(Color.WHITE);
		btnNewButton_1_1_1_2.setBounds(178, 182, 70, 29);
		contentPane.add(btnNewButton_1_1_1_2);
		
		JButton btnNewButton_1_1_4 = new JButton("2");
		btnNewButton_1_1_4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_1_1_4.setBorder(new LineBorder(new Color(0, 0, 0), 0, true));
		btnNewButton_1_1_4.setForeground(Color.BLACK);
		btnNewButton_1_1_4.setFont(new Font("Segoe UI", Font.BOLD, 20));
		btnNewButton_1_1_4.setBackground(Color.WHITE);
		btnNewButton_1_1_4.setBounds(98, 182, 70, 29);
		contentPane.add(btnNewButton_1_1_4);
		
		JButton btnNewButton_1_3 = new JButton("1");
		btnNewButton_1_3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_1_3.setBorder(new LineBorder(new Color(0, 0, 0), 0, true));
		btnNewButton_1_3.setForeground(Color.BLACK);
		btnNewButton_1_3.setFont(new Font("Segoe UI", Font.BOLD, 20));
		btnNewButton_1_3.setBackground(Color.WHITE);
		btnNewButton_1_3.setBounds(18, 182, 70, 29);
		contentPane.add(btnNewButton_1_3);
		
		JButton btnNewButton_1_1_2_3 = new JButton("+");
		btnNewButton_1_1_2_3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_1_1_2_3.setBorder(new LineBorder(new Color(0, 0, 0), 0, true));
		btnNewButton_1_1_2_3.setForeground(Color.BLACK);
		btnNewButton_1_1_2_3.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		btnNewButton_1_1_2_3.setBackground(Color.WHITE);
		btnNewButton_1_1_2_3.setBounds(258, 222, 70, 29);
		contentPane.add(btnNewButton_1_1_2_3);
		
		JButton btnNewButton_1_1_1_3 = new JButton("=");
		btnNewButton_1_1_1_3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_1_1_1_3.setBorder(new LineBorder(new Color(0, 0, 0), 0, true));
		btnNewButton_1_1_1_3.setForeground(Color.BLACK);
		btnNewButton_1_1_1_3.setFont(new Font("Segoe UI", Font.BOLD, 20));
		btnNewButton_1_1_1_3.setBackground(Color.WHITE);
		btnNewButton_1_1_1_3.setBounds(178, 222, 70, 29);
		contentPane.add(btnNewButton_1_1_1_3);
		
		JButton btnNewButton_1_1_5 = new JButton(",");
		btnNewButton_1_1_5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_1_1_5.setBorder(new LineBorder(new Color(0, 0, 0), 0, true));
		btnNewButton_1_1_5.setForeground(Color.BLACK);
		btnNewButton_1_1_5.setFont(new Font("Segoe UI", Font.BOLD, 20));
		btnNewButton_1_1_5.setBackground(Color.WHITE);
		btnNewButton_1_1_5.setBounds(98, 222, 70, 29);
		contentPane.add(btnNewButton_1_1_5);
		
		JButton btnNewButton_1_4 = new JButton("0");
		btnNewButton_1_4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_1_4.setBorder(new LineBorder(new Color(0, 0, 0), 0, true));
		btnNewButton_1_4.setForeground(Color.BLACK);
		btnNewButton_1_4.setFont(new Font("Segoe UI", Font.BOLD, 20));
		btnNewButton_1_4.setBackground(Color.WHITE);
		btnNewButton_1_4.setBounds(18, 222, 70, 29);
		contentPane.add(btnNewButton_1_4);

	}
}
