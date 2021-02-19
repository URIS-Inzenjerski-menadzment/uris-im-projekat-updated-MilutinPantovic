package Smart_Calculator;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JInternalFrame;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import Smart_Calculator.Postfix;
import java.awt.Color;

public class Custom_Expression extends JDialog{
	
	
	

	private final JPanel contentPanel = new JPanel();
	private JTextField izraz;
	
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Custom_Expression dialog = new Custom_Expression();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

	/**
	 * Create the dialog.
	 */
	public Custom_Expression() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(Color.BLACK);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			izraz = new JTextField();
			izraz.setBounds(63, 55, 316, 115);
			contentPanel.add(izraz);
			izraz.setColumns(10);
		}
		
		JLabel lblNewLabel = new JLabel("Unesite izraz:");
		lblNewLabel.setBackground(Color.RED);
		lblNewLabel.setForeground(Color.YELLOW);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(63, 21, 316, 13);
		contentPanel.add(lblNewLabel);
		
		izraz = new JTextField();
		izraz.setBounds(63, 77, 316, 93);
		contentPanel.add(izraz);
		izraz.setColumns(10);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(Color.BLACK);
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.setBackground(Color.BLACK);
				okButton.setForeground(Color.YELLOW);
				okButton.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						String s = String.valueOf(izraz.getText());
						int exp = Integer.parseInt(s);
						exp = Postfix.evaluatePostfix(String.valueOf(exp));	
						//textField.setText(String.valueOf(exp));
					}
				});
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent click) {
						
						
					}
					
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
				
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setForeground(Color.YELLOW);
				cancelButton.setBackground(Color.BLACK);
				cancelButton.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent click) {
						setVisible (false);
						dispose();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
				
			}
		}
	

		
	}
}

	
