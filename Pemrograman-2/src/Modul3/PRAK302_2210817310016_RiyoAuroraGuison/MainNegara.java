package PRAK302_2210817310016_RiyoAuroraGuison;

import java.util.Scanner;
import java.util.LinkedList;

public class MainNegara {

    public static void main(String[] args) {
        LinkedList<Negara> listNegara = new LinkedList<Negara>();
        Scanner input = new Scanner(System.in);
        int jumlah = input.nextInt();
        input.nextLine();
        for (int i = 0; i < jumlah; i++) {
            String nama = input.nextLine();
            String jenisKepemimpinan = input.nextLine();
            String namaPemimpin = input.nextLine();
            int tanggalKemerdekaan = 0, bulanKemerdekaan = 0,
                    tahunKemerdekaan = 0;
            if (!jenisKepemimpinan.equals("monarki")) {
                tanggalKemerdekaan = input.nextInt();
                input.nextLine();
                bulanKemerdekaan = input.nextInt();
                input.nextLine();
                tahunKemerdekaan = input.nextInt();
                input.nextLine();
            }
            Negara negara = new Negara(nama,jenisKepemimpinan, namaPemimpin, tanggalKemerdekaan, bulanKemerdekaan,tahunKemerdekaan);
            listNegara.add(negara);
        }
        for (int i = 0; i < listNegara.size(); i++) {
            Negara j = listNegara.get(i);
            j.InfoNegara();
        }
    }
}
