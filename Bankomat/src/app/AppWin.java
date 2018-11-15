package app;

import java.awt.EventQueue;
import java.time.LocalDate;

import bankomat.Bankomat;
import bankomat.Karta;
import bankomat.Konto;


public class AppWin {
	
	public static void main(String[] args) {
		
		LocalDate data;
        Konto konto1 = new Konto("PKO", 666666, "Konrad", 100.0);  
        Karta karta1 = new Karta(konto1, 1111);
        Bankomat bankomat1 = new Bankomat("PKO","Krakow", 100, 3333);
  
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				new AppOkn(bankomat1,karta1);
			}
		});
		
	}
}
