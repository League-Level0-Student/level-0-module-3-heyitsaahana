
package _01_else_if._1_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;


public class RobotColorChooser {
	public static void main(String[] args) {

		//1. Create a new Robot
		Robot rob=new Robot();
		rob.setSpeed(30);
		for(int y=0;y<15;y++) {
		//2. Make the robot draw a shape (this will take more than one line of code)
		rob.penDown();
		rob.move(200);
		rob.turn(90);
		rob.move(200);
		rob.turn(90);
		rob.move(200);
		rob.turn(90);
		rob.move(200);;
		//3. Set the pen width to 10
		rob.setPenWidth(10);
		//4. Ask the user what color pen they would like the robot to draw with
			String x=JOptionPane.showInputDialog("what color pen would you like the robot to draw with red,blue,green,or pink");
			//5. Use an if/else statement to set the pen color that the user requested

			if(x.equals("red")) {
				rob.setPenColor(Color.red);
			}
			if(x.equals("blue")) {
				rob.setPenColor(Color.blue);
			}
			if(x.equals("green")) {
				rob.setPenColor(Color.green);
			}
            if(x.equals("pink")) {
            	rob.setPenColor(Color.PINK);
            }


			//6. If the user doesn't enter anything, choose a random color
			if(x.equals("i dont know")) {
				rob.setRandomPenColor();
			}

			//7. Put a loop around your code so that you keep asking the user for more colors & drawing them






		}
	}
}
