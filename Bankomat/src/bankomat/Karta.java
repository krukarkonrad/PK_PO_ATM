package bankomat;

public class Karta {
    private Konto konto;
    private int pin;
    private boolean isOdblokowana;
   
   
    public Karta(Konto konto, int pin) {
        this.konto = konto;
        this.pin = pin;
        isOdblokowana = false;
    }
 
   
   
   
    public String odblokuj(int pin) {
        if(this.pin == pin) {
            isOdblokowana = true;
            return("Odblokowano karte ");
        }
        else
            return("Z³y pin");
    }

    		
    
    /**
     * @return the konto
     */
    public Konto getKonto() {
        return konto;
    }
 
 
    /**
     * @param konto the konto to set
     */
    public void setKonto(Konto konto) {
        this.konto = konto;
    }
 
 
    /**
     * @return the pin
     */
    public int getPin() {
        return pin;
    }
 
 
    /**
     * @param pin the pin to set
     */
    public void setPin(int pin) {
        this.pin = pin;
    }
 
 
    /**
     * @return the isOdblokowana
     */
    public boolean isOdblokowana() {
        return isOdblokowana;
    }
 
 
    /**
     * @param isOdblokowana the isOdblokowana to set
     */
    public void setOdblokowana(boolean isOdblokowana) {
        this.isOdblokowana = isOdblokowana;
    }
   
   
}
