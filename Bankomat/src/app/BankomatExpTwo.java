package app;

import javax.swing.JOptionPane;


public class BankomatExpTwo extends Exception {
	
	public BankomatExpTwo () {
		infoBox("Pin za krótki","Blad");
	}

    public static void infoBox(String infoMessage, String titleBar)
    {
        JOptionPane.showMessageDialog(null, infoMessage, "InfoBox: " + titleBar, JOptionPane.INFORMATION_MESSAGE);
    }
}