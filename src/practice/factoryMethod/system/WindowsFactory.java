package practice.factoryMethod.system;

public class WindowsFactory implements OsystemFactory {
	@Override
	public Osystem createSystem() {
		return new Windows();
	}
}
