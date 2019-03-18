package practice.factoryMethod.pen;

public class BrushFactory implements PenFactory {
	@Override
	public Pen createPen() {
		return new Brush();
	}
}
