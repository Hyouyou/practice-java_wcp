package chapter;

public class Car {
	/*自分の回答
	 * 燃費（Km/L）
    private double fuelCost;
     残量（L）
    private double fuelAmount;

     コンストラクタを作成
    public Car() {
    	this.fuelCost
    	this.fuelAmount;
    }

     moveメソッド
    public void move(int distance) {
    	 "xx km 走ります"を出力
    	System.out.println(distance + "km走ります");
    }
    ・残量を計算

    fuelAmountを取得するメソッドを作成
    public void getFuelAmount() {

    }*/

	//カリキュラムの回答
	// 燃費（Km/L）
    private double fuelCost;
    // 残量（L）
    private double fuelAmount;

    public Car(double Cost, double Amount) {
        this.fuelCost = Cost;
        this.fuelAmount = Amount;
    }

    public void move(int km) {
        System.out.println(km + " km 走ります");
        this.fuelAmount -= (km / fuelCost);
    }

    public double getFuelAmount() {
        return this.fuelAmount;
    }
}
