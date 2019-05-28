import java.util.Scanner;

public class Kennzahlen {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double zahl = 0;
		int anzahl = 0;
		double summe = 0;
		double max = 0;
		double min = 0;
		double zweitmin = 0;
		
		while(scan.hasNextDouble()) {
			zahl = scan.nextDouble();
			summe = summe + zahl;
			if(anzahl == 0 || zahl > max) {
				max = zahl;
			}
			if(anzahl == 0 || zahl < min) {
				zweitmin = min;
				min = zahl;
			}
			if((anzahl == 2 && zahl > min && zahl < max) || (anzahl > 2 && zahl > min && zahl < zweitmin)) {	
				zweitmin = zahl;
			}
			if(anzahl < 2) {
				zweitmin = max;
			}
			anzahl = anzahl + 1;
		}
		
		System.out.println("Anzahl: " + anzahl);
		System.out.println("Summe: " + summe);
		System.out.println("Mittelwert: " + summe / anzahl);
		System.out.println("Maximum: " + max);
		System.out.println("Minimum: " + min);
		System.out.println("Zweitkleinste Zahl: " + zweitmin);
	}

}
