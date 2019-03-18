package study.abstractFactory;

public interface Engine {
	void run();

	void start();
}

class LuxuryEngine implements Engine {
	@Override
	public void run() {
		System.out.println("fast");

	}

	@Override
	public void start() {
		System.out.println("fast");

	}
}

class LowEngine implements Engine {
	@Override
	public void run() {
		System.out.println("slowly");

	}

	@Override
	public void start() {
		System.out.println("slowly");

	}
}