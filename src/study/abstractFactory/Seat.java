package study.abstractFactory;

public interface Seat {
	void feel();
}

class LuxurySeat implements Seat {
	@Override
	public void feel() {
		System.out.println("comfortable");

	}
}

class LowSeat implements Seat {
	@Override
	public void feel() {
		System.out.println("Just soso");

	}
}