import java.util.Arrays;

public class PreFes_20_12_22_2 {
	public static void main(String[] args) {

		// ���� ª�� �� ���ϱ�

		int[] point = { 92, 32, 52, 9, 81, 2, 68 };
		int min = point[0] - point[1]; ///////////////////////////////////////
		int temp = 0;                                                       //
		int num1 = 0;                                                       //
		int num2 = 0;                                                       //
                                                                            //
		for (int i = 0; i < point.length; i++) {                            //  ���밪 �Ⱦ� ����
			for (int j = i + 1; j < point.length; j++) {                    //  1. ���� �� ������ ������ �����ϴ°�
                                                                            //  2. ���̳ʽ����� �������� ���̳ʽ� �ѹ� �� ������ +�� ����°�
				temp = point[i] - point[j];                                 //  �� �ΰ����� ���� �߿��� �� �����ϴ�.
                                                                            //
				if (temp < 0) { //////////////////////////////////////////////          
					temp = -temp;

				}
				if (temp < min) {
					min = temp;
					num1 = i;
					num2 = j;
				}

			}
		}
		System.out.println(String.format("result >> [%d,%d]", num1,num2));


	}

}
