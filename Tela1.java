package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;

public class Tela1 {

	private JFrame frmLogin;
	private JTextField n1;
	private JTextField n2;
	private JTextField result;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela1 window = new Tela1();
					window.frmLogin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Tela1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLogin = new JFrame();
		frmLogin.setTitle("Login");
		frmLogin.setBounds(100, 100, 837, 572);
		frmLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLogin.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Sair");
		btnNewButton.setBackground(new Color(255, 255, 0));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton.setBounds(433, 455, 99, 40);
		frmLogin.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Número 1:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel.setBounds(187, 202, 99, 40);
		frmLogin.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Bem vindo!!!");
		lblNewLabel_1.setFont(new Font("Onyx", Font.BOLD, 72));
		lblNewLabel_1.setBounds(275, 107, 245, 84);
		frmLogin.getContentPane().add(lblNewLabel_1);
		
		n1 = new JTextField();
		n1.setBounds(309, 203, 170, 40);
		frmLogin.getContentPane().add(n1);
		n1.setColumns(10);
		
		JButton Dividir = new JButton("Dividir");
		Dividir.setBackground(new Color(255, 255, 0));
		Dividir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float num1, num2, res;
				num1 = Float.parseFloat(n1.getText());
				num2 = Float.parseFloat(n2.getText());
				res = num1 / num2;
				String resFormatado = String.format("%.2f", res);
				result.setText(String.valueOf(resFormatado));
			}
		});
		Dividir.setBounds(538, 396, 89, 40);
		
		frmLogin.getContentPane().add(Dividir);
		
		JButton Limpar = new JButton("Limpar");
		Limpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n1.setText("");
				n2.setText("");
				result.setText("");
			}
		});
		Limpar.setBackground(Color.YELLOW);
		Limpar.setBounds(250, 455, 89, 40);
		frmLogin.getContentPane().add(Limpar);
		
		n2 = new JTextField();
		n2.setColumns(10);
		n2.setBounds(309, 261, 170, 40);
		frmLogin.getContentPane().add(n2);
		
		JLabel lblNmero = new JLabel("Número 2:");
		lblNmero.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNmero.setBounds(187, 260, 99, 40);
		frmLogin.getContentPane().add(lblNmero);
		
		JLabel lblResultado = new JLabel("Resultado:");
		lblResultado.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblResultado.setBounds(187, 321, 99, 40);
		frmLogin.getContentPane().add(lblResultado);
		
		result = new JTextField();
		result.setBackground(new Color(255, 255, 255));
		result.setEnabled(false);
		result.setColumns(10);
		result.setBounds(309, 322, 170, 40);
		frmLogin.getContentPane().add(result);
		
		JButton btnMultiplicar = new JButton("Multiplicar");
		btnMultiplicar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1, num2, res;
				num1 = Integer.parseInt(n1.getText());
				num2 = Integer.parseInt(n2.getText());
				res = num1 * num2;
				result.setText(String.valueOf(res));
			}
		});
		btnMultiplicar.setBackground(Color.YELLOW);
		btnMultiplicar.setBounds(414, 396, 89, 40);
		frmLogin.getContentPane().add(btnMultiplicar);
		
		JButton subtrair = new JButton("Subtrair");
		subtrair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1, num2, res;
				num1 = Integer.parseInt(n1.getText());
				num2 = Integer.parseInt(n2.getText());
				res = num1 - num2;
				result.setText(String.valueOf(res));
			}
		});
		subtrair.setBackground(Color.YELLOW);
		subtrair.setBounds(297, 396, 89, 40);
		frmLogin.getContentPane().add(subtrair);
		
		JButton Somar_3 = new JButton("Somar");
		Somar_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1, num2, res;
				num1 = Integer.parseInt(n1.getText());
				num2 = Integer.parseInt(n2.getText());
				res = num1 + num2;
				result.setText(String.valueOf(res));
			}
		});
		Somar_3.setBackground(Color.YELLOW);
		Somar_3.setBounds(187, 396, 89, 40);
		frmLogin.getContentPane().add(Somar_3);
	}
}
