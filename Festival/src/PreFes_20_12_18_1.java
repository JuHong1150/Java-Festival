import java.util.Scanner;

public class PreFes_20_12_18_1 {
	public static void main(String[] args) {

		// 값을 입력받아 최소공배수, 최대공약수 구하기
		// 숫자1,2 중 큰수 를 작은수로 나눈 몫과 나머지 중 나머지를 다시한번 작은수로 나눠서 나머지가 0이 될때까지 나눌때
		// 그때의 작은수 = 최대공약수
		// 숫자1*숫자2를 최대 공약수로 나누면 최소공배수

		Scanner sc = new Scanner(System.in);
		System.out.print("숫자1 입력 >>");
		int num1 = sc.nextInt();
		System.out.print("숫자2 입력 >>");
		int num2 = sc.nextInt();
		int big;    // 큰 수 
		int small;  // 작은수
		
		int a = 0;  // 몫
		int b = 0;  // 나머지

		int minGB;  // 최소공배수
		int maxGY;  // 최대공약수

		if (num1 >= num2) { //만약 입력받은 값이 num1>num2 라면
			big = num1;     // 큰수는  num1
			small = num2;   // 작은수는 num2
		} else {
			big = num2;
			small = num1;   //아니라면 위와 반대로
		}

		while (true) {
			a = big / small;  // 큰수에서 작은수를 나눈 값이 몫
			b = big - a * small;  // 큰수 - 몫*작은수 = 나머지
			if (b == 0) {
				maxGY = small;  // 이 나머지가 0이 될때 작은수는 최대공약수가 된다.
				minGB = num1 * num2 / maxGY; // 최소공배수는 입력받은 두 수의 곱을 최대공약수로 나눈 값.
				System.out.println("최대공약수 :" + maxGY);
				System.out.println("최소공배수 :" + minGB);
				break;
			} else {
				big = small;
				small = b;
			}
		}

	}

}
