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

public class FindPanel extends JFrame implements ActionListener  {

	public static final String FIND = "FIND";
	private JButton butFind;
	
	private JLabel lbId;
	private JLabel lbContrasenha;
	private JLabel lbNombre;
	private JLabel lbDireccion;
	private JLabel lbFecha;
	private JLabel lbTelefono;
    
	private TextField txtId;
	private TextField txtContrasenha;
	private TextField txtNombre;
	private TextField txtDireccion;
	private TextField txtFecha;
	private TextField txtTelefono;
	private HTextField txtCedula;
	
	private MainGui main;
	private String type;
	
	public FindPanel(String type, MainGui main) {
		this.type = type;
		this.main = main;
		
		setTitle("Find "+type);
		setSize(400, 400);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		
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
		
		txtCedula = new HTextField("cedula");
		txtContrasenha = new TextField("");
		txtDireccion = new TextField("");
		txtFecha = new TextField("");
		txtId = new TextField("");
		txtNombre = new TextField("");
		txtTelefono = new TextField("");
		
		butFind = new JButton("Find");
		butFind.setFont(new java.awt.Font("Calibri", 1, 18));
		butFind.setActionCommand(FIND);
		butFind.addActionListener(this);
		
		JPanel data = new JPanel();
		data.setLayout(new GridLayout(13, 2));
		
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
		button.setLayout(new GridLayout(3,5));

		button.add(new JLabel());
		button.add(new JLabel());
		button.add(new JLabel());
		button.add(new JLabel());
		button.add(new JLabel());
		
		button.add(new JLabel());
		button.add(butFind);	
		button.add(new JLabel());
		button.add(txtCedula);
		button.add(new JLabel());
		
		button.add(new JLabel());
		button.add(new JLabel());
		button.add(new JLabel());
		button.add(new JLabel());
		button.add(new JLabel());
		
		add(data, BorderLayout.CENTER);
		add(button, BorderLayout.NORTH);
		add(new JLabel("          "),BorderLayout.EAST);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();

		if (command.equals(FIND)) {	
			main.find_(type, txtCedula.getText());
		}
		
	}
}
