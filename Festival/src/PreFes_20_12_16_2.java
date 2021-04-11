import java.util.Scanner;

public class PreFes_20_12_16_2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("현재금액 : ");
		int money = sc.nextInt();
		
		System.out.println("잔돈변환");
		
		int num1 = money / 10000;
		int num2 = money % 10000 / 5000;
		int num3 = money % 10000 % 5000 / 1000;
		int num4 = money % 10000 % 5000 % 1000 / 500;
		int num5 = money % 10000 % 5000 % 1000 % 500 / 100;
				
		if (money >= 100) {
			System.out.println(String.format("10000원 : %d개 ",num1)); 
			System.out.println(String.format("5000원 : %d개",num2)); 
			System.out.println(String.format("1000원  : %d개",num3)); 
			System.out.println(String.format("500원  : %d개",num4)); 
			System.out.println(String.format("100원 : %d개",num5)); 
		}

	}

}
