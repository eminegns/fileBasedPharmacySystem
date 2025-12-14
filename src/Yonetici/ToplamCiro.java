package Yonetici;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ToplamCiro {
    public void ToplamCiro() {
        String dosyaYolu = "ToplamCiro.txt";
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File(dosyaYolu));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        int toplam = 0;
        while (scanner.hasNext()) {
            int sayi = scanner.nextInt();

            toplam += sayi;
        }

        scanner.close();

        System.out.println("Toplam: " + toplam);

    }
}

