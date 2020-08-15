package chapter;

public class Chapter07 {
	public static void main(String[] args) {
		int km = 10;
		if (km <= 5) {
			System.out.println("とても近いです");
		}else if (km <= 10) {
			System.out.println("近いです");
		}else if (km <= 15) {
			System.out.println("遠いです");
		}else {
			System.out.println("とても遠いです");
		}

		String str1 = "blue";
		switch(str1) {
		case "red":
			System.out.println("赤信号です");
			break;
		case "blue":
			System.out.println("青信号です");
			break;
		case "yellow":
			System.out.println("黄色信号です");
			break;
		default:
			System.out.println("信号の色ではありません");
		}
	}
}
