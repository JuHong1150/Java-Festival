import java.util.Scanner;

public class PreFes_20_12_17_1 {
	public static void main(String[] args) {
		
		// 세자릿수 곱하기
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 숫자 입력 >> ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 숫자 입력 >> ");
		int num2 = sc.nextInt();
		
		int a = num2%100%10;
		int b = num2%100/10;
		int c = num2/100;
		
		System.out.println(num1*a);
		System.out.println(num1*b);
		System.out.println(num1*c);
		System.out.println(num1*num2);
		
	}

}
