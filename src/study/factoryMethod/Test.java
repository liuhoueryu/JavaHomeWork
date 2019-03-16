package study.factoryMethod;

public class Test {

	public static void main(String[] args) {
		Car car1 = new BusFactory().carCreate();
		Car car2 = new TaxiFactory().carCreate();
		Car car3 = new TruckFactory().carCreate();
		car1.run();
		car2.run();
		car3.run();
	}

}
