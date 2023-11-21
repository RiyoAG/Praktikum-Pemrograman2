package Soal2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("""
                        pilih jenis hewan yang ingin diinputkan:
                        1 = Kucing
                        2 = Anjing
                        """);
        System.out.print("Masukkan Pilihan: ");
        int pilihan = in.nextInt();
        in.nextLine();
        MembuatObjek(pilihan, in);
      
    }
    static private void MembuatObjek(int pilihan, Scanner in){
        System.out.print("Nama hewan peliharaan: ");
        String nama = in.nextLine();
        System.out.print("Ras: ");
        String ras = in.nextLine();
        System.out.print("Warna Bulu: ");
        String warnaBulu = in.nextLine();
        if (pilihan==1){
            Kucing kucing = new Kucing(nama,ras,warnaBulu);
            System.out.println();
            kucing.displayDetailKucing();
        }
        else if (pilihan==2){
            System.out.print("Memiliki kemampuan: ");
            String kemampuanString = in.nextLine();
            String[] kemampuan = kemampuanString.split(", ");
            Anjing anjing = new Anjing(nama,ras,warnaBulu,kemampuan);
            System.out.println();
            anjing.displayDetailAnjing();
        }
    }  
}
