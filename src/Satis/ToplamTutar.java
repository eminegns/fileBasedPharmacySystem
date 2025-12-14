package Satis;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ToplamTutar {
    int toplamFiyat = 0;

    void topla(int hastalik, int ilacTuru, int adet) {


        switch (hastalik) {
            case 1:
                if (ilacTuru == 1) {
                    toplamFiyat += 60 * adet;
                } else if (ilacTuru == 2) {
                    toplamFiyat += 45 * adet;

                } else if (ilacTuru == 3) {
                    toplamFiyat += 30 * adet;
                } else {
                    toplamFiyat += 20 * adet;
                }
                break;
            case 2:
                if (ilacTuru == 1) {
                    toplamFiyat += 70 * adet;
                } else if (ilacTuru == 2) {
                    toplamFiyat += 55 * adet;

                } else if (ilacTuru == 3) {
                    toplamFiyat += 40 * adet;

                } else {
                    toplamFiyat += 20 * adet;
                }
                break;
            case 3:
                if (ilacTuru == 1) {
                    toplamFiyat += 80 * adet;
                } else if (ilacTuru == 2) {
                    toplamFiyat += 65 * adet;

                } else if (ilacTuru == 3) {
                    toplamFiyat += 50 * adet;
                } else {

                    toplamFiyat += 20 * adet;
                }
                break;

            case 4:
                if (ilacTuru == 1) {
                    toplamFiyat += 90 * adet;
                } else if (ilacTuru == 2) {
                    toplamFiyat += 75 * adet;

                } else if (ilacTuru == 3) {
                    toplamFiyat += 60 * adet;
                } else {
                    toplamFiyat += 20 * adet;
                }
                break;
            case 5:
                if (ilacTuru == 1) {
                    toplamFiyat += 100 * adet;
                } else if (ilacTuru == 2) {
                    toplamFiyat += 85 * adet;

                } else if (ilacTuru == 3) {
                    toplamFiyat += 70 * adet;
                } else {
                    toplamFiyat += 20 * adet;
                }
                break;

        }
    }

    public void yazdir() {

        System.out.println("Toplam borcunuz: " + toplamFiyat + " TL");
        ToplamCiroTutma();
    }

    private void ToplamCiroTutma() {
        try {
            FileWriter fileWriter = new FileWriter("ToplamCiro.txt", true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.newLine();
            bufferedWriter.write(Integer.toString(toplamFiyat));


            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println("Dosya yazma hatası: " + e.getMessage());
        }
    }
}





