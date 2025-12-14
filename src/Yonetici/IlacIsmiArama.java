package Yonetici;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class IlacIsmiArama {
    public void IlacBul() {
        Scanner scanner = new Scanner(System.in);
        try
        {

            System.out.print("Lütfen aramak istediğiniz ilacın adını girin: ");
            String arananIlac = scanner.nextLine();

            if (ilacBul(arananIlac)) {
                System.out.println(arananIlac + " adlı ilaç bulundu.");
            } else {
                System.out.println(arananIlac + " adlı ilaç bulunamadı.");
            }
        } catch (Exception e) {
            System.out.println("Bir hata oluştu: " + e.getMessage());
        }
    }

    private static boolean ilacBul(String arananIlac) {
        boolean bulundu = false;
        String[] dosyaListesi = {"BasAgrisiIlac.txt", "BogazAgrisiİlac.txt", "Extralar.txt", "Gripİlac.txt", "YanikKremi.txt"};

        for (String dosyaAdi : dosyaListesi) {
            try (BufferedReader bufferedReader = new BufferedReader(new FileReader(dosyaAdi))) {
                String satir;

                while ((satir = bufferedReader.readLine()) != null) {
                    if (satir.toLowerCase().contains(arananIlac.toLowerCase())) {
                        bulundu = true;
                        break;
                    }
                }
            } catch (IOException e) {
                System.out.println("Dosya okuma hatası (" + dosyaAdi + "): " + e.getMessage());
            }

            if (bulundu) {
                return bulundu;
            }
        }
        return bulundu;
    }
}

