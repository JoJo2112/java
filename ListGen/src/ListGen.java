import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class ListGen {

	public static void main(String[] args) throws IOException {
		
		PrintWriter writer = new PrintWriter(new FileWriter("1000000.txt")); 
		Random generator = new Random();
		
		for(int i = 0; i < 1000000; i++) {
			writer.println(generator.nextInt(1000000));
		}
		
		writer.close();
		
	}
	
}
