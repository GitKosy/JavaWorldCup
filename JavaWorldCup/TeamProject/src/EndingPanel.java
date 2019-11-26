import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EndingPanel extends JPanel {

	private JLabel First,Second,Third;
	private JButton	btnBack;
	private PrimaryPanel	parent;
	private EndingButtonListener	btnE;
	
	public EndingPanel() {
		
	}
	public EndingPanel(PrimaryPanel parent) {
		this.setPreferredSize(new Dimension(1440,900));
		this.setLayout(null);
		this.setBackground(Color.black);
		this.setBounds(0, 0, 1440, 900);
		this.parent=parent;
		
		First = new JLabel();
		First.setBounds(50, 50, 500, 600);
		First.setBackground(Color.black);
		
		this.add(First);
		
		Second = new JLabel();
		Second.setBounds(650, 50, 300, 400);
		Second.setBackground(Color.black);
		
		this.add(Second);
		
		Third = new JLabel();
		Third.setBounds(1000, 50, 300, 400);
		Third.setBackground(Color.black);
		
		this.btnBack = new JButton("BACK");
		this.btnBack.setBounds(1250, 750, 200, 50);
		this.btnBack.setFont(new Font("",Font.BOLD,30));
		this.btnBack.setBackground(Color.white);
		this.btnBack.setForeground(Color.BLUE);
		this.btnBack.setVisible(true);
		this.btnE = new EndingButtonListener();
		this.btnBack.addActionListener(btnE);
		this.add(btnBack);
		
	}
	private class EndingButtonListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			Object obj = e.getSource();
			if(obj == btnBack)
			{
				parent.disableEndingPanel();
				parent.enableInitPanel();
				
			}
			
		}
		
	}
	
}
