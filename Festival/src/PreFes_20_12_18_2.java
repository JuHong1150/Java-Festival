import java.util.Scanner;

public class PreFes_20_12_18_2 {
	public static void main(String[] args) {
		// 팩토리얼 구하기

		Scanner sc = new Scanner(System.in);
		System.out.println("입력 : ");  // 입력받을 값
		int n = sc.nextInt();
		int n2 = 1;                   // 아래 n2 초기값 설정(n2 변수 설정)

		for (int i = 1; i < n + 1; i++) { // i = 1부터 입력받은값까지 1씩 증가하고
			n2 = n2 * i;                 // n2 = 1부터 i를 차례차례 곱한다
		}
		System.out.println(n2);  // n2 = 1*1=1, 1*2=2, 2*3=6, 6*4=24, 24*5=120.....
		                          //    n!  =  1*2*3*4*5........

	}

}
