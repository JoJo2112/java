import java.util.Random;
import java.util.Scanner;

public class Weihnachtsbaum {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random generator = new Random();
		System.out.print("s = ");
    	int s = scanner.nextInt();
    	int i = 0;
    	int p = s / 2;
    	boolean letztekugel = true;
    	for(; i < s; i+=2) {
    		for(int swap = p; swap > 0; swap--) {
    			System.out.print(" ");
    		}
    		for(int k = 0; k <= i; k++) {
    			if(generator.nextInt(100)+1 > 35 || letztekugel) {
    				if(i == 0)
    					System.out.print("$");
    				else
    					System.out.print("#");
    				letztekugel = false;
    			}
    			else {
    				System.out.print("*");
    				letztekugel = true;
    			}
    		}
    		p--;
    		System.out.println("");
    	}
    	for(int k = 1; k < s / 2; k++)
    		System.out.print(" ");
    	System.out.print("|||");
    	System.out.println("");
    	for(int k = 1; k < s / 2; k++)
    		System.out.print(" ");
    	System.out.print("|||");
	}
}
