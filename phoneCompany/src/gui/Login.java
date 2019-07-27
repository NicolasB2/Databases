package gui;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Login extends JFrame implements ActionListener {

	
	public static final String LOGIN = "Login";
	public boolean loginCorrect;
	private JButton butLogin;

	private JLabel lbTitle;
	
	private JLabel lbIconUser;
	private JLabel lbIconPassword;
	private JLabel lbIconCorreo;

	private JPlaceholderTextField txtEmail;
	private JPlaceholderTextField txtPass;
	
	private MainGui main;
	
	public Login(MainGui main) {

		this.main = main;
		setTitle("Agar.io");
		setSize(333, 333);
		setLocationRelativeTo(null);
		setResizable(false);

		lbTitle = new JLabel("Sing in", SwingConstants.CENTER);
		lbTitle.setFont(new java.awt.Font("Calibri", 1, 28));

		txtEmail = new JPlaceholderTextField("Email");
		txtEmail.setFont(new java.awt.Font("Calibri", 1, 18));
		txtPass = new JPlaceholderTextField("Password");
		txtPass.setFont(new java.awt.Font("Calibri", 1, 18));

		String path = "icons/user.png";
		ImageIcon icon = new ImageIcon(path);
		lbIconUser = new JLabel("", SwingConstants.CENTER);
		lbIconUser.setIcon(icon);
		
		String path1 = "icons/correo.png";
		ImageIcon icon1 = new ImageIcon(path1);
		lbIconCorreo = new JLabel("", SwingConstants.CENTER);
		lbIconCorreo.setIcon(icon1);
		
		String path2 = "icons/password.png";
		ImageIcon icon2 = new ImageIcon(path2);
		lbIconPassword = new JLabel("", SwingConstants.CENTER);
		lbIconPassword.setIcon(icon2);

		butLogin = new JButton("Login");
		butLogin.setFont(new java.awt.Font("Calibri", 1, 18));
		butLogin.setActionCommand(LOGIN);
		butLogin.addActionListener(this);

		setLayout(new BorderLayout());
		JPanel auxLogin = new JPanel();
		auxLogin.setLayout(new GridLayout(9, 3));
		auxLogin.add(new JLabel());
		auxLogin.add(new JLabel());
		auxLogin.add(new JLabel());
		auxLogin.add(new JLabel());
		auxLogin.add(lbTitle);
		auxLogin.add(new JLabel());
		auxLogin.add(new JLabel());
		auxLogin.add(new JLabel());
		auxLogin.add(new JLabel());
		auxLogin.add(lbIconUser);
		auxLogin.add(txtEmail);
		auxLogin.add(new JLabel());
		auxLogin.add(new JLabel());
		auxLogin.add(new JLabel());
		auxLogin.add(new JLabel());
		auxLogin.add(lbIconPassword);
		auxLogin.add(txtPass);
		auxLogin.add(new JLabel());
		auxLogin.add(new JLabel());
		auxLogin.add(new JLabel());
		auxLogin.add(new JLabel());
		auxLogin.add(new JLabel());
		auxLogin.add(butLogin);
		auxLogin.add(new JLabel());
		auxLogin.add(new JLabel());
		auxLogin.add(new JLabel());
		add(auxLogin, BorderLayout.CENTER);
	}

	public String getEmail() {
		return txtEmail.getText();
	}

	public String getPassword() {
		return txtPass.getText();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String comand = e.getActionCommand();

		if (comand.equals(LOGIN)) {	
			this.loginCorrect = main.verifyLogin(getEmail(), getPassword());
			if(loginCorrect) {
				main.showMenu();
			}
		} 
	}

}