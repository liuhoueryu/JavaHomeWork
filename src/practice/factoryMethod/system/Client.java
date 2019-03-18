package practice.factoryMethod.system;

public class Client {
	public static void main(String[] args) {
		Osystem Os1 = new WindowsFactory().createSystem();
		Osystem Os2 = new LinuxFactory().createSystem();
		Osystem Os3 = new MacFactory().createSystem();
		Osystem Os4 = new UnixFactory().createSystem();
		Os1.run();
		Os2.run();
		Os3.run();
		Os4.run();
	}
}
