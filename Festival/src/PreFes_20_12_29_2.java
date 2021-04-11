import java.util.Scanner;

public class PreFes_20_12_29_2 {
	public static void main(String[] args) {

		// 1234567890

		Scanner sc = new Scanner(System.in);
		System.out.print("첫자리 0을 제외한 숫자를 입력해주세요 >> ");
		String num = sc.next();

		String[] number = num.split(""); // , 기준으로 나누기

		int A = 6;  // 0,6,9는 대시가 6개
		int B = 2;  // 1은 2개
		int C = 5;  // 2,3,5는 5개
		int D = 4;  // 4는 4개
		int E = 3;  // 7은 3개
		int F = 7;  // 8은 7개

		int sum = 0; // 대시 갯수합계의 초기값은 0

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
		System.out.println("대시('-')의 총합 >> " + sum);
	}

}
