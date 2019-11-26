import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GamePanel extends JPanel {

	JPanel leftPanel,rightPanel;					// 선택지
	JLabel leftLabel,rightLabel;					//
	
	
	
	
	public GamePanel() {
					
		setLayout(null);
		setPreferredSize(new Dimension(800,600));
		setSize(800,600);
		setVisible(true);
		
		
		MyMouseListener listener = new MyMouseListener();			// listener
		
		
		
		
		leftPanel = new JPanel();					//set panel
		leftPanel.setLayout(null);
		//leftPanel.setPreferredSize(new Dimension(350,400));
		leftPanel.setBounds(30, 30, 350, 400);
		leftPanel.setBackground(Color.black);
		leftPanel.addMouseListener(listener);
		leftPanel.setVisible(true);
		add(leftPanel);
		//leftPanel.add(new EntryPanel());
		//추가한부분//
		//leftPanel.add(EPanel);
		//추가한부분//
		
		
		
		
		rightPanel = new JPanel();					//set panel
		rightPanel.setLayout(null);
		rightPanel.setPreferredSize(new Dimension(350,400));
		rightPanel.setBounds(410, 30, 350, 400);
		rightPanel.setBackground(Color.green);
		rightPanel.addMouseListener(listener);
		rightPanel.setVisible(true);
		add(rightPanel);
		
		leftLabel = new JLabel();					//set label
		leftLabel.setText("leftLabel");
		leftLabel.setBounds(0, 320, 350, 50);
		leftLabel.setHorizontalAlignment(SwingConstants.CENTER);
		leftLabel.setBackground(Color.gray);
		leftPanel.add(leftLabel);
		leftLabel.setVisible(true);
		
		rightLabel = new JLabel();					//set label
		rightLabel.setText("rightLabel");
		rightLabel.setHorizontalAlignment(SwingConstants.CENTER);
		rightLabel.setBounds(0, 320, 350, 50);
		rightLabel.setBackground(Color.gray);
		rightPanel.add(rightLabel);
		rightLabel.setVisible(true);
		
		
		
		
	}//constructor
	
	
	class MyMouseListener implements MouseListener{

		@Override
		public void mouseClicked(MouseEvent e) {
			add(new GamePanel());
			
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
