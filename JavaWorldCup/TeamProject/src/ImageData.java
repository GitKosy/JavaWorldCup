import java.awt.*;

//�̹����� ��ǥ,�̸� , ���� , �ε�����ȯ�޼ҵ带 �����Ѵ�.
public class ImageData {
	public String [] 			FemaleImg;
	public String [] 			FemaleName;
	public int 					gender;
	public int [] 				checklist;			// ������ ���ӿ� �����ϴ� ������� �ε���
	
	// �߰��Ѻκ�
	public int 					nRound;				// ����1 ���� �����
	public int []				nPlayerIndex;		// �÷��� ����� �ε��� 
	public int []				nWinnerIndex;		// �¸��� �ε���
	public int					nWinner;			// �¸��� ������� ���� �����ϴ� ����
	
	
	//������
	public ImageData(int gender) {
		this.gender = gender;
		this.nRound = 16;						//����2
		this.nWinner = 0;						// ����
		
		FemaleImg = new String[nRound];
		FemaleName = new String[nRound];
		
		if(gender ==1) 
		{
			
		FemaleImg[0]="Images/Female/jeonjihyeon1.jpg";
		FemaleImg[1]="Images/Female/jeonjihyeon2.jpg";
		FemaleImg[2]="Images/Female/krystal1.jpg";
		FemaleImg[3]="Images/Female/krystal2.jpg";
		FemaleImg[4]="Images/Female/leesungkyung1.jpg";
		FemaleImg[5]="Images/Female/leesungkyung2.jpg";
		FemaleImg[6]="Images/Female/parkboyoung1.jpg";
		FemaleImg[7]="Images/Female/parkboyoung2.jpg";
		FemaleImg[8]="Images/Female/parkminyoung1.jpg";
		FemaleImg[9]="Images/Female/parkminyoung2.jpg";
		FemaleImg[10]="Images/Female/parkshinhye1.jpg";
		FemaleImg[11]="Images/Female/parkshinhye2.jpg";
		FemaleImg[12]="Images/Female/shinhyesun1.jpg";
		FemaleImg[13]="Images/Female/shinhyesun2.jpg";
		FemaleImg[14]="Images/Female/youinna1.jpg";
		FemaleImg[15]="Images/Female/youinna2.jpg";
		
		FemaleName[0]="jeonjihyeon1";
		FemaleName[1]="jeonjihyeon2";
		FemaleName[2]="krystal1";
		FemaleName[3]="krystal2";
		FemaleName[4]="leesungkyung1";
		FemaleName[5]="leesungkyung2";
		FemaleName[6]="parkboyoung1";
		FemaleName[7]="parkboyoung2";
		FemaleName[8]="parkminyoung1";
		FemaleName[9]="parkminyoung2";
		FemaleName[10]="parkshinhye1";
		FemaleName[11]="parkshinhye2";
		FemaleName[12]="shinhyesun1";
		FemaleName[13]="shinhyesun2";
		FemaleName[14]="youinna1";
		FemaleName[15]="youinna2";
		
		}
		else {
			//���ڿ�����
		}
		
		this.nPlayerIndex = new int[this.nRound];	
		this.nWinnerIndex = new int[this.nRound];	// ����
		this.checklist = new int[this.nRound];
		
		for(int i=0;i<nRound;i++)					
		{
			this.checklist[i]=0;
			nPlayerIndex[i]=i;				// �÷��� ������ ��Ȳ�� 1 / �÷��� �Ұ����� ��Ȳ�� 0
			/* �÷��� �����ϴ� �� �ǹ� : n������ �÷��̰� ��������� ���θ� ������.
			*n/2������ ������ ��� �÷��̾� �ε������� 1�� �����ȴ�.
			*
			*/
			nWinnerIndex[i]=0;
		}
		
	}
	
	public ImageSearch getRandom() {
		int left = (int)(Math.random()*nRound);			
		while(checklist[nPlayerIndex[left]]!=1) 
		{						
			left = (int)(Math.random()*nRound);			
		}
		
		int right= (int)(Math.random()*nRound);			
		while(checklist[nPlayerIndex[right]]!=1) 						
		{
			right = (int)(Math.random()*nRound);		
		}
		
		while(left==right)
		{
			right= (int)(Math.random()*nRound);			
			if(left!=right && checklist[nPlayerIndex[right]]==1)
				break;
		}
		
		
		ImageSearch im = new ImageSearch();
		im.left = nPlayerIndex[left];
		im.right = nPlayerIndex[right];
		return im;
		
	}// ����� ������
	
	
	public void setGender(int gender) 
	{
	      this.gender = gender;
	}
	
	//�÷��̾���� �̹� ������ ������� ����� �ʱ�ȭ�ϰ� ������ �ø���. 
	public void resetPlayerArray()
	{
		nRound = nRound / 2 ;
		for(int i=0; i< nRound; i++)
		{
			this.nPlayerIndex[i]=nWinnerIndex[i];			//����
			nWinnerIndex[i]=0;								//����
		}
		this.nWinner = 0;
	}
	
	// �¸����� ���� �ø���.		
	public void addWinner()
	{
		this.nWinner ++;
	}
	
	//�¸��ڸ� �����ϴ� �迭�� �ε����� �����Ѵ�.
	public void addWinnerArray(int index)
	{
		addWinner();
		nWinnerIndex[nWinner]=index;
		
	}

}
