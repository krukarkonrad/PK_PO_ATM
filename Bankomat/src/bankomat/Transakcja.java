package bankomat;

import java.time.LocalDate;

public class Transakcja {
    private String rodzaj;
    private double kwota;
    private LocalDate data;
    
    
    //KONSTRUKTOR
    
    public Transakcja(String rodzaj, double kwota) {
        this.rodzaj = rodzaj;
        this.kwota = kwota;
        this.data = LocalDate.now();
    }

    
    //GETTERy/SETTERy
	public String getRodzaj() {
		return rodzaj;
	}

	public void setRodzaj(String rodzaj) {
		this.rodzaj = rodzaj;
	}

	public double getKwota() {
		return kwota;
	}

	public void setKwota(double kwota) {
		this.kwota = kwota;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}
       
	public String toString() {
		return "Transkajca: Data: "+ data + " rodzaj: "
				+ "" + rodzaj + " kwota " + kwota + " z³";
	}
	
}
