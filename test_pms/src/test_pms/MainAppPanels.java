package test_pms;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.text.DefaultEditorKit.CopyAction;

import java.util.Random;
import javax.swing.border.LineBorder;

public class MainAppPanels extends JPanel implements ActionListener{
	
	
	static final int SCREEN_WIDTH = 1400;
	static final int SCREEN_HEIGTH = 700;
	static final int UNIT_SIZE = 25;
	static Color GREEN;

	
	

	MainAppPanels () 
	{
		
		
		
		this.setPreferredSize(new Dimension(1400, 658));
		
		logo();
		menu_panel();
		usertaskbar();
		//display();
		

		
	}
	
	

	//constructors
//	public AddActionToAllButtons() {
//		initComponents();
//	}
	
	CardLayout cardLayout;
	
	public void menu_panel()	{
		Image img  = new ImageIcon(this.getClass().getResource("/alphalogo.png")).getImage();
		Image img_welcome  = new ImageIcon(this.getClass().getResource("/WELCOME.png")).getImage();
		setLayout(null);
		
	
		JPanel usertaskbar = new JPanel();
		usertaskbar.setLayout(null);
		usertaskbar.setBackground(Color.ORANGE);
		usertaskbar.setBounds(316, 11, 1074, 80);
		add(usertaskbar);
		
		//
		JPanel Jpanel = new JPanel();
		Jpanel.setBounds(316, 91, 1074, 555);
		Jpanel.setBackground(Color.LIGHT_GRAY);
		add(Jpanel);
		Jpanel.setLayout(new CardLayout(0, 0));
				
		JLayeredPane layeredPane = new JLayeredPane();
		Jpanel.add(layeredPane, "panel");
		layeredPane.setLayout(new CardLayout(0, 0));
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(Color.WHITE);
		layeredPane.add(panel_1_1, "pane1_1");
		panel_1_1.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(322, 199, 490, 117);
		panel_1_1.add(lblNewLabel_3);
		lblNewLabel_3.setIcon(new ImageIcon(img_welcome));
		
//		JLabel panel_1_1 = new JLabel();
//		pane
		
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.white);
		layeredPane.add(panel_1, "panel1");
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Dashboard");
		lblNewLabel_1.setBounds(10, 11, 117, 40);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Total Employees");
		lblNewLabel_2.setBounds(56, 146, 208, 125);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Total Department");
		lblNewLabel_2_1.setBounds(291, 146, 208, 125);
		panel_1.add(lblNewLabel_2_1);
		
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.GREEN);
		layeredPane.add(panel_2, "panel2");
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.RED);
		layeredPane.add(panel_3, "panel3");
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.YELLOW);
		layeredPane.add(panel_4, "panel4");
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(Color.PINK);
		layeredPane.add(panel_5, "panel5");
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(Color.BLACK);
		layeredPane.add(panel_6, "panel6");
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(new Color(0, 128, 0));
		layeredPane.add(panel_7, "panel7");
		
		JPanel panel_8 = new JPanel();
		panel_8.setBackground(new Color(30, 144, 255));
		layeredPane.add(panel_8, "panel8");
		
		JPanel panel_9 = new JPanel();
		panel_9.setBackground(new Color(128, 0, 0));
		layeredPane.add(panel_9, "panel9");
		
		JPanel panel_10 = new JPanel();
		panel_10.setBackground(new Color(255, 222, 173));
		layeredPane.add(panel_10, "panel10");
		
		cardLayout = (CardLayout)(layeredPane.getLayout());
		
		JPanel logo = new JPanel();
		logo.setBorder(new LineBorder(Color.DARK_GRAY));
		logo.setBackground(Color.WHITE);
		logo.setBounds(10, 11, 306, 127);
		add(logo);
		logo.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("Clicked!");
				cardLayout.show(layeredPane, "pane1_1");
				
			}
		});
		lblNewLabel.setBounds(18, 2, 268, 121);
		logo.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon(img));
		
		JPanel menu_Jpanel = new JPanel();
		menu_Jpanel.setBounds(10, 91, 306, 555);
		menu_Jpanel.setBackground(Color.darkGray);
		add(menu_Jpanel);
		
		JButton btnNewButton_1 = new JButton("EMPLOYEE");
		btnNewButton_1.setBounds(10, 110, 286, 50);
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setHideActionText(true);
		btnNewButton_1.setForeground(Color.ORANGE);
		btnNewButton_1.setBackground(Color.DARK_GRAY);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Clicked!");
				cardLayout.show(layeredPane, "panel2");
				 
			}
		});
		menu_Jpanel.setLayout(null);
		
		JButton btnNewButton = new JButton("DASHBOARD");
		btnNewButton.setBorderPainted(false);
		btnNewButton.setBounds(10, 63, 286, 50);
		btnNewButton.setHideActionText(true);
		btnNewButton.setForeground(Color.ORANGE);
		btnNewButton.setBackground(Color.DARK_GRAY);
		menu_Jpanel.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Clicked!");
				cardLayout.show(layeredPane, "panel1");
				
			}
		});
		menu_Jpanel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("DEPARTMENT");
		btnNewButton_2.setBounds(10, 158, 286, 50);
		btnNewButton_2.setBorderPainted(false);
		btnNewButton_2.setForeground(Color.ORANGE);
		btnNewButton_2.setBackground(Color.DARK_GRAY);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Clicked!");
				cardLayout.show(layeredPane, "panel3");
			}
		});
		menu_Jpanel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("ATTENDANCE");
		btnNewButton_3.setBounds(10, 206, 286, 50);
		btnNewButton_3.setBorderPainted(false);
		btnNewButton_3.setForeground(Color.ORANGE);
		btnNewButton_3.setBackground(Color.DARK_GRAY);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Clicked!");
				cardLayout.show(layeredPane, "panel4");
			}
		});
		menu_Jpanel.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("LEAVE");
		btnNewButton_4.setBounds(10, 253, 286, 50);
		btnNewButton_4.setBorderPainted(false);
		btnNewButton_4.setForeground(Color.ORANGE);
		btnNewButton_4.setBackground(Color.DARK_GRAY);
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Clicked!");
				cardLayout.show(layeredPane, "panel5");
			}
		});
		menu_Jpanel.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("PAYROLL");
		btnNewButton_5.setBounds(10, 300, 286, 50);
		btnNewButton_5.setBorderPainted(false);
		btnNewButton_5.setForeground(Color.ORANGE);
		btnNewButton_5.setBackground(Color.DARK_GRAY);
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Clicked!");
				cardLayout.show(layeredPane, "panel6");
			}
		});
		menu_Jpanel.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("HOLIDAY");
		btnNewButton_6.setBounds(10, 349, 286, 50);
		btnNewButton_6.setBorderPainted(false);
		btnNewButton_6.setForeground(Color.ORANGE);
		btnNewButton_6.setBackground(Color.DARK_GRAY);
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Clicked!");
				cardLayout.show(layeredPane, "panel7");
			}
		});
		menu_Jpanel.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("DAILY");
		btnNewButton_7.setBounds(10, 398, 286, 50);
		btnNewButton_7.setBorderPainted(false);
		btnNewButton_7.setForeground(Color.ORANGE);
		btnNewButton_7.setBackground(Color.DARK_GRAY);
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Clicked!");
				cardLayout.show(layeredPane, "panel8");
			}
		});
		menu_Jpanel.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("USERS");
		btnNewButton_8.setBounds(10, 446, 286, 50);
		btnNewButton_8.setBorderPainted(false);
		btnNewButton_8.setForeground(Color.ORANGE);
		btnNewButton_8.setBackground(Color.DARK_GRAY);
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Clicked!");
				cardLayout.show(layeredPane, "panel9");
			}
		});
		menu_Jpanel.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("ACITIVITY LOG");
		btnNewButton_9.setBorderPainted(false);
		btnNewButton_9.setBounds(10, 494, 286, 50);
		btnNewButton_9.setForeground(Color.ORANGE);
		btnNewButton_9.setBackground(Color.DARK_GRAY);
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Clicked!");
				cardLayout.show(layeredPane, "panel10");
			}
		});
		menu_Jpanel.add(btnNewButton_9);

		


		
	}
	
	public  void logo() {
		
	}
	
	
	public void usertaskbar() {
	}
	

	public void login()	{
		
	}
	
	public void logout() {
		
	}
	
	public void dashboard() {
		
	}

	public void employee() {
		
	}
	
	public void department() {
		
	}
	
	public void attendance() {
		
	}
	
	public void leave() {
		
	}
	
	public void payroll() {
		
	}
	
	public void holiday() {
		
	}
	
	public void daily() {
		
	}
	
	public void setting() {
		
	}
	
	public void users() {
		
	}
	
	public void acitivity_log() {
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
