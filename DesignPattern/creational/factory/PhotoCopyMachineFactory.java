package factory;

public class PhotoCopyMachineFactory extends PrinterFactory {
	@Override
	protected Printer printDocument() {
		return new PhotoCopyMachine();
	}
}