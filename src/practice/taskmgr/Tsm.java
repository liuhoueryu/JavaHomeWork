package practice.taskmgr;

public class Tsm {
	private static Tsm t = new Tsm();

	private Tsm() {
	}

	public static Tsm getInstance() {
		return t;
	}
}
