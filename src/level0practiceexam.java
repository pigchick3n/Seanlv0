import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

/* Level 0 Practice: Coding  Exercise #1 */
public class level0practiceexam {

	public static void main(String[] args) {
		Robot batter = new Robot("mini");
		batter.penDown();
		batter.setSpeed(10);
		// 1. Create a random number from 0 to 4 and store it in a ‘bases’
		// variable
		int bases = new Random().nextInt(5);
		// 2. If the number is zero display a window that says “the batter is
		// out”
		if (bases == 0) {
			JOptionPane.showMessageDialog(null, "The batter struck out");

		}

		// 3. Otherwise display “the batter hit a ” and “single”, “double”,
		// “triple” or “home run”
		if (bases == 1) {
			JOptionPane.showMessageDialog(null, "The batter hit a single");
			batter.turn(45);
			batter.move(100);
		}
		if (bases == 2) {
			JOptionPane.showMessageDialog(null, "The batter hit a double");
			batter.turn(45);
			batter.move(100);
			batter.turn(-90);
			batter.move(100);
		}
		if (bases == 3) {
			JOptionPane.showMessageDialog(null, "The batter hit a triple");
			batter.turn(45);
			batter.move(100);
			batter.turn(-90);
			batter.move(100);
			batter.turn(-90);
			batter.move(100);
		}
		if (bases == 4) {
			JOptionPane.showMessageDialog(null, "The batter hit a home run");
			batter.turn(45);
			batter.move(100);
			batter.turn(-90);
			batter.move(100);
			batter.turn(-90);
			batter.move(100);
			batter.turn(-90);
			batter.move(100);
		}

		// 4. Make the robot draw the path of the base runner. For example, if
		// the batter hit a double, draw a line from home plate to first and
		// another line from
		// first to second. Home plate should be at the bottom and first should
		// be on the
		// right. You do not need to draw the bases themselves or any other
		// features.

	}

}
