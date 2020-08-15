package chapter;

public class Chapter08 {
	public static void main(String[] args) {
		int int1 = 1;
		while(int1 <= 5) {
			System.out.println(int1 * int1);
			int1 = ++int1;
		}

		int[] array = {1,2,3,4};
		for (int num = 0 ; num < array.length ; num++){
			System.out.println(array[num]);
		}

		for (int i : array) {
			if (i % 2 == 0) {
				continue;
			}
			System.out.println(i);
		}
	}
}
