package Ilaclar;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class YanikKremi extends AbstractDosyaOkuyucu {
    @Override
    public void dosyaOkucu(String dosyaAdi) {
        try (BufferedReader br = new BufferedReader(new FileReader(dosyaAdi))) {
            String satir;
            while ((satir = br.readLine()) != null) {
                System.out.println(" " + satir);
            }
        } catch (IOException e) {
            e.printStackTrace();


        }
    }
}
