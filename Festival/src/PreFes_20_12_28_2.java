import java.util.Arrays;

public class PreFes_20_12_28_2 {
	public static void main(String[] args) {

		System.out.println(reverseStr("ZAbcdVefEg"));

	}

	private static char[] reverseStr(String string) {
		// TODO Auto-generated method stub

		char[] input = new char[string.length()];
		char temp = 'a';

		for (int i = 0; i < string.length(); i++) {
			input[i] = string.charAt(i);

		}

		for (int i = 0; i < input.length; i++) {
			for (int j = i; j < input.length; j++) {
				if (input[i] > input[j]) {
					temp = input[i];
					input[i] = input[j];
					input[j] = temp;
				}
			}
		}
		return input;
	}

}

