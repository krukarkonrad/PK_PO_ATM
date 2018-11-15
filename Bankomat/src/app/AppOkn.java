package app;

import java.awt.Component;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import bankomat.Bankomat;
import bankomat.Karta;


public class AppOkn extends JFrame{
	
	public AppOkn() {
		super("Bankomat");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setSize(400, 400);
		setLocation(100, 50);
		
		JPanel buttonPanel = new ButtonPanel();
		add(buttonPanel);
		
		pack();
		setVisible(true);
	}

	public AppOkn(Bankomat bankomat1, Karta karta) {
		super("Bankomat");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLocation(500, 200);
		
		JPanel buttonPanel = new ButtonPanel(bankomat1, karta);
		add(buttonPanel);
		
		pack();
		setVisible(true);	
	}
	
}


