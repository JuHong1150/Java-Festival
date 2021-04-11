import java.util.Arrays;

public class PreFes_20_12_22_2 {
	public static void main(String[] args) {

		// 가장 짧은 점 구하기

		int[] point = { 92, 32, 52, 9, 81, 2, 68 };
		int min = point[0] - point[1]; ///////////////////////////////////////
		int temp = 0;                                                       //
		int num1 = 0;                                                       //
		int num2 = 0;                                                       //
                                                                            //
		for (int i = 0; i < point.length; i++) {                            //  절대값 안쓸 때는
			for (int j = i + 1; j < point.length; j++) {                    //  1. 위에 비교 변수를 별도로 지정하는것
                                                                            //  2. 마이너스값이 나왔을땐 마이너스 한번 더 씌워서 +로 만드는것
				temp = point[i] - point[j];                                 //  이 두가지가 정말 중요한 것 같습니다.
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
