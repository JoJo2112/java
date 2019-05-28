import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MergeSort {
	
	public static long laufzeit = 0;
	
	public static <T extends Comparable<? super T>> void sort(List<T> list) {
		
		if(list.size() == 1) {
			return;
		}
		else {
			List<T> neueListe = new ArrayList<T>();
			neueListe = mergesort(list);
			list.clear();
			list.addAll(neueListe);
		}
	}
	
	private static <T extends Comparable<? super T>> List<T> mergesort(List<T> list) {
		
		List<T> linkeListe = new ArrayList<T>();
		List<T> rechteListe = new ArrayList<T>();
		
		if(list.size() <= 1) {
			return list;
		}
		else {
			for(int i = 0; i < (list.size()/2); i++) {
				linkeListe.add(list.get(i));
				laufzeit++;
			}
			for(int i = (list.size()/2); i < list.size(); i++) {
				rechteListe.add(list.get(i));
				laufzeit++;
			}
		}
		
		linkeListe = mergesort(linkeListe);
		rechteListe = mergesort(rechteListe);
		
		return merge(linkeListe,rechteListe);
	}

	private static <T extends Comparable<? super T>> List<T> merge(List<T> linkeListe, List<T> rechteListe) {
		
		List<T> neueListe = new ArrayList<T>();
		
		while(linkeListe.size() > 0 && rechteListe.size() > 0) {
			if(linkeListe.get(0).compareTo(rechteListe.get(0)) <= 0) {
				neueListe.add(linkeListe.get(0));
				linkeListe.remove(0);
			}
			else {
				neueListe.add(rechteListe.get(0));
				rechteListe.remove(0);
			}
			laufzeit++;
		}
		
		while(linkeListe.size() > 0) {
			neueListe.add(linkeListe.get(0));
			linkeListe.remove(0);
			laufzeit++;
		}
		
		while(rechteListe.size() > 0) {
			neueListe.add(rechteListe.get(0));
			rechteListe.remove(0);
			laufzeit++;
		}
		return neueListe;

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