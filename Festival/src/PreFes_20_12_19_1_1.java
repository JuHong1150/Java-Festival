import java.util.Scanner;

public class PreFes_20_12_19_1_1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("소인수분해 할 수를 입력하시오 >> ");
		int num = sc.nextInt();
		int i = 0;

		System.out.print(num + "=");
		for (i = 2; i <= num; i++) {// 1.나는 i로 입력받은 num을 나눌껀데 1로 나누면 무한하게 1로 나눠버리니까 2부터 나눌거다.
			while (num % i == 0) { // 2.num을 초기 2로 나눴을때 나머지가 0이라면 계속 2로 나눈다,안나눠지면 위에 for문으로 올라가서 +1 한다.
				System.out.print(i);
				num = num / i;
				if (num == 1) {
					break;
				}

				System.out.print("*");
			}
		}

	}

}
