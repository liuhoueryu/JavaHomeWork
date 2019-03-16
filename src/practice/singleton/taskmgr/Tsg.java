package practice.singleton.taskmgr;

public class Tsg {
	private static Tsg t;

	private Tsg() {
	}

	public static Tsg getInstance() {
		if (t == null)
			t = new Tsg();
		return t;
	}
}
