package arrays;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
	
	public static void main(String[] args) {
		int highX = 600;
		Robot[] lol = new Robot[5];
		Random ran = new Random();
		for(int i = 0; i < 5; i++) {
			Robot ismth = new Robot();
			ismth.moveTo(100*i+48, 550);
			lol[i] = ismth;
		}
		while(highX != 0) {
		for(int j = 0; j < 5; j++) {
			highX = lol[j].getY();
			if(highX == 0 || highX < 0) {
				break;
			}
			else if(highX != 0 || highX > 0) {
				lol[j].move(ran.nextInt(50));
			}
		}
		}
	}
	//2. create an array of 5 robots.

	//3. use a for loop to initialize the robots.

		//4. make each robot start at the bottom of the screen, side by side, facing up

	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.

	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

	//7. declare that robot the winner and throw it a party!

	//8. try different races with different amounts of robots.

	//9. make the robots race around a circular track.
}
