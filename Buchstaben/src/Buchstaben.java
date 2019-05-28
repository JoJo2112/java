import java.util.Scanner;

public class Buchstaben {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int[] a = new int[26];
		String eingabe = scan.nextLine();
		int buchstaben = 0;
		
		for(int i = 0; i < eingabe.length(); i++) {
			char current = Character.toUpperCase(eingabe.charAt(i));
			
			if(current - 'A' >= 0 && current - 'A' <= 25) {
				a[current - 'A']++;
				buchstaben++;
			}
		}
		
		for(int i = 0; i < a.length; i++) {
			if(a[i] > 0) {
				char c = (char) (i + 'A');
				System.out.println(c + ": " + a[i] + " (" + (a[i]*100 / buchstaben) + "%)");
			}
		}
	}
}
