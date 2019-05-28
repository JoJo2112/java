import java.util.Scanner;

public class Schaltjahr {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int jahr = input.nextInt();
		
		if(jahr % 4 == 0 && (jahr % 100 != 0 || jahr % 400 == 0)) {
			System.out.println("Das Jahr " + jahr + " ist ein Schaltjahr.");
		}
		else {
			System.out.println("Das Jahr " + jahr + " ist kein Schaltjahr.");
		}
		

	}

}
