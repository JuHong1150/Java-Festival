import java.util.Scanner;

public class PreFes_20_12_16_3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("년도입력 >> ");
		int year = sc.nextInt();
		
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
			System.out.println("윤년입니다.");
		} else {
			System.out.println("윤년이는 언년이여?!");
		}
		
		
		
	}

}
