package study.singleton;
//Ë«ÖØ¼ì²âËøÄ£Ê½
public class Singleton3 {
	private static Singleton3 single;

	private Singleton3() {
	}

	public static Singleton3 getInstance() {
		if (single == null) {
			Singleton3 sc;
			synchronized (Singleton3.class) {
				sc = single;
				if (sc == null) {
					synchronized (Singleton3.class) {
						if (sc == null) {
							sc = new Singleton3();
						}
					}
					single = sc;
				}
			}
		}
		return single;
	}
}
