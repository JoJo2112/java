public class Sudoku {
	
	private byte [][] spielfeld;
	private int werte;
	private int letztezeile = 0;
	private int letztespalte = 0;
	
	public Sudoku(byte [][] feld, int werte2) {
		spielfeld = feld;
		werte = werte2;
	}
	
	public void print() {
		
		boolean head = false;
		boolean zeile1 = false;
		boolean zeile2 = false;
		
		for(int i = 0; i < 9;) {
			if(i == 0 && !head) {
				System.out.println("  123 456 789");
				System.out.println("  --- --- ---");
				head = true;
			}
			if(i < 3 && head) {
				for(int k = 0; k < 9; k++) {
					if(k == 0) {
						System.out.print(i+1);
					}
					if(k == 0 || k == 3 || k == 6 || k == 9) {
						System.out.print("|");
					}
					if(spielfeld[i][k] != 0) {
						System.out.print(spielfeld[i][k]);
					}
					else {
						System.out.print("*");
					}
				}
				i++;
			}
			if(i == 3 && !zeile1) {
				System.out.println("\n  --- --- ---");
				zeile1 = true;
			}
			if(i < 7 && zeile1) {
				for(int k = 0; k < 9; k++) {
					if(k == 0) {
						System.out.print(i+1);
					}
					if(k == 0 || k == 3 || k == 6 || k == 9) {
						System.out.print("|");
					}
					if(spielfeld[i][k] != 0) {
						System.out.print(spielfeld[i][k]);
					}
					else {
						System.out.print("*");
					}
				}
				i++;
			}
			if(i == 6 && !zeile2) {
				System.out.println("\n  --- --- ---");
				zeile2 = true;
			}
			if(zeile2) {
				for(int k = 0; k < 9; k++) {
					if(k == 0) {
						System.out.print(i+1);
					}
					if(k == 0 || k == 3 || k == 6 || k == 9) {
						System.out.print("|");
					}
					if(spielfeld[i][k] != 0) {
						System.out.print(spielfeld[i][k]);
					}
					else {
						System.out.print("*");
					}
				}
				i++;
			}
			System.out.println("");
		}
	}
	
	public char setze(int zeile, int spalte, byte wert) {
		
		if(zeile < 1 || zeile > 9 || spalte < 1 || spalte > 9) {
			return 'p';
		}
		if(wert < 1 || wert > 9) {
			return 'w';
		}
		for(int i = 0; i < 9; i++) {
			if(spielfeld[zeile-1][i] == wert) {
				return 'z';
			}
			if(spielfeld[i][spalte-1] == wert) {
				return 's';
			}
		}
		
		if(zeile <= 3) {
			if(spalte <= 3) {
				for(int i = 0; i < 3; i++) {
					for(int k = 0; k < 3; k++) {
						if(spielfeld[i][k] == wert) {
							return 'q';
						}
					}
				}
			}
			if(spalte >= 4 && spalte <= 6) {
				for(int i = 0; i < 3; i++) {
					for(int k = 3; k < 6; k++) {
						if(spielfeld[i][k] == wert) {
							return 'q';
						}
					}
				}
			}
			if(spalte >= 7) {
				for(int i = 0; i < 3; i++) {
					for(int k = 6; k < 9; k++) {
						if(spielfeld[i][k] == wert) {
							return 'q';
						}
					}
				}
			}
		}
		
		if(zeile >= 4 && zeile <= 6) {
			if(spalte <= 3) {
				for(int i = 3; i < 6; i++) {
					for(int k = 0; k < 3; k++) {
						if(spielfeld[i][k] == wert) {
							return 'q';
						}
					}
				}
			}
			if(spalte >= 4 && spalte <= 6) {
				for(int i = 3; i < 6; i++) {
					for(int k = 3; k < 6; k++) {
						if(spielfeld[i][k] == wert) {
							return 'q';
						}
					}
				}
			}
			if(spalte >= 7) {
				for(int i = 3; i < 6; i++) {
					for(int k = 6; k < 9; k++) {
						if(spielfeld[i][k] == wert) {
							return 'q';
						}
					}
				}
			}
		}
		
		if(zeile >= 7) {
			if(spalte <= 3) {
				for(int i = 6; i < 9; i++) {
					for(int k = 0; k < 3; k++) {
						if(spielfeld[i][k] == wert) {
							return 'q';
						}
					}
				}
			}
			if(spalte >= 4 && spalte <= 6) {
				for(int i = 6; i < 9; i++) {
					for(int k = 3; k < 6; k++) {
						if(spielfeld[i][k] == wert) {
							return 'q';
						}
					}
				}
			}
			if(spalte >= 7) {
				for(int i = 6; i < 9; i++) {
					for(int k = 6; k < 9; k++) {
						if(spielfeld[i][k] == wert) {
							return 'q';
						}
					}
				}
			}
		}
		letztezeile = zeile;
		letztespalte = spalte;
		spielfeld[zeile-1][spalte-1] = wert;
		werte++;
		if (werte < 81) {
			return 'l';
		}
		else {
			return 'f';
		}
		
	}
	
	public void widerrufen() {
		spielfeld[letztezeile-1][letztespalte-1] = 0;
		werte--;
	}
	
}
