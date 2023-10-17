package factory;

public class PhotoCopyMachine implements Printer {
	@Override
	public void print() {
		System.out.println("Photocopy machine is working.");
	}
}