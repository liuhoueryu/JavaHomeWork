package practice.simplefactory.pen;

public class PenFactory {
	public static Pen CreatePen(String type) {
		if ("pencil".equals(type))
			return new Pencil();
		else if ("brush".equals(type))
			return new Brush();
		else
			return null;
	}
}
