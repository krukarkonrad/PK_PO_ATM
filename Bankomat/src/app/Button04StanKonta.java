package app;

import java.awt.event.*;
import javax.swing.*;
import bankomat.Bankomat;


public class Button04StanKonta extends JButton implements ActionListener{

	private Bankomat bankomat1;
	
	Button04StanKonta() {
		super("Stan");
		addActionListener(this);
	}

	Button04StanKonta(Bankomat bankomat1) {
		super("Stan Konta");
		this.bankomat1 = bankomat1;
		addActionListener(this);
	}      
    
	@Override
	public void actionPerformed(ActionEvent e) {
		bankomat1.wyswietlStanKonta();
	}
	
}
