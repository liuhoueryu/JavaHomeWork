package study.singleton;
//懒汉式
public class Singleton2 {
	private static Singleton2 single;

	private Singleton2() {
	}

	public static synchronized Singleton2 getInstance() {
		if (single == null)
			single = new Singleton2();
		return single;
	}
}
