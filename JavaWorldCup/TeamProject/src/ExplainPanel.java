import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class ExplainPanel extends JPanel {

	private JPanel setting;
	private JLabel lblLeft,lblRight;
	private JButton btnBack;
	private ExplainButtonListener btnE;
	private PrimaryPanel parent;
	public ExplainPanel()
	{
		this.setPreferredSize(new Dimension(1440,900));
		this.setBounds(0, 0, 1440, 900);
		this.setLayout(null);
		this.setBackground(Color.black);
		
		setting = new JPanel();
		setting.setBounds(0, 0, 1440, 900);
		setting.setBackground(Color.white);
		setting.setLayout(null);
		this.add(setting);
		
		lblLeft = new JLabel();
		lblLeft.setBounds(10, 50, 600, 800);
		lblLeft.setBackground(Color.black);
		lblLeft.setOpaque(true);
		//lblLeft.setLayout(null);
		setting.add(lblLeft);
		
		lblRight = new JLabel();
		lblRight.setBounds(630, 50, 800, 600);
		lblRight.setBackground(Color.black);
		lblRight.setOpaque(true);
		//lblRight.setLayout(null);
		setting.add(lblRight);
		
		this.btnBack = new JButton("BACK");
		this.btnBack.setPreferredSize(new Dimension(200,50));
		this.btnBack.setBounds(1000, 700, 200, 50);
		this.btnBack.setFont(new Font("",Font.BOLD,30));
		this.btnBack.setBackground(Color.white);
		this.btnBack.setForeground(Color.black);
		this.btnBack.setVisible(true);
		this.btnE = new ExplainButtonListener();
		this.btnBack.addActionListener(btnE);
		setting.add(btnBack);
		
		
	}
	public ExplainPanel(PrimaryPanel parent)
	{
		
		this.setPreferredSize(new Dimension(1440,900));
		this.setBounds(0, 0, 1440, 900);
		this.setLayout(null);
		this.setBackground(Color.black);
		this.parent=parent;
		
		setting = new JPanel();
		setting.setBounds(0, 0, 1440, 900);
		setting.setBackground(Color.white);
		setting.setLayout(null);
		this.add(setting);
		
		lblLeft = new JLabel();
		lblLeft.setBounds(10, 50, 600, 800);
		lblLeft.setBackground(Color.black);
		lblLeft.setLayout(null);
		lblLeft.setOpaque(true);
		setting.add(lblLeft);
		
		lblRight = new JLabel();
		lblRight.setBounds(630, 50, 800, 600);
		lblRight.setBackground(Color.black);
		lblRight.setLayout(null);
		lblRight.setOpaque(true);
		setting.add(lblRight);
		
		this.btnBack = new JButton("BACK");
		this.btnBack.setPreferredSize(new Dimension(200,50));
		this.btnBack.setBounds(1000, 700, 200, 50);
		this.btnBack.setFont(new Font("",Font.BOLD,30));
		this.btnBack.setBackground(Color.white);
		this.btnBack.setForeground(Color.black);
		this.btnBack.setVisible(true);
		this.btnE = new ExplainButtonListener();
		this.btnBack.addActionListener(btnE);
		setting.add(btnBack);
		
		
	}
	private class ExplainButtonListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			Object obj = e.getSource();
			if(obj == btnBack) {
				parent.disableExplainPanel();
				parent.enableInitPanel();
			}
			
		}
		
	}
}
