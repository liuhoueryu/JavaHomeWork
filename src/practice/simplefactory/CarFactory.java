package practice.simplefactory;

public class CarFactory {
	public static Car createCar(String type) {
		if("bus".equals(type)) {
			return new Bus();
		}else if("taxi".equals(type)) {
			return new Taxi();
		}else return null;
	}
}
