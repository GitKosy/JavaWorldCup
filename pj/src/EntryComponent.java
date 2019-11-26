//  work
import java.awt.*;
import javax.swing.*;

public class EntryComponent {
	public ImageIcon 		imgEntry;
	public Image			Image;
	public String			strImageName;
	public int				nVictory;

	// testing constructor
	public EntryComponent()
	{
		this.imgEntry 			= new ImageIcon("testing.jpg");
		this.strImageName 		= new String("testString");
		this.nVictory 			= 0;
	}
	// testing constructor

	public EntryComponent(EntryComponent E)
	{
		this.imgEntry 			= E.imgEntry;
		this.strImageName 		= E.strImageName;
		this.nVictory 			= E.nVictory;
		
	}//constructor
	
	
	
	//constructor
	public EntryComponent(ImageIcon imgins, String imgname , int victory )
	{
		this.imgEntry 				= imgins;
		this.strImageName		 	= imgname;
		this.nVictory 				= victory;
			
		int imageWidth=this.imgEntry.getIconWidth();
		int imageHeight=this.imgEntry.getIconHeight();
		
		this.Image = this.imgEntry.getImage();
		if(imageWidth>imageHeight) 
		{			
			imageHeight = (int)(imageHeight*(float)300/imageWidth);		
			imageWidth = 300;													
		        	
		}
		else 
		{
			imageWidth = (int)(imageWidth*(float)400/imageHeight);
		    imageHeight = 400;
		}
			
		this.imgEntry.setImage(this.Image.getScaledInstance(
		        		imageWidth, 
		        		imageHeight, 
		        		this.Image.SCALE_SMOOTH));
		     
		     
			 
		}//constructor

	
	
	
	//constructor
	public EntryComponent(String imgdir, String imgname , int victory )
	{
	}
	
	//constructor
	
	
	public int cmpVictory(EntryComponent E)
	{
		return this.nVictory - E.nVictory;
	}
	
	
}//EntryComponent
