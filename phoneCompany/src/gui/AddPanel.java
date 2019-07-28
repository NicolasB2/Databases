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
		
		setTitle("Add");
		setSize(400, 400);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		
		lbCedula = new JLabel("Cedula", SwingConstants.CENTER);
		lbCedula.setFont(new java.awt.Font("Calibri", 1, 28));
		
		lbContrasenha = new JLabel("Contrasenia", SwingConstants.CENTER);
		lbContrasenha.setFont(new java.awt.Font("Calibri", 1, 28));
		
		lbDireccion = new JLabel("Direccion", SwingConstants.CENTER);
		lbDireccion.setFont(new java.awt.Font("Calibri", 1, 28));
		
		lbFecha = new JLabel("Fecha", SwingConstants.CENTER);
		lbFecha.setFont(new java.awt.Font("Calibri", 1, 28));
		
		lbId = new JLabel("Id", SwingConstants.CENTER);
		lbId.setFont(new java.awt.Font("Calibri", 1, 28));
		
		lbNombre = new JLabel("Nombre", SwingConstants.CENTER);
		lbNombre.setFont(new java.awt.Font("Calibri", 1, 28));
		
		lbTelefono = new JLabel("Telefono", SwingConstants.CENTER);
		lbTelefono.setFont(new java.awt.Font("Calibri", 1, 28));
		
		txtCedula = new TextField("");
		txtContrasenha = new TextField("");
		txtDireccion = new TextField("");
		txtFecha = new TextField("");
		txtId = new TextField("");
		txtNombre = new TextField("");
		txtTelefono = new TextField("");
		
		JPanel data = new JPanel();
		data.setLayout(new GridLayout(7, 2));
		
		data.add(lbId);
		data.add(txtId);
		
		data.add(lbContrasenha);
		data.add(txtContrasenha);
		
		data.add(lbNombre);
		data.add(txtNombre);
		
		data.add(lbCedula);
		data.add(txtCedula);
		
		data.add(lbDireccion);
		data.add(txtDireccion);
		
		data.add(lbFecha);
		data.add(txtFecha);
		
		data.add(lbTelefono);
		data.add(txtTelefono);
		
		add(data, BorderLayout.CENTER);
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
