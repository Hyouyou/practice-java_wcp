package extend.phone;

public interface Phone {
	int MAX_NUMBER_DIGITS = 11;

	//抽象メソッド
    public void call(String number);

 // defaultメソッドの宣言
    default void powerOff() {
        System.out.println("電源を切ります。");
    }
}
