package app;
//wyplata
import java.awt.event.*;
import javax.swing.*;

import bankomat.Bankomat;


class SecondButton extends JButton implements ActionListener {

	private Bankomat bankomat1;
	private double kwota;
	private boolean ctrl;
	
	SecondButton() {
		super("Wyp³aæ");
		addActionListener(this);
	}

	SecondButton(Bankomat bankomat1) {
		super("Wyp³aæ");
		this.bankomat1 = bankomat1;
		addActionListener(this);
	}
	
    public static void infoBox(String infoMessage, String titleBar)
    {
        JOptionPane.showMessageDialog(null, infoMessage, "InfoBox: " + titleBar, JOptionPane.INFORMATION_MESSAGE);
    }
    
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
    
    
	@Override
	public void actionPerformed(ActionEvent e) {
		inputBox();
		if(ctrl==true) {
			String info = bankomat1.wyplata(this.kwota);
			infoBox(info, "Rezultat");
		} else 
			infoBox("Blad", "Rezultat");
	}
}
