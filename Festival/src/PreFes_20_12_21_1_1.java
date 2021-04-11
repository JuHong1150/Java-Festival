import java.util.Random;
import java.util.Scanner;

public class PreFes_20_12_21_1_1 {
	public static void main(String[] args) {

		// 8칸 크기의 배열을 선언하고 랜덤수로 초기화 한 후
		// 가장 큰 수와 작은 수를 각각 출력하시오.

		Random rd = new Random();
		int[] num = new int[8];  // 1. 8칸 크기의 배열을 선언하고 

		System.out.print("배열에 있는 모든 값 >>");
		for (int i = 0; i < num.length; i++) {
			num[i] = rd.nextInt(100);  // 2. 그 수는 0~99까지 랜덤하게 가져온다.
		}
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " "); // 3. 랜덤한 수 옆으로 출력

		}
		int max, min;
		max = min = num[0];  // 4. 최댓값, 최솟값을 찾기 위한 변수를 지정해주고

		for (int i = 1; i < num.length; i++) {
			if (num[i] > max) { // 5. for 문을 돌면서 랜덤한 수가 max 변수보다 크면 그 값이 max가 되고
				max = num[i];
			}
			if (num[i] < min) { // 랜덤수가 min 보다 작으면 그 수가 min 값이 된다.
				min = num[i];
			}
		}

		System.out.println("\n최댓값" + max);
		System.out.println("최솟값" + min);
	}

}
