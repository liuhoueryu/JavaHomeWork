package practice.simplefactory.pen;

public class Client {

	public static void main(String[] args) {
		Pen p1 = PenFactory.CreatePen("pencil");
		Pen p2 = PenFactory.CreatePen("brush");
		p1.write();
		p2.write();

	}

}
