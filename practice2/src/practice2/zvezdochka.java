package practice2;

public class zvezdochka {
	private int width;
	public zvezdochka(int width) {
		this.width = width;
	}
	public String toString() {
		String res = "";
		for (int i = 0; i < this.width + 1; i++) {
			for (int j = 0; j < i; j++) {
				res += "[*]";
			}
			res += "\n";
		}
		return res;
	}
}
