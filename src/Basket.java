
public class Basket<E extends Fruit> {
	private E elem;

	Basket(E e){
		elem = e;
	}

	void replace(E e) {
		elem = e;
	}

	E get() {
		return elem;
	}

	void printName() {
		System.out.println("籠の中は"+elem.getName()+ "です。");
	}

	void printPrice() {
		System.out.println("合計金額は"+elem.getPrice()+"です。");
	}
}
