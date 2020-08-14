
public class For01 {
	public static void main(String[] args) {
        for (int number = 1; number <= 2; number++) {
            System.out.println("For01 = " + number);
        }

        int[] array = { 1, 2, 3, 4, 5 };
        for (int number02 : array) {
            System.out.println("For02 = " + number02);
        }
    }
}
