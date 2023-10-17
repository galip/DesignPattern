package factory;

public abstract class PrinterFactory {
	public Printer print() {
		Printer printer = printDocument();
		printer.print();
		return printer;
	}
	protected abstract Printer printDocument();
}