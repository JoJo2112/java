import java.util.List;

public abstract class Heapsort {
	
	
	public static <T extends Comparable<? super T> > void sort(List<T> array) {
		
		int n = array.size();
		
        // Build heap (rearrange array) 
		for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(array, n, i); 
		}
  
        // One by one extract an element from heap 
        for (int i=n-1; i>=0; i--) 
        { 
            // Move current root to end 
            T temp = array.get(0);
            array.set(0, array.get(i));
            array.set(i, temp);
  
            // call max heapify on the reduced heap 
            heapify(array, i, 0); 
        }
		
	}
		
	private static <T extends Comparable<? super T> > void heapify(List<T> array, int n, int i) {
		
		int max = i; // Initialize largest as root 
        int l = 2*i + 1; // left = 2*i + 1 
        int r = 2*i + 2; // right = 2*i + 2 
  
        // If left child is larger than root 
        //arr[l] > arr[largest])
        
        if (l < n && array.get(l).compareTo(array.get(max)) > 0) 
            max = l; 
  
        // If right child is larger than largest so far 
        if (r < n && array.get(r).compareTo(array.get(max)) > 0) 
            max = r; 
  
        // If largest is not root 
        if (max != i) 
        { 
            T swap = array.get(i); 
            array.set(i, array.get(max));
            array.set(max, swap);
  
            // Recursively heapify the affected sub-tree 
            heapify(array, n, max); 
        } 
		
	}
	
}
