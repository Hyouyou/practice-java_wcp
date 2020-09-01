
public class Action {
	public static void main(String[] args) {
		Basket<Apple> appleBasket = new Basket<>(new Apple("ふじ", new Integer(100)));
		Basket<Peach> peachBasket = new Basket<>(new Peach("桃",new Integer(300)));

		appleBasket.printPrice();
		peachBasket.printPrice();
	}
}
