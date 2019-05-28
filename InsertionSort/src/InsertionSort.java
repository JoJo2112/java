import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InsertionSort {
	
	public static long laufzeit = 0;
	
	public static <T extends Comparable<? super T>> void sort(List<T> list) {
         
		for(int i = 1; i < list.size(); i++) {
    		
			T wert = list.get(i);
			int j = i;
    		for(; j > 0 && list.get(j-1).compareTo(wert) > 0; j--) {
    			list.set(j,list.get(j-1));
    			laufzeit++;
    		}
    		list.set(j, wert);
		}
	}
	
	public static ArrayList<Integer> readFile(String filename) throws FileNotFoundException {
		
		Scanner scan = new Scanner(new FileReader(filename));
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		while(scan.hasNextLine()) {
			numbers.add(Integer.parseInt(scan.nextLine()));
		}
		scan.close();
		return numbers;
	}
}