package practice.factoryMethod.pen;

public class PencileFactory implements PenFactory {
	@Override
	public Pen createPen() {
		return new Pencile();
	}
}
