package app;
//wyplata
import java.awt.event.*;
import javax.swing.*;
import infoBox.InfoBox;
import bankomat.Bankomat;


class SecondButton extends JButton implements ActionListener {
	
	private InfoBox infoBox = new InfoBox();
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
	   
    public boolean inputBox() {
    	String temp;
    	temp= JOptionPane.showInputDialog(null,"Wprowadz kwote");
    	try {
    	this.kwota = Double.parseDouble(temp);
    	}catch (NumberFormatException e) {
    		infoBox.InfoBox("Proszê podaæ cyfry", "Blad");
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
			bankomat1.wyplata(this.kwota);
		} else 
			infoBox.InfoBox("Blad", "Rezultat");
	}
}
