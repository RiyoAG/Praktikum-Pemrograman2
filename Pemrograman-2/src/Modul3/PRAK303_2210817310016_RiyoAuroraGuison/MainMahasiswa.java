package PRAK303_2210817310016_RiyoAuroraGuison;

import java.util.Scanner;

public class MainMahasiswa {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama = "", nim = "";
        Mahasiswa mahasiswa = new Mahasiswa(nama, nim);
        while (true) {
            System.out.print("Menu: " + "\n1. Tambah Mahasiswa" + "\n2. Hapus Mahasiswa berdasarkan NIM"
                    + "\n3. Cari Mahasiswa berdasarkan NIM" + "\n4. Tampilkan Daftar Mahasiswa" + "\n0. Keluar"
                    + "\nPilihan: ");

            int inputMenu = input.nextInt();
            input.nextLine();
            switch (inputMenu) {
                case 1:
                    mahasiswa.TambahMahasiswa();
                    break;
                case 2:
                    mahasiswa.HapusMahasiswa();
                    break;
                case 3:
                    mahasiswa.CariMahasiswa();
                    break;
                case 4:
                    mahasiswa.DaftarMahasiswa();
                    break;
                case 0:
                    mahasiswa.Keluar();
                    return;
                default:
                    System.out.println(
                            "Input tidak valid\n");
            }
        }
    }
}
