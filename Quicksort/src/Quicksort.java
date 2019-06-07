import java.util.List;

public class Quicksort {
	
	public static <T extends Comparable<? super T>> void sort(List<T> list) {
		
		quicksort(list,0,list.size()-1);
		
	}
	
	private static <T extends Comparable<? super T>> void quicksort(List<T> list, int left, int right) {
		
		int splitpoint;
		
		if(left < right) {
			splitpoint = partition(list, left, right);
			quicksort(list, left, splitpoint-1);
			quicksort(list, splitpoint+1, right);
		}
		
	}
	
	private static <T extends Comparable<? super T>> int partition(List<T> list, int left, int right) {
		
		int i = left;
		int j = right - 1;
		T pivot = list.get(right);
		
		while(i < j) {
			
			while(i < right && list.get(i).compareTo(pivot) < 0) {
				i += 1;
			}
			
			while(j > left && (list.get(j).compareTo(pivot) > 0 || list.get(j).compareTo(pivot) == 0)) {
				j -= 1;
			}
			
			if(i < j) {
				T temp = list.get(i);
				list.set(i, list.get(j));
				list.set(j, temp);
			}
			
		}
		
		T temp = list.get(i);
		list.set(i, list.get(right));
		list.set(right, temp);
		
		return i;
	}
	
		
}
