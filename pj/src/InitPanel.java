import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//초기화프레임
public class InitPanel extends JPanel {

	JLabel 			Title;											//제목
	JButton 		btnGirl,btnBoy,btnExp;							//여자버튼 남자버튼 설명버튼
	
	private void hide(boolean flag)
	{
		this.Title.setVisible(flag);
		this.btnGirl.setVisible(flag);
		this.btnBoy.setVisible(flag);
		this.btnExp.setVisible(flag);
	}
	
	//constructor
	public InitPanel() {
		
		
		setLayout(null);
		setPreferredSize(new Dimension(800,600));
		setSize(800,600);
		setVisible(true);
		
		
		MyMouseListener listener = new MyMouseListener();		// mouse listener
		MyExplainListener explisten = new MyExplainListener();	// explain listener 
		
		Title = new JLabel();											// title
		Title.setText("Ideal World Cup");
		Title.setBounds(300, 30, 300, 50);
		add(Title);
		
		btnGirl = new JButton();										
		btnGirl.setText("Girl");
		btnGirl.setBounds(100, 200, 100, 30);
		btnGirl.addMouseListener(listener);
		add(btnGirl);
		
		btnBoy = new JButton();
		btnBoy.setText("Boy");
		btnBoy.setBounds(100, 300, 100, 30);
		btnBoy.addMouseListener(listener);
		add(btnBoy);
		
		btnExp = new JButton();
		btnExp.setText("Explain");
		btnExp.setBounds(100, 400, 100, 30);
		btnExp.addMouseListener(explisten);
		add(btnExp);
		
		Title.setVisible(true);;
		btnGirl.setVisible(true);
		btnBoy.setVisible(true);
		btnExp.setVisible(true);
		
		
		hide(true);
		
	}//constructor
	
	class MyMouseListener implements MouseListener{

		@Override
		public void mouseClicked(MouseEvent e) {
			add(new GamePanel());
			hide(false);
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
			add(new ExplainPanel());
			hide(false);
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
