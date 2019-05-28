import java.util.Scanner;

public class BF {

	public static void main(String[] args) {
		int n;
        if(args.length > 0)
        	n = Integer.parseInt(args[0]);
        else {
        	Scanner scanner = new Scanner(System.in);
        	System.out.print("n = ");
        	n = scanner.nextInt();
        }
        if(n <= 0) {
            System.out.println("Eingabe muss > 0 sein!");
            return;
        }
        binomFormel(n);
	}
	
	private static void binomFormel (int n) {
		for(int k = 0; k <= n; k++) {
			if(binomKo(n,k) > 1)
				System.out.print(binomKo(n,k));
			if(n - k > 0)
				System.out.print("a");
			if(n - k > 1)
				System.out.print("^" + (n - k));
			if(k > 0)
				System.out.print("b");
			if(k > 1)
				System.out.print("^" + k);
			
			if(k < n)
				System.out.print(" + ");
		}
	}
	
	private static long binomKo(long n, long k) {
		long binomKo = fak(n) / (fak(k) * fak(n - k));
		return binomKo;
	}
	
	private static long fak(long n) {
	   if (n > 1)
		   return(n * fak(n-1)); 
	   else
		   return(1);
	}
}
