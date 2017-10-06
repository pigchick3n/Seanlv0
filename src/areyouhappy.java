import javax.swing.JOptionPane;

public class areyouhappy {
	public static void main(String[] args) {

		int x = JOptionPane.showConfirmDialog(null, "Are you happy?", "", JOptionPane.YES_NO_OPTION);
		if (x == 0) {
			JOptionPane.showMessageDialog(null, "Keep doing what you're doing.");
		} else {
			int y = JOptionPane.showConfirmDialog(null, "Do you want to be happy?", "", JOptionPane.YES_NO_OPTION);
			if (y == 0) {
				JOptionPane.showMessageDialog(null, "Do something else.");
			} else {
				JOptionPane.showMessageDialog(null, "Keep doing what you're doing.");
			}
		}

	}
}
