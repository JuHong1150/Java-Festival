import java.util.Scanner;

public class PreFes_20_12_22_3 {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�����Է� >>");
		int input = sc.nextInt();  // �Է¹��� ��.
		int[] num = new int[100];  // 2������ ��ȯ�� �� 2������ ������ �迭

		int i = 0;
		int �� = input;

		while (�� > 0) {
			num[i] = �� % 2;
			�� /= 2;
			i++;              // �ݺ����� �ѹ��� �� �� ���� i ���� 1�� ���������ش�.
		}
		i--;                 // ��������  ���� �ϴ°͸� �ϳ� ���ָ� ��.
		for (; i >= 0; i--) {
			System.out.print(num[i]+" ");
		}	
	}

}
