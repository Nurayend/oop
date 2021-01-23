package fifth;

public class Series extends Circuit{
	private Circuit c1;
	private Circuit c2;

	public Series(Circuit c1, Circuit c2) {
		this.c1 = c1;
		this.c2 = c2;
	}
	
	public double getResistance() {
		return c1.getResistance() + c2.getResistance();
	}
	
	public void applyPotentialDiff(double v) {
		double I = v / getResistance();
		c1.applyPotentialDiff(I * c1.getResistance());
		c2.applyPotentialDiff(I * c2.getResistance());
	}
	
	public double getPotentialDiff() {
		return c1.getPotentialDiff() + c2.getPotentialDiff();
	}

}
