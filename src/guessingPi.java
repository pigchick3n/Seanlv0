import javax.swing.JOptionPane;

public class guessingPi {
	public static void main(String[] args) {

		String pi = "3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679821480865";
		System.out.println(pi.charAt(0));
		pi.length();
		for (int i = 0; i < pi.length(); i++) {
			String guess = JOptionPane.showInputDialog("What is the next digit of pi?");
			System.out.println(pi.charAt(i));
			if (guess.charAt(0) == pi.charAt(i)) {
				JOptionPane.showMessageDialog(null, "you are correct");
			} else {
				JOptionPane.showMessageDialog(null, "you are incorrect/Start over");
break;
			}
		}

	}
}
