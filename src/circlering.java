
/*******************************************************************************
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 *    Circle Ring
 *    Duration=.5
 *    Platform=Eclipse
 *    Type=Recipe
 *    Objectives=nested for loops
 *  
 ******************************************************************************/

import org.jointheleague.graphical.robot.Robot;

public class circlering {
	public static void main(String[] args) throws Exception {

		// 1. Make a new Robot
		Robot pig = new Robot("mini");
		pig.sparkle();
		// 2. Set your robot’s position to x=150 and y=200
		pig.setX(150);
		pig.setY(200);
		// 3. Put the robot's pen down
		pig.penDown();
		pig
		// 4. Set the robot’s speed to 10
		pig.setSpeed(10);
		// 5. Do everything below here 360 times (use i as the counter)
		for (int i = 0; i < 360; i++) {

			// 6. Move the robot 3 pixels
			pig.move(3);
			// 7. Turn the robot 1 degree
			pig.turn(1);
			// 8. If the counter i is divisible by 20 (hint: use mod operator %)
			if (i % 20 == 0) {
				// 9. Do steps 10 thru 12, 360 times (use j as the counter)
				for (int j = 0; j < 360; j++) {

					// 10. Move the robot 1 pixel
					pig.move(1);
					// 11. Turn the robot 1 degree
					pig.turn(1);
				}
			}
		}
	}
}