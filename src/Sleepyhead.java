
// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

public class Sleepyhead {

	public static void main(String[] args) {
		boolean isWeekday, isVacation;

		int x = JOptionPane.showConfirmDialog(null, "Is it a weekday?", "", JOptionPane.YES_NO_OPTION);
		if (x == 0) {
			int y = JOptionPane.showConfirmDialog(null, "Is it a vacation", "", JOptionPane.YES_NO_OPTION);
			if (y == 0) {
				JOptionPane.showMessageDialog(null, "Sleep in");
			} else {
				JOptionPane.showMessageDialog(null, "Get up lazybones!");

			}
		} else {
			JOptionPane.showMessageDialog(null, "Sleep in.");
		}
		/*
		 * Ask the user for these values using
		 * JOptionPane.showConfirmDialog(null, "is it a weekday?", "",
		 * JOptionPane.YES_NO_OPTION);
		 */

		/*
		 * Print “sleep in” if it is a vacation or a weekend. If it’s a weekday,
		 * print “get up lazybones!” If it is a weekday, and we are on vacation,
		 * print “sleep in”.
		 */
	}
}
