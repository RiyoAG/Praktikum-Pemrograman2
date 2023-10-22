package Modul1;

import java.util.Scanner;

public class PRAK103_2210817310016_RiyoAuroraGuison {
		public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int N = in.nextInt();
	        int angka = in.nextInt();

	        if (angka % 2 == 0) {
	            angka += 1;
	        }

	        do {
	            if (N == 1) {
	                System.out.println(angka);
	                break;
	            }
	            System.out.print(angka + ",");
	            angka += 2;
	            N--;
	        } while (N > 1);

	        if (N == 1) {
	            System.out.print(angka);
	        }
	        in.close();
	    }
}
	        
	
	
	        



