package practice.factoryMethod.pen;

public class Client {

	public static void main(String[] args) {
		Pen p1 = new PencileFactory().createPen();
		Pen p2 = new BrushFactory().createPen();
		p1.write();
		p2.write();

	}

}
