import java.util.Scanner;

public class PreFes_20_12_19_1 {
	public static void main(String[] args) {

		// ���μ�����

		Scanner sc = new Scanner(System.in);
		System.out.print("���μ����� �� ���� �Է��Ͻÿ� >> ");
		int n = sc.nextInt();
		 
		for (int i = 2; i <= n; i++) {	// �Ǵ� i * i <= N
			while (n % i == 0) {
				System.out.print(i);
				n /= i;
			}
		}
		if (n != 1) {
			System.out.println(n);
		}
		
		
	}

}
