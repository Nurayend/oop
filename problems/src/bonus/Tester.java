package bonus;

import java.util.Arrays;
import java.util.Vector;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DuplicatesCounter d = new DuplicatesCounter();
		int arr[] = new int[] {1, 1, 2, 3, 1, 2};
		Vector<Pair> v = new Vector<Pair>();
		int n = arr.length;
		int cnt[] = new int[n];
		int count = 1;
		boolean check[] = new boolean[n];
		Arrays.fill(check, false);
		Arrays.sort(arr);
		for(int i = 0; i < arr.length; i++) {
			d.calculateDuplicates(arr[i]);
		}
		
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = i + 1; j < arr.length; j++) {
//				if (check[i] != true && arr[i] == arr[j]) {
//					cnt[i]++;
//					check[j] = true;
//				}
//				v.add(new Pair(arr[i], cnt[i]));
//			}
//		}
		
		System.out.println(v);
	}

}
