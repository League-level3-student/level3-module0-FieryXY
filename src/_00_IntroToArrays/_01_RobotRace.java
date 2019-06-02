package _00_IntroToArrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
	public static void main(String[] args) {

	
		//2. create an array of 5 robots.
			Robot[] robotArr = new Robot[5];
		//3. use a for loop to initialize the robots.
			int nextX = 150;
		for(int i = 0; i < robotArr.length; i++) {
			//4. make each robot start at the bottom of the screen, side by side, facing up
			robotArr[i] = new Robot();
			robotArr[i].setY(300);
			robotArr[i].setX(nextX);
			nextX += 100;
		}
		//5. use another for loop to iterate through the array and make each robot move 
	    //   a random amount less than 50.
		boolean reachedTop = false;
		int roboNumber = -1;
		Random random = new Random();
		while(reachedTop == false) {
			for(int i = 0; i < robotArr.length; i++) {
				//4. make each robot start at the bottom of the screen, side by side, facing up
				robotArr[i].move(random.nextInt(50));
				robotArr[i].turn(30);
				if(robotArr[i].getY() <= 0) {
					roboNumber = i;
					reachedTop = true;
				}
			}
		}
		
    	
		//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

		//7. declare that robot the winner and throw it a party!
		JOptionPane.showMessageDialog(null, "You won good job Robot#"+ roboNumber + "!");
		//8. try different races with different amounts of robots.
    	
	    //9. make the robots race around a circular track.
		
	}

	
}
