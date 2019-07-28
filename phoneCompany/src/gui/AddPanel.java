package gui;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class AddPanel extends JFrame implements ActionListener {

	public static final String ADD = "Add";
	
	private JButton butAdd;
	
	private JLabel lbId;
	private JLabel lbContrasenha;
	private JLabel lbNombre;
	private JLabel lbCedula;
	private JLabel lbDireccion;
	private JLabel lbFecha;
	private JLabel lbTelefono;
	
	private TextField txtId;
	private TextField txtContrasenha;
	private TextField txtNombre;
	private TextField txtCedula;
	private TextField txtDireccion;
	private TextField txtFecha;
	private TextField txtTelefono;
	
	private MainGui main;
	private String type;
	
	public AddPanel(String type, MainGui main) {
		this.type = type;
		this.main = main;
		
		setTitle("Add "+type);
		setSize(400, 400);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		
		lbCedula = new JLabel("Cedula: ", SwingConstants.RIGHT);
		lbCedula.setFont(new java.awt.Font("Calibri", 1, 28));
		
		lbContrasenha = new JLabel("Contrasenia: ", SwingConstants.RIGHT);
		lbContrasenha.setFont(new java.awt.Font("Calibri", 1, 28));
		
		lbDireccion = new JLabel("Direccion: ", SwingConstants.RIGHT);
		lbDireccion.setFont(new java.awt.Font("Calibri", 1, 28));
		
		lbFecha = new JLabel("Fecha: ", SwingConstants.RIGHT);
		lbFecha.setFont(new java.awt.Font("Calibri", 1, 28));
		
		lbId = new JLabel("Id: ", SwingConstants.RIGHT);
		lbId.setFont(new java.awt.Font("Calibri", 1, 28));
		
		lbNombre = new JLabel("Nombre: ", SwingConstants.RIGHT);
		lbNombre.setFont(new java.awt.Font("Calibri", 1, 28));
		
		lbTelefono = new JLabel("Telefono: ", SwingConstants.RIGHT);
		lbTelefono.setFont(new java.awt.Font("Calibri", 1, 28));
		
		txtCedula = new TextField("");
		txtContrasenha = new TextField("");
		txtDireccion = new TextField("");
		txtFecha = new TextField("");
		txtId = new TextField("");
		txtNombre = new TextField("");
		txtTelefono = new TextField("");
		
		butAdd = new JButton("Find");
		butAdd.setFont(new java.awt.Font("Calibri", 1, 18));
		butAdd.setActionCommand(ADD);
		butAdd.addActionListener(this);
		
		JPanel data = new JPanel();
		data.setLayout(new GridLayout(15, 2));
		
		data.add(new JLabel());
		data.add(new JLabel());
		
		data.add(lbId);
		data.add(txtId);
		
		data.add(new JLabel());
		data.add(new JLabel());
		
		data.add(lbContrasenha);
		data.add(txtContrasenha);
		
		data.add(new JLabel());
		data.add(new JLabel());
		
		data.add(lbNombre);
		data.add(txtNombre);
		
		data.add(new JLabel());
		data.add(new JLabel());
		
		data.add(lbCedula);
		data.add(txtCedula);
		
		data.add(new JLabel());
		data.add(new JLabel());
		
		data.add(lbDireccion);
		data.add(txtDireccion);
		
		data.add(new JLabel());
		data.add(new JLabel());
		
		data.add(lbFecha);
		data.add(txtFecha);
		
		data.add(new JLabel());
		data.add(new JLabel());
		
		data.add(lbTelefono);
		data.add(txtTelefono);
		
		data.add(new JLabel());
		data.add(new JLabel());
		
		JPanel button = new JPanel();
		button.setLayout(new GridLayout(2,3));
		
		button.add(new JLabel());
		button.add(butAdd);
		button.add(new JLabel());
		
		button.add(new JLabel());
		button.add(new JLabel());
		button.add(new JLabel());
		
		add(data, BorderLayout.CENTER);
		add(button, BorderLayout.SOUTH);
		add(new JLabel("          "),BorderLayout.EAST);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();

		if (command.equals(ADD)) {	
			
		} 
	}
}
