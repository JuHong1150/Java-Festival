
public class PreFes_20_12_29_3 {
	public static void main(String[] args) {

		// 스플릿 성적나누기

		String score = "A,A,B,C,D,A,C,D,D,D,F";

		String[] word = score.split(","); // , 기준으로 나누기

		System.out.println(word.length); // 잘 나눠졌는지 갯수 확인

		int A = 0;
		int B = 0;
		int C = 0;
		int D = 0;
		int F = 0;

		for (int i = 0; i < word.length; i++) {

			if (word[i].equals("A")) {
				A++;
			} else if (word[i].equals("B")) {
				B++;
			} else if (word[i].equals("C")) {
				C++;
			} else if (word[i].equals("D")) {
				D++;
			} else if (word[i].equals("F")) {
				F++;
			}

		}
		System.out.println("A : " + A + "명");
		System.out.println("B : " + B + "명");
		System.out.println("C : " + C + "명");
		System.out.println("D : " + D + "명");
		System.out.println("F : " + F + "명");

	}

}
