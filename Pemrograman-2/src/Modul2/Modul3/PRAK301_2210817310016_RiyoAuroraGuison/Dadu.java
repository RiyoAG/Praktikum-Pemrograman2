package PRAK301_2210817310016_RiyoAuroraGuison;

import java.util.Collection;
import java.util.LinkedList;
import java.util.Random;

public class Dadu {

    int jumlahBaris, total;

    public void acakNilai() {
        Collection<Integer> dadu = new LinkedList<Integer>();
        dadu.add(1);
        dadu.add(2);
        dadu.add(3);
        dadu.add(4);
        dadu.add(5);
        dadu.add(6);
        for (int i = 0; i < jumlahBaris; i++) {
            int nilaiAcak = ((LinkedList<Integer>) dadu).get(new Random().nextInt(dadu.size()));
            System.out.printf("Dadu ke-%d bernilai %d\n", i+1, nilaiAcak);
            total += nilaiAcak;
        }
        System.out.printf("Total nilai dadu keseluruhan %d", total);
}
}
