package PRAK301_2210817310016_RiyoAuroraGuison;

import java.util.Scanner;

public class MainDadu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Dadu dadu = new Dadu();
        dadu.jumlahBaris = input.nextInt();
        dadu.acakNilai();
    }
}
