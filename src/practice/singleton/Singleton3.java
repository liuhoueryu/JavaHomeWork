package practice.singleton;

public class Singleton3 {
	private static class SingletonInstance {
		private static Singleton3 single = new Singleton3();
	}

	private Singleton3() {
	}

	public static Singleton3 getInstance() {
		return SingletonInstance.single;
	}
}
