import java.util.Scanner;

public class Quersumme {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Bitte geben sie eine natürliche Zahl ein: ");
		String n = scan.next();
		int stelle = 0;
		int summe = 0;
	
		while(stelle < n.length()){
			char zahl = n.charAt(stelle);
			int swap = Character.getNumericValue(zahl);
			summe = summe + swap;
			stelle = stelle +1;
		}
		System.out.println("Die Quersumme von " + n + " ist " + summe + ".");
	}

}
