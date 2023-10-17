package factory;

public class FaxMachine implements Printer {
	@Override
	public void print() {
		System.out.println("Fax machine is working.");
	}
}