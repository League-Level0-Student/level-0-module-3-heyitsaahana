
package _01_else_if._3_high_low;

import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {

		public static void main(String[] args) {
			// 3. Change this line to give you a random number between 1 - 100. 
		String g= int int random = new Random().nextInt(101);
			for(int a=0;a<11;a=a++) {
			// 2. Print out the random variable above
			 random=new Random().nextInt(5);
			// 11. Repeat steps 1 to 10 ten times
				// 1. Ask the user for a guess using a pop-up window, and save their response 
				String x=JOptionPane.showInputDialog("Enter your guess of what my number could be");
					// 4. Convert the users’ answer to an int (Integer.parseInt(string))
					Integer.parseInt(x);
					// 5. if the guess is correct
					if(x==g) {
						JOptionPane.showMessageDialog(null,"Congratulations you win");
					}
						// 6. Win
						// 12. Use "System.exit(0);" to quit the game if the user guessed the right answer.
					if(x==g) {
						System.exit(0);
					}
					
					// 7. if the guess is high
					if(x>g) {
						JOptionPane.showMessageDialog(null,"Your guess is to high");
					}
						// 8. Tell them it's too high
					// 9. if the guess is low
						// 10. Tell them it's too low
				 
			}
		
				// 13. Tell them they lose
				JOptionPane.showMessageDialog(null,"YOU LOSE");
			}

}


