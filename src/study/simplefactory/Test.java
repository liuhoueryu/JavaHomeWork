package study.simplefactory;

public class Test {

	public static void main(String[] args) {
		Car car1 = new Bus();
		Car car2 = new Taxi();
		car1.run();
		car2.run();
	}

}
