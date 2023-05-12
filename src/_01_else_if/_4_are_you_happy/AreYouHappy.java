package _01_else_if._4_are_you_happy;

import javax.swing.JOptionPane;

public class AreYouHappy {
	
	
	public static void main(String[] args) {
		
		String x=JOptionPane.showInputDialog("Are You Happy");
		if(x.equals ("yes")) {
			JOptionPane.showMessageDialog(null,"Keep doing whatever you are doing");
		}
		if(x.equals("no")) {
			String a=JOptionPane.showInputDialog("Do you want to be happy?");
			if(a.equals("no")) {
				JOptionPane.showMessageDialog(null,"Keep doing whatever you are doing");
			}
			if (a.equals("yes")) {
				JOptionPane.showMessageDialog(null,"change something");
			}
			
			
			
		}
		
		
		
	}

} 


