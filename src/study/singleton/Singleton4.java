package study.singleton;
//��̬�ڲ�ʵ����
public class Singleton4 {
	private static class SingletonInstance {
		private static Singleton4 single = new Singleton4();
	}

	private Singleton4() {
	}

	public static Singleton4 getInstance() {
		return SingletonInstance.single;
	}
}
