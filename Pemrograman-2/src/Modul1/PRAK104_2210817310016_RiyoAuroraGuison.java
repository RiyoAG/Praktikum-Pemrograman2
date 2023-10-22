package Modul1;

import java.util.Scanner;

public class PRAK104_2210817310016_RiyoAuroraGuison {
	    public static void main(String[] args) {
	    	Scanner in = new Scanner(System.in);
	        System.out.print("Tangan Abu: ");
	        String Abu = in.nextLine();
	        System.out.print("Tangan Bagas: ");
	        String Bagas = in.nextLine();

	        int poinAbu = 0, poinBagas = 0;

	        for (int i = 0; i < Abu.length(); i++) {
	            char charAbu = Abu.charAt(i);
	            char charBagas = Bagas.charAt(i);

	            if (charAbu == 'G' && charBagas == 'B'
	               ||charAbu == 'K' && charBagas == 'G'
	               ||charAbu == 'B' && charBagas == 'K') {
	                poinBagas++;
	            } else if (charAbu == 'B' && charBagas == 'G'
	               ||charAbu == 'G' && charBagas == 'K'
	               ||charAbu == 'K' && charBagas == 'B') {
	                poinAbu++;
	            }
	        }
	        String pemenang;
	        if (poinAbu == poinBagas) {
	            pemenang = "Seri";
	        } else if (poinAbu > poinBagas) {
	            pemenang = "Abu";
	        } else {
	            pemenang = "Bagas";
	        }
	        System.out.println(pemenang);
	        in.close();
	    }
	}
	    
