import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Frame1 {

	private JFrame frame;
	private JTextField txtNum_1;
	private JTextField txtNum;
	private JTextField Ans;
	private JButton ButtonMultiply;
	private JButton ButtonDivide;
	private JButton ButtonFactorial;
	private JLabel lblNumber;
	private JLabel lblNumber_1;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame1 window = new Frame1();
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
	public Frame1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 597, 446);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtNum_1 = new JTextField();
		txtNum_1.setBounds(32, 21, 179, 38);
		frame.getContentPane().add(txtNum_1);
		txtNum_1.setColumns(10);
		
		txtNum = new JTextField();
		txtNum.setBounds(259, 21, 165, 38);
		frame.getContentPane().add(txtNum);
		txtNum.setColumns(10);
		
		JButton ButtonAdd = new JButton("Add");
		ButtonAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int num1,num2,ans;
				
				try {
					num1 = Integer.parseInt(txtNum_1.getText());
					num2 =  Integer.parseInt(txtNum.getText());
					
					ans = num1+num2;
					Ans.setText(Integer.toString(ans));
				}
				catch(Exception e){
					JOptionPane.showMessageDialog(null, "Please enter a valid number");
				}
			}
		});
		ButtonAdd.setBounds(32, 106, 179, 51);
		ButtonAdd.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		frame.getContentPane().add(ButtonAdd);
		
		JButton ButtonSubtract = new JButton("Subtract");
		ButtonSubtract.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg1) {
				int num1,num2,ans;
				
				try {
					num1 = Integer.parseInt(txtNum_1.getText());
					num2 =  Integer.parseInt(txtNum.getText());
					
					ans = num1-num2;
					Ans.setText(Integer.toString(ans));
				}
				catch(Exception e1){
					JOptionPane.showMessageDialog(null, "Please enter a valid number");
				}
			}
		});
		ButtonSubtract.setBounds(259, 106, 165, 51);
		ButtonSubtract.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		frame.getContentPane().add(ButtonSubtract);
		
		JLabel lblAnswer = new JLabel("Answer...");
		lblAnswer.setBounds(32, 332, 179, 51);
		lblAnswer.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
		frame.getContentPane().add(lblAnswer);
		
		Ans = new JTextField();
		Ans.setBounds(209, 332, 268, 51);
		Ans.setFont(new Font("Comic Sans MS", Font.PLAIN, 30));
		frame.getContentPane().add(Ans);
		Ans.setColumns(10);
		
		ButtonMultiply = new JButton("Multiply");
		ButtonMultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg2) {
				int num1,num2,ans;
				
				try {
					num1 = Integer.parseInt(txtNum_1.getText());
					num2 =  Integer.parseInt(txtNum.getText());
					
					ans = num1*num2;
					Ans.setText(Integer.toString(ans));
				}
				catch(Exception e3){
					JOptionPane.showMessageDialog(null, "Please enter a valid number");
				}
			}
		});
		ButtonMultiply.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		ButtonMultiply.setBounds(32, 196, 179, 51);
		frame.getContentPane().add(ButtonMultiply);
		
		ButtonDivide = new JButton("Divide");
		ButtonDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg4) {
				double num1,num2,ans;
				
				try {
					num1 = Double.parseDouble(txtNum_1.getText());
					num2 = Double.parseDouble(txtNum.getText());
					
					ans = num1/num2;
					Ans.setText(Double.toString(ans));
				}
				catch(Exception e4){
					JOptionPane.showMessageDialog(null, "Please enter a valid number");
				}
			}
		});
		ButtonDivide.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		ButtonDivide.setBounds(259, 196, 165, 51);
		frame.getContentPane().add(ButtonDivide);
		
		ButtonFactorial = new JButton("Factorial");
		ButtonFactorial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg5) {
				double num1,num2,ans;
				ans = 1;
				try {
					num1 = Double.parseDouble(txtNum_1.getText());
					for(double i = num1;i>0;i--) {
						ans= ans*num1;
						num1--;
					}
				}
				catch(Exception e5){
					JOptionPane.showMessageDialog(null, "Please enter a valid number");
				}
				
				Ans.setText(Double.toString(ans));
				
			}
		});
		ButtonFactorial.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		ButtonFactorial.setBounds(32, 269, 179, 44);
		frame.getContentPane().add(ButtonFactorial);
		
		lblNumber = new JLabel("NUMBER 1");
		lblNumber.setBounds(32, 70, 89, 14);
		frame.getContentPane().add(lblNumber);
		
		lblNumber_1 = new JLabel("NUMBER 2");
		lblNumber_1.setBounds(259, 70, 89, 14);
		frame.getContentPane().add(lblNumber_1);
		
		lblNewLabel = new JLabel("(Only use Number 1 for factorial)");
		lblNewLabel.setBounds(218, 269, 206, 51);
		frame.getContentPane().add(lblNewLabel);
	}
}
