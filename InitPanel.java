import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class InitPanel extends JFrame {

	JLabel Title;
	JButton btnGirl,btnBoy,btnExp;
	public InitPanel() {
		setTitle("IDEAL WORLD CUP");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		
		MyMouseListener listener = new MyMouseListener();
		MyExplainListener explisten = new MyExplainListener();
		Title = new JLabel();
		Title.setText("Ideal World Cup");
		Title.setBounds(300, 30, 300, 50);
		c.add(Title);
		
		btnGirl = new JButton();
		btnGirl.setText("Girl");
		btnGirl.setBounds(100, 200, 100, 30);
		btnGirl.addMouseListener(listener);
		c.add(btnGirl);
		
		btnBoy = new JButton();
		btnBoy.setText("Boy");
		btnBoy.setBounds(100, 300, 100, 30);
		btnBoy.addMouseListener(listener);
		c.add(btnBoy);
		
		btnExp = new JButton();
		btnExp.setText("Explain");
		btnExp.setBounds(100, 400, 100, 30);
		btnExp.addMouseListener(explisten);
		c.add(btnExp);
		
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
	class MyExplainListener implements MouseListener{

		@Override
		public void mouseClicked(MouseEvent e) {
			new ExplainPanel();
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
