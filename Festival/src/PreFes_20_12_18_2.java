import java.util.Scanner;

public class PreFes_20_12_18_2 {
	public static void main(String[] args) {
		// ���丮�� ���ϱ�

		Scanner sc = new Scanner(System.in);
		System.out.println("�Է� : ");  // �Է¹��� ��
		int n = sc.nextInt();
		int n2 = 1;                   // �Ʒ� n2 �ʱⰪ ����(n2 ���� ����)

		for (int i = 1; i < n + 1; i++) { // i = 1���� �Է¹��������� 1�� �����ϰ�
			n2 = n2 * i;                 // n2 = 1���� i�� �������� ���Ѵ�
		}
		System.out.println(n2);  // n2 = 1*1=1, 1*2=2, 2*3=6, 6*4=24, 24*5=120.....
		                          //    n!  =  1*2*3*4*5........

	}

}
