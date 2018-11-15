package app;

import java.awt.*;

import javax.swing.JButton;
import javax.swing.JPanel;

import bankomat.Bankomat;
import bankomat.Karta;


public class ButtonPanel extends JPanel {
	public static final int HEIGHT = 100;
	public static final int WIDTH = 300;

	private JButton wplata;
	private JButton wyplata;
	private JButton zatwierdz;
	private JButton stanKonta;
	private JButton WysTran;
	private JButton info;
	
	public ButtonPanel() {
		
	}

	public ButtonPanel(Bankomat bankomat1, Karta karta) {
		wplata = new Button03Wplac(this, bankomat1);
		wyplata	= new SecondButton(bankomat1);
		zatwierdz= new Button01WsunKarte(bankomat1,karta);
		stanKonta = new Button04StanKonta(bankomat1);
		WysTran = new Button05Trasakcje(bankomat1);
		info = new Button06Info(bankomat1);
		
		setLayout(new GridLayout(6,1));
		setPreferredSize(new Dimension(WIDTH, HEIGHT));
		add(zatwierdz);
		add(wyplata);
		add(wplata);
		add(stanKonta);
		add(WysTran);
		add(info);
	}
}
