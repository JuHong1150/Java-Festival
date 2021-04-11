import java.util.Scanner;

public class PreFes_20_12_19_1 {
	public static void main(String[] args) {

		// 소인수분해

		Scanner sc = new Scanner(System.in);
		System.out.print("소인수분해 할 수를 입력하시오 >> ");
		int n = sc.nextInt();
		 
		for (int i = 2; i <= n; i++) {	// 또는 i * i <= N
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
