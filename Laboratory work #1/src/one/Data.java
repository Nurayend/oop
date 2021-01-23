package one;

public class Data {
		
		private int counter;
		private double maximum;
		private double sum;

		public Data() {
			counter = 0;
			maximum = -1000;
			sum = 0;
		}
		
		public void add(String s) {
			Double number = Double.parseDouble(s);
			sum += number;
			counter++;
			if (number > maximum)
				maximum = number;
		}
		
		public double getAverage() {
			return sum/counter;
		}
		
		public double getMaximum() {
			return maximum;
		}
		

}
