package practice.singleton.taskmgr;

public class Client {

	public static void main(String[] args) {
		Tsg t11 = Tsg.getInstance();
		Tsg t12 = Tsg.getInstance();
		Tsg t13 = Tsg.getInstance();
		Tsm t21 = Tsm.getInstance();
		Tsm t22 = Tsm.getInstance();
		Tsm t23 = Tsm.getInstance();
		Tsr t31 = Tsr.getInstance();
		Tsr t32 = Tsr.getInstance();
		Tsr t33 = Tsr.getInstance();
		System.out.println(t11);
		System.out.println(t12);
		System.out.println(t13);
		System.out.println(t21);
		System.out.println(t22);
		System.out.println(t23);
		System.out.println(t31);
		System.out.println(t32);
		System.out.println(t33);
	}

}
