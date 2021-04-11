import java.util.Arrays;
import java.util.Scanner;

public class PreFes_20_12_24_2 {
	public static void main(String[] args) {

		// 다이아몬드

		int array[][] = new int[7][7]; // 7행 7열의 이차원배열 생성
		int i, j;  // i = 행, j = 열 값
		int cnt = 1; //  1부터 넣을 숫자
		
		// 1. 이차원배열에 넣는 방법을 계산하자.

		for (i = 0; i < 7; i++) {  // 2. 세로 행이 0부터 7까지 
			if (i <= 3) { // 3. 근데 만약 세로행이 3보다 작을때, 즉 3보다 윗줄일때는 
				for (j = 3 - i; j <= 3 + i; j++) {  // 4. 가로 열 값을 3-i 부터 시작해서 3+i 까지
					array[i][j] = cnt++;           // i,j 값에 cnt를 순서대로 넣는다
				}
			} else {  // 5. 그게 아니라면, 즉 i 값이 3보다 크면, 3보다 아랫줄일때는
				for (j = i - 3; j <= 9 - i; j++) { // 6. 가로 열 값은 i-3부터 9-i 까지 
					array[i][j] = cnt++;         // cnt를 순서대로 넣는다.
				}
			}
		}
		// 위의 식을 바탕으로 출력할 틀 생성
		
		for (i = 0; i < 7; i++) {
			for (j = 0; j < 7; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
