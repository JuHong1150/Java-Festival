
public class PreFes_20_12_29_3 {
	public static void main(String[] args) {

		// ���ø� ����������

		String score = "A,A,B,C,D,A,C,D,D,D,F";

		String[] word = score.split(","); // , �������� ������

		System.out.println(word.length); // �� ���������� ���� Ȯ��

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
		System.out.println("A : " + A + "��");
		System.out.println("B : " + B + "��");
		System.out.println("C : " + C + "��");
		System.out.println("D : " + D + "��");
		System.out.println("F : " + F + "��");

	}

}
