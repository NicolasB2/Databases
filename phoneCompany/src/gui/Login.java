package gui;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Login extends JFrame implements ActionListener {

	public static final String LOGIN = "Login";
	public static final String GO_REGISTRER = "Go registrer";
	public boolean loginCorrect;

	private JLabel lbTitle;
	private JLabel lbTextRegistrer;

	private JLabel lbIconUser;
	private JLabel lbIconPassword;

	private JPlaceholderTextField txtEmail;
	private JPasswordField txtPass;

	private JButton butLogin;
	private JButton butPanelRegistrar;

	public String email;

	public Login() {

		setTitle("Agar.io");
		setSize(333, 333);
		setLocationRelativeTo(null);
		setResizable(false);

		lbTitle = new JLabel("Sing in", SwingConstants.CENTER);
		lbTitle.setFont(new java.awt.Font("Calibri", 1, 28));

		lbTextRegistrer = new JLabel("Don't have account?", SwingConstants.CENTER);
		lbTextRegistrer.setFont(new java.awt.Font("Calibri", 1, 18));

		txtEmail = new JPlaceholderTextField("Email");
		txtEmail.setFont(new java.awt.Font("Calibri", 1, 18));
		txtPass = new JPasswordField();

		String path = "/icons/user.png";
		java.net.URL url = this.getClass().getResource(path);
		ImageIcon icon = new ImageIcon(url);
		lbIconUser = new JLabel("", SwingConstants.CENTER);
		lbIconUser.setIcon(icon);

		String path2 = "/icons/password.png";
		java.net.URL url2 = this.getClass().getResource(path2);
		ImageIcon icon2 = new ImageIcon(url2);
		lbIconPassword = new JLabel("", SwingConstants.CENTER);
		lbIconPassword.setIcon(icon2);

		butLogin = new JButton("Login");
		butLogin.setFont(new java.awt.Font("Calibri", 1, 18));
		butLogin.setActionCommand(LOGIN);
		butLogin.addActionListener(this);

		butPanelRegistrar = new JButton("Registrer");
		butPanelRegistrar.setFont(new java.awt.Font("Calibri", 1, 18));
		butPanelRegistrar.setActionCommand(GO_REGISTRER);
		butPanelRegistrar.addActionListener(this);

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
		auxLogin.add(new JLabel());
		auxLogin.add(txtEmail);
		auxLogin.add(new JLabel());
		auxLogin.add(new JLabel());
		auxLogin.add(new JLabel());
		auxLogin.add(new JLabel());
		auxLogin.add(new JLabel());
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

		JPanel auxRegistrer = new JPanel();
		auxRegistrer.setLayout(new GridLayout(1, 2));
		auxRegistrer.add(lbTextRegistrer);
		auxRegistrer.add(butPanelRegistrar);

		add(auxLogin, BorderLayout.CENTER);
		add(auxRegistrer, BorderLayout.SOUTH);
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
			
		} 
	}

}