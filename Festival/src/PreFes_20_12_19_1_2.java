import java.util.Scanner;

public class PreFes_20_12_19_1_2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("소인수분해 할 수를 입력하시오 >> ");
		int num = sc.nextInt();
		int i = 2; // 2. 초기에 나누는 값은 2다

		System.out.print(num + "=");
		while (true) { // 1. 반복문 돌릴껀데
			if (num % i == 0) { // 2. 만약 i 로 입력한 숫자가 나눠서 나머지가 0이라면 그냥 계속 이걸로 돌리고
				System.out.print(i);
				num = num / i;
				if (num == 1) { // 4. 그리고 나누는 숫자가 1이 되면 멈춘다
					break;
				}
				System.out.print("*");
			} else { // 3. 만약 나머지가 0이 아니라면 i에 1씩 더해서 나눠본다.
				i++;
			}
		}
	}

}
