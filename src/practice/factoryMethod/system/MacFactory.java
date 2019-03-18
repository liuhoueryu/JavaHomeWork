package practice.factoryMethod.system;

public class MacFactory implements OsystemFactory{
	@Override
	public Osystem createSystem() {
		return new Mac();
	}
}
