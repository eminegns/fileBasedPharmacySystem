
package Satis;

import java.util.Scanner;

class VeriAlmaIslemi {
   public MusteriGirisi musteriBilgileriniAl() {
        Scanner input = new Scanner(System.in);

        System.out.println("Müşteri ismi:");
        String isim = input.nextLine();

        System.out.println("Müşteri soyismi:");
        String soyisim = input.nextLine();

        int no = 0;
        int girisDenemesi = 0;
        final int MaxGirisDenemesi = 3;

        while (girisDenemesi < MaxGirisDenemesi) {
            try {
                System.out.println("Müşteri numaranızı giriniz (3 haneli):");
                no = input.nextInt();

                if (no < 100 || no > 999) {
                    throw new Exception("Hatalı müşteri numarası girdiniz");
                }


                break;
            } catch (Exception e) {
                girisDenemesi++;
                System.out.println(e.getMessage());
                System.out.println("Kalan deneme hakkınız: " + (MaxGirisDenemesi - girisDenemesi));
                input.nextLine();
            }
        }

        if (girisDenemesi == MaxGirisDenemesi) {
            System.out.println("Hatalı müşteri numarası girişi. Program sonlandırılıyor.");
            System.exit(0);
        }

        return new MusteriGirisi(isim, soyisim, no);
    }

}
