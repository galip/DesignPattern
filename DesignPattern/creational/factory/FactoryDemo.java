package factory;

public class FactoryDemo {
	public static void main(String args[]) {

		FaxMachineFactory faxMachineFactory = new FaxMachineFactory();
		faxMachineFactory.print();

		PhotoCopyMachineFactory photoCopyMachineFactory = new PhotoCopyMachineFactory();
		photoCopyMachineFactory.print();

	}
}