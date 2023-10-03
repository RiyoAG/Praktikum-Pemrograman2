package Modul1;

import java.util.Scanner;

public class PRAK005_2210817310016_RiyoAuroraGuison {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan Makanan Favorit:");
        String makanan = in.next();
        System.out.print("Masukkan Hobi:");
        String hobi = in.next();

        System.out.println("Aku Suka Makan " + makanan + " dan Hobiku " + hobi);
        in.close();
    }
}
