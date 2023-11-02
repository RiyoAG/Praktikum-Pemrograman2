package PRAK303_2210817310016_RiyoAuroraGuison;

import java.util.Scanner;
import java.util.ArrayList;

public class Mahasiswa {

    String nama, nim;
    Scanner input = new Scanner(System.in);
    ArrayList<Mahasiswa> listMahasiswa = new ArrayList<Mahasiswa>();

    public Mahasiswa(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    public void TambahMahasiswa() {
        System.out.print("Masukkan Nama Mahasiswa: ");
        nama = input.nextLine();
        System.out.print("Masukkan NIM Mahasiswa (harus unik): ");
        nim = input.nextLine();
        Mahasiswa mahasiswa = new Mahasiswa(nama, nim);
        listMahasiswa.add(mahasiswa);
        System.out.println("Mahasiswa " + nama + " ditambahkan\n");
    }

    public void HapusMahasiswa() {
        System.out.print("Masukkan NIM Mahasiswa yang akan dihapus: ");
        nim = input.nextLine();
        boolean found = false;
        for (int i = 0; i < listMahasiswa.size(); i++) {
            if (listMahasiswa.get(i).getNim().equals(nim)) {
                listMahasiswa.remove(i);
                found = true;
            }
        }
        if (found) {
            System.out.println("Mahasiswa dengan NIM "
                    + nim + " dihapus\n");
        } else {
            System.out.println("Mahasiswa tidak ditemukan\n");
        }
    }

    public void CariMahasiswa() {
        System.out.print(
                "Masukkan NIM Mahasiswa yang akan dicari: ");
        nim = input.nextLine();
        boolean found = false;
        for (int i = 0; i < listMahasiswa.size();
                i++) {
            if (listMahasiswa.get(i).getNim().equals(nim)) {
                Mahasiswa mahasiswa
                        = listMahasiswa.get(i);
                System.out.println("NIM: "
                        + mahasiswa.getNim() + "\nNama: " + mahasiswa.getNama()
                        + "\n");
                found = true;
            }
        }
        if (!found) {
            System.out.println("Mahasiswa tidak ditemukan\n");
        }
    } 

    public void DaftarMahasiswa() {
        System.out.println("Daftar Mahasiswa:");
        for (int i = 0; i < listMahasiswa.size(); i++) {
            Mahasiswa mahasiswa = listMahasiswa.get(i);
            System.out.println("NIM: "+ mahasiswa.getNim() + " ,Nama: " + mahasiswa.getNama());
        }
        System.out.print("\n");
    }
    public void Keluar() {
        listMahasiswa.clear();
        System.out.println("Terimakasih!");
    }
}


