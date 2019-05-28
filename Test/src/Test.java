import java.util.ArrayList;
import java.util.List;


public class Test {
	
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(5);
		list.add(5);
		
		
		sort(list);
		for(int i = 0; i < list.size();i++) {
			System.out.println(list.get(i));
		}
		
	}
	
	public static <T extends Comparable<? super T>> void sort(List<T> list) {
		
		list.remove(0);
		
		
	}
	
}