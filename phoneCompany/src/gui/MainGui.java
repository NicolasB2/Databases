package gui;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import model.PhoneCompany;

public class MainGui extends JFrame{
	
	public static final int WINDOW_WIDTH = 1400;
	public static final int WINDOW_HEIGHT = 800;
	public static final int WINDOW_POS_X = 50;
	public static final int WINDOW_POS_Y = 50;
	
	public static final String CLIENT = "Client";
	public static final String FUNCTIONARY = "Functionary";
	
	private PhoneCompany pc;
	private Login login;
	private Menu menu;
	private AddPanel add;
	private FindPanel find;
	
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
	
	public void showAdd(String type) {
		menu.setVisible(false);
		add = new AddPanel(type, this);
		add.setVisible(true);
	}
	
	public void showFind(String type) {
		menu.setVisible(false);
		find = new FindPanel(type, this);
		find.setVisible(true);
	}
	
	public void add_(String type, String ivId, String ivContrasenha, String ivNombre,
			String ivCedula, String ivDireccion, String ivFecha, String ivTelefono) {
		
		try {
			
			if(type.equals(CLIENT)){
				pc.AddClient(ivId, ivContrasenha, ivNombre, ivCedula, ivDireccion, ivFecha, ivTelefono);
				JOptionPane.showMessageDialog(this, "added correctly");
			}
			
			if(type.equals(FUNCTIONARY)){
				pc.AddFuncionario(ivId, ivContrasenha, ivNombre, ivCedula, ivDireccion, ivFecha, ivTelefono);
				JOptionPane.showMessageDialog(this, "added correctly");
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public String  find_(String type, String cedula) {
		try {
			
			if(type.equals(CLIENT)){
				return pc.consultClient(cedula);
			}
			
			if(type.equals(FUNCTIONARY)){
				return pc.consultaFuncionario(cedula);
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		return null;
	}
	
	public static void main(String[] args) {
		MainGui gui = new MainGui(); 
	}
}