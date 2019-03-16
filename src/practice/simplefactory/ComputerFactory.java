package practice.simplefactory;

public class ComputerFactory {
	public static Computer createComputer(String type) {
		if("Hp".equals(type))
			return new Hp();
		else if("Dell".contentEquals(type))
			return new Dell();
		else return null;
	}
}
