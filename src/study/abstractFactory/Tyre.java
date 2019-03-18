package study.abstractFactory;

public interface Tyre {
	void brake();
}

class LuxuryTyre implements Tyre {
	@Override
	public void brake() {
		System.out.println("good");

	}
}

class LowTyre implements Tyre {
	@Override
	public void brake() {
		System.out.println("commonly");

	}
}