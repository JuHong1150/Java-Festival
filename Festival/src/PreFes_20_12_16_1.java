import java.util.Scanner;

public class PreFes_20_12_16_1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ݿø� �� �� : ");
		int num1 = sc.nextInt();
		int result1 = (num1%100%10)<4 ? num1-(num1%100%10) : num1-(num1%100%10)+10;
		System.out.println("�ݿø� �� �� : " + result1);
		
	}

}
