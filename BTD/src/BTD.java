public class BTD {

	public static void main(String[] args) {
		boolean [] in = {true, false, true, false, true, false};

		int val = 0;
		int i = 0;
		while (i < in.length) {
			if (in[i])
				val = val * 2 + 1;
			else
				val = val * 2;
			i = i + 1;
		}
		System.out.println(val);
	}

}
