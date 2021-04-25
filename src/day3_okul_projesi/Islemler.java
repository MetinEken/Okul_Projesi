package day3_okul_projesi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Islemler {

    private List<Kisi> ogrenciListesi = new ArrayList<>();
    private List<Kisi> ogretmenListesi = new ArrayList<>();
    private String kisiTuru;





    public void toluEkle() {
        ogrenciListesi.add(new Ogrenci("Ahmet can", "1234567", 30, "36", "b"));
        ogrenciListesi.add(new Ogrenci("Veli can", "34567", 31, "37", "b"));
        ogrenciListesi.add(new Ogrenci("Ahmet Usta", "12347", 32, "38", "c"));

        ogrenciListesi.add(new Ogrenci("metin Eken", "123467", 33, "39", "c"));
        ogretmenListesi.add(new Ogretmen("Ali Veli", "5798945", 40,"mat", "123456"));
        ogretmenListesi.add(new Ogretmen("Hasan Guzel", "0987535", 41,"eng", "986432"));
        ogretmenListesi.add(new Ogretmen("Funda ksjdjh", "3465773", 25,"muz", "15467322"));
    }



    public void anaMenu(){

        Scanner scan = new Scanner(System.in);
        System.out.println("====================================");
        System.out.println(" ÖĞRENCİ VE ÖĞRETMEN YÖNETİM PANELİ");
        System.out.println("====================================");
        System.out.println("1- ÖĞRENCİ İŞLEMLERİ");
        System.out.println("2- ÖĞRETMEN İŞLEMLERİ");
        System.out.println("Q- ÇIKIŞ");
        String secim = scan.next().toUpperCase();

        if(secim.equals("Q")){
            cikis();
        }else if(secim.equals("1")){
            kisiTuru = "OGRENCI";
            islemMenusu();
        }else if(secim.equals("2")){
            kisiTuru = "OGRETMEN";
            islemMenusu();
        }else{
            System.out.println("Yanlış giriş yaptınız..");
            anaMenu();
        }
    }

    private void islemMenusu(){
        Scanner scan = new Scanner(System.in);
        System.out.println("============= İŞLEMLER =============");
        System.out.println("1-EKLEME");
        System.out.println("2-ARAMA");
        System.out.println("3-LİSTELEME");
        System.out.println("4-SİLME");
        System.out.println("5-ANA MENÜ");
        System.out.println("Q-ÇIKIŞ\n");
        System.out.println("SEÇİMİNİZ:");
        String tercih = scan.next().toUpperCase();
        switch(tercih){
            case "1":   ekle();
                break;
           case "2":   ara();
                        break;
            case "3":
                listele();
                       break;
            case "4":   sil();
                        break;
            case "5":   anaMenu();
                break;
            case "Q":   cikis();
                break;
            default:    System.out.println("Hatalı seçim yaptınız.");
                islemMenusu();
                break;
        }
    }

    private void sil() {
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen silmek istediginiz kimlik No giriniz");
        String no = scan.next();
        if (kisiTuru == "OGRENCI") {
            ogrenciListesi.stream().filter(t -> t.getKim().contains(no)).forEach(System.out::println);
            String secenek = scan.next().toUpperCase();
            if (secenek == "E") {
                ogrenciListesi.remove(no);
            } else {
                islemMenusu();

            }
        }else {


        }
    }
    private void ara() {
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen aratmak istediginiz ismi giriniz");
        String word = scan.next().toUpperCase();
        if(kisiTuru=="OGRENCI"){
          //  if(word==ogrenciListesi.stream().sorted(Comparator.comparing()).filter(t -> t.getAdSoyad().toUpperCase()); {
                ogrenciListesi.stream().filter(t -> t.getAdSoyad().toUpperCase().contains(word)).forEach(System.out::println);

                System.out.println( word +" isminde ogrenci bulunamadi...");

        }
            ogretmenListesi.stream().filter(t -> t.getAdSoyad().toUpperCase().contains(word)).forEach(System.out::println);
        }


    private void listele() {
       // ogrenciListesi.stream().forEach(System.out::println);
        if(kisiTuru=="OGRENCI") {
            ogrenciListesi.stream().forEach(System.out::println);

        } else {ogretmenListesi.stream().forEach(System.out::println);

            }
        islemMenusu();
        }



    private void cikis(){
        System.out.println("Programı kullandığınız için teşekkürler..");
    }

    private void ekle(){
        Scanner scan = new Scanner(System.in);
        System.out.println("------------- " + kisiTuru + " EKLEME SAYFASI ----------------");
        System.out.println("Ad Soyad Giriniz:");
        String adSoyad = scan.nextLine();
        System.out.println("Kimlik No Giriniz:");
        String kimlikNo = scan.next();
        System.out.println("Yaşınızı Giriniz:");
        int yas = scan.nextInt();

        if(kisiTuru.equals("OGRENCI")){
            System.out.println("Numaranızı giriniz:");
            String numara = scan.next();
            System.out.println("Sınıf giriniz:");
            String sinif = scan.next();
            Ogrenci ogrenci = new Ogrenci(adSoyad,kimlikNo,yas,numara,sinif);

            ogrenciListesi.add(ogrenci);

            System.out.println("BASARIYLA KAYDEDILDI");

        }else {
            System.out.println("Sicil No giriniz:");
            String sicilNo = scan.next();
            System.out.println("Bölüm giriniz:");
            String bolum = scan.next();
            Ogretmen ogretmen = new Ogretmen(adSoyad,kimlikNo,yas,bolum,sicilNo);
            ogretmenListesi.add(ogretmen);
        }

        islemMenusu();
    }



}