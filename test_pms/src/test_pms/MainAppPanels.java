package test_pms;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.text.DefaultEditorKit.CopyAction;

import java.util.Random;
import javax.swing.border.LineBorder;
import javax.swing.border.BevelBorder;

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
		Jpanel.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		Jpanel.setBounds(326, 101, 1052, 545);
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
		lblNewLabel_3.setBounds(310, 190, 490, 117);
		panel_1_1.add(lblNewLabel_3);
		lblNewLabel_3.setIcon(new ImageIcon(img_welcome));
		
		JPanel dashboard = new JPanel();
		dashboard.setBackground(Color.white);
		layeredPane.add(dashboard, "panel1");
		dashboard.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("DASHBOARD");
		lblNewLabel_1.setOpaque(true);
		lblNewLabel_1.setBackground(Color.ORANGE);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_1.setBounds(10, 11, 117, 40);
		dashboard.add(lblNewLabel_1);
		
		JPanel total_emp_display = new JPanel();
		total_emp_display.setBounds(33, 75, 214, 130);
		dashboard.add(total_emp_display);
		total_emp_display.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Total Employees");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(10, 92, 125, 27);
		total_emp_display.add(lblNewLabel_2);
		
		JLabel lblNewLabel_4 = new JLabel("2");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(10, 11, 46, 47);
		total_emp_display.add(lblNewLabel_4);
		
		
		//dashboard
		
		Image img_emp  = new ImageIcon(this.getClass().getResource("/employees.png")).getImage();
		Image img_dept  = new ImageIcon(this.getClass().getResource("/department1.png")).getImage();
		Image img_prsnt  = new ImageIcon(this.getClass().getResource("/present.png")).getImage();
		Image img_onleave  = new ImageIcon(this.getClass().getResource("/onleavetoday.png")).getImage();
		
		JLabel img_1 = new JLabel("");
		img_1.setHorizontalAlignment(SwingConstants.CENTER);
		img_1.setFont(new Font("Tahoma", Font.PLAIN, 35));
		img_1.setBounds(158, 11, 46, 47);
		total_emp_display.add(img_1);
		img_1.setIcon(new ImageIcon(img_emp));
		
		JPanel total_dept_display = new JPanel();
		total_dept_display.setBounds(287, 75, 214, 130);
		dashboard.add(total_dept_display);
		total_dept_display.setLayout(null);
		
		JLabel lblNewLabel_2_1 = new JLabel("Total Department");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_1.setBounds(10, 92, 125, 27);
		total_dept_display.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_4_1 = new JLabel("5");
		lblNewLabel_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lblNewLabel_4_1.setBounds(10, 11, 46, 47);
		total_dept_display.add(lblNewLabel_4_1);
		
		JLabel img_1_1 = new JLabel("");
		img_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		img_1_1.setFont(new Font("Tahoma", Font.PLAIN, 35));
		img_1_1.setBounds(158, 11, 46, 47);
		total_dept_display.add(img_1_1);
		img_1_1.setIcon(new ImageIcon(img_dept));
		
		JPanel present_today = new JPanel();
		present_today.setBounds(541, 75, 214, 130);
		dashboard.add(present_today);
		present_today.setLayout(null);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Present Today");
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_1_1.setBounds(10, 92, 125, 27);
		present_today.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("0");
		lblNewLabel_4_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1_1.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lblNewLabel_4_1_1.setBounds(10, 11, 46, 47);
		present_today.add(lblNewLabel_4_1_1);
		
		JLabel img_1_2 = new JLabel("");
		img_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		img_1_2.setFont(new Font("Tahoma", Font.PLAIN, 35));
		img_1_2.setBounds(158, 11, 46, 47);
		present_today.add(img_1_2);
		img_1_2.setIcon(new ImageIcon(img_prsnt));
		
		JPanel on_leave_today = new JPanel();
		on_leave_today.setLayout(null);
		on_leave_today.setBounds(795, 75, 214, 130);
		dashboard.add(on_leave_today);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("On Leave Today");
		lblNewLabel_2_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_1_1_1.setBounds(10, 92, 125, 27);
		on_leave_today.add(lblNewLabel_2_1_1_1);
		
		JLabel lblNewLabel_4_1_2 = new JLabel("0");
		lblNewLabel_4_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1_2.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lblNewLabel_4_1_2.setBounds(10, 11, 46, 47);
		on_leave_today.add(lblNewLabel_4_1_2);
		
		JLabel img_1_3 = new JLabel("");
		img_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		img_1_3.setFont(new Font("Tahoma", Font.PLAIN, 35));
		img_1_3.setBounds(158, 11, 46, 47);
		on_leave_today.add(img_1_3);
		img_1_3.setIcon(new ImageIcon(img_onleave));
		
		//employee
		
		Image img_add  = new ImageIcon(this.getClass().getResource("/add_emp.png")).getImage();
		Image img_mng = new ImageIcon(this.getClass().getResource("/mng_emp.png")).getImage();
		
		JPanel employee = new JPanel();
		employee.setBackground(Color.white);
		layeredPane.add(employee, "panel2");
		employee.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(205, 105, 239, 257);
		employee.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setBounds(7, 0, 229, 257);
		panel.add(lblNewLabel_5);
		lblNewLabel_5.setIcon(new ImageIcon(img_add));
		
		JPanel panel_11 = new JPanel();
		panel_11.setBounds(595, 105, 239, 257);
		employee.add(panel_11);
		panel_11.setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setBounds(0, 0, 239, 257);
		panel_11.add(lblNewLabel_6);
		lblNewLabel_6.setIcon(new ImageIcon(img_mng));
		
		JPanel panel_12 = new JPanel();
		panel_12.setBounds(518, 81, 4, 299);
		employee.add(panel_12);
		panel_12.setBackground(Color.orange);
		
		JLabel lblNewLabel_1_1 = new JLabel("EMPLOYEE");
		lblNewLabel_1_1.setOpaque(true);
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_1_1.setBackground(Color.ORANGE);
		lblNewLabel_1_1.setBounds(10, 11, 117, 40);
		employee.add(lblNewLabel_1_1);
		
		JPanel department = new JPanel();
		department.setBackground(Color.RED);
		layeredPane.add(department, "panel3");
		department.setLayout(null);
		
		JLabel lblNewLabel_1_2 = new JLabel("DEPARTMENT");
		lblNewLabel_1_2.setOpaque(true);
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_1_2.setBackground(Color.ORANGE);
		lblNewLabel_1_2.setBounds(10, 11, 117, 40);
		department.add(lblNewLabel_1_2);
		
		JPanel attendance = new JPanel();
		attendance.setBackground(Color.YELLOW);
		layeredPane.add(attendance, "panel4");
		attendance.setLayout(null);
		
		JLabel lblNewLabel_1_3 = new JLabel("ATTENDANCE");
		lblNewLabel_1_3.setOpaque(true);
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_1_3.setBackground(Color.ORANGE);
		lblNewLabel_1_3.setBounds(10, 11, 117, 40);
		attendance.add(lblNewLabel_1_3);
		
		JPanel leave = new JPanel();
		leave.setBackground(Color.PINK);
		layeredPane.add(leave, "panel5");
		leave.setLayout(null);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("LEAVE");
		lblNewLabel_1_3_1.setOpaque(true);
		lblNewLabel_1_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_1_3_1.setBackground(Color.ORANGE);
		lblNewLabel_1_3_1.setBounds(10, 11, 117, 40);
		leave.add(lblNewLabel_1_3_1);
		
		JPanel payroll = new JPanel();
		payroll.setBackground(Color.BLACK);
		layeredPane.add(payroll, "panel6");
		payroll.setLayout(null);
		
		JLabel lblNewLabel_1_3_1_1 = new JLabel("PAYROLL");
		lblNewLabel_1_3_1_1.setOpaque(true);
		lblNewLabel_1_3_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3_1_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_1_3_1_1.setBackground(Color.ORANGE);
		lblNewLabel_1_3_1_1.setBounds(10, 11, 117, 40);
		payroll.add(lblNewLabel_1_3_1_1);
		
		JPanel holiday = new JPanel();
		holiday.setBackground(new Color(0, 128, 0));
		layeredPane.add(holiday, "panel7");
		
		JPanel daily = new JPanel();
		daily.setBackground(new Color(30, 144, 255));
		layeredPane.add(daily, "panel8");
		
		JPanel users = new JPanel();
		users.setBackground(new Color(128, 0, 0));
		layeredPane.add(users, "panel9");
		
		JPanel acitivity_log = new JPanel();
		acitivity_log.setBackground(new Color(255, 222, 173));
		layeredPane.add(acitivity_log, "panel10");
		
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
