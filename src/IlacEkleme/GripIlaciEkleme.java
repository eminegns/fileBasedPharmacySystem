package IlacEkleme;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class GripIlaciEkleme implements IDosyaIlacEkleme {
    @Override
public void DosyaEkleme(String dosyaAdi) throws IOException {
    File dosya = new File(dosyaAdi);
    Scanner input = new Scanner(System.in);

    System.out.println("Yeni ilacın adını girin: ");
    String ilacAdi = input.nextLine();
    System.out.println("Yeni ilacın fiyatı 20 TL ");

    try (BufferedWriter BWriter = new BufferedWriter(new FileWriter(dosya, true))) {
        BWriter.newLine();
        BWriter.write(ilacAdi + " 20TL" );

        System.out.println("Yeni ilaç başarıyla eklendi.");
    } catch (IOException e) {
        e.printStackTrace();
    }
}
}
