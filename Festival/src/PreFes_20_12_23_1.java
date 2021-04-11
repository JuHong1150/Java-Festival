import java.util.Arrays;
import java.util.Scanner;

public class PreFes_20_12_23_1 {
	public static void main(String[] args) {
		
		// 선택정렬
		
		Scanner sc = new Scanner(System.in);
		int num;
		int[] a;
		
		
		for (int i = 0; i < 5; i++) {
			System.out.print(String.format("%d번째 수 입력 >>", i+1));
			num = sc.nextInt();
			int temp = num;
		}
		
		int[] arr = {};
		a = arr;
		
		
		for (int k = 0; k < arr.length - 1; k++) {
			int min = arr[k];
			int minIndex = k;

			for (int i = k + 1; i < arr.length; i++) {
				if (min > arr[i]) {
					min = arr[i];
					minIndex = i;
				}
			}
			int temp = arr[k];
			arr[k] = arr[minIndex];
			arr[minIndex] = temp;
			System.out.println(Arrays.toString(arr));
			
		}
		
		
		
		
		
		
		
	}

}
