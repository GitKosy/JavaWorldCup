import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.SQLException;
public class InitPanel extends JPanel {

	private JPanel 				sexPanel;
	private ButtonGroup 		sexButtonGroup;
	private JRadioButton [] 	sexButton;
	private String [] 			sexText = {"����" , "����"};
	
	
	private JLabel 				lblTitle;
	private JButton 			btnStart;
	private JButton 			btnExplain;
	private PrimaryPanel 		parentPanel;
	private int 				isBtnStartClicked;
	private BtnListener 		btnL;
	private BtnExplainListener 	btnE;
	public InitPanel(){
		
	}
	
	public InitPanel(PrimaryPanel parent) {
		parentPanel = parent;
		setBackground(Color.white);
		setPreferredSize(new Dimension(1440,900));
		setLayout(null);
		setBounds(0,0,1440,900);
		
		lblTitle = new JLabel("Ideal World Cup");
		lblTitle.setPreferredSize(new Dimension(500,50));
		lblTitle.setFont(new Font("",Font.BOLD,55));
		lblTitle.setBounds(550, 100, 500, 50);
		this.add(lblTitle);
		
		btnStart = new JButton("Start");
		btnStart.setPreferredSize(new Dimension(300,50));
		btnStart.setBounds(550, 700, 500, 50);
		btnStart.setFont(new Font("",Font.ITALIC,30));
		btnStart.setBackground(Color.gray);
		btnL = new BtnListener();
		btnStart.addActionListener(btnL);
		this.add(btnStart);
		isBtnStartClicked=0;
		
		btnExplain = new JButton("Explain");
		btnExplain.setPreferredSize(new Dimension(200,50));
		btnExplain.setBounds(100, 700, 300, 50);
		btnExplain.setFont(new Font("",Font.ITALIC,30));
		btnExplain.setBackground(Color.white);
		btnE = new BtnExplainListener();
		btnExplain.addActionListener(btnE);
		this.add(btnExplain);
		
		
		
		sexPanel = new JPanel();
		sexPanel.setBackground(Color.white);
		sexPanel.setBounds(200, 300, 130, 250);
		add(sexPanel);
		
		
		sexButtonGroup = new ButtonGroup();
		sexButton = new JRadioButton [2];
		sexPanel.setLayout(new GridLayout(2,1));
		
		
		for(int i=0;i<sexButton.length;i++)
		{
			sexButton[i] = new JRadioButton(sexText[i]);
			sexButtonGroup.add(sexButton[i]);
			sexPanel.add(sexButton[i],BorderLayout.CENTER);
			sexButton[i].addItemListener(btnL);
			sexButton[i].setFont(new Font("",Font.BOLD,20));
			sexButton[i].setBackground(Color.white);
		}
		
		sexButton[0].setSelected(true);
	
		
		setVisible(true);
	}//������
	
	
	public int GetisBtnStartClicked() {
		return isBtnStartClicked;
	}
	private class BtnExplainListener implements ActionListener{

		// �����ư�� ������ �����г��� ����.
		public void actionPerformed(ActionEvent e) {
			Object obj = e.getSource();
			if(obj ==btnExplain)
			{
				parentPanel.disableInitPanel();
				parentPanel.addExplainPanel(parentPanel);
				
				
			}
			
		}
		
	}
	
	
	
	
	private class BtnListener implements ActionListener, ItemListener{

		// ��������
		public void itemStateChanged(ItemEvent e) {
			if(e.getStateChange()==ItemEvent.DESELECTED)
                return;
            if(sexButton[0].isSelected()) //���ڸ� ����������
            {
            	parentPanel.setType(1);
                parentPanel.setnSex("����");
            }
            else if(sexButton[1].isSelected()) //���ڸ� ����������
            {
            	parentPanel.setType(0);
                parentPanel.setnSex("����");
            }
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			Object obj = e.getSource();
			if(obj == btnStart) 
			{
				parentPanel.disableInitPanel();
				parentPanel.addMainGamePanel();
				
			}
		}
		
	}
	
}
