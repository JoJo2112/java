import java.util.Scanner;

public class Memory {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char[] memory = {'A','B','A','B','C','C'};
		boolean[] aufgedeckt = new boolean[memory.length];
		int mschleife = 0;
		int versuche = 0;
		
		while(mschleife < memory.length) {
			System.out.println("Indizes der Spielkarten:");
			int schleife = 0;
			int index1 = scan.nextInt();
			int index2 = scan.nextInt();
			
			if(index1 >= 0 && index1 < memory.length && index2 >= 0 && index2 < memory.length) {
				if(memory[index1] == memory[index2]) {
					aufgedeckt[index1] = true;
					aufgedeckt[index2] = true;
					mschleife = mschleife + 2;
				}
			
				while(schleife < memory.length) {
					if(aufgedeckt[schleife] || schleife == index1 || schleife == index2){
						System.out.print(memory[schleife]);
						schleife++;
					}
					else {
						System.out.print("*");
						schleife++;
					}
				}
			
				System.out.println("");
				int leerzeichen = 0;
				while(leerzeichen < memory.length) {
					if(leerzeichen == index1 || leerzeichen == index2) {
						System.out.print("^");
					}
					else {
						System.out.print(" ");
					}
					leerzeichen++;
				}
				versuche++;
				System.out.println("\n");
			}
			else {
				System.out.println("Einer dieser Zahlen ist kein gueltiger Index.\n");
			}
		}
		System.out.println("Sie haben " + versuche + " Versuche benoetigt!");
	}
}
