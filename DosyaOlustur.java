import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class DosyaOlustur {
    PrintWriter yazdir = null;
    String dosyaYolu = "C:/Users/Mert/Desktop/Araba.txt";
    Araba araba = new Araba();
    Scanner klavye = new Scanner(System.in);

    public void setAraba() {
        System.out.println("Marka? ");
        String marka = klavye.next();
        System.out.println("Renk? ");
        String renk = klavye.next();
        System.out.println("Fiyat? ");
        String fiyat = klavye.next();

        araba.setOzellik(marka,renk,fiyat);
        araba.arabaOlustur();
    }

    public void dosyaOlustur() {
        try {
            try {
                yazdir = new PrintWriter(new File(dosyaYolu));
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
        }catch (Exception e) {
            System.out.println(e);
        }
    }

    public void dosyaYaz() {
        yazdir.println(araba.arabaOzellikleri[0].toUpperCase() + " Özellikleri");
        for(int i = 0; i<3; i++) {
            yazdir.println("-" + araba.arabaOzellikleri[i]);
        }
        yazdir.close();
    }


}
