package bonus;

public class Pair {
	private int key;
	private int value;
	
	public Pair() {}
	
	public Pair(int key, int value) {
		this.key = key;
		this.value = value;
	}
	
	public int getKey() {
		return key;
	}

	public void setKey(int key) {
		this.key = key;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if (!(obj instanceof Pair))
			return false;
		Pair pair = (Pair) obj;
		return pair.key == key && pair.value == value;
	}
	
	public String toString() {
		return "[" + key + ", " + value + "]";
	}
}
