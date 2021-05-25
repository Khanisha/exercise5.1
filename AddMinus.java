package exercise5_1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class AddMinus {

	private JFrame frame;
	private JTextField textFieldInput1;
	private JTextField textFieldInput2;
	private JTextField textFieldAnswer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddMinus window = new AddMinus();
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
	public AddMinus() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 502, 363);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textFieldInput1 = new JTextField();
		textFieldInput1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textFieldInput1.setBounds(65, 49, 130, 53);
		frame.getContentPane().add(textFieldInput1);
		textFieldInput1.setColumns(15);
		
		textFieldInput2 = new JTextField();
		textFieldInput2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textFieldInput2.setColumns(15);
		textFieldInput2.setBounds(237, 49, 130, 53);
		frame.getContentPane().add(textFieldInput2);
		
		JButton btnAdd = new JButton("ADD");
		btnAdd.setForeground(new Color(0, 0, 0));
		btnAdd.setBackground(SystemColor.activeCaption);
		btnAdd.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int input1 = Integer.parseInt(textFieldInput1.getText());
					int input2 = Integer.parseInt(textFieldInput2.getText());
					
					int result = input1 + input2;
					
					textFieldAnswer.setText(Integer.toString(result));
					
				} catch (Exception a) {
					JOptionPane.showMessageDialog(null, "Please enter number in whole number!");
				}
				
			}
			
		});
			
		btnAdd.setBounds(84, 155, 85, 42);
		frame.getContentPane().add(btnAdd);
		
		JButton btnMinus = new JButton("MINUS");
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int input1 = Integer.parseInt(textFieldInput1.getText());
					int input2 = Integer.parseInt(textFieldInput2.getText());
					
					int result = input1 - input2;
					
					textFieldAnswer.setText(Integer.toString(result));
				}catch (Exception a) {
					JOptionPane.showMessageDialog(null, "Please enter number in whole number!");
			}
			}
		});
		btnMinus.setForeground(Color.BLACK);
		btnMinus.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnMinus.setBackground(SystemColor.activeCaption);
		btnMinus.setBounds(267, 155, 85, 42);
		frame.getContentPane().add(btnMinus);
		
		JLabel lblNewLabel = new JLabel("ANSWER :");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(123, 265, 72, 36);
		frame.getContentPane().add(lblNewLabel);
		
		textFieldAnswer = new JTextField();
		textFieldAnswer.setFont(new Font("Tahoma", Font.BOLD, 15));
		textFieldAnswer.setBounds(203, 265, 96, 36);
		frame.getContentPane().add(textFieldAnswer);
		textFieldAnswer.setColumns(15);
	} }

