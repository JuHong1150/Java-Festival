import java.util.Scanner;

public class PreFes_20_12_26_1 {
	public static void main(String[] args) {

		// 2차원 입력받아서 입력하기 오르락 내리락

		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt(); //
		int num2 = sc.nextInt(); // 행, 열 2개를 입력

		int[][] arr;
		arr = new int[num1][num2]; // 이차원배열 만들어서 각각 입력받은 값을 넣음.

		// 이차원 배열

		int cnt = 1;

		for (int i = 0; i < arr[0].length; i++) {
			if (i % 2 == 0) { // i 행이 짝수행일때는(0,2,4....행)
				for (int j = 0; j < arr.length; j++) {
					arr[i][j] = cnt++;
				}
			}
			else { // 홀수행 (1,3,5,,,,,행일때는)
				for (int j = arr.length-1; j >= 0; j--) { // 전체길이에서 -
					arr[i][j] = cnt++;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {

				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
