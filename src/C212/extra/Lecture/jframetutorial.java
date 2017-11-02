import javax.swing.*;

public class Jframetutorial {
	public static void main(String[] args) {
		//create the frame
		JFrame frame = new JFrame("FrameExample");

		//what happens on default when closed
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//create and add components to the frame
		JLabel label = new JLabel();
		frame.add(label);

		//frame size
		frame.setSize(400, 400);

		//set the frame to be visible
		frame.setVisible(true);
	}
}