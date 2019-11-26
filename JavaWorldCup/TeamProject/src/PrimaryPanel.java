import javax.swing.*;
import java.awt.*;
import java.sql.SQLException;

public class PrimaryPanel extends JPanel {

	private InitPanel						P_Init;
	private MainGamePanel 					P_MainGame;
	private EndingPanel						P_Ending;	
	private ExplainPanel					P_Explain;
	private String 							nSex;
	private	int 							type;
	private ImageData						imData;
	
	//������
	public PrimaryPanel() {
		this.setBackground(Color.black);
		this.setBounds(0, 0, 1440, 900);
		this.setPreferredSize(new Dimension(1440,900));
		this.setLayout(null);
		P_Init = new InitPanel(this);
		this.add(P_Init);
		
	}
	
	//���ΰ����г��� �߰��Ѵ�.
	public void addMainGamePanel()  {
		imData = new ImageData(0);
		P_MainGame = new MainGamePanel(0,this,imData);
		P_MainGame.setBounds(0,0,1440,900);
		this.add(P_MainGame);
		
	}
	
	//�����г��� �߰��Ѵ�.
	public void addEndingPanel() {
		P_Ending = new EndingPanel();
		P_Ending.setBounds(0, 0, 1440, 900);
		this.add(P_Ending);
	}
	
	//�����г��� �߰��Ѵ�.
	public void addExplainPanel(PrimaryPanel p) {
		P_Explain = new ExplainPanel(p);
		P_Explain.setBounds(0, 0, 1440, 900);
		this.add(P_Explain);
	}
	
	//�̴��г��� ����Ѵ�.
	public void enableInitPanel() {
		this.P_Init.setVisible(true);
	}
	
	//�����г��� ��ȯ�Ѵ�.
	public MainGamePanel getMainGamePanel() {
		return this.P_MainGame;
	}
	
	//�̴��г��� ��������ʴ´�.
	public void disableInitPanel() {
		this.P_Init.setVisible(false);
	}
	
	
	//�����г��� ������� �ʴ´�.
	public void disableEndingPanel() {
		this.P_Ending.setVisible(false);
	}
	
	//�����г��� ������� �ʴ´�.
	public void disableExplainPanel() {
		this.P_Explain.setVisible(false);
	}
	
	//�̴��г��� ����
	public InitPanel getInitPanel() {
		return P_Init;
	}
	
	// ������ ����
	public void setnSex(String nSex) {
		this.nSex=nSex;
	}
	
	
	public void setType(int gender)
	{
		this.type = gender;
	}
	
	
	
	
}
