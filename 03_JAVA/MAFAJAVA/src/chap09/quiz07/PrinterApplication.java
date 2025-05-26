package chap09.quiz07;

public class PrinterApplication {
	public static void main(String[] args) {
		Printer printer = new Printer();
		printer.powerOn();
		printer.print();
		LaserPrinter laserPrinter = new LaserPrinter();
		laserPrinter.print();
		laserPrinter.powerOff();
	}
}
