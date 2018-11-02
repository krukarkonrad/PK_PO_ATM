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
		
       /* bankomat1.wplata(100);
        bankomat1.wlozKarte(karta1, 1111);
        bankomat1.wplata(100);
        bankomat1.wyswietlStanKonta();
        bankomat1.wyplata(100);
        bankomat1.wyswietlStanKonta();
		*/
	}
}
