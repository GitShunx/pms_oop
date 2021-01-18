package test_pms;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.util.Random;

public class MainAppPanels extends JPanel implements ActionListener{
	
	
	static final int SCREEN_WIDTH = 1400;
	static final int SCREEN_HEIGTH = 700;
	static final int UNIT_SIZE = 25;
	static Color GREEN;

	
	

	MainAppPanels () 
	{
		
		
		
		this.setPreferredSize(new Dimension(1400, 668));
		setLayout(null);
		
		logo();
		menu_panel();
		usertaskbar();
		display();
		

		
	}
	
	

	//constructors
	
	public void menu_panel()	{
		JPanel menu_panel = new JPanel();
		menu_panel.setBounds(10, 91, 306, 566);
		menu_panel.setBackground(Color.darkGray);
		add(menu_panel);
		menu_panel.setLayout(null);
		{
			JPanel logo_panel = new JPanel();
			logo_panel.setBounds(10, 11, 286, 50);
			logo_panel.setBackground(Color.cyan);
			menu_panel.add(logo_panel);
			logo_panel.setLayout(null);
			
			JButton btnNewButton = new JButton("DASHBOARD");
			btnNewButton.setBounds(0, 0, 286, 50);
			logo_panel.add(btnNewButton);
		}
		{
			JPanel logo_panel = new JPanel();
			logo_panel.setBackground(Color.WHITE);
			logo_panel.setBounds(10, 61, 286, 50);
			menu_panel.add(logo_panel);
			logo_panel.setLayout(null);
			
			JButton btnNewButton_1 = new JButton("EMPLOYEE");
			btnNewButton_1.setBounds(0, 0, 286, 50);
			logo_panel.add(btnNewButton_1);
		}
		{
			JPanel logo_panel = new JPanel();
			logo_panel.setBackground(Color.WHITE);
			logo_panel.setBounds(10, 110, 286, 50);
			menu_panel.add(logo_panel);
			logo_panel.setLayout(null);
			
			JButton btnNewButton_2 = new JButton("DEPARTMENT");
			btnNewButton_2.setBounds(0, 0, 286, 50);
			logo_panel.add(btnNewButton_2);
		}
		{
			JPanel logo_panel = new JPanel();
			logo_panel.setBackground(Color.WHITE);
			logo_panel.setBounds(10, 160, 286, 50);
			menu_panel.add(logo_panel);
			logo_panel.setLayout(null);
			
			JButton btnNewButton_3 = new JButton("ATTENDANCE");
			btnNewButton_3.setBounds(0, 0, 286, 50);
			logo_panel.add(btnNewButton_3);
		}
		{
			JPanel logo_panel = new JPanel();
			logo_panel.setBackground(Color.WHITE);
			logo_panel.setBounds(10, 209, 286, 50);
			menu_panel.add(logo_panel);
			logo_panel.setLayout(null);
			
			JButton btnNewButton_4 = new JButton("LEAVE");
			btnNewButton_4.setBounds(0, 0, 286, 50);
			logo_panel.add(btnNewButton_4);
		}
		{
			JPanel logo_panel = new JPanel();
			logo_panel.setBackground(Color.WHITE);
			logo_panel.setBounds(10, 259, 286, 50);
			menu_panel.add(logo_panel);
			logo_panel.setLayout(null);
			
			JButton btnNewButton_5 = new JButton("PAYROLL");
			btnNewButton_5.setBounds(0, 0, 286, 50);
			logo_panel.add(btnNewButton_5);
		}
		{
			JPanel logo_panel = new JPanel();
			logo_panel.setBackground(Color.WHITE);
			logo_panel.setBounds(10, 308, 286, 50);
			menu_panel.add(logo_panel);
			logo_panel.setLayout(null);
			
			JButton btnNewButton_6 = new JButton("HOLIDAY");
			btnNewButton_6.setBounds(0, 0, 286, 50);
			logo_panel.add(btnNewButton_6);
		}
		{
			JPanel logo_panel = new JPanel();
			logo_panel.setBackground(Color.WHITE);
			logo_panel.setBounds(10, 358, 286, 50);
			menu_panel.add(logo_panel);
			logo_panel.setLayout(null);
			
			JButton btnNewButton_7 = new JButton("DAILY");
			btnNewButton_7.setBounds(0, 0, 286, 50);
			logo_panel.add(btnNewButton_7);
		}
		{
			JPanel logo_panel = new JPanel();
			logo_panel.setBackground(Color.WHITE);
			logo_panel.setBounds(10, 406, 286, 50);
			menu_panel.add(logo_panel);
			logo_panel.setLayout(null);
			
			JButton btnNewButton_8 = new JButton("USERS");
			btnNewButton_8.setBounds(0, 0, 286, 50);
			logo_panel.add(btnNewButton_8);
		}
		{
			JPanel logo_panel = new JPanel();
			logo_panel.setBackground(Color.WHITE);
			logo_panel.setBounds(10, 456, 286, 50);
			menu_panel.add(logo_panel);
			logo_panel.setLayout(null);
			
			JButton btnNewButton_9 = new JButton("ACITIVITY LOG");
			btnNewButton_9.setBounds(0, 0, 286, 50);
			logo_panel.add(btnNewButton_9);
		}
		{
			JPanel logo_panel = new JPanel();
			logo_panel.setBackground(Color.WHITE);
			logo_panel.setBounds(10, 506, 286, 50);
			menu_panel.add(logo_panel);
			logo_panel.setLayout(null);
			
			JButton btnNewButton_10 = new JButton("LOG OUT");
			btnNewButton_10.setBounds(0, 0, 286, 50);
			logo_panel.add(btnNewButton_10);
		}
		{
			
			
		}
		
	}
	
	public  void logo() {
		JPanel logo_panel = new JPanel();
		logo_panel.setBackground(Color.white);
		logo_panel.setBounds(10, 11, 306, 80);
		add(logo_panel);
		
	}
	
	public void display() {
		JPanel taskbar_user = new JPanel();
		taskbar_user.setBackground(Color.orange);
		taskbar_user.setBounds(316, 11, 1074, 80);
		add(taskbar_user);

	}
	
	public void usertaskbar() {
		JPanel display = new JPanel();
		display.setBackground(Color.DARK_GRAY);
		display.setBounds(316, 91, 1074, 566);
		add(display);
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
