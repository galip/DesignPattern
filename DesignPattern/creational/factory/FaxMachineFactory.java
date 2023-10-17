package factory;

public class FaxMachineFactory extends PrinterFactory {
	@Override
	protected Printer printDocument() {
		return new FaxMachine();
	}
}