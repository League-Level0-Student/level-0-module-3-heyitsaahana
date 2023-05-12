package _01_else_if._5_own_adventure;

import javax.swing.JOptionPane;

public class OwnAdventure {
	public static void main(String[] args) {
		String y=JOptionPane.showInputDialog("Would you like something good or bad to the character?");
		if(y.equals("good")) {
JOptionPane.showMessageDialog(null,"She woke up right on time to go to the first day of school.She got ready and left the house to wait for the bus to pick her up. Ths bus was on time");
		}
		if(y.equals("bad")) {
			
JOptionPane.showMessageDialog(null,"She woke up late for the first day of school and only had 5 minutes to get ready.She was late for the bus so she had to walk to school in the burning sun and heat .");
		}
		String h=JOptionPane.showInputDialog("Would you like the teacher in class to be mean or nice?");
			if(h.equals("mean")) {
				JOptionPane.showMessageDialog(null,"As soon as i walked inside of class the teacher yelled at us to get our textbooks out and start reading page 209");
			}
		if(h.equals("nice")) {
			JOptionPane.showMessageDialog(null," As soon as I walked in the class the teacher gave us candy");
		}
		String a=JOptionPane.showInputDialog(null," Would you like the character to pass or fail her test");
		     if(a.equals("fail")) {
		    	 JOptionPane.showMessageDialog(null,"The teacher gave us a test to see how much we know and i got a 10%");
		     }
		      if(a.equals("pass")) {
		    	  JOptionPane.showMessageDialog(null,"The teacher gave us a test to see how much we know and i got a 100%");
		      }
		 String s=JOptionPane.showInputDialog("Should the character get lots of homework or no homework at all");
		          if(s.equals("lots")) {
		        	  JOptionPane.showMessageDialog(null,"The day ended with 100 pages of homework for me to do");
		          }
		          if(s.equals("none")) {
		        	  JOptionPane.showMessageDialog(null,"The day ended great with no homework fot me to do");
		          }
		          JOptionPane.showMessageDialog(null,"THE END");
		          
	}
}
