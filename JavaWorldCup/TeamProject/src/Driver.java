import java.awt.*;
import javax.swing.*;

public class Driver {

	public static void main(String[] args) {//여자 남자는 체크박스  스타트  그리고 남자 순위 여자 순위 게임 설명
		JFrame frame = new JFrame("Ideal World Cup");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//ExplainPanel P_Explain = new ExplainPanel();
		//InitPanel P_Init = new InitPanel();
		
		PrimaryPanel primary = new PrimaryPanel();
		frame.getContentPane().add(primary);
		
		frame.pack();
		frame.setVisible(true);

	}

}
// 시간 제한 할때 색깔 변하는 걸로 해서 긴급함을 표현
//기록누적
//선택 되었을때 가운데로 오면서 커지는 효과
//