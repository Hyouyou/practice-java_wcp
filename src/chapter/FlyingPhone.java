package chapter;

import extend.phone.Phone;

public class FlyingPhone implements Flying, Phone {
	private int number;

	// コンストラクタ。引数でメンバ変数を初期化。
	public FlyingPhone(int number) {
		this.number = number;
	}

	public void fly() {
		System.out.println(number + "分間、飛びます");
	}

	public void call(String number) {
		System.out.println(number + "に電話します。通話できるのは飛んでいる間だけです。");
	}

	//オーバーライドしないとコンパイルエラー
	public void powerOff() {
		// Flyingのdefaultメソッドを呼び出す
		Flying.super.powerOff();
	}
}
