package PRAK201_2210817310016_RiyoAuroraGuison;

public class Buah {
	String nama;
    double berat;
    double harga;
    double jumlahBeli;

    Buah(String nama, double berat, double harga, double jumlahBeli) {
        this.nama = nama;
        this.berat = berat;
        this.harga = harga;
        this.jumlahBeli = jumlahBeli;
    }

    double hitungHargaSebelumDiskon() {
        return (harga / berat) * jumlahBeli;
    }

    double hitungDiskon() {
        double kelipatan = Math.floor(jumlahBeli / 4);
        return 0.02 * (4 * harga) * kelipatan;
    }

    double hitungHargaSetelahDiskon() {
        return hitungHargaSebelumDiskon() - hitungDiskon();
    }
    void tampilkanDetail() {
        System.out.println("Nama Buah: " + nama);
        System.out.println("Berat: " + berat);
        System.out.println("Harga: Rp" +  harga);
        System.out.println("Jumlah Beli: " + jumlahBeli + "kg");
        System.out.println("Harga Sebelum Diskon: Rp" + String.format("%.2f", hitungHargaSebelumDiskon()));
        System.out.println("Total Diskon: Rp" + String.format("%.2f", hitungDiskon()));
        System.out.println("Harga Setelah Diskon: Rp" + String.format("%.2f", hitungHargaSetelahDiskon()));
    }
}

