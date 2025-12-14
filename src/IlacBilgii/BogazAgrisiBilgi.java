package IlacBilgii;

public class BogazAgrisiBilgi {
    public void bogazAgrisi(int secenekIlac) {
        if (secenekIlac == 1) {
            System.out.println("Bu ilacın dozu düşüktür o yüzden başınız ağrıdığında 1 ya da 2 tane kullanabilirsiniz.\nAç veya tok kullanılabilir.\nOlası yan etkileri:\nDoz aşımında solgunluk, ishal, iştahsızlık, bulantı, kusma, mide krampları, aşırı terleme görülebilir.");
        } else if (secenekIlac == 2) {
            System.out.println("Bu ilacın dozu orta seviyedir 1'den fazla kullanmamaya dikkat ediniz.\nAç veya tok kullanılabilir.\nOlası yan etkileri:\nSindirim sistemi rahatsızlıkları: midede ülser, ağrı, yanma, bulantı, kusma, iç kanama, mide veya bağırsak delinmeleri,\n" +
                    "Yüz çevresinde şişlikler (alerji sonucu),\n" +
                    "Astım krizi (alerji sonucu),\n" +
                    "Yüksek dozda kullanıldığında kulak çınlaması,\n" +
                    "İnmeye neden olabilecek beyin kanaması. ");
        } else {
            System.out.println("Bu ilaç yüksek doz içermektedir.Zorunda kalınmadığı sürece tüketilmemelidir.Tüketmemesi gereken bazı kişiler:\nHamilelik ve emzirme döneminde olan anneler\nAmeliyat öncesi ve sonrası 24 saat kullanılmamalı\nBağırsak tıkanması olan kişiler kullanmamalı\nOlası yan etkileri:\nBaş Dönmesi ve Uyuşukluk\nMide Bulantısı ve Kusma\nKabızlık\nSolunum Problemleri\nCilt Problemleri\nBağımlılık");
        }

    }
}
