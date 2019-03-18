package practice.factoryMethod;

public class TaxiFactory implements CarCreate {
	@Override
	public Car carCreate() {
		return new Taxi();
	}
}
