import java.util.Scanner;

    public class Arac {
        String type;
        int prim;
        public int countPrim(int tarifeDonemi){
            if ( tarifeDonemi==1){
                switch (type){
                    case "otomobil":
                        prim=2000;
                        break;
                    case "kamyon":
                        prim=3000;
                        break;
                    case "otobus":
                        prim =countBusPrim(tarifeDonemi);
                        break;
                    case "motosiklet":
                        prim=1500;
                        break;
                    default:
                        System.out.println("Hatali giris");
                        prim=0;
                        break;
                }
            } else if (tarifeDonemi==2) {
                switch (type){
                    case "otomobil":
                        prim=2500;
                        break;
                    case "kamyon":
                        prim=3500;
                        break;
                    case "otobus":
                        prim =countBusPrim(tarifeDonemi);
                        break;
                    case "motosiklet":
                        prim=1750;
                        break;
                    default:
                        System.out.println("Hatali giris");
                        prim=0;
                        break;
                }

            }else {
                System.out.println("Hatali giris yapildi");
                prim=0;
            } return prim;
        }
        public int countBusPrim(int tarifeDonemi){
            Scanner input= new Scanner(System.in);
            System.out.println("Otobus tipini giriniz :" +
                    "\n1-- (18-30 koltuk), 2--(31 ve uzeri koltuk)    ");
            int busType= input.nextInt();
            switch (busType){
                case 1:
                    if (tarifeDonemi==1){
                        prim=4000;
                    }else {
                        prim=4500;
                    }
                    break;
                case 2:
                    if (tarifeDonemi==1){
                        prim=500;
                    }else {
                        prim=5500;
                    }
                    break;
            }
            return prim;
        }
    }


