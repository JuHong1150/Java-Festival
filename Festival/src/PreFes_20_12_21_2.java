import java.util.Random;

public class PreFes_20_12_21_2 {
	public static void main(String[] args) {

		// 중복없이 랜덤숫자 뽑기

		Random rd = new Random();
		int[] num = new int[6];  // 2. 6개의 숫자를 맞추면 되는 방식이다.
		int[] luck = new int[6];

		for (int i = 0; i < num.length; i++) {
			int daebak = rd.nextInt(45) + 1;  // 1. 로또는 45개의 랜덤한 숫자 중에서 
			num[i] = daebak;  // 3. 순차적으로 6개의 숫자를 돌려 num에 저장한다음
			for (int j = 0; j < num.length; j++) {
				int daebak2 = rd.nextInt(45) + 1;
				luck[j] = daebak2;  // 4. luck에도 위의 num과 같은 방식으로 저장하고

				if (num[i] == luck[j]) {  // 5. 이 둘을 비교하여
					num[i] -= num[i];  // 둘이 같다면 i 값을 빼버린다.
					break;
				}

			}
			System.out.println("이번주는 너로 정했다!! >>" + daebak);// 6. 중복값을 제외한 나머지를 출력
		}

	}

}
