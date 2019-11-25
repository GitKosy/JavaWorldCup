import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ExplainPanel extends JFrame{

	JPanel leftPanel,rightPanel;
	JButton Backbtn;
	
	public ExplainPanel() {
		setTitle("Explain");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(null);
		
		leftPanel = new JPanel();
		leftPanel.setBounds(50, 50, 350, 400);
		leftPanel.setBackground(Color.pink);
		c.add(leftPanel);
		
		rightPanel = new JPanel();
		rightPanel.setBounds(450, 50, 300, 300);
		rightPanel.setBackground(Color.pink);
		c.add(rightPanel);
		
		Backbtn = new JButton();
		Backbtn.setText("BACK");
		Backbtn.setBounds(650, 400, 100, 50);
		Backbtn.addMouseListener(new MyMouseListener());
		c.add(Backbtn);
		setSize(800,600);
		setVisible(true);
	}
	class MyMouseListener implements MouseListener{

		@Override
		public void mouseClicked(MouseEvent e) {
			new InitPanel();
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
