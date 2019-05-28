import java.util.Scanner;
import java.util.Random;

public class Zufallszahlen {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = 0;
		int[] eingaben = new int[6];
		
		System.out.println("Ihr Tipp:");
		while(n < 6) {
			int zahl = scan.nextInt(); 
			
			int i = 0;
			boolean found = false;
			while(i < n) {
				if(eingaben[i] == zahl) {
					found = true;
				}
				i++;
			}
			
			if(zahl >= 1 && zahl <= 49 && !found) {
				eingaben[n] = zahl;
				n++;
			}
			else if (!found) {
				System.out.println("Bitte eine Zahl zwischen 1 und 49 abgegeben!");	
			}
			else {
				System.out.println("Diese Zahl kam als Tipp bereits vor.");	
			}
		}
		
		int[] zufallszahlen = new int[6];
		int position = 0;
		Random generator = new Random();
		while(position < 6) {
			boolean found = false;
			zufallszahlen[position] = generator.nextInt(49)+1;
			int position2 = 0;
			while(position2 < position) {
				if(zufallszahlen[position] == zufallszahlen[position2]) {
					found = true;
				}
				position2++;
			}
			if(!found) {
				System.out.println(position + 1 + "te Zahl der Ziehung: " + zufallszahlen[position]);
				position++;
			}
		}
		
		position = 0;
		int richtige = 0;
		while(position < 6) {
			int position2 = 0;
			while(position2 < 6) {
				if(zufallszahlen[position] == eingaben[position2]) {
					richtige++;
				}
				position2++;
			}
			position++;
		}
		System.out.println("Sie haben " + richtige + " Richtige!");
	}

}
