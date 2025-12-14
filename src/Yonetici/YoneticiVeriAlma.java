package Yonetici;

import java.util.Scanner;

public class YoneticiVeriAlma {
    public static YoneticiGirisi YoneticiBilgileriniAl() {
        Scanner input = new Scanner(System.in);

        System.out.println("Yönetici ismi:");
        String isim = input.nextLine();

        System.out.println("Yönetici soyismi:");
        String soyisim = input.nextLine();

        int sifre = 0;
        int girisDenemesi = 0;
        final int MaxGirisDenemesi = 3;

        while (girisDenemesi < MaxGirisDenemesi) {
            try {
                System.out.println("Yönetici şifrenizi giriniz (3 haneli):");
                sifre = input.nextInt();

                if (sifre < 100 || sifre > 999) {
                    throw new Exception("Yanlış yönetici şifresini girdiniz.");
                }

                break;
            } catch (Exception e) {
                girisDenemesi++;
                System.out.println(e.getMessage());
                System.out.println("Kalan deneme hakkınız: " + (MaxGirisDenemesi - girisDenemesi));
                input.nextLine(); // Buffer temizleme
            }
        }

        if (girisDenemesi == MaxGirisDenemesi) {
            System.out.println("Yönetici şifrenizi 3 defa yanlış girdiniz. Program sonlandırılıyor.");
            System.exit(0);
        }

        return new YoneticiGirisi(isim, soyisim, sifre);
    }
}