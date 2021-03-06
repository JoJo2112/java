import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Test {

	public static void main(String[] args) throws IOException {
		
		ArrayList<Integer> list = MergeSort.readFile("1000000.txt");
		MergeSort.sort(list);
		toFile(list);
		
	}
	
	static void toFile(ArrayList<Integer> list) throws IOException {
		
		PrintWriter writer = new PrintWriter(new FileWriter("neu.txt")); 
		
		for(int i = 0; i < list.size(); i++) {
			writer.println(list.get(i));
		}
		
		writer.close();
		
	}
}
