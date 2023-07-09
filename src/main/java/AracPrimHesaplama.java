import java.util.Scanner;

public class AracPrimHesaplama {


    /*

        Proje: Araç Sigorta Prim Hesaplama
               Araç tipleri: otomobil,kamyon,otobüs,motosiklet
                            - otobüs: 18-30 koltuk veya 31 ve üstü koltuk
               Tarife dönemi: Aralık 2022,Haziran 2022
               1.dönemi: Haziran 2022                   2.dönem: Aralık 2022
                 otomobil: 2000                           otomobil: 2500
                 kamyon: 3000                             kamyon: 3500
                 otobüs: tip1: 4000 tip2: 5000            otobüs: tip1: 4500 tip2: 5500
                 motosiklet: 1500                         motosiklet: 1750

             Hatalı girişte hesaplama başarısız uyarısı verip tekrar menü gösterilsin.
             Yeni islem yapilabilmesi icin secenek sunsun.

         */
        public static void main(String[] args) {
            start();
        }
        public static void start(){
            boolean isFail;
            Scanner input= new Scanner(System.in);
            do {
                isFail=false;
                System.out.println("             »»————-　★　————-««");
                System.out.println("-----Zorunlu Arac Sigorta Primi Hesaplama----");
                System.out.println("             »»————-　★　————-««");

                System.out.println("Tarife donemi secin: ");
                System.out.println("1. haziran 2023");
                System.out.println("2. aralik 2023");
                int tarifeDonemi= input.nextInt();
                if (tarifeDonemi==1 || tarifeDonemi==2){
                    Arac arac = new Arac();
                    System.out.println("Arac tipini giriniz: ");
                    System.out.println("otomobil -- kamyon-- otobus -- motosiklet");
                    arac.type=input.next();
                    arac.prim=arac.countPrim(tarifeDonemi);
                    int select;
                    String donemIsmi= tarifeDonemi==1? "Haziran 2023":"Aralik 2023";
                    if (arac.prim > 0) {
                        System.out.println("Hesaplama basariliyla tamamlandi");
                        System.out.println("Arac tipi : "+ arac.type);
                        System.out.println("Tarife donemi :  : "+ donemIsmi);
                        System.out.println("Aracin ilgili donem sigorta primi : "+ arac.prim);
                        System.out.println( "Yeni islem icin 1, cikis icin 0 girin");
                        select=input.nextInt();
                        if (select==1){
                            isFail=true;
                        }else {
                            isFail=false;
                        }

                    }else {
                        System.out.println("hesaplama basarisiz, tekrar deneyin" +
                                "\nYeni islem icin 1, cikis icin 0 girin");
                        select=input.nextInt();
                        if (select==1){
                            isFail=true;
                        }else {
                            isFail=false;
                        }
                    }



                }else {
                    System.out.println("Hatali giris! ");
                    isFail=true;
                }


            }while (isFail);
            System.out.println("Iyi gunler");


        }

    }


