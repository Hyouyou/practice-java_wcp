package extend;

import extend.phone.Camera;
import extend.phone.MobilePhone;

public class Interface01 {
	public static void main(String[] args) {
        MobilePhone mobilePhone = new MobilePhone("000-1111-2222");

        System.out.println("電話番号は最大" + MobilePhone.MAX_NUMBER_DIGITS + "桁です。");
        mobilePhone.call("99-8888-7777");
        Interface01.classTakePicture(mobilePhone);
        //mobilePhone.takePicture();→興味で勝手に追加したやつ
    }

	// Cameraインターフェース実装したクラスは呼び出しできる
    public static void classTakePicture(Camera camera) {
    	// アップキャストされた変数のメソッドを呼び出し
        camera.takePicture();
    }
}
