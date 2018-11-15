package app;

//WPLATA
import java.awt.event.*;
import javax.swing.*;
import infoBox.InfoBox;
import bankomat.Bankomat;

class FirstButton extends JButton implements ActionListener, InputBox {

	private InfoBox infoBox = new InfoBox();
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
   
    
	@Override
	public void actionPerformed(ActionEvent e) {
		this.kwota=inputBox();
		if(this.kwota!=-1) {
			bankomat1.wplata(this.kwota);
		}else
			infoBox.InfoBox("Blad", "Rezultat");
	}
}
