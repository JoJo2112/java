import java.util.List;

public abstract class Heapsort {
	
	
	public static <T extends Comparable<? super T> > void sort(List<T> array) {
		
		createHeap(array);

        for (int i = array.size() - 1; i >= 0; i--) 
        { 
            T temp = array.get(0);
            array.set(0, array.get(i));
            array.set(i, temp);
  
            heapify(array, i, 0); 
        }
		
	}
	
	private static <T extends Comparable<? super T> > void createHeap(List<T> array) {
		
		int n = array.size();
		
		for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(array, n, i); 
		}
		
	}
		
	private static <T extends Comparable<? super T> > void heapify(List<T> array, int n, int i) {
		
		int max = i;  
        int l = 2*i + 1; 
        int r = 2*i + 2; 
        
        if (l < n && array.get(l).compareTo(array.get(max)) > 0)
            max = l;
  
        if (r < n && array.get(r).compareTo(array.get(max)) > 0)
            max = r; 
        
        if (max != i) 
        { 
            T swap = array.get(i); 
            array.set(i, array.get(max));
            array.set(max, swap);
            
            heapify(array, n, max); 
        } 
		
	}
	
}
