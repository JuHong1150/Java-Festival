
public class PreFes_20_12_30_2 {
	public static void main(String[] args) {

		// getMiddle메소드는 하나의 단어를 입력 받습니다.
		// 단어를 입력 받아서 가운데 글자를 반환하도록 getMiddle메소드를 만들어 보세요.
		// 단어의 길이가 짝수일경우 가운데 두글자를 반환하면 됩니다. 예를들어 입력받은 단어가 power이라면 w를 반환하면 되고,
		// 입력받은 단어가 test라면 es를 반환하면 됩니다.

		System.out.println(getMiddle("test"));

	}

	private static String getMiddle(String string) {
		// TODO Auto-generated method stub

		String[] number = string.split("");
		String str = "";

		if (string.length() % 2 == 0) { // 문자 길이가 짝수면 문자의길이 /2 의 값-1 번의 인덱스와 문자의 길이 /2 번째 인덱스의 값을 같이 출력
			str = number[string.length() / 2 - 1] + number[string.length() / 2];

		} else if (string.length() % 2 != 0) { // 홀수라면 문자의 길이 /2 번째 인덱스만 출력
			str = number[string.length() / 2];
		}
		return str;
	}

}
