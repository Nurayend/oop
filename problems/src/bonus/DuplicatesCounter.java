package bonus;

import java.util.Vector;

public class DuplicatesCounter {
	Vector<Pair> v = new Vector<Pair>();
	int[] cnt = new int[7];
	
	public void calculateDuplicates(int a) {
		if (v.isEmpty())
			v.add(new Pair(a, 1));
		for (int i = 0; i < v.size(); i++) {
			if (v.get(i).getKey() == a)
				cnt[i]++;
			else 
				v.add(new Pair(a, 1));
		}
		System.out.println(v);
	}
	
	public void print() {
		System.out.println(v);
	}
}
