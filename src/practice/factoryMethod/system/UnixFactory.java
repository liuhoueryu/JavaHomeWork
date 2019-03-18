package practice.factoryMethod.system;

public class UnixFactory implements OsystemFactory {
	@Override
	public Osystem createSystem() {
		return new Unix();
	}
}
