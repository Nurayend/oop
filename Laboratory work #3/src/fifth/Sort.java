package fifth;

public class Sort {

	  static <E> void swap(E[] array, int i, int j) {
	     E e = array[i];
	     array[i] = array[j];
	     array[j] = e;
	  }
	  
	  static <E extends Comparable<E>> void bubbleSort(E [] array) {
	    for(int i = 0; i < array.length; i++) {
	      for(int j = i + 1; j < array.length; j++) {
	        if(array[i].compareTo(array[j]) > 0) 
	          swap(array, i, j);         
	      }
	    }
	  }
	  
	  static <E extends Comparable<E>> void quickSort(E[] array) {
	    quickSort(array, 0, array.length - 1);
	  }

	  static <E extends Comparable<E>> void quickSort(E[] array, int left, int right) {
	    int i = left;
	    int j = right;
	    E mid = (E) array[(left + right) / 2];
	    
	    while (i < j) {
	      while (array[i].compareTo(mid) < 0)
	        i++;
	      while (array[j].compareTo(mid) > 0)
	        j--;
	      if (i <= j) {
	        swap(array, i, j);
	        i++;
	        j--;
	      }
	    }
	    
	    if (left < j)
	      quickSort(array, left, j);
	    
	    if (i < right)
	      quickSort(array, i, right);
	  }
}