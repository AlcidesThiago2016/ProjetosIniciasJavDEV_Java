package devsuperior.HerancaMultipla.application;

import devsuperior.HerancaMultipla.devices.ConcretePrinter;
import devsuperior.HerancaMultipla.devices.ConcreteScanner;

public class Program {
    public static void main(String[] args) {

        ConcretePrinter p = new ConcretePrinter("1080");
        p.processDoc("My Letter");
        p.print("My Letter");

        ConcreteScanner s = new ConcreteScanner("2003");
        s.processDoc("My Email");
        System.out.println("Scan result: " + s.scan());
    }
}
