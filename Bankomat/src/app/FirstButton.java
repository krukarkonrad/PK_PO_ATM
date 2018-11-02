package app;

//WPLATA
import java.awt.event.*;
import javax.swing.*;

import bankomat.Bankomat;

class FirstButton extends JButton implements ActionListener, InputBox {

	private JPanel buttonPanel;
	private Bankomat bankomat1;
	private double kwota;
	private boolean ctrl;
	
	FirstButton(JPanel buttonPanel) {
		super("Wp³aæ");
		this.buttonPanel = buttonPanel;
		addActionListener(this);
	}

	FirstButton(JPanel buttonPanel, Bankomat bankomat1) {
		super("Wp³aæ");
		this.buttonPanel = buttonPanel;
		this.bankomat1 = bankomat1;
		addActionListener(this);
	}

    public static void infoBox(String infoMessage, String titleBar)
    {
        JOptionPane.showMessageDialog(null, infoMessage, "InfoBox: " + titleBar, JOptionPane.INFORMATION_MESSAGE);
    }
    
    /*
    public boolean inputBox() {
    	String temp;
    	temp= JOptionPane.showInputDialog(null,"Wprowadz kwote");
    	try {
    	this.kwota = Double.parseDouble(temp);
    	}catch (NumberFormatException e) {
    		infoBox("Proszê o cyfry", "Blad");
    		ctrl=false;
    		return(ctrl);
    	}
    	ctrl = true;
    	return(ctrl);
    }
    */
    
	@Override
	public void actionPerformed(ActionEvent e) {
		this.kwota=inputBox();
		if(this.kwota!=-1) {
			String info = bankomat1.wplata(this.kwota);
			infoBox(info, "Rezultat");
		}else
			infoBox("Blad", "Rezultat");
	}
}
