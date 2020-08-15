package chapter;

public class Chapter09 {
	public static void main(String[] args) {
        // 燃費（Km/L）
        double Cost = 12.5;
        // 残量（L）
        double Amount = 55.0;

        Car car = new Car(Cost, Amount);

        car.move(20);
        System.out.println("残量は、" + car.getFuelAmount() + "です");
    }
}
