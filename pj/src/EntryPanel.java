// work
import javax.swing.*;
import java.awt.*;


public class EntryPanel extends JPanel {

	private Point 					ptPanel;			//패널좌표
	private int						panelwidth = 350;	//패널사이즈
	private int						panelheight = 400;
	
	private JLabel					lblEntryImage;		//이미지
	private JLabel					lblEntryName;		//이름
	private int						nVelocity;			//속도
	private EntryComponent			EntryData;			//데이터
	
	private void hide(boolean flag)
	{
		lblEntryImage.setVisible(flag);
		lblEntryName.setVisible(flag);
	}
	
	private void setPoint(int x, int y)
	{
		ptPanel 			= new Point();
		ptPanel.x			= x;
		ptPanel.y			= y;
	}
	
	public EntryPanel()	//constructor
	{
		setPoint(0,0);
		//this.setLayout(null);
		this.setBounds(this.ptPanel.x,this.ptPanel.y,this.panelwidth,this.panelheight);
        //setBackground(Color.red);
		
		
		this.EntryData = new EntryComponent(new EntryComponent());
		
		//출전자 이름지정
		this.lblEntryName = new JLabel(EntryData.strImageName);
		this.lblEntryName.setFont(new Font(("바탕"),Font.ITALIC+Font.BOLD,15));
        this.lblEntryName.setLocation(panelwidth*3/4,panelheight*3/4);
        this.lblEntryName.setSize(this.panelwidth,panelheight/5);
        this.lblEntryName.setBackground(Color.cyan);						// 조정가능
        this.lblEntryName.setForeground(Color.yellow);						// 조정가능
		
		this.lblEntryImage = new JLabel(EntryData.imgEntry);
        this.lblEntryImage.setBounds(0,0,this.panelwidth,this.panelheight);
		
		add(this.lblEntryImage);
        add(this.lblEntryName);

        nVelocity = 0;
        
	}//constructor
	
	
	
	
	//constructor
	/*
	public EntryPanel(int x, int y, EntryComponent E)
	{
		setPoint(x,y);
		this.setLayout(null);
        this.setBounds(x,y,this.panelwidth,this.panelheight);
        setBackground(Color.green);
        
		this.lblEntryImage = new JLabel(E.imgEntry);
		this.lblEntryImage.setBounds(0,0,this.panelwidth,this.panelheight);
		
		this.lblEntryName = new JLabel(E.strImageName);
        this.lblEntryName.setFont(new Font(("바탕"),Font.ITALIC,25));
        this.lblEntryName.setLocation(this.panelwidth/2-this.lblEntryName.getWidth()/2,panelheight*3/4);
        this.lblEntryName.setSize(this.panelwidth,panelheight*2/5);
        this.lblEntryName.setBackground(Color.cyan);						// 조정가능
        this.lblEntryName.setForeground(Color.yellow);						// 조정가능
        
        nVelocity = 0;
        
        add(this.lblEntryImage);
        add(this.lblEntryName);
        
	}
	*/
	//constructor
	
	
	
	
}// EntryPanel
