
public class While01 {
	public static void main(String[] args) {
        int number1 = 100;
        while (number1 < 50) {
            number1 *= 2;
            System.out.println("While01 = " + number1);
        }

        int number2 = 100;
        do {
            number2 *= 2;
            System.out.println("DoWhile01 = " + number2);
        } while (number2 < 50);
    }
}
