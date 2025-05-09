public class Araba {
    private String renk;
    private String marka;
    private String fiyat;
    public String[] arabaOzellikleri = new String[3];

    public void setOzellik(String marka, String renk, String fiyat) {
        this.fiyat = fiyat;
        this.marka = marka;
        this.renk = renk;
    }

    public void arabaOlustur() {
        arabaOzellikleri[0] = marka;
        arabaOzellikleri[1] = renk;
        arabaOzellikleri[2] = fiyat;
    }


}
