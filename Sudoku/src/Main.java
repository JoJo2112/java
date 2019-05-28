import java.io.*;
public class Main {
    
	private static void clear() {
		for(int i = 0; i < 30; i++)
			System.out.println("");
	}
	
    public static void main(String[] args) throws IOException {
        
            byte [][] spielfeld = {{0, 0, 0, 9, 0, 0, 7, 2, 8},
                                   {2, 7, 8, 0, 0, 3, 0, 1, 0},
                                   {0, 9, 0, 0, 0, 0, 6, 4, 0},
                                   {0, 5, 0, 0, 6, 0, 2, 0, 0},
                                   {0, 0, 6, 0, 0, 0, 3, 0, 0},
                                   {0, 1, 0, 0, 5, 0, 0, 0, 0},
                                   {1, 0, 0, 7, 0, 6, 0, 3, 4},
                                   {0, 0, 0, 5, 0, 4, 0, 0, 0},
                                   {7, 0, 9, 1, 0, 0, 8, 0, 5}};

        Sudoku test = new Sudoku(spielfeld,31);
        
        clear();
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        char status;
        int i, j; byte wert;
        boolean widerrufbar = false;
        
        
        if (! (args.length == 1)) {
            test.print();
        }
        
        do {
            if(widerrufbar) {
                widerrufbar = false;
                 if (! (args.length == 1)) {
                      System.out.println("Letzten Zug widerrufen? (j fuer ja, n fuer nein) ");
                      if(in.readLine().charAt(0) == 'j') {
                    	  	test.widerrufen();
                            test.print();
                      }    
                }
            }
            // Zeile einlesen
            i = Integer.parseInt(in.readLine());   
            // Spalte einlesen
            j = Integer.parseInt(in.readLine());
            // Wert einlesen;
            wert = Byte.parseByte(in.readLine());
            status = test.setze(i, j, wert);
            switch(status) {
                case 'w':
                    System.out.println("Wert muss zwischen 1 und 9 liegen!");
                    if ((args.length == 1) && (args[0].equals("wert"))) {
                         System.exit(0);
                     }
                    break;
                case 'p':
                    System.out.println("Zeilen- und Spaltenwerte muessen zwischen 1 und 9 liegen!");
                     if ( (args.length == 1) && (args[0].equals("zeile")||args[0].equals("spalte"))) {
                         System.exit(0);
                     } 
                    break;
                case 'z':
                    System.out.println(wert + " bereits in Zeile enthalten!");
                     if ( (args.length == 1) && (args[0].equals("bereitsinzeile"))) {
                         System.exit(0);
                     }                    
                    break;
                case 's':
                    System.out.println(wert + " bereits in Spalte enthalten!");
                     if ((args.length == 1) && (args[0].equals("bereitsinspalte"))) {
                         System.exit(0);
                     }                    
                    break;
                case 'q':
                    System.out.println(wert + " bereits im Quadrant enthalten!");
                     if ((args.length == 1) && (args[0].equals("bereitsinquadrant"))) {
                         System.exit(0);
                     }                     
                    break;
                default:
                    widerrufbar = true;
                     if (!((args.length == 1) && (args[0].equals("ohneAusgabe")))) {
                        test.print();
                     }
            }
        } while(status != 'f');
        System.out.println("Gratuliere, Sie haben das Raetsel geloest!");
    }
}
