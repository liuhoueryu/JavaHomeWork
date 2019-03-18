package study.abstractFactory;

public interface CarFactory {
	Engine createEngine();

	Seat createSeat();

	Tyre createTyre();
}
