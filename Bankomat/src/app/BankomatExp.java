package app;

import javax.swing.JOptionPane;

public class BankomatExp extends Exception {
	
	public BankomatExp () {
		infoBox("Pin = 0","Blad");			
		}

	    public static void infoBox(String infoMessage, String titleBar)
	    {
	        JOptionPane.showMessageDialog(null, infoMessage, "InfoBox: " + titleBar, JOptionPane.INFORMATION_MESSAGE);
	    }
	}

