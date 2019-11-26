import java.awt.Dimension;
import java.awt.*;

import javax.swing.*;

public class EntryPanel extends JPanel {

	 private Point pt;						// 패널좌표
	 private int velocity;					// 속도
	 private ImageData imData;				//이미지인덱스를 받아내는 ...그런과정
	 private ImageIcon image1;				//EntryPanel에 삽입할 이미지
	 private JLabel lblImg,lblName;			//이미지라벨, 이미지 이름
	 private int imageLocation;				// 이미지 위치
	 private int sex;						//이미지 성별
	 
	 public EntryPanel()
	 {
		this.setPreferredSize(new Dimension(500,600));
		this.setBounds(0, 0, 500, 600);
		this.setLayout(null);
		this.setBackground(Color.green);
		
		//imData= new ImageData();
		image1 = new ImageIcon(imData.FemaleImg[0]);
		lblImg = new JLabel(image1);
		lblName = new JLabel(imData.FemaleName[0]);
		this.add(lblImg);
		this.add(lblName);
	 }
	 
	 public EntryPanel(int index , ImageData imdata) {
		this.setPreferredSize(new Dimension(500,600));
		this.setBounds(0, 0, 500, 600);
		this.setLayout(null);
		
		//imData = new ImageData(sex);
		
		image1 = new ImageIcon(imData.FemaleImg[index]);
		lblImg = new JLabel(image1);
		lblName = new JLabel(imData.FemaleName[index]);
		
		this.add(lblImg);
		this.add(lblName);
		 
	 }
	 public void getImageLocation(int locat) {
		 imageLocation = locat;
	 }
	 
	 
}
