import java.util.Scanner;

public class PreFes_20_12_20_1 {
	public static void main(String[] args) {

		// 1,2,4,7,11�� ���� ������ n��° �ױ��� ����Ͻÿ�.
		
		// 0.�⺻�� 1�� +1 �״������ڴ� +2 �״������ڴ� +3....�̷����� ���� ������

		Scanner sc = new Scanner(System.in);
		System.out.print("n �Է� >> ");
		int n = sc.nextInt();
		
		int sum = 1;     // 3. sum, a ���� ����
		int a = 0;

		while (true) {  // 
			sum = sum+a;  //1. ���� 1�� ������ sum ������  a���� ���ؼ� �ٽ� sum�� ��ȯ,
			a++;      // 2. a ���� 1�� ��� ���� �ϴ� �ݺ����� �ۼ��Ѵ�.
			if (a <= n) {  // 4. ���� a ���� �Է¹��� ������ ������ ��� ������ ��� �����ش�.
				System.out.print(sum+" ");  // println �ϸ� ���η� �����µ� 
				  // �� ������ �� �������� ln ����°� �߿�! �̰Ŷ����� ���� ��û �޾Ҿ��!!!!!!!
			}else {           //5. �Է¹��� ���� a�� �������� ����
				break;
			}
		}

	}

}
