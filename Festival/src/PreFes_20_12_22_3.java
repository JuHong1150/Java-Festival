import java.util.Scanner;

public class PreFes_20_12_22_3 {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자입력 >>");
		int input = sc.nextInt();  // 입력받을 값.
		int[] num = new int[100];  // 2진수로 변환할 때 2진수를 저장할 배열

		int i = 0;
		int 몫 = input;

		while (몫 > 0) {
			num[i] = 몫 % 2;
			몫 /= 2;
			i++;              // 반복문이 한번씩 돌 때 마다 i 값을 1씩 증가시켜준다.
		}
		i--;                 // 마지막에  증가 하는것만 하나 빼주면 됨.
		for (; i >= 0; i--) {
			System.out.print(num[i]+" ");
		}	
	}

}
