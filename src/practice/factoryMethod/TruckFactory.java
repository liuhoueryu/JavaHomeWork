package practice.factoryMethod;

public class TruckFactory implements CarCreate {
	@Override
	public Car carCreate() {
		return new Truck();
	}
}
