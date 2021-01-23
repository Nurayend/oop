package fifth;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circuit a = new Resistor(3.0);
		Circuit b = new Resistor(3.0);
		Circuit c = new Resistor(6.0);
		Circuit d = new Resistor(3.0);
		Circuit e = new Resistor(2.0); //R = 2
		Circuit f = new Series(a, b); // R1 = 3, R2 = 3 -> R = 6
		Circuit g = new Parallel(c, d);
		Circuit h = new Series(g, e); // R1.1 = 6, R1.2 = 3, R2 = 2 -> R = 4
		Circuit circuit = new Parallel(h, f); // 2 series: R1 = 6, R2 = 4 -> R = 12/5
		circuit.applyPotentialDiff(12); // V = 12 R = 12/5 -> I = 5
		//double R = circuit.getResistance();
		
		System.out.println(circuit.getCurrent());
	}

}
