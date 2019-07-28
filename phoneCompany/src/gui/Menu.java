package gui;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.TitledBorder;

public class Menu extends JFrame implements ActionListener {

	
	public static final String ADD_C   = "Add client";
	public static final String FIND_C  = "find client";
	public static final String ADD_F   = "Add functionary";
	public static final String FIND_F  = "find functionary";

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
		setSize(400, 400);
		setLocationRelativeTo(null);

		lbTitle = new JLabel("\nMenu\n", SwingConstants.CENTER);
		lbTitle.setFont(new java.awt.Font("Calibri", 1, 28));

		String path = "icons/client.png";
		ImageIcon icon = new ImageIcon(path);
		lbIconClient = new JLabel("", SwingConstants.CENTER);
		lbIconClient.setIcon(icon);
		
		String path1 = "icons/functionary.png";
		ImageIcon icon1 = new ImageIcon(path1);
		lbIconFunctionary = new JLabel("", SwingConstants.CENTER);
		lbIconFunctionary.setIcon(icon1);

		butAdd_C = new JButton("Add");
		butAdd_C.setFont(new java.awt.Font("Calibri", 1, 18));
		butAdd_C.setActionCommand(ADD_C);
		butAdd_C.addActionListener(this);
		
		butFind_C = new JButton("Find");
		butFind_C.setFont(new java.awt.Font("Calibri", 1, 18));
		butFind_C.setActionCommand(FIND_C);
		butFind_C.addActionListener(this);
		
		butAdd_F = new JButton("Add");
		butAdd_F.setFont(new java.awt.Font("Calibri", 1, 18));
		butAdd_F.setActionCommand(ADD_F);
		butAdd_F.addActionListener(this);
		
		butFind_F = new JButton("Find");
		butFind_F.setFont(new java.awt.Font("Calibri", 1, 18));
		butFind_F.setActionCommand(FIND_F);
		butFind_F.addActionListener(this);
		
		setLayout(new BorderLayout());
		
		JPanel title = new JPanel();
		title.setLayout(new GridLayout(3, 1));
		
		title.add(new Label());
		title.add(lbTitle);
		title.add(new Label());
		
		setLayout(new BorderLayout());
		JPanel icons = new JPanel();
		icons.setLayout(new GridLayout(1, 5));
		
		icons.add(new Label());
		icons.add(lbIconClient);
		icons.add(new Label());
		icons.add(lbIconFunctionary);
		icons.add(new Label());
		
		JPanel banner = new JPanel();
		banner.setLayout(new BorderLayout());
		
		banner.add(icons, BorderLayout.CENTER);
		banner.add(title, BorderLayout.NORTH);
		
		JPanel buttons = new JPanel();
		buttons.setLayout(new GridLayout(5, 5));
		
		buttons.add(new Label());
		buttons.add(new Label("   cliente"));
		buttons.add(new Label());
		buttons.add(new Label("  Funcionario"));
		buttons.add(new Label());
		
		buttons.add(new Label());
		buttons.add(butAdd_C);
		buttons.add(new Label());
		buttons.add(butAdd_F);
		buttons.add(new Label());
		
		buttons.add(new Label());
		buttons.add(new Label());
		buttons.add(new Label());
		buttons.add(new Label());
		buttons.add(new Label());
		
		buttons.add(new Label());
		buttons.add(butFind_C);
		buttons.add(new Label());
		buttons.add(butFind_F);
		buttons.add(new Label());
		
		buttons.add(new Label());
		buttons.add(new Label());
		buttons.add(new Label());
		buttons.add(new Label());
		buttons.add(new Label());
		
		
		add(banner, BorderLayout.NORTH);
		add(buttons,BorderLayout.CENTER);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();

		switch (command) {
		case ADD_C:
			main.showAdd(MainGui.CLIENT);
			break;

		case FIND_C:
			main.showFind(MainGui.CLIENT);
			break;
			
		case ADD_F:
			main.showAdd(MainGui.FUNCTIONARY);
			break;

		case FIND_F:
			main.showFind(MainGui.FUNCTIONARY);
			break;
		} 
	}

}