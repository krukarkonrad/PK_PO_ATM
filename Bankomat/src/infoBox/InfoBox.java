package infoBox;

import javax.swing.JOptionPane;


public class InfoBox {
	
    public void InfoBox(String infoMessage, String titleBar)
    {
        JOptionPane.showMessageDialog(null, infoMessage, "InfoBox: " + titleBar, JOptionPane.INFORMATION_MESSAGE);
    }
    
    /*
     NAD KLAS¥
     import infoBox.InfoBox;
 
 	 W KLASIE
     private InfoBox infoBox = new InfoBox();

     U¯YWAÆ
     infoBox.InfoBox("TEKST", "NAZWA_OKIENKA")
     */
}
