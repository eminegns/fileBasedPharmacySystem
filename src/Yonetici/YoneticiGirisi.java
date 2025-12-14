package Yonetici;

import Satis.Insan;

public class YoneticiGirisi extends Insan {
    private int sifre;

    public YoneticiGirisi(String isim, String soyisim,int sifre) {
        super(isim, soyisim);
        this.sifre=sifre;

    }

    public int getSifre() {
        return sifre;
    }
}