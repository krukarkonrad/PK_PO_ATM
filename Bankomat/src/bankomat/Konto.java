package bankomat;


public class Konto {
    private String wlasciciel;
    private int numer;
    private String bank;
    private double saldo;
    private Transakcja[] archiwum;
    private int index = -1;
    private int maxLiczbaTransakcji = 100;
   
   
    public Konto(String bank,int numer, String wlasciciel, double saldo ) {
        this.wlasciciel  = wlasciciel;
        this.numer = numer;
        this.bank=bank;
        this.saldo = saldo;
        this.archiwum = new Transakcja[maxLiczbaTransakcji];
    }
   
   
    public String toString() {
        return "Konto w banku " + bank + " o numerze " + numer +", saldzie " + saldo + " , wlasciciel - " + wlasciciel;
    }
   
   
    private void dodajTransakcje(Transakcja transakcja) {
        if(index + 1 < maxLiczbaTransakcji)
        archiwum[++index] = transakcja;
        else
            System.out.println("Brak miejsca na transakcje");
       
    }
   
   
    public void wyswietlTransakcje() {
        for(int i =0; i<=index;i++) {
            System.out.println(archiwum[i]);
        }
    }
   
   
    public String wplata(double kwota) {
        saldo += kwota;
        dodajTransakcje(new Transakcja("wplata", kwota));
        return ("Wplacono " + kwota);
    }
   
   
    public String wyplata(double kwota) {
    if(saldo>=kwota) {
        saldo -= kwota;
        dodajTransakcje(new Transakcja("wyplata", kwota));
        return("Wyplacono " + kwota);
    }
    else
        return("Brak tylu srodkow na koncie");
    }
   
    public void przelew(double kwota,Konto konto) {
    if(saldo>=kwota) {
        this.saldo -=kwota;
        konto.saldo+= kwota;
        System.out.println("Przelano " + kwota);
        dodajTransakcje(new Transakcja("przelew", kwota));
    }
    else
        System.out.println("Nie masz wystarczajacych srodkow");
    }
 
 
    /**
     * @return the wlasciciel
     */
    public String getWlasciciel() {
        return wlasciciel;
    }
 
 
    /**
     * @param wlasciciel the wlasciciel to set
     */
    public void setWlasciciel(String wlasciciel) {
        this.wlasciciel = wlasciciel;
    }
 
 
    /**
     * @return the numer
     */
    public int getNumer() {
        return numer;
    }
 
 
    /**
     * @param numer the numer to set
     */
    public void setNumer(int numer) {
        this.numer = numer;
    }
 
 
    /**
     * @return the bank
     */
    public String getBank() {
        return bank;
    }
 
 
    /**
     * @param bank the bank to set
     */
    public void setBank(String bank) {
        this.bank = bank;
    }
 
 
    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }
 
 
    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
   
   
}
