package practice.simplefactory;

public class Test1 {

	public static void main(String[] args) {
		Computer c1 = ComputerFactory.createComputer("Hp");
		Computer c2 = ComputerFactory.createComputer("Dell");
		c1.display();
		c2.display();
	}

}
