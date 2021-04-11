import java.util.Scanner;

public class PreFes_20_12_22_1 {
	public static void main(String[] args) {

		//

		Scanner sc = new Scanner(System.in);

		System.out.print("N입력 >> ");
		int N = sc.nextInt();
		System.out.print("X입력 >> ");
		int X = sc.nextInt();
		int[] num = new int[N];
		int[] num1 = new int[X]; //

		int[] num2 = new int[X];

		for (int i = 0; i < num.length; i++) {
			System.out.print(String.format("%d번째 정수 입력>>", i + 1));
			num[i] = sc.nextInt();

		}
		System.out.println("결과 : ");
		for (int i = 0; i < num.length; i++) {
			if (num[i] < X) {
				System.out.print(num[i]+" ");
		}

		}

	}

}
