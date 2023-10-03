package Modul2;

import java.util.Scanner;

public class PRAK101_2210817310016_RiyoAuroraGuison {
		public static void main(String[] args) {
			Scanner input = new Scanner (System.in);
			System.out.print("Masukkan Nama Lengkap: ");
			String Nama = input.nextLine();
			System.out.print("Masukkan Tempat Lahir: ");
			String TempatLahir = input.nextLine();
			System.out.print("Masukkan Tanggal Lahir: ");
			int TanggalLahir = input.nextInt();
			System.out.print("Masukkan Bulan Lahir: ");
			int BulanLahir = input.nextInt();
			String bulan = "";
			switch(BulanLahir) {
			case 1:
				bulan ="Januari";
				break;
			case 2:
				bulan = ("Februari");
				break;
			case 3 :
				bulan = ("Maret");
				break;
			case 4 :
				bulan = ("April");
				break;
			case 5 :
				bulan = ("Mei");
				break;
			case 6 :
				bulan = ("Juni");
				break;
			case 7 :
				bulan = ("Juli");
				break;
			case 8 :
				bulan = ("Agustus");
				break;
			case 9 :
				bulan = ("September");
				break;
			case 10 :
				bulan =("Oktober");
				break;
			case 11 :
				bulan = ("November");
				break;
			case 12 :
				bulan = ("Desember");
				break;
			}
			System.out.print("Masukkan Tahun Lahir: ");
			int TahunLahir = input.nextInt();
			System.out.print("Masukkan Tinggi Badan: ");
			int TinggiBadan = input.nextInt();
			System.out.print("Masukkan Berat Badan: ");
			double BeratBadan = input.nextDouble();
			
			System.out.println("Nama Lengkap "+Nama+", Lahir di "+TempatLahir+" pada Tanggal "+TanggalLahir+" "+bulan+" "+TahunLahir+" Tinggi Badan "+TinggiBadan+" cm dan Berat Badan "+BeratBadan+" kilogram");
			input.close();
		}
}
