package gui;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import model.PhoneCompany;

public class MainGui extends JFrame{
	
	public static final int WINDOW_WIDTH = 1400;
	public static final int WINDOW_HEIGHT = 800;
	public static final int WINDOW_POS_X = 50;
	public static final int WINDOW_POS_Y = 50;
	
	private Login login;
	private Menu menu;
	private PhoneCompany pc;
	
	public MainGui() {
		
		pc = new PhoneCompany();		
		menu = new Menu(this);
		login = new Login(this);
		login.setVisible(true);
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(false);
		this.setBounds(WINDOW_POS_X, WINDOW_POS_Y, WINDOW_WIDTH, WINDOW_HEIGHT);
		this.setResizable(false);
		this.setFocusable(true);
		this.setLocationRelativeTo(null);
	}
	
	public boolean verifyLogin(String user, String password) {
		try {
			return pc.createConection(user, password);
		} catch (Exception e) {
			return false;
		}
	}
	
	public void showMenu() {
		login.setVisible(false);
		menu.setVisible(true);
	}
	
	public void showAdd() {
		
	}
	
	public void showFind() {
		
	}
	
	public static void main(String[] args) {
		MainGui gui = new MainGui(); 
	}
}