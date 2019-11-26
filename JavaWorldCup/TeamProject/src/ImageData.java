import java.awt.*;

//이미지의 좌표,이름 , 성별 , 인덱스반환메소드를 제공한다.
public class ImageData {
	public String [] 			FemaleImg;
	public String [] 			FemaleName;
	public int 					gender;
	public int [] 				checklist;			// 실제로 게임에 참가하는 사람들의 인덱스
	
	// 추가한부분
	public int 					nRound;				// 수정1 게임 진행률
	public int []				nPlayerIndex;		// 플레이 대기자 인덱스 
	public int []				nWinnerIndex;		// 승리자 인덱스
	public int					nWinner;			// 승리한 사람들의 수를 저장하는 정수
	
	
	//생성자
	public ImageData(int gender) {
		this.gender = gender;
		this.nRound = 16;						//수정2
		this.nWinner = 0;						// 수정
		
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
			//남자연예인
		}
		
		this.nPlayerIndex = new int[this.nRound];	
		this.nWinnerIndex = new int[this.nRound];	// 수정
		this.checklist = new int[this.nRound];
		
		for(int i=0;i<nRound;i++)					
		{
			this.checklist[i]=0;
			nPlayerIndex[i]=i;				// 플레이 가능한 상황은 1 / 플레이 불가능한 상황은 0
			/* 플레이 가능하다 의 의미 : n강에서 플레이가 진행됬는지 여부를 따진다.
			*n/2강으로 진출할 경우 플레이어 인덱스값은 1로 복구된다.
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
		
	}// 대결을 진행할
	
	
	public void setGender(int gender) 
	{
	      this.gender = gender;
	}
	
	//플레이어들중 이미 출전한 사람들의 목록을 초기화하고 강수를 올린다. 
	public void resetPlayerArray()
	{
		nRound = nRound / 2 ;
		for(int i=0; i< nRound; i++)
		{
			this.nPlayerIndex[i]=nWinnerIndex[i];			//수정
			nWinnerIndex[i]=0;								//수정
		}
		this.nWinner = 0;
	}
	
	// 승리자의 수를 늘린다.		
	public void addWinner()
	{
		this.nWinner ++;
	}
	
	//승리자를 저장하는 배열에 인덱스를 저장한다.
	public void addWinnerArray(int index)
	{
		addWinner();
		nWinnerIndex[nWinner]=index;
		
	}

}
