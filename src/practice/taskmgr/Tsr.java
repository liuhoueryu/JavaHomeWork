package practice.taskmgr;

public class Tsr {
	private static class getTsr {
		private static Tsr t = new Tsr();
	}

	private Tsr() {
	}

	public static Tsr getInstance() {
		return getTsr.t;
	}
}
