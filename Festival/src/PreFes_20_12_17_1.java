import java.util.Scanner;

public class PreFes_20_12_17_1 {
	public static void main(String[] args) {
		
		// ���ڸ��� ���ϱ�
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù ��° ���� �Է� >> ");
		int num1 = sc.nextInt();
		
		System.out.print("�� ��° ���� �Է� >> ");
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
