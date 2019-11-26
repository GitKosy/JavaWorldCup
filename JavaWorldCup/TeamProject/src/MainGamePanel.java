import javax.swing.*;
import java.awt.*;
import java.sql.SQLException;

public class MainGamePanel extends JPanel {
	
		private ImageData 					imData;
		private EntryPanel 					leftPanel,rightPanel;
		//private int 						gender;
		private int 						left,right;
		private PrimaryPanel 				parent;
		
		public MainGamePanel(int gender,PrimaryPanel parent,ImageData imData) {
			//this.gender = gender;
			this.parent= parent;
			this.setPreferredSize(new Dimension(1440,900));
			this.setBounds(0, 0, 1440, 900);
			this.setLayout(null);
			
			//imData = new ImageData(gender);
			this.left = imData.getRandom().left;
			this.right =imData.getRandom().right;
			
			leftPanel = new EntryPanel(left,imData);
			rightPanel = new EntryPanel(right,imData);
			
			
			this.add(leftPanel);
			this.add(rightPanel);
			
			
	}
	
}
