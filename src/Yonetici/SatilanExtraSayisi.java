package Yonetici;

import java.io.*;
import java.util.Scanner;

public class SatilanExtraSayisi {

    public void say(int extraSayisi) throws FileNotFoundException {

        File dosya = new File("ExtraSayisi.txt");
        String dosyaYolu = "ExtraSayisi.txt";

        try (BufferedWriter BWriter = new BufferedWriter(new FileWriter(dosya, true))) {
            BWriter.write(Integer.toString(extraSayisi));
            BWriter.newLine();

        } catch (IOException e) {
            e.printStackTrace();
        }
        try (Scanner scanner = new Scanner(new File(dosyaYolu))) {
            int toplam = 0;

            while (scanner.hasNext()) {
                int satirDegeri = scanner.nextInt();
                toplam += satirDegeri;
            }

            System.out.println("Satılan toplam extra sayisi = " + toplam);
        } catch (FileNotFoundException e) {
            System.out.println("Dosya bulunamadı: " + e.getMessage());
        }
    }
}


