import javax.swing.JOptionPane;

public class spottheerror {

	@SuppressWarnings("all")
	public static void main(String[] args) {
		String n = JOptionPane.showInputDialog("Give me a number");
		int num = Integer.parseInt(n);
		for (int i = 0; i < num; i++) {
			System.out.println(num);

		}
	}
}
