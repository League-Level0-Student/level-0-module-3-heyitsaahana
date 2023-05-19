
package _99_extra;

import javax.swing.JOptionPane;

public class BananaQuiz
{
	
	public static void main(String[] args)
	{
		//1. ask the user if they like bananas
	String x=	JOptionPane.showInputDialog("do you like bananas?" );
		//2. if they say no, 
			//tell them they are crazy 
			//and end quiz
	if(x.equals("no")) {
		JOptionPane.showMessageDialog(null,"You are crazy, this quiz is offically done for you!");
	}
		//3. if they say yes
		//	ask them what is their favorite hobby
		//	show a pop up that says "<your hobby> is much better with bananas!"
	else if(x.contentEquals("yes")) {
		String w=JOptionPane.showInputDialog("What is your favorite hobby?");
		JOptionPane.showMessageDialog(null,w+ " is much better with bananas!");
	}else{
		JOptionPane.showMessageDialog(null,"You are bananas!!!!");
		
	}

		//4. OPTIONAL: if they say something other than "yes?" or "no?"
		//	show a pop up that says "You are bananas!?"
	
	
	}

}
