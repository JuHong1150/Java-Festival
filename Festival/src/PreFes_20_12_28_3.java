import java.util.Arrays;

public class PreFes_20_12_28_3 {
	public static void main(String[] args) {

		// findKim �޼ҵ�� String�� �迭 names�� �Ű������� �޽��ϴ�.
		// names�� "Kim"�� ��ġ x�� ã��, "�輭���� x�� �ִ�"�� String�� ��ȯ�ϼ���.
		// names�� "Kim"�� ���� �� ���� ��Ÿ���� �߸��� ���� �ԷµǴ� ���� �����ϴ�.

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
		String result = String.format("�輭���� %d ��°�� �ִ�!!", find);

		return result;
	}

}
