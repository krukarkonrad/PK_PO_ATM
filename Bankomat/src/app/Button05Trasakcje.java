package app;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import bankomat.Bankomat;


public class Button05Trasakcje extends JButton implements ActionListener{

	private Bankomat bankomat1;
	private boolean ctrl;
	private int pin;
	
	Button05Trasakcje() {
		super("Transakcje");
		addActionListener(this);
	}

	Button05Trasakcje(Bankomat bankomat1) {
		super("Transakcje");
		this.bankomat1 = bankomat1;
		addActionListener(this);
	}
	
    public boolean inputBox() {
    	String temp;
    	temp= JOptionPane.showInputDialog(null,"Wprowadz haslo");
    	try {
    	this.pin = Integer.parseInt(temp);
    	}catch (NumberFormatException e) {
    		infoBox("Proszê o cyfry", "Blad");
    		ctrl=false;
    		return(ctrl);
    	}
    	ctrl = true;
    	return(ctrl);
    }
    
    public static void infoBox(String infoMessage, String titleBar)
    {
        JOptionPane.showMessageDialog(null, infoMessage, "InfoBox: " + titleBar, JOptionPane.INFORMATION_MESSAGE);
    }
        
    
	@Override
	public void actionPerformed(ActionEvent e) {
		inputBox();
		LocalDate data = LocalDate.now();
		bankomat1.wydrukujTransakcje(data,pin);
	}
	
}