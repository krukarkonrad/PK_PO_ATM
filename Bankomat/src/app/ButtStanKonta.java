package app;

import java.awt.event.*;
import javax.swing.*;
import bankomat.Bankomat;

public class ButtStanKonta extends JButton implements ActionListener{

	private Bankomat bankomat1;
	
	ButtStanKonta() {
		super("Stan");
		addActionListener(this);
	}

	ButtStanKonta(Bankomat bankomat1) {
		super("Stan Konta");
		this.bankomat1 = bankomat1;
		addActionListener(this);
	}      
    
	@Override
	public void actionPerformed(ActionEvent e) {
		bankomat1.wyswietlStanKonta();
	}
	
}
