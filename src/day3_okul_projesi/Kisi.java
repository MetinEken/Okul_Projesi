package day3_okul_projesi;

public class Kisi {

    private String adSoyad;
    private String kimlikNo;
    private int yas;

    public Kisi(String adSoyad, String kim, int yas) {
        this.adSoyad = adSoyad;
        this.kimlikNo = kim;
        this.yas = yas;
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public String getKim() {
        return kimlikNo;
    }

    public void setKim(String kim) {
        this.kimlikNo = kim;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }


}
