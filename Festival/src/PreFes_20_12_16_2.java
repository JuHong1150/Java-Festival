import java.util.Scanner;

public class PreFes_20_12_16_2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����ݾ� : ");
		int money = sc.nextInt();
		
		System.out.println("�ܵ���ȯ");
		
		int num1 = money / 10000;
		int num2 = money % 10000 / 5000;
		int num3 = money % 10000 % 5000 / 1000;
		int num4 = money % 10000 % 5000 % 1000 / 500;
		int num5 = money % 10000 % 5000 % 1000 % 500 / 100;
				
		if (money >= 100) {
			System.out.println(String.format("10000�� : %d�� ",num1)); 
			System.out.println(String.format("5000�� : %d��",num2)); 
			System.out.println(String.format("1000��  : %d��",num3)); 
			System.out.println(String.format("500��  : %d��",num4)); 
			System.out.println(String.format("100�� : %d��",num5)); 
		}

	}

}
