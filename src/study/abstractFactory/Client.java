package study.abstractFactory;

public class Client {

	public static void main(String[] args) {
		CarFactory f1 = new LuxuryCarFactory();
		Engine e1 = f1.createEngine();
		e1.run();
		e1.start();

	}

}
