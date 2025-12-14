package Satis;

import IlacBilgii.*;
import Ilaclar.*;
import Yonetici.*;
import IlacEkleme.*;


import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        int secim;
        int hastalikSec;
        int basAgrisiSec;
        String devamSec;
        String cevap;
        int gripSec;
        int extraSec;
        int basAgrisiAdet;
        int gripAdet;
        int bogazAgrisiAdet;
        int yanikAdet;
        int extralarAdet = 0;
        int yoneticiIslemiSec;
        String yoneticiCevap;
        Giris giris = new Giris();
        ToplamTutar toplamTutar = new ToplamTutar();
        Scanner input = new Scanner(System.in);
        giris.girisMesaji();
        secim = input.nextInt();

        switch (secim) {
            case 1:
                VeriAlmaIslemi veriAlmaIslemi = new VeriAlmaIslemi();
                MusteriGirisi musteriGirisi = veriAlmaIslemi.musteriBilgileriniAl();
                System.out.println("Hoş geldiniz: " + musteriGirisi.getIsim() + " " + musteriGirisi.getSoyisim());
                do {
                    HastalikSecim hastalikSecim = new HastalikSecim();

                    hastalikSecim.yazdir();
                    hastalikSec = input.nextInt();
                    input.nextLine();

                    switch (hastalikSec) {
                        case 1:

                            BasAgrisiIlaclari BasAgrisiIlac = new BasAgrisiIlaclari();
                            BasAgrisiIlac.dosyaOkucu("BasAgrisiIlac.txt");
                            basAgrisiSec = input.nextInt();
                            System.out.println("Kaç adet almak istiyorsunuz:");
                            basAgrisiAdet = input.nextInt();
                            System.out.println("İlaç hakkında bilgi almak istiyor musunuz?(evet/hayır)");
                            input.nextLine();
                            devamSec = input.nextLine();
                            if (devamSec.equals("evet")) {
                                BasAgrisiBilgi basAgrisiBilgi = new BasAgrisiBilgi();
                                basAgrisiBilgi.basAgrisi(basAgrisiSec);
                            }

                            System.out.println("Başka bir isteğiniz var mı?(evet/hayır)");
                            cevap = input.nextLine();
                            toplamTutar.topla(hastalikSec, basAgrisiSec, basAgrisiAdet);
                            break;
                        case 2:
                            GripIlaclari gripIlaclari = new GripIlaclari();
                            gripIlaclari.dosyaOkucu("Gripİlac.txt");
                            gripSec = input.nextInt();
                            System.out.println("Kaç adet almak istiyorsunuz:");
                            gripAdet = input.nextInt();
                            System.out.println("İlaç hakkında bilgi almak istiyor musunuz?(evet/hayır)");
                            input.nextLine();
                            devamSec = input.nextLine();
                            if (devamSec.equals("evet")) {
                                GripBilgi gripBilgi = new GripBilgi();
                                gripBilgi.GripBilgi(gripSec);
                            }
                            System.out.println("Başka bir isteğiniz var mı?(evet/hayır)");
                            cevap = input.nextLine();
                            toplamTutar.topla(hastalikSec, gripSec, gripAdet);
                            break;
                        case 3:
                            BogazAgrisiIlaclari bogazAgrisiIlaclari = new BogazAgrisiIlaclari();
                            bogazAgrisiIlaclari.dosyaOkucu("BogazAgrisiİlac.txt");
                            int BogazAgrisiSec = input.nextInt();
                            System.out.println("Kaç adet almak istiyorsunuz:");
                            bogazAgrisiAdet = input.nextInt();
                            System.out.println("İlaç hakkında bilgi almak istiyor musunuz?(evet/hayır)");
                            input.nextLine();
                            devamSec = input.nextLine();
                            if (devamSec.equals("evet")) {
                                BogazAgrisiBilgi bogazAgrisiBilgi = new BogazAgrisiBilgi();
                                bogazAgrisiBilgi.bogazAgrisi(BogazAgrisiSec);
                            }

                            System.out.println("Başka bir isteğiniz var mı?(evet/hayır)");
                            cevap = input.nextLine();
                            toplamTutar.topla(hastalikSec, BogazAgrisiSec, bogazAgrisiAdet);
                            break;
                        case 4:
                            YanikKremi yanikKremi = new YanikKremi();
                            yanikKremi.dosyaOkucu("YanikKremi.txt");
                            int yanikKremisec = input.nextInt();
                            System.out.println("Kaç adet almak istiyorsunuz:");
                            yanikAdet = input.nextInt();
                            System.out.println("İlaç hakkında bilgi almak istiyor musunuz?(evet/hayır)");
                            input.nextLine();
                            devamSec = input.nextLine();

                            if (devamSec.equals("evet")) {
                                YanikKremiBilgi yanikKremiBilgi;
                                yanikKremiBilgi = new YanikKremiBilgi();
                                yanikKremiBilgi.YanikKremiBilgi(yanikKremisec);
                            }

                            System.out.println("Başka bir isteğiniz var mı?(evet/hayır)");
                            cevap = input.nextLine();
                            toplamTutar.topla(hastalikSec, yanikKremisec, yanikAdet);
                            break;
                        case 5:
                            Extralar extralar = new Extralar();
                            extralar.dosyaOkucu("Extralar.txt");
                            extraSec = input.nextInt();
                            System.out.println("Kaç adet almak istiyorsunuz:");
                            extralarAdet = input.nextInt();
                            System.out.println("Başka bir isteğiniz var mı?(evet/hayır)");
                            cevap = input.next();
                            toplamTutar.topla(hastalikSec, extraSec, extralarAdet);

                            break;

                        default:
                            throw new IllegalStateException("Yanlış seçim yaptınız. " + hastalikSec);
                    }
                } while (cevap.equals("evet"));
                toplamTutar.yazdir();
                break;
            case 2:
                YoneticiGirisi yoneticiGirisi = YoneticiVeriAlma.YoneticiBilgileriniAl();
                System.out.println("hosgeldiniz " + yoneticiGirisi.getIsim() + " " + yoneticiGirisi.getSoyisim());
                do {


                    YoneticiIslemiSecme yoneticiIslemiSecme = new YoneticiIslemiSecme();
                    yoneticiIslemiSecme.yazdir();
                    yoneticiIslemiSec = input.nextInt();

                    switch (yoneticiIslemiSec) {
                        case 1:
                            IlacEkleme ilacEkleme = new IlacEkleme();
                            ilacEkleme.yazdir();
                            int ilacSecenek = input.nextInt();

                            switch (ilacSecenek) {
                                case 1:
                                    BasAgrisiIlacEkleme basAgrisiIlacEkleme = new BasAgrisiIlacEkleme();
                                    basAgrisiIlacEkleme.DosyaEkleme("BasAgrisiIlac.txt");
                                    break;
                                case 2:
                                    GripIlaciEkleme gripIlaciEkleme = new GripIlaciEkleme();
                                    gripIlaciEkleme.DosyaEkleme("Gripİlac.txt");
                                    break;
                                case 3:
                                    BogazAgrisiIlacEkleme bogazAgrisiIlacEkleme = new BogazAgrisiIlacEkleme();
                                    bogazAgrisiIlacEkleme.DosyaEkleme("BogazAgrisiİlac.txt");
                                    break;
                                case 4:
                                    YanikKremiEkleme yanikKremiEkleme = new YanikKremiEkleme();
                                    yanikKremiEkleme.DosyaEkleme("YanikKremi.txt");
                                    break;
                                case 5:
                                    ExtraEkleme extraEkleme = new ExtraEkleme();
                                    extraEkleme.DosyaEkleme("Extralar.txt");
                                    break;

                            }
                            System.out.println("Başka bir isteğiniz var mı?(evet/hayır)");
                            input.nextLine();
                            yoneticiCevap = input.nextLine();
                            break;
                        case 2:
                            ToplamCiro toplamCiro = new ToplamCiro();
                            toplamCiro.ToplamCiro();
                            System.out.println("Başka bir isteğiniz var mı?(evet/hayır)");
                            input.nextLine();
                            yoneticiCevap = input.nextLine();
                            break;
                        case 3:

                            SatilanExtraSayisi satilanExtraSayisi = new SatilanExtraSayisi();
                            satilanExtraSayisi.say(extralarAdet);
                            System.out.println("Başka bir isteğiniz var mı?(evet/hayır)");
                            input.nextLine();
                            yoneticiCevap = input.nextLine();
                            break;
                        case 4:
                            IlacIsmiArama ilacIsmiArama = new IlacIsmiArama();
                            ilacIsmiArama.IlacBul();

                            System.out.println("Başka bir isteğiniz var mı?(evet/hayır)");
                            input.nextLine();
                            yoneticiCevap = input.nextLine();
                            break;
                        default:
                            throw new IllegalStateException("Yanlış seçim yaptınız: " + yoneticiIslemiSec);
                    }
                } while (yoneticiCevap.equals("evet"));
                break;
            default:
                throw new IllegalStateException("Yanlış seçim yaptınız: " + secim);
        }
    }
}


