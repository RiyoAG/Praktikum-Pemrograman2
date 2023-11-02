package PRAK302_2210817310016_RiyoAuroraGuison;

import java.util.HashMap;

public class Negara {

    private String nama;
    private String jenisKepemimpinan;
    private String namaPemimpin;
    private int tanggalKemerdekaan;
    private int bulanKemerdekaan;
    private int tahunKemerdekaan;

    public Negara(String nama, String jenisKepemimpinan, String namaPemimpin, int tanggalKemerdekaan, int bulanKemerdekaan, int tahunKemerdekaan) {
        this.nama = nama;
        this.jenisKepemimpinan = jenisKepemimpinan;
        this.namaPemimpin = namaPemimpin;
        this.tanggalKemerdekaan = tanggalKemerdekaan;
        this.bulanKemerdekaan = bulanKemerdekaan;
        this.tahunKemerdekaan = tahunKemerdekaan;
    }

    public int getBulanMerdeka() {
        return bulanKemerdekaan;
    }

    public void InfoNegara() {
        HashMap<Integer, String> mapBulan = new HashMap<Integer, String>();
        mapBulan.put(1, "Januari");
        mapBulan.put(2, "Februari");
        mapBulan.put(3, "Maret");
        mapBulan.put(4, "April");
        mapBulan.put(5, "Mei");
        mapBulan.put(6, "Juni");
        mapBulan.put(7, "Juli");
        mapBulan.put(8, "Agustus");
        mapBulan.put(9, "September");
        mapBulan.put(10, "Oktober");
        mapBulan.put(11, "November");
        mapBulan.put(12, "Desember");
        if (jenisKepemimpinan.equals("presiden")) {
            System.out.println("Negara " + nama + " mempunyai Presiden " + "bernama " + namaPemimpin);
        } else if (jenisKepemimpinan.equals("perdana menteri")) {
            System.out.println("Negara " + nama + " mempunyai Perdana Menteri " + "bernama " + namaPemimpin);
        } else {
            System.out.println("Negara " + nama + " mempunyai Raja " + "bernama " + namaPemimpin + "\n");
        }
        if (!jenisKepemimpinan.equals("monarki")) {
            System.out.println("Deklarasi Kemerdekaan pada Tanggal " + tanggalKemerdekaan + " " + mapBulan.get(getBulanMerdeka()) + " " + tahunKemerdekaan + "\n");
        }
    }
}
