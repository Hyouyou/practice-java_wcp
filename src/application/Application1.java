package application;

public class Application1 {
	public static void main(String[] args) {
		Human human = new Human();
		Human.HumanLeg leg = human.new HumanLeg();
		//leg.hello();
		leg.kick();
		//System.out.println(leg.hello());
	}
}
