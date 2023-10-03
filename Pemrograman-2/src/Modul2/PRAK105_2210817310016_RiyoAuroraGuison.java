package Modul2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PRAK105_2210817310016_RiyoAuroraGuison {
	static final double PI = 3.14;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.###");
		
		System.out.print("Masukkan jari-jari: ");
		double Jarijari = in.nextDouble();
		
		System.out.print("Masukkan tinggi tabung: ");
		double tinggi = in.nextDouble();
		
		double volume = PI * Jarijari * Jarijari *tinggi;
		
		System.out.println("Volume tabung dengan jari-jari "+Jarijari+" cm dan tinggi "+tinggi+" cm adalah "+df.format(volume)+" m3");
		in.close();
	}
}
