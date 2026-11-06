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
import java.util.ArrayList;
import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

public class Calculatrice extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
    private String nombreEnCours = "";
    private ArrayList<String> elements = new ArrayList<>();
    public ArrayList<String> Affichage = new ArrayList<>();

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
		setBounds(100, 100, 340, 340);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//label
		JLabel Label = new JLabel("0");
		Label.setBorder(null);
		Label.setBounds(10, 39, 300, 41);
		Label.setBackground(Color.WHITE);
		Label.setFont(new Font("Segoe UI", Font.BOLD, 30));
		Label.setHorizontalAlignment(SwingConstants.TRAILING);
		Label.setForeground(Color.WHITE);
		contentPane.add(Label);
		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!nombreEnCours.isEmpty()) {
					elements.add(nombreEnCours); 
			        nombreEnCours = "";  
				}
				elements.add("+");
				Affichage.add("+");
				String joined = String.join("", Affichage);
				Label.setText(joined);
			}
		});
		btnPlus.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnPlus.setBorder(new LineBorder(new Color(0, 0, 0), 0, true));
		btnPlus.setForeground(Color.BLACK);
		btnPlus.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		btnPlus.setBackground(Color.WHITE);
		btnPlus.setBounds(258, 220, 52, 29);
		contentPane.add(btnPlus);
		
		JButton btnMoins = new JButton("-");
		btnMoins.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!nombreEnCours.isEmpty()) {
					elements.add(nombreEnCours); 
			        nombreEnCours = "";  
				}
				elements.add("-");
				Affichage.add("-");
				String joined = String.join("", Affichage);
				Label.setText(joined);
			}
		});
		btnMoins.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnMoins.setBorder(new LineBorder(new Color(0, 0, 0), 0, true));
		btnMoins.setForeground(Color.BLACK);
		btnMoins.setFont(new Font("Segoe UI", Font.BOLD, 20));
		btnMoins.setBackground(Color.WHITE);
		btnMoins.setBounds(258, 185, 52, 29);
		contentPane.add(btnMoins);
		
		JButton btnDiviser = new JButton("/");
		btnDiviser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!nombreEnCours.isEmpty()) {
					elements.add(nombreEnCours); 
			        nombreEnCours = "";  
				}
				elements.add("/");
				Affichage.add("/");
				String joined = String.join("", Affichage);
				Label.setText(joined);
			}
		});
		btnDiviser.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnDiviser.setBorder(new LineBorder(new Color(0, 0, 0), 0, true));
		btnDiviser.setForeground(Color.BLACK);
		btnDiviser.setFont(new Font("Segoe UI", Font.BOLD, 20));
		btnDiviser.setBackground(Color.WHITE);
		btnDiviser.setBounds(258, 114, 52, 29);
		contentPane.add(btnDiviser);
		
		JButton btnMultiplier = new JButton("*");
		btnMultiplier.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!nombreEnCours.isEmpty()) {
						elements.add(nombreEnCours); 
				        nombreEnCours = "";  
				}
				elements.add("*");
				Affichage.add("*");
				String joined = String.join("", Affichage);
				Label.setText(joined);
			}
		});
		btnMultiplier.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnMultiplier.setBorder(new LineBorder(new Color(0, 0, 0), 0, true));
		btnMultiplier.setForeground(Color.BLACK);
		btnMultiplier.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		btnMultiplier.setBackground(Color.WHITE);
		btnMultiplier.setBounds(258, 150, 52, 29);
		contentPane.add(btnMultiplier);
		
		JButton btnVirgule = new JButton(".");
		btnVirgule.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!nombreEnCours.contains(".")) {
			        if (nombreEnCours.isEmpty()) {
			            nombreEnCours = "0.";
			            Affichage.add("0.");
			        } 
			        else {
			            nombreEnCours += ".";
			            Affichage.add(".");
			        }
			        String joined = String.join("", Affichage);
			        Label.setText(joined);
			    }
			}
		});
		btnVirgule.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnVirgule.setBorder(new LineBorder(new Color(0, 0, 0), 0, true));
		btnVirgule.setForeground(Color.BLACK);
		btnVirgule.setFont(new Font("Segoe UI", Font.BOLD, 20));
		btnVirgule.setBackground(Color.WHITE);
		btnVirgule.setBounds(180, 250, 70, 35);
		contentPane.add(btnVirgule);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nombreEnCours += "0";
				Affichage.add("0");
				if (elements == null) {
					Label.setText(nombreEnCours);
				} else {
					String joined = String.join("", Affichage);
					Label.setText(joined);	
				}
			}
		});
		btn0.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn0.setBorder(new LineBorder(new Color(0, 0, 0), 0, true));
		btn0.setForeground(Color.BLACK);
		btn0.setFont(new Font("Segoe UI", Font.BOLD, 20));
		btn0.setBackground(Color.WHITE);
		btn0.setBounds(100, 251, 70, 35);
		contentPane.add(btn0);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nombreEnCours += "1";
				Affichage.add("1");
				if (elements == null) {
					Label.setText(nombreEnCours);
				} else {
					String joined = String.join("", Affichage);
					Label.setText(joined);	
				}
			}
		});
		btn1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn1.setBorder(new LineBorder(new Color(0, 0, 0), 0, true));
		btn1.setForeground(Color.BLACK);
		btn1.setFont(new Font("Segoe UI", Font.BOLD, 20));
		btn1.setBackground(Color.WHITE);
		btn1.setBounds(20, 204, 70, 35);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nombreEnCours += "2";
				Affichage.add("2");
				if (elements == null) {
					Label.setText(nombreEnCours);
				} else {
					String joined = String.join("", Affichage);
					Label.setText(joined);	
				}
			}
		});
		btn2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn2.setBorder(new LineBorder(new Color(0, 0, 0), 0, true));
		btn2.setForeground(Color.BLACK);
		btn2.setFont(new Font("Segoe UI", Font.BOLD, 20));
		btn2.setBackground(Color.WHITE);
		btn2.setBounds(100, 204, 70, 35);
		contentPane.add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nombreEnCours += "3";
				Affichage.add("3");
				if (elements == null) {
					Label.setText(nombreEnCours);
				} else {
					String joined = String.join("", Affichage);
					Label.setText(joined);	
				}
			}
		});
		btn3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn3.setBorder(new LineBorder(new Color(0, 0, 0), 0, true));
		btn3.setForeground(Color.BLACK);
		btn3.setFont(new Font("Segoe UI", Font.BOLD, 20));
		btn3.setBackground(Color.WHITE);
		btn3.setBounds(180, 204, 70, 35);
		contentPane.add(btn3);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nombreEnCours += "4";
				Affichage.add("4");
				if (elements == null) {
					Label.setText(nombreEnCours);
				} else {
					String joined = String.join("", Affichage);
					Label.setText(joined);	
				}
			}
		});
		btn4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn4.setBorder(new LineBorder(new Color(0, 0, 0), 0, true));
		btn4.setForeground(Color.BLACK);
		btn4.setFont(new Font("Segoe UI", Font.BOLD, 20));
		btn4.setBackground(Color.WHITE);
		btn4.setBounds(20, 158, 70, 35);
		contentPane.add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nombreEnCours += "5";
				Affichage.add("5");
				if (elements == null) {
					Label.setText(nombreEnCours);
				} else {
					String joined = String.join("", Affichage);
					Label.setText(joined);	
				}
			}
		});
		btn5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn5.setBorder(new LineBorder(new Color(0, 0, 0), 0, true));
		btn5.setForeground(Color.BLACK);
		btn5.setFont(new Font("Segoe UI", Font.BOLD, 20));
		btn5.setBackground(Color.WHITE);
		btn5.setBounds(100, 158, 70, 35);
		contentPane.add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nombreEnCours += "6";
				Affichage.add("6");
				if (elements == null) {
					Label.setText(nombreEnCours);
				} else {
					String joined = String.join("", Affichage);
					Label.setText(joined);	
				}
			}
		});
		btn6.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn6.setBorder(new LineBorder(new Color(0, 0, 0), 0, true));
		btn6.setForeground(Color.BLACK);
		btn6.setFont(new Font("Segoe UI", Font.BOLD, 20));
		btn6.setBackground(Color.WHITE);
		btn6.setBounds(180, 158, 70, 35);
		contentPane.add(btn6);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nombreEnCours += "7";
				Affichage.add("7");
				if (elements == null) {
					Label.setText(nombreEnCours);
				} else {
					String joined = String.join("", Affichage);
					Label.setText(joined);	
				}
			}
		});
		btn7.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn7.setBorder(new LineBorder(new Color(0, 0, 0), 0, true));
		btn7.setBackground(Color.WHITE);
		btn7.setForeground(Color.BLACK);
		btn7.setFont(new Font("Segoe UI", Font.BOLD, 20));
		btn7.setBounds(20, 112, 70, 35);
		contentPane.add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nombreEnCours += "8";
				Affichage.add("8");
				if (elements == null) {
					Label.setText(nombreEnCours);
				} else {
					String joined = String.join("", Affichage);
					Label.setText(joined);	
				}
			}
		});
		btn8.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn8.setBorder(new LineBorder(new Color(0, 0, 0), 0, true));
		btn8.setForeground(Color.BLACK);
		btn8.setFont(new Font("Segoe UI", Font.BOLD, 20));
		btn8.setBackground(Color.WHITE);
		btn8.setBounds(100, 112, 70, 35);
		contentPane.add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nombreEnCours += "9";
				Affichage.add("9");
				if (elements == null) {
					Label.setText(nombreEnCours);
				} else {
					String joined = String.join("", Affichage);
					Label.setText(joined);	
				}
			}
		});
		btn9.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn9.setBorder(new LineBorder(new Color(0, 0, 0), 0, true));
		btn9.setForeground(Color.BLACK);
		btn9.setFont(new Font("Segoe UI", Font.BOLD, 20));
		btn9.setBackground(Color.WHITE);
		btn9.setBounds(180, 112, 70, 35);
		contentPane.add(btn9);
		
		JButton btnEgal = new JButton("=");
		btnEgal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				elements.add(nombreEnCours);
				nombreEnCours = ("");
				String Calcule = String.join("", Affichage);
				Expression a = new ExpressionBuilder(Calcule).build();
		        double resultat = a.evaluate();
		        Label.setText(Double.toString(resultat));
		        
		        Affichage.clear();
				elements.clear();
				nombreEnCours = "";
			}
		});
		btnEgal.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnEgal.setBorder(new LineBorder(new Color(0, 0, 0), 0, true));
		btnEgal.setForeground(Color.BLACK);
		btnEgal.setFont(new Font("Segoe UI", Font.BOLD, 20));
		btnEgal.setBackground(Color.WHITE);
		btnEgal.setBounds(258, 256, 52, 29);
		contentPane.add(btnEgal);
		
		JButton btn_All_Clear = new JButton("AC");
		btn_All_Clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Affichage.clear();
				elements.clear();
				nombreEnCours = "";
				Label.setText("0");
			}
		});
		btn_All_Clear.setForeground(Color.BLACK);
		btn_All_Clear.setFont(new Font("Segoe UI", Font.BOLD, 17));
		btn_All_Clear.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_All_Clear.setBorder(new LineBorder(new Color(0, 0, 0), 0, true));
		btn_All_Clear.setBackground(Color.WHITE);
		btn_All_Clear.setBounds(20, 251, 70, 35);
		contentPane.add(btn_All_Clear);
	}
}
