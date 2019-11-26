import java.awt.Dimension;
import java.awt.*;

import javax.swing.*;

public class EntryPanel extends JPanel {

	 private Point pt;						// �г���ǥ
	 private int velocity;					// �ӵ�
	 private ImageData imData;				//�̹����ε����� �޾Ƴ��� ...�׷�����
	 private ImageIcon image1;				//EntryPanel�� ������ �̹���
	 private JLabel lblImg,lblName;			//�̹�����, �̹��� �̸�
	 private int imageLocation;				// �̹��� ��ġ
	 private int sex;						//�̹��� ����
	 
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
