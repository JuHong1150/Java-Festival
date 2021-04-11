
public class PreFes_20_12_27_1 {
	public static void main(String[] args) {

		// 알파벳 모래시계

		char array[][] = new char[5][5]; // 5행 5열의 이차원배열 생성
		int i, j; // i = 행, j = 열 값
		char a = 'A'; // A부터 넣을 것이다아아아아아아아아아~~~~~~

		// 1. 이차원배열에 넣는 방법을 계산하자.

		for (i = 0; i <= 4; i++) { // 2. 세로 행이 0부터 4까지
			if (i <= 2) { // 3. 근데 만약 세로행이 2보다 작을때, 즉 2보다 윗줄일때는
				for (j = i; j <= 4 - i; j++) { // 4. 가로 열 값을 i 부터 시작해서 4-i 까지
					array[i][j] = a++; // i,j 값에  a를 순서대로 넣는다
				}
			} else { // 5. 그게 아니라면, 즉 i 값이 2보다 크면, 2보다 아랫줄일때는
				for (j = 4 - i; j <= i; j++) { // 6. 가로 열 값은 4-i부터 i 까지
					array[i][j] = a++; // a를 순서대로 넣는다.
				}
			}
		}
		// 위의 식을 바탕으로 출력할 틀 생성

		for (i = 0; i < 5; i++) {
			for (j = 0; j < 5; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}

	}

}
