package practice.factoryMethod.system;

public class LinuxFactory implements OsystemFactory {
	@Override
	public Linux createSystem() {
		return new Linux();

	}
}
