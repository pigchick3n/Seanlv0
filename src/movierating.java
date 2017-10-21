import javax.swing.JOptionPane;

public class movierating {
public static void main(String[] args) {
	String age = JOptionPane.showInputDialog(null, "How old are you?");
	int num = Integer.parseInt(age);
	if(num >=18) {
	JOptionPane.showMessageDialog(null,"You can go to the movies.");
	}
	if (num >=0 && num <=17){
		JOptionPane.showMessageDialog(null, "Go get a parent.");
	}
	if(num <0) {
		JOptionPane.showInputDialog(null, "Tell me your secrets time traveler.");
	}
}
}
