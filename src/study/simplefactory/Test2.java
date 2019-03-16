package study.simplefactory;

public class Test2 {

	public static void main(String[] args) {
		Car car1 = CarFactory.createCar("taxi");
		Car car2 = CarFactory.createCar("bus");
		car1.run();
		car2.run();
	}

}
