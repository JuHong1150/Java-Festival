import java.util.Arrays;
import java.util.Scanner;

public class PreFes_20_12_24_2 {
	public static void main(String[] args) {

		// ���̾Ƹ��

		int array[][] = new int[7][7]; // 7�� 7���� �������迭 ����
		int i, j;  // i = ��, j = �� ��
		int cnt = 1; //  1���� ���� ����
		
		// 1. �������迭�� �ִ� ����� �������.

		for (i = 0; i < 7; i++) {  // 2. ���� ���� 0���� 7���� 
			if (i <= 3) { // 3. �ٵ� ���� �������� 3���� ������, �� 3���� �����϶��� 
				for (j = 3 - i; j <= 3 + i; j++) {  // 4. ���� �� ���� 3-i ���� �����ؼ� 3+i ����
					array[i][j] = cnt++;           // i,j ���� cnt�� ������� �ִ´�
				}
			} else {  // 5. �װ� �ƴ϶��, �� i ���� 3���� ũ��, 3���� �Ʒ����϶���
				for (j = i - 3; j <= 9 - i; j++) { // 6. ���� �� ���� i-3���� 9-i ���� 
					array[i][j] = cnt++;         // cnt�� ������� �ִ´�.
				}
			}
		}
		// ���� ���� �������� ����� Ʋ ����
		
		for (i = 0; i < 7; i++) {
			for (j = 0; j < 7; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
