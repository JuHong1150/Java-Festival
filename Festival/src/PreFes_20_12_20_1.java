import java.util.Scanner;

public class PreFes_20_12_20_1 {
	public static void main(String[] args) {

		// 1,2,4,7,11과 같은 수열의 n번째 항까지 출력하시오.
		
		// 0.기본값 1에 +1 그다음숫자는 +2 그다음숫자는 +3....이런식의 식을 만들자

		Scanner sc = new Scanner(System.in);
		System.out.print("n 입력 >> ");
		int n = sc.nextInt();
		
		int sum = 1;     // 3. sum, a 변수 지정
		int a = 0;

		while (true) {  // 
			sum = sum+a;  //1. 본값 1로 지정된 sum 변수에  a값을 더해서 다시 sum에 반환,
			a++;      // 2. a 값은 1씩 계속 증가 하는 반복문을 작성한다.
			if (a <= n) {  // 4. 만일 a 값이 입력받은 값보다 작으면 계속 돌려서 계속 더해준다.
				System.out.print(sum+" ");  // println 하면 세로로 써지는데 
				  // 이 문제랑 이 다음문제 ln 지우는게 중요! 이거때문에 고통 엄청 받았어요!!!!!!!
			}else {           //5. 입력받은 값과 a가 같아지면 종료
				break;
			}
		}

	}

}
