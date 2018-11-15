package app;
//wyplata
import java.awt.event.*;
import javax.swing.*;
import infoBox.InfoBox;
import bankomat.Bankomat;



class Button02Wyplac extends JButton implements ActionListener, InputBox {
	
	private InfoBox infoBox = new InfoBox();
	private Bankomat bankomat1;
	private double kwota;
	
	Button02Wyplac() {
		super("Wyp³aæ");
		addActionListener(this);
	}

	Button02Wyplac(Bankomat bankomat1) {
		super("Wyp³aæ");
		this.bankomat1 = bankomat1;
		addActionListener(this);
	}
	      
	@Override
	public void actionPerformed(ActionEvent e) {
		this.kwota=inputBox();
		if(this.kwota!=-1) {
			bankomat1.wyplata(this.kwota);
		} else 
			infoBox.InfoBox("Blad", "Rezultat");
	}
}
