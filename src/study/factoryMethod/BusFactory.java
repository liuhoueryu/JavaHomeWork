package study.factoryMethod;

public class BusFactory implements CarCreate{
	@Override
	public Car carCreate() {
		return new Bus();
	}
}
