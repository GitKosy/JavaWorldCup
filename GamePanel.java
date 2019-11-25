import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GamePanel extends JFrame {

	JPanel leftPanel,rightPanel;
	JLabel leftLabel,rightLabel;
	public GamePanel() {
		setTitle("ING");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(null);
		
		MyMouseListener listener = new MyMouseListener();
		
		leftPanel = new JPanel();
		leftPanel.setBounds(30, 30, 350, 400);
		leftPanel.setBackground(Color.black);
		leftPanel.addMouseListener(listener);
		c.add(leftPanel);
		
		rightPanel = new JPanel();
		rightPanel.setBounds(420, 30, 350, 400);
		rightPanel.setBackground(Color.black);
		rightPanel.addMouseListener(listener);
		c.add(rightPanel);
		
		leftLabel = new JLabel();
		leftLabel.setText("leftLabel");
		leftLabel.setBounds(30, 440, 350, 50);
		leftLabel.setHorizontalAlignment(SwingConstants.CENTER);
		leftLabel.setBackground(Color.gray);
		c.add(leftLabel);
		
		rightLabel = new JLabel();
		rightLabel.setText("rightLabel");
		rightLabel.setHorizontalAlignment(SwingConstants.CENTER);
		rightLabel.setBounds(420, 440, 350, 50);
		rightLabel.setBackground(Color.gray);
		c.add(rightLabel);
		
		setSize(800,600);
		setVisible(true);
	}
	class MyMouseListener implements MouseListener{

		@Override
		public void mouseClicked(MouseEvent e) {
			new GamePanel();
			setVisible(false);
		}

		@Override
		public void mousePressed(MouseEvent e) {}

		@Override
		public void mouseReleased(MouseEvent e) {}

		@Override
		public void mouseEntered(MouseEvent e) {}

		@Override
		public void mouseExited(MouseEvent e) {}
		
	}
}
