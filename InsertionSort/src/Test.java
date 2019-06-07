import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Test {

	public static void main(String[] args) throws IOException {
		
		ArrayList<Integer> list = InsertionSort.readFile("1000000.txt");
		InsertionSort.sort(list);
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println(InsertionSort.laufzeit);
		
	}
	
	static void toFile(ArrayList<Integer> list) throws IOException {
		
		PrintWriter writer = new PrintWriter(new FileWriter("neu.txt")); 
		
		for(int i = 0; i < list.size(); i++) {
			writer.println(list.get(i));
		}
		
		writer.close();
		
	}
}