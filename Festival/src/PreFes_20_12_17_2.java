
public class PreFes_20_12_17_2 {
	public static void main(String[] args) {
		
		int num = 0;
		
		for (int i = 1; i <= 100; i++) {
			if (i%2 == 1) {
				System.out.print(String.format("+%d",i));
				num += i;
			} else {
				System.out.print(String.format("-%d",i));
				num -= i;
			}
		}
		System.out.println();
		System.out.println(String.format("°á°ú :%d", num));
	}

}
