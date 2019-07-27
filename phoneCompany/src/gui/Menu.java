package gui;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Menu extends JFrame implements ActionListener {

	
	public static final String ADD_C   = "Add client";
	public static final String FIND_C  = "find client";
	public static final String ADD_F   = "Add functionary";
	public static final String FIND_f  = "find functionary";

	private MainGui main;
	private JLabel lbTitle;
	private JLabel lbIconClient;
	private JLabel lbIconFunctionary;
	
	private JButton butAdd_C;
	private JButton butFind_C;	
	private JButton butAdd_F;
	private JButton butFind_F;
	
	
	public Menu(MainGui main) {

		this.main = main;
		setTitle("Menu");
		setSize(333, 333);
		setLocationRelativeTo(null);
		setResizable(false);

		lbTitle = new JLabel("Menu", SwingConstants.CENTER);
		lbTitle.setFont(new java.awt.Font("Calibri", 1, 28));

		String path = "icons/client.png";
		ImageIcon icon = new ImageIcon(path);
		lbIconClient = new JLabel("", SwingConstants.CENTER);
		lbIconClient.setIcon(icon);
		
		String path1 = "icons/functionary.png";
		ImageIcon icon1 = new ImageIcon(path1);
		lbIconFunctionary = new JLabel("", SwingConstants.CENTER);
		lbIconFunctionary.setIcon(icon1);

		butAdd_C = new JButton("Add Client");
		butAdd_C.setFont(new java.awt.Font("Calibri", 1, 18));
		butAdd_C.setActionCommand(ADD_C);
		butAdd_C.addActionListener(this);

		butFind_C = new JButton("Find Client");
		butFind_C.setFont(new java.awt.Font("Calibri", 1, 18));
		butFind_C.setActionCommand(FIND_C);
		butFind_C.addActionListener(this);
		
		butAdd_F = new JButton("Add Functionary");
		butAdd_F.setFont(new java.awt.Font("Calibri", 1, 18));
		butAdd_F.setActionCommand(ADD_F);
		butAdd_F.addActionListener(this);
		
		butFind_F = new JButton("Find Functionary");
		butFind_F.setFont(new java.awt.Font("Calibri", 1, 18));
		butFind_F.setActionCommand(FIND_f);
		butFind_F.addActionListener(this);
		
		setLayout(new BorderLayout());
		JPanel aux = new JPanel();
		aux.setLayout(new GridLayout(3, 2));
		
		aux.add(lbIconClient);
		aux.add(lbIconFunctionary);
		
		aux.add(butAdd_C);
		aux.add(butAdd_F);
		
		aux.add(butFind_C);
		aux.add(butFind_F);
		
		add(aux, BorderLayout.CENTER);
		add(lbTitle, BorderLayout.NORTH);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String comand = e.getActionCommand();

		 
	}

}