import java.util.Scanner;

public class PreFes_20_12_20_2 {
	public static void main(String[] args) {

		// 행 개수를 입력받아 다음과 같이 삼각형을 출력하시오

		Scanner sc = new Scanner(System.in);
		System.out.println("행 개수 입력 >>");  // 0. 입력받는 변수 지정
		int n = sc.nextInt();
		
		for (int i = n; i >=1; i--) { // 1. i 가 n부터 1이 될때까지 1씩 줄여가면서 행으로 작성
			for (int j = 1; j <= i; j++) { // 3. 열 작성 j가 1부터 i 와 같아질때 까지
				System.out.print("*");	// 2.* 하나씩 찍고 가라!(println = 세로로 한줄씩 찍힘)
				                     //(2의 ln을 지우면 가로로 n개를 작성함.)
			}System.out.println();   // 이게 빠지면 *************************이렇게작성함.줄간격 주기 위한것.
			
		}
		
		System.out.println("====================================================");

		for (int i = n; i >= 1; i--) {
			for (int j = 1; j <=i ; j++) {
				System.out.print("*");
			}System.out.println();
		}
	}

}
