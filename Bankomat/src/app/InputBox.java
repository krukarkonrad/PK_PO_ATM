package app;

import javax.swing.JOptionPane;


public interface InputBox {
	
    public static void infoBox(String infoMessage, String titleBar)
    {
        JOptionPane.showMessageDialog(null, infoMessage, "InfoBox: " + titleBar, JOptionPane.INFORMATION_MESSAGE);
    }
	
    public default double inputBox() {
    	String temp= JOptionPane.showInputDialog(null,"Wprowadz kwote");
    	double kwota;
    	try {
    	kwota = Double.parseDouble(temp);
    	}catch (NumberFormatException e) {
    		infoBox("Prosz� o cyfry lub liczb� dodatni�", "Blad");

    		return(-1);
    	}
    	return(kwota);
    }

}
