import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Test {
public static void main(String[] args) throws IOException {
		
		ArrayList<Integer> list = readFile("1000000.txt");
		Heapsort.sort(list);
		
		toFile(list);
		
	}
	
	static void toFile(ArrayList<Integer> list) throws IOException {
		
		PrintWriter writer = new PrintWriter(new FileWriter("neu.txt")); 
		
		for(int i = 0; i < list.size(); i++) {
			writer.println(list.get(i));
		}
		
		writer.close();
		
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
