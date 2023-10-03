package Modul2;

import java.util.Scanner;

public class PRAK102_2210817310016_RiyoAuroraGuison {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int baris = in.nextInt();
		int angka = baris;
		int barisCetak = 1;
		while (barisCetak <= 11) {
			if (angka % 5 == 0) {
				if (barisCetak == 11) {
					System.out.print((angka / 5) - 1);
				} else {
					System.out.print((angka / 5) - 1 + ",");
				}
			} else {
				if (barisCetak == 11) {
					System.out.print(angka);
				} else {
					System.out.print(angka + ",");
				}
			}
			angka++;
			barisCetak++;
			in.close();
		}
	}
}

//		Scanner in = new Scanner(System.in);
//        int baris = in.nextInt();
//        int angka = baris;
//
//        while (baris-- <= 11) {
//            if (angka % 5 == 0) {
//                if(baris==0){
//                    System.out.print((angka/5)-1);
//                    break;
//                }
//                System.out.print((angka/5)-1 + ",");
//            } else {
//                if(baris==0){
//                    System.out.print(angka);
//                    break;
//                }
//                System.out.print(angka + ",");
//            }
//            angka++;
//        }
//    }
//}
//	public static void main(String[] args) {
//			Scanner in = new Scanner(System.in);
//			int baris = in.nextInt();
//			int angka = baris;
//			
//			while(baris-- >= 0) {
//				if(angka % 5 == 0) {
//					if(baris==0) {
//					System.out.print((angka/5)-1);
//					break;
//				}
//				System.out.print((angka/5)-1 + ",");
//			} else {
//				if(baris==0) {
//					System.out.print(angka);
//					break;
//				}
//				System.out.print(angka + ",");
//			}
//				angka++;
//		}
//	}
//}
