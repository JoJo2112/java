import java.util.Scanner;

public class Kuerbis {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int g = 1;
		double dmax = 0;
		double ggesamt = 0;
		double laster;
		double d = 0;
		
		while (g != 0) {
			System.out.print("Bitte geben sie das Gewicht des Kürbis in kg ein: ");
			g = input.nextInt();
			
			if(g != 0) {
				System.out.print("Bitte geben sie den Durchmesser des Kürbis in m ein: ");
				d = input.nextDouble();
				if (d > dmax) {
					dmax = d;
				}
				ggesamt = ggesamt + g;	
			}
		}
		laster = Math.ceil(ggesamt / 1000);
		System.out.println("groesster Durchmesser: " + dmax);
		System.out.println("Anzahl der Laster: " + laster);
	}

}
