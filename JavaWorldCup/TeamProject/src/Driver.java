import java.awt.*;
import javax.swing.*;

public class Driver {

	public static void main(String[] args) {//���� ���ڴ� üũ�ڽ�  ��ŸƮ  �׸��� ���� ���� ���� ���� ���� ����
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
// �ð� ���� �Ҷ� ���� ���ϴ� �ɷ� �ؼ� ������� ǥ��
//��ϴ���
//���� �Ǿ����� ����� ���鼭 Ŀ���� ȿ��
//