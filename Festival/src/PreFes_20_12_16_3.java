import java.util.Scanner;

public class PreFes_20_12_16_3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�⵵�Է� >> ");
		int year = sc.nextInt();
		
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
			System.out.println("�����Դϴ�.");
		} else {
			System.out.println("�����̴� ����̿�?!");
		}
		
		
		
	}

}
