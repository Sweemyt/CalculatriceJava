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
	private 

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
		
		JLabel Label = new JLabel("0");
		Label.setBorder(null);
		Label.setBounds(10, 39, 328, 41);
		Label.setBackground(Color.WHITE);
		Label.setFont(new Font("Segoe UI", Font.BOLD, 30));
		Label.setHorizontalAlignment(SwingConstants.TRAILING);
		Label.setForeground(Color.WHITE);
		contentPane.add(Label);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn7.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn7.setBorder(new LineBorder(new Color(0, 0, 0), 0, true));
		btn7.setBackground(Color.WHITE);
		btn7.setForeground(Color.BLACK);
		btn7.setFont(new Font("Segoe UI", Font.BOLD, 20));
		btn7.setBounds(18, 102, 70, 29);
		contentPane.add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn8.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn8.setBorder(new LineBorder(new Color(0, 0, 0), 0, true));
		btn8.setForeground(Color.BLACK);
		btn8.setFont(new Font("Segoe UI", Font.BOLD, 20));
		btn8.setBackground(Color.WHITE);
		btn8.setBounds(98, 102, 70, 29);
		contentPane.add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn9.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn9.setBorder(new LineBorder(new Color(0, 0, 0), 0, true));
		btn9.setForeground(Color.BLACK);
		btn9.setFont(new Font("Segoe UI", Font.BOLD, 20));
		btn9.setBackground(Color.WHITE);
		btn9.setBounds(178, 102, 70, 29);
		contentPane.add(btn9);
		
		JButton btnDiviser = new JButton("÷");
		btnDiviser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnDiviser.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnDiviser.setBorder(new LineBorder(new Color(0, 0, 0), 0, true));
		btnDiviser.setForeground(Color.BLACK);
		btnDiviser.setFont(new Font("Segoe UI", Font.BOLD, 20));
		btnDiviser.setBackground(Color.WHITE);
		btnDiviser.setBounds(258, 102, 70, 29);
		contentPane.add(btnDiviser);
		
		JButton btnMultiplier = new JButton("x");
		btnMultiplier.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnMultiplier.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnMultiplier.setBorder(new LineBorder(new Color(0, 0, 0), 0, true));
		btnMultiplier.setForeground(Color.BLACK);
		btnMultiplier.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		btnMultiplier.setBackground(Color.WHITE);
		btnMultiplier.setBounds(258, 142, 70, 29);
		contentPane.add(btnMultiplier);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn6.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn6.setBorder(new LineBorder(new Color(0, 0, 0), 0, true));
		btn6.setForeground(Color.BLACK);
		btn6.setFont(new Font("Segoe UI", Font.BOLD, 20));
		btn6.setBackground(Color.WHITE);
		btn6.setBounds(178, 142, 70, 29);
		contentPane.add(btn6);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn5.setBorder(new LineBorder(new Color(0, 0, 0), 0, true));
		btn5.setForeground(Color.BLACK);
		btn5.setFont(new Font("Segoe UI", Font.BOLD, 20));
		btn5.setBackground(Color.WHITE);
		btn5.setBounds(98, 142, 70, 29);
		contentPane.add(btn5);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn4.setBorder(new LineBorder(new Color(0, 0, 0), 0, true));
		btn4.setForeground(Color.BLACK);
		btn4.setFont(new Font("Segoe UI", Font.BOLD, 20));
		btn4.setBackground(Color.WHITE);
		btn4.setBounds(18, 142, 70, 29);
		contentPane.add(btn4);
		
		JButton btnMoins = new JButton("-");
		btnMoins.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnMoins.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnMoins.setBorder(new LineBorder(new Color(0, 0, 0), 0, true));
		btnMoins.setForeground(Color.BLACK);
		btnMoins.setFont(new Font("Segoe UI", Font.BOLD, 20));
		btnMoins.setBackground(Color.WHITE);
		btnMoins.setBounds(258, 182, 70, 29);
		contentPane.add(btnMoins);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn3.setBorder(new LineBorder(new Color(0, 0, 0), 0, true));
		btn3.setForeground(Color.BLACK);
		btn3.setFont(new Font("Segoe UI", Font.BOLD, 20));
		btn3.setBackground(Color.WHITE);
		btn3.setBounds(178, 182, 70, 29);
		contentPane.add(btn3);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn2.setBorder(new LineBorder(new Color(0, 0, 0), 0, true));
		btn2.setForeground(Color.BLACK);
		btn2.setFont(new Font("Segoe UI", Font.BOLD, 20));
		btn2.setBackground(Color.WHITE);
		btn2.setBounds(98, 182, 70, 29);
		contentPane.add(btn2);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn1.setBorder(new LineBorder(new Color(0, 0, 0), 0, true));
		btn1.setForeground(Color.BLACK);
		btn1.setFont(new Font("Segoe UI", Font.BOLD, 20));
		btn1.setBackground(Color.WHITE);
		btn1.setBounds(18, 182, 70, 29);
		contentPane.add(btn1);
		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnPlus.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnPlus.setBorder(new LineBorder(new Color(0, 0, 0), 0, true));
		btnPlus.setForeground(Color.BLACK);
		btnPlus.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		btnPlus.setBackground(Color.WHITE);
		btnPlus.setBounds(258, 222, 70, 29);
		contentPane.add(btnPlus);
		
		JButton btnEgal = new JButton("=");
		btnEgal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnEgal.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnEgal.setBorder(new LineBorder(new Color(0, 0, 0), 0, true));
		btnEgal.setForeground(Color.BLACK);
		btnEgal.setFont(new Font("Segoe UI", Font.BOLD, 20));
		btnEgal.setBackground(Color.WHITE);
		btnEgal.setBounds(178, 222, 70, 29);
		contentPane.add(btnEgal);
		
		JButton btnVirgule = new JButton(",");
		btnVirgule.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnVirgule.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnVirgule.setBorder(new LineBorder(new Color(0, 0, 0), 0, true));
		btnVirgule.setForeground(Color.BLACK);
		btnVirgule.setFont(new Font("Segoe UI", Font.BOLD, 20));
		btnVirgule.setBackground(Color.WHITE);
		btnVirgule.setBounds(98, 222, 70, 29);
		contentPane.add(btnVirgule);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn0.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn0.setBorder(new LineBorder(new Color(0, 0, 0), 0, true));
		btn0.setForeground(Color.BLACK);
		btn0.setFont(new Font("Segoe UI", Font.BOLD, 20));
		btn0.setBackground(Color.WHITE);
		btn0.setBounds(18, 222, 70, 29);
		contentPane.add(btn0);

	}
}
