package study.singleton;

public class Test {

	public static void main(String[] args) {
		// TODO  Auto-generated method stub
		Singleton1 s1= Singleton1.getInstance();
		Singleton1 s2= Singleton1.getInstance();
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1==s2);
		
		Singleton2 s3= Singleton2.getInstance();
		Singleton2 s4= Singleton2.getInstance();
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s3==s4);
		
		Singleton3 s5= Singleton3.getInstance();
		Singleton3 s6= Singleton3.getInstance();
		System.out.println(s5);
		System.out.println(s6);
		System.out.println(s5==s6);
		
		Singleton4 s7= Singleton4.getInstance();
		Singleton4 s8= Singleton4.getInstance();
		System.out.println(s7);
		System.out.println(s8);
		System.out.println(s7==s8);
		
		Singleton5 s9=Singleton5.SINGLE;
		Singleton5 s10=Singleton5.SINGLE;
		System.out.println(s9);
		System.out.println(s10);
		System.out.println(s9==s10);
	}

}
