package practice.simplefactory;

public class Test {

	public static void main(String[] args) {
		Car car1 = CarFactory.createCar("bus");
		Car car2 = CarFactory.createCar("taxi");
		car1.run();
		car2.run();
	}

}
