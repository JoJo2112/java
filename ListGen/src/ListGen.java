import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class ListGen {

	public static void main(String[] args) throws IOException {
		
		PrintWriter writer = new PrintWriter(new FileWriter("50.txt")); 
		Random generator = new Random();
		
		for(int i = 0; i < 50; i++) {
			writer.println(generator.nextInt(100));
		}
		
		writer.close();
		
	}
	
}
