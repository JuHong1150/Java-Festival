import java.util.Scanner;

public class PreFes_20_12_19_2 {
	public static void main(String[] args) {
		// a,b 입력받고 a-b 출력하고 a,b 둘다 0일때 종료

		Scanner sc = new Scanner(System.in);

		int a = 0;   // 1. while 문 안에서 입력받을 두 수의 변수를 while 위에서 미리 지정
		int b = 0;

		while (true) {
			System.out.print("A 입력 >> ");
			a = sc.nextInt();
			System.out.print("B 입력 >> ");  // 2. 두 변수 입력 받고
			b = sc.nextInt();
			int m = a - b;                 // 3. 두 수의 차를 입력

			if (a == 0 && b == 0) {  // 반복문 속 조건문 
				System.out.println(String.format("결과 : %d", m));
				break;                      // a,b 둘다 0 일때 종료
			} else {                        // 아니면 계속 돌림
				System.out.println(String.format("결과 : %d", m));
			}

		}

	}

}
