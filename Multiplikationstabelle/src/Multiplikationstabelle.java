import java.util.Scanner;

public class Multiplikationstabelle {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int zeile = 0;
		int werte = 0;

		
		if(n >= 1 && n <= 9) {
			int[] a = new int[n];
			a[0] = 1;
			
			while(werte < n) {
				a[werte] = werte + 1;
				werte = werte + 1;
			}
				
			while(zeile < n) {
				if(zeile == 0) {
					int swap = 0;
					System.out.print("*");
					while(swap < n) {
						System.out.print("  " + a[swap]);  //\n
						swap = swap + 1;
					}
				}
				System.out.println("");
				System.out.print(a[zeile]);
				zeile = zeile + 1;
				int swap = 0;
				while(swap < n) {
					if(a[zeile-1] * a[swap] < 10){
						System.out.print("  " + a[zeile-1] * a[swap]);
					}
					else {
						System.out.print(" " + a[zeile-1] * a[swap]);
					}
					swap = swap + 1;
				}
			}
			System.out.println("");
		}
		else {
			System.out.println("Ungültige Eingabe! Nur Zahlen von 1 bis 9 akzeptiert.");
		}
		
	}

}
