import java.util.Arrays;

public class PreFes_20_12_28_3 {
	public static void main(String[] args) {

		// findKim 메소드는 String형 배열 names을 매개변수로 받습니다.
		// names중 "Kim"의 위치 x를 찾아, "김서방은 x에 있다"는 String을 반환하세요.
		// names에 "Kim"은 오직 한 번만 나타나며 잘못된 값이 입력되는 경우는 없습니다.

		String[] names = { "Queen", "Tod", "kim" };
		System.out.println(findkim(names));

	}

	private static String findkim(String[] names) {
		// TODO Auto-generated method stub

		int find = 0;
		for (int i = 0; i < names.length; i++) {
			if (names[i] == "kim") {
				find = i + 1;
			}
		}
		String result = String.format("김서방은 %d 번째에 있다!!", find);

		return result;
	}

}
