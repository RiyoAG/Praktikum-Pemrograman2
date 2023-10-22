package PRAK201_2210817310016_RiyoAuroraGuison;

public class Main {
	public static void main(String[] args) {
		Buah apel = new Buah("Apel", 0.4, 7000.0, 40.0);
        Buah mangga = new Buah("Mangga", 0.2, 3500.0, 15.0);
        Buah alpukat = new Buah("Alpukat", 0.25, 10000.0, 12.0);
        
        apel.tampilkanDetail();
        System.out.println();
        mangga.tampilkanDetail();
        System.out.println();
        alpukat.tampilkanDetail();
        System.out.println();
    }
}

