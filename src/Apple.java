
public class Apple extends Fruit {
	Apple(String name, int price){
		super(name,price);
	}

	@Override
	protected String getName() {
		return name;
	}

	@Override
	protected int getPrice() {
		Integer tPrice = price + 100;
		return tPrice;
	}
}