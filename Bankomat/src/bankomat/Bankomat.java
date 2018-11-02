package bankomat;

import java.util.List;

import javax.swing.JOptionPane;

import java.time.LocalDate;
import java.util.ArrayList;

public class Bankomat extends UrzadzenieElektrczne {
    private Karta karta;
    private String bank;
    private String lokalizacja;
    private Transakcja[] archiwum;
    private int index = -1;
    private  int haslo;
    boolean exist = false;
    String info;
    List<String> arch = new ArrayList<String>();
    
    public Bankomat(String bank,String lokalizacja, int haslo, int maxLiczbaTransakcji) {
        this.bank=bank;
        this.lokalizacja=lokalizacja;
        this.haslo=haslo;
        this.archiwum = new Transakcja[maxLiczbaTransakcji];
    }
   
    private void dodajTransakcje(TransakcjaBankomat transakcja) {
        if(index+1<archiwum.length) {
            arch.add(transakcja.toString());
        	index++;
        }

        else
            System.out.println("Brak miejsca na transakcje");
    }
   
    public static void infoBox(String infoMessage, String titleBar)
    {
        JOptionPane.showMessageDialog(null, infoMessage, "InfoBox: " + titleBar, JOptionPane.INFORMATION_MESSAGE);
    }
    
   
    public String toString() {
        System.out.println("WSZYSTKIE TRANSAKCJE");
        if(index == -1) {
            return "Nie ma transakcji";
           
        }
        else {
        String wynik="";
        for(int i=0;i<index;i++)
            wynik+= archiwum[i].toString()+"\n";
        return wynik;
        }
    }
   
    public void wydrukujTransakcje(LocalDate data, int haslo) {
        if(this.haslo==haslo) {
      
            
            if(this.exist==true) {
                System.out.println("Transakcje z dnia "+ data);
                for(int i=0;i<=index;i++) {
                	infoBox(arch.get(i), "Transakcja "+i);
                }
            }
            if(this.exist == false) infoBox("Nie ma transakcji w tym dniu","Transakcje");
        }
        else
        	infoBox("Z³e has³o, brak dostepu","Transakcje");
    }
   
   
    public void reset(int haslo) {
        if(this.haslo == haslo) {
            int tmp = archiwum.length;
            archiwum = new TransakcjaBankomat[tmp];
            this.index = -1;
        }
        else
            System.out.println("Niepoprawne haslo");
    }
   
    public void wlozKarte(Karta karta,int pin) {
        this.karta = karta;
        karta.odblokuj(pin);
    }
    /*
    public void wplata(double kwota) {
        if(karta!=null && karta.isOdblokowana()) {
            if(!karta.getKonto().getBank().equals(this.bank))
                kwota = kwota * 0.95;
            karta.getKonto().wplata(kwota);
            dodajTransakcje(new TransakcjaBankomat("wplata",kwota,karta.getKonto()));
        }
        else
            System.out.println("Wloz karte");
    }
    */
    public String wplata(double kwota) {
        if(karta!=null && karta.isOdblokowana()) {
            if(karta.getKonto().getBank().equals(this.bank)) {
                karta.getKonto().wplata(kwota);
                dodajTransakcje(new TransakcjaBankomat("wplata",kwota,karta.getKonto()));
                this.exist=true;
            }
            else {
                kwota = kwota * 0.95;
                karta.getKonto().wplata(kwota);
                dodajTransakcje(new TransakcjaBankomat("wplata z innego banku ",kwota,karta.getKonto()));
            }
            return("Wyplacono " + kwota );
        }
        else
            return("Wloz karte");
   
    }
    public String wyplata(double kwota) {
        if(karta!=null && karta.isOdblokowana()) {
            if(!karta.getKonto().getBank().equals(this.bank))
                kwota = kwota * 1.05;
            String msg = karta.getKonto().wyplata(kwota);   
            dodajTransakcje(new TransakcjaBankomat("wyplata",kwota,karta.getKonto()));
            this.exist=true;
            return(msg);
            
        }
        else
            return("Wloz karte");
    }
   
   
    public String wyswietlStanKonta() {
        if(karta!=null && karta.isOdblokowana()) {
            return("Stan konta wynosi: " + karta.getKonto().getSaldo());
        }
        else
            return("Odblokuj karte zanim wyswietlisz stan konta");
    }

	@Override
	public void cenaPrad() {
		infoBox("Cena pradu wynosi 1.65 z³", "Cena pradu");	
		infoBox("Wersja v1.0", "Info");
	}

}
