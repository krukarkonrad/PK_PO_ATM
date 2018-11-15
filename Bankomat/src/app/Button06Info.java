package app;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import bankomat.Bankomat;


public class Button06Info extends JButton implements ActionListener {

private Bankomat bankomat1;
	
	Button06Info() {
		super("Cena");
		addActionListener(this);
	}

	Button06Info(Bankomat bankomat1) {
		super("Info");
		this.bankomat1 = bankomat1;
		addActionListener(this);
	}
	
	
    public static void infoBox(String infoMessage, String titleBar)
    {
        JOptionPane.showMessageDialog(null, infoMessage, "InfoBox: " + titleBar, JOptionPane.INFORMATION_MESSAGE);
    }
        
    
	@Override
	public void actionPerformed(ActionEvent e) {
		bankomat1.cenaPrad();
	}
	
}
