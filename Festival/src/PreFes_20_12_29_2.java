import java.util.Scanner;

public class PreFes_20_12_29_2 {
	public static void main(String[] args) {

		// 1234567890

		Scanner sc = new Scanner(System.in);
		System.out.print("ù�ڸ� 0�� ������ ���ڸ� �Է����ּ��� >> ");
		String num = sc.next();

		String[] number = num.split(""); // , �������� ������

		int A = 6;  // 0,6,9�� ��ð� 6��
		int B = 2;  // 1�� 2��
		int C = 5;  // 2,3,5�� 5��
		int D = 4;  // 4�� 4��
		int E = 3;  // 7�� 3��
		int F = 7;  // 8�� 7��

		int sum = 0; // ��� �����հ��� �ʱⰪ�� 0

		for (int i = 0; i < number.length; i++) {
			if (number[i].equals("0")) {
				sum = sum + A;
			} else if (number[i].equals("1")) {
				sum = sum + B;
			} else if (number[i].equals("2")) {
				sum = sum + C;
			} else if (number[i].equals("3")) {
				sum = sum + C;
			} else if (number[i].equals("4")) {
				sum = sum + D;
			} else if (number[i].equals("5")) {
				sum = sum + C;
			} else if (number[i].equals("6")) {
				sum = sum + A;
			} else if (number[i].equals("7")) {
				sum = sum + E;
			} else if (number[i].equals("8")) {
				sum = sum + F;
			} else if (number[i].equals("9")) {
				sum = sum + A;
			}
		}
		System.out.println("���('-')�� ���� >> " + sum);
	}

}
