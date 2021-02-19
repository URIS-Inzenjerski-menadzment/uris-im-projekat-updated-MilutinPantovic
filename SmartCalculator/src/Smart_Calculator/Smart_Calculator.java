package Smart_Calculator;

import java.awt.Dialog.ModalityType;
import java.awt.EventQueue;
import Smart_Calculator.Factorial;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JDialog;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Color;

public class Smart_Calculator {
	
	

	private JFrame frame;
	private JTextField textField;
	
	double prviBroj;
	double drugiBroj;
	double rezultat;
	String operacija;
	String odgovor;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Smart_Calculator window = new Smart_Calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Smart_Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setBackground(Color.BLACK);
		frame.setBounds(100, 100, 506, 528);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(10, 43, 474, 60);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton br7 = new JButton("7");
		br7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String UnosBroja = textField.getText() + br7.getText();
				textField.setText(UnosBroja);
			}
		});
		br7.setFont(new Font("Franklin Gothic Medium", Font.BOLD, 15));
		br7.setBounds(10, 181, 60, 45);
		frame.getContentPane().add(br7);
		
		JButton br8 = new JButton("8");
		br8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String UnosBroja = textField.getText() + br8.getText();
				textField.setText(UnosBroja);
				
			}
		});
		br8.setFont(new Font("Franklin Gothic Medium", Font.BOLD, 15));
		br8.setBounds(96, 181, 60, 45);
		frame.getContentPane().add(br8);
		
		JButton br9 = new JButton("9");
		br9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String UnosBroja = textField.getText() + br9.getText();
				textField.setText(UnosBroja);
				
			}
		});
		br9.setFont(new Font("Franklin Gothic Medium", Font.BOLD, 15));
		br9.setBounds(181, 181, 60, 45);
		frame.getContentPane().add(br9);
		
		JButton br6 = new JButton("6");
		br6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String UnosBroja = textField.getText() + br6.getText();
				textField.setText(UnosBroja);
			}
		});
		br6.setFont(new Font("Franklin Gothic Medium", Font.BOLD, 15));
		br6.setBounds(181, 247, 60, 45);
		frame.getContentPane().add(br6);
		
		JButton br4 = new JButton("4");
		br4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String UnosBroja = textField.getText() + br4.getText();
				textField.setText(UnosBroja);
				
			}
		});
		br4.setFont(new Font("Franklin Gothic Medium", Font.BOLD, 15));
		br4.setBounds(10, 247, 60, 45);
		frame.getContentPane().add(br4);
		
		JButton br5 = new JButton("5");
		br5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String UnosBroja = textField.getText() + br5.getText();
				textField.setText(UnosBroja);
			}
		});
		br5.setFont(new Font("Franklin Gothic Medium", Font.BOLD, 15));
		br5.setBounds(96, 247, 60, 45);
		frame.getContentPane().add(br5);
		
		JButton br3 = new JButton("3");
		br3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String UnosBroja = textField.getText() + br3.getText();
				textField.setText(UnosBroja);
			}
		});
		br3.setFont(new Font("Franklin Gothic Medium", Font.BOLD, 15));
		br3.setBounds(181, 320, 60, 45);
		frame.getContentPane().add(br3);
		
		JButton br1 = new JButton("1");
		br1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String UnosBroja = textField.getText() + br1.getText();
				textField.setText(UnosBroja);
			}
		});
		br1.setFont(new Font("Franklin Gothic Medium", Font.BOLD, 15));
		br1.setBounds(10, 320, 60, 45);
		frame.getContentPane().add(br1);
		
		JButton br2 = new JButton("2");
		br2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String UnosBroja = textField.getText() + br2.getText();
				textField.setText(UnosBroja);
			}
		});
		br2.setFont(new Font("Franklin Gothic Medium", Font.BOLD, 15));
		br2.setBounds(96, 320, 60, 45);
		frame.getContentPane().add(br2);
		
		JButton brisanje = new JButton("\u2190");
		brisanje.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String brisanje = null;
				
				if (textField.getText().length()>0) {
					StringBuilder strB = new StringBuilder(textField.getText());
					strB.deleteCharAt(textField.getText().length() - 1);
					brisanje = strB.toString();
					textField.setText(brisanje);
				}
			}
		});
		brisanje.setFont(new Font("Franklin Gothic Medium", Font.BOLD, 15));
		brisanje.setBounds(181, 401, 60, 45);
		frame.getContentPane().add(brisanje);
		
		JButton clear = new JButton("AC");
		clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		clear.setFont(new Font("Franklin Gothic Medium", Font.BOLD, 15));
		clear.setBounds(10, 401, 60, 45);
		frame.getContentPane().add(clear);
		
		JButton br0 = new JButton("0");
		br0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String UnosBroja = textField.getText() + br0.getText();
				textField.setText(UnosBroja);
			}
		});
		br0.setFont(new Font("Franklin Gothic Medium", Font.BOLD, 15));
		br0.setBounds(96, 401, 60, 45);
		frame.getContentPane().add(br0);
		
		JButton Sab = new JButton("+");
		Sab.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				prviBroj= Double.parseDouble(textField.getText());
				textField.setText("");
				operacija = "+";
			}
		});
		Sab.setFont(new Font("Franklin Gothic Medium", Font.BOLD, 15));
		Sab.setBounds(258, 181, 60, 45);
		frame.getContentPane().add(Sab);
		
		JButton oduz = new JButton("-");
		oduz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				prviBroj= Double.parseDouble(textField.getText());
				textField.setText("");
				operacija = "-";
			}
		});
		oduz.setFont(new Font("Franklin Gothic Medium", Font.BOLD, 15));
		oduz.setBounds(344, 181, 60, 45);
		frame.getContentPane().add(oduz);
		
		JButton delj = new JButton("/");
		delj.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				prviBroj= Double.parseDouble(textField.getText());
				textField.setText("");
				operacija = "/";
			}
		});
		delj.setFont(new Font("Franklin Gothic Medium", Font.BOLD, 15));
		delj.setBounds(344, 247, 60, 45);
		frame.getContentPane().add(delj);
		
		JButton mnoz = new JButton("*");
		mnoz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				prviBroj= Double.parseDouble(textField.getText());
				textField.setText("");
				operacija = "*";
			}
		});
		mnoz.setFont(new Font("Franklin Gothic Medium", Font.BOLD, 15));
		mnoz.setBounds(258, 247, 60, 45);
		frame.getContentPane().add(mnoz);
		
		JButton fktr = new JButton("x!");
		fktr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double fktr = Double.parseDouble(String.valueOf(textField.getText()));
				fktr = Factorial.factorial(fktr);
				textField.setText(String.valueOf(fktr));
			}
		});
		fktr.setFont(new Font("Franklin Gothic Medium", Font.BOLD, 15));
		fktr.setBounds(344, 320, 60, 45);
		frame.getContentPane().add(fktr);
		
		JButton prcnt = new JButton("%");
		prcnt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				prviBroj= Double.parseDouble(textField.getText());
				textField.setText("");
				operacija = "%";
			}
		});
		prcnt.setFont(new Font("Franklin Gothic Medium", Font.BOLD, 15));
		prcnt.setBounds(258, 320, 60, 45);
		frame.getContentPane().add(prcnt);
		
		JButton jednako = new JButton("=");
		jednako.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String odgovor;
				drugiBroj = Double.parseDouble(textField.getText());
				if (operacija == "+")
				{
					rezultat = prviBroj + drugiBroj;
					odgovor= String.format("%.2f", rezultat);
					textField.setText(odgovor);
				}
				else if (operacija == "-")
				{
					rezultat = prviBroj - drugiBroj;
					odgovor= String.format("%.2f", rezultat);
					textField.setText(odgovor); 
				}
				else if (operacija == "*")
				{
					rezultat = prviBroj * drugiBroj;
					odgovor= String.format("%.2f", rezultat);
					textField.setText(odgovor); 
				}
				else if (operacija == "/")
				{
					rezultat = prviBroj / drugiBroj;
					odgovor= String.format("%.2f", rezultat);
					textField.setText(odgovor); 
				}
				else if (operacija == "%")
				{
					rezultat = prviBroj * (drugiBroj/100);
					odgovor= String.format("%.2f", rezultat);
					textField.setText(odgovor); 
				}
				
			}
		});
		jednako.setFont(new Font("Franklin Gothic Medium", Font.BOLD, 15));
		jednako.setBounds(424, 401, 60, 45);
		frame.getContentPane().add(jednako);
		
		JButton sqrt = new JButton("\u221A");
		sqrt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(textField.getText()));
				ops = Math.sqrt(ops);
				textField.setText(String.valueOf(ops));
			}
		});
		sqrt.setFont(new Font("Franklin Gothic Medium", Font.BOLD, 15));
		sqrt.setBounds(424, 320, 60, 45);
		frame.getContentPane().add(sqrt);
		
		JButton log = new JButton("ln");
		log.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(textField.getText()));
				ops = Math.log10(ops);
				textField.setText(String.valueOf(ops));
			}
		});
		log.setFont(new Font("Franklin Gothic Medium", Font.ITALIC, 15));
		log.setBounds(424, 181, 60, 45);
		frame.getContentPane().add(log);
		
		JButton kvadrat = new JButton("^2");
		kvadrat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(textField.getText()));
				ops = (ops*ops);
				textField.setText(String.valueOf(ops));
			}
		});
		kvadrat.setFont(new Font("Franklin Gothic Medium", Font.BOLD, 15));
		kvadrat.setBounds(424, 247, 60, 45);
		frame.getContentPane().add(kvadrat);
		
		JButton zgrd1 = new JButton("(");
		zgrd1.setFont(new Font("Franklin Gothic Medium", Font.BOLD, 15));
		zgrd1.setBounds(258, 401, 60, 45);
		frame.getContentPane().add(zgrd1);
		
		JButton zgrd2 = new JButton(")");
		zgrd2.setFont(new Font("Franklin Gothic Medium", Font.BOLD, 15));
		zgrd2.setBounds(344, 401, 60, 45);
		frame.getContentPane().add(zgrd2);
		
		JButton CstExp = new JButton("Custom Expression");
		CstExp.setForeground(Color.YELLOW);
		CstExp.setBackground(Color.RED);
		CstExp.setFont(new Font("Franklin Gothic Medium", Font.BOLD, 15));
		CstExp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Custom_Expression dialog = new Custom_Expression();
				dialog.setModalityType(ModalityType.APPLICATION_MODAL);
		        dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		        dialog.setVisible(true);
				}
				catch (Exception ex) {
					ex.printStackTrace();
				}
			}
		});
		CstExp.setBounds(10, 113, 474, 40);
		frame.getContentPane().add(CstExp);
	}
}
