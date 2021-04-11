
public class PreFes_20_12_17_3 {
	public static void main(String[] args) {
		
		//(77*1) + (76*2) + (75*3)+…+(1*77)를 계산하여
		//결과를 출력하시오.

		int num1 = 77;
		int num2 = 1;
		int sum = 0;
		int total = 0;
		
		while (num2 <= 77) {
			sum = num1*num2;
			num1--;
			num2++;
			total = total+sum;
		}
		System.out.println(total);
	}

}
