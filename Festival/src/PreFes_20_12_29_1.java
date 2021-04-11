
public class PreFes_20_12_29_1 {
	public static void main(String[] args) {

		// startValue부터 endValue까지의 숫자 중 완전수를 출력하는 getPerfectNumber()메소드를 구현하세요
		// 완전수?
		// 자기 자신을 제외한 양의 약수를 더했을 때 자기 자신이 되는 것
		// 1. 각 수의 약수를 쭉 구해야 함.
		// 2. 자기 자신을 뺀 뒤 남은 약수들의 총합이 자기 자신과 똑같은지 확인해보기.

		// 완전수 구하기

		int startValue = 2;
		int endValue = 1000;

		getPerfectNumber(startValue, endValue);

	}

	private static void getPerfectNumber(int startValue, int endValue) {
		// TODO Auto-generated method stub
		System.out.print("2~1000까지의 완전수 : ");
		for (int i = startValue; i <= endValue; i++) {
			int sum = 0;
			for (int j = 1; j < i; j++) {
				if (i % j == 0) {
					sum += j;
				}
			}
			if (i == sum) {
				System.out.print(i + " ");
			}
		}
	}

}
