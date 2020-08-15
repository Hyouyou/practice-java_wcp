package chapter;

public class Chapter05 {
	public static void main(String[] args) {
		/*プリミティブ型*/
		long long1 = 10000000000L;
		double dl1 = 123.45d;
		boolean bl1 = true;

		System.out.println(long1);
		System.out.println(dl1);
		System.out.println(bl1);

		/*ラッパークラスにボクシング*/
		Float float1 = 0.123f;
		Integer integer1 = 5;
		Character  character1 = 'あ';

		System.out.println(float1);
		System.out.println(integer1);
		System.out.println(character1);

		/*配列*/
		int[] array2 = new int[] { 0, 10, 20, 30, 40 };
		int int2 = array2[3];
		System.out.println(int2);
		System.out.println(array2[4]);
	}
}
