import java.util.Arrays;

public class PreFes_20_12_24_1 {
	public static void main(String[] args) {

		// 180도

		int[][] arr = new int[5][5];

		// 이차원 배열

		int cnt = 1;

		System.out.println("원본");

		for (int i = 0; i < arr[0].length; i++) {
			for (int j = 0; j < arr.length; j++) {

				arr[j][i] = cnt++;

			}
		}
		for (int i = 0; i < arr[0].length; i++) {
			for (int j = 0; j < arr.length; j++) {

				System.out.print(arr[j][i] + "\t");
			}
			System.out.println("");
		}

		System.out.println("================================================================");

		System.out.println("180도 회전");  // 반대로 25부터 1씩 빼주면 됨

		int cnt1 = 25;

		for (int i = 0; i < arr[0].length; i++) {
			for (int j = 0; j < arr.length; j++) {

				arr[j][i] = cnt1--;

			}
		}
		for (int i = 0; i < arr[0].length; i++) {
			for (int j = 0; j < arr.length; j++) {

				System.out.print(arr[j][i] + "\t");
			}
			System.out.println("");
		}

	}

}
