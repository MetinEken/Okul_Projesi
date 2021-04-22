package day3_okul_projesi;

public class Ogrenci extends Kisi {
    private String numara;
    private String sinif;

    public Ogrenci(String adSoyad, String kimlikNo, int yas, String numara, String sinif) {
        super(adSoyad, kimlikNo, yas);
        this.numara = numara;
        this.sinif = sinif;
    }

    public String getNumara() {
        return numara;
    }

    public void setNumara(String numara) {
        this.numara = numara;
    }

    public String getSinif() {
        return sinif;
    }

    public void setSinif(String sinif) {
        this.sinif = sinif;
    }

    @Override
    public String toString() {
        return "Ad Soyadi : " + getAdSoyad() + ", Kimlik no : " + getKim() + ", Yasi : " + getYas() + ", Sinifi : " + getSinif()
                + ", Numara" + getNumara();


  /*  public String toString(String adSoyad, String kimlikNo, int yas, String numara, String sinif) {
        return "Ad Soyadi" + getAdSoyad() + "Kimlik No" + getKim()+ "Yasi" + getYas() +
                "numara='" + getNumara() + '\'' +
                ", sinif='" + getSinif() + '\'' +
                '}';
    }*/
    }
}

