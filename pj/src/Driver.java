import javax.swing.*;

public class Driver {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setTitle("이상형월드컵");							// frame title
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new InitPanel());
		frame.pack();
		frame.setVisible(true);

	}

}
