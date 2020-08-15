
public class For01 {
	public static void main(String[] args) {
        for (int number01 = 1; number01 <= 2; number01++) {
            System.out.println("For01 = " + number01);
        }

        int[] array = { 1, 2, 3, 4, 5 };
        for (int number02 : array) {
            System.out.println("For02 = " + number02);
        }

        int number = 1;
        printNum(number);
    }

	  public static int printNum(int number) {
	    if (number < 50) {
	      number *= 2;
	      System.out.println("While01 = " + number);
	  // 条件にマッチしたら自分自身を再度呼び出す
	      printNum(number);
	    }
	    return number;
	  }
}
