package Satis;

class MusteriGirisi extends Insan {
    private int no;

    public MusteriGirisi(String isim, String soyisim,int no) {
        super(isim, soyisim);
        this.no = no;
    }

    public int getNo() {
        return no;
    }
}