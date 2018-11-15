package app;

import java.awt.*;

import javax.swing.JButton;
import javax.swing.JPanel;

import bankomat.Bankomat;
import bankomat.Karta;


public class ButtonPanel extends JPanel {
	public static final int HEIGHT = 100;
	public static final int WIDTH = 300;

	private JButton b1,b2,b3,b4,b5,b6;
	
	public ButtonPanel() {
		
	}

	public ButtonPanel(Bankomat bankomat1, Karta karta) {
		b1 = new Button01WsunKarte(bankomat1,karta);
		b2 = new Button02Wyplac(bankomat1);
		b3 = new Button03Wplac(this, bankomat1);
		b4 = new Button04StanKonta(bankomat1);
		b5 = new Button05Trasakcje(bankomat1);
		b6 = new Button06Info(bankomat1);
		
		setLayout(new GridLayout(6,1));
		setPreferredSize(new Dimension(300, 300));
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
	}
}
