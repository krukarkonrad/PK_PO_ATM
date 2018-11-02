package bankomat;

import java.time.LocalDate;


public class TransakcjaBankomat extends Transakcja{
    private Konto konto;
    private LocalDate data;
   
   
    public TransakcjaBankomat(String rodzaj, double kwota, Konto konto) {
        super(rodzaj,kwota);
        this.data = LocalDate.now();
        this.konto = konto;
    }
   
    public String toString() {
        return "Transakcja: Data: "+data+ ", rodzaj- " + super.getRodzaj() + " na kwotê " + super.getKwota() + " z³, wlasciciel - " + konto.getWlasciciel();
    }
   
    
}