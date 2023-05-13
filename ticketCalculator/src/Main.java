import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int age;
        double costPerKm=0.10,cost,ageDisc,newCost,wayDisc,km,finalCost;
        Scanner inp = new Scanner(System.in);

        System.out.print("Mesafeyi Km türünden giriniz: ");
        km = inp.nextInt();
        if (km<0){
            System.out.print("Hatalı Veri Girdiniz");}

        cost = km * 0.10;

        System.out.print("Yaşınızı giriniz: ");
        age = inp.nextInt();
            if(age>0 && age<12){
                ageDisc = 0.5;
                newCost = cost * ageDisc;
                cost -= newCost;
            }
            else if(age<=24){
                ageDisc = 0.1;
                newCost = cost * ageDisc;
                cost -= newCost;
            }
            else if(age>=65){
                ageDisc = 0.3;
                newCost = cost * ageDisc;
                cost -= newCost;
            }
            else if(age<0){
                System.out.print("Hatalı Veri Girdiniz!");
            }


        System.out.print("Yolculuk Tipini Seçiniz\n----------\n1-Tek Yön\n2-Gidiş Dönüş\nSeçiminiz: ");
            int way = inp.nextInt();
            if(way == 2){
                wayDisc = cost * 0.2;
                cost -= wayDisc;
                finalCost = cost*2;
                System.out.print("Toplam Tutar= "+finalCost+" TL");

            }
            else if(way == 1) {
                wayDisc = 0;
                cost = cost;
                System.out.print("Toplam Tutar= "+cost+" TL");
            }
            else{
                System.out.print("Hatalı Veri Girdiniz !");
            }

        ;


        }

    }
