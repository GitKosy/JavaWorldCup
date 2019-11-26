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
	
	//생성자
	public PrimaryPanel() {
		this.setBackground(Color.black);
		this.setBounds(0, 0, 1440, 900);
		this.setPreferredSize(new Dimension(1440,900));
		this.setLayout(null);
		P_Init = new InitPanel(this);
		this.add(P_Init);
		
	}
	
	//메인게임패널을 추가한다.
	public void addMainGamePanel()  {
		imData = new ImageData(0);
		P_MainGame = new MainGamePanel(0,this,imData);
		P_MainGame.setBounds(0,0,1440,900);
		this.add(P_MainGame);
		
	}
	
	//종료패널을 추가한다.
	public void addEndingPanel() {
		P_Ending = new EndingPanel();
		P_Ending.setBounds(0, 0, 1440, 900);
		this.add(P_Ending);
	}
	
	//설명패널을 추가한다.
	public void addExplainPanel(PrimaryPanel p) {
		P_Explain = new ExplainPanel(p);
		P_Explain.setBounds(0, 0, 1440, 900);
		this.add(P_Explain);
	}
	
	//이닛패널을 출력한다.
	public void enableInitPanel() {
		this.P_Init.setVisible(true);
	}
	
	//게임패널을 반환한다.
	public MainGamePanel getMainGamePanel() {
		return this.P_MainGame;
	}
	
	//이닛패널을 출력하지않는다.
	public void disableInitPanel() {
		this.P_Init.setVisible(false);
	}
	
	
	//엔딩패널을 출력하지 않는다.
	public void disableEndingPanel() {
		this.P_Ending.setVisible(false);
	}
	
	//설명패널을 출력하지 않는다.
	public void disableExplainPanel() {
		this.P_Explain.setVisible(false);
	}
	
	//이닛패널을 리턴
	public InitPanel getInitPanel() {
		return P_Init;
	}
	
	// 성별을 지정
	public void setnSex(String nSex) {
		this.nSex=nSex;
	}
	
	
	public void setType(int gender)
	{
		this.type = gender;
	}
	
	
	
	
}
