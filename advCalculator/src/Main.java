import java.util.Scanner;

public class Main {

    static void plus(){
        Scanner scan = new Scanner(System.in);
        int number,result=0,i=1;
        System.out.println("TOPLAMA");
        while(true){
            System.out.println("-------------");
            System.out.print(i++ +".Sayı: ");
            number = scan.nextInt();
            if (number == 0){
                break;
            }
            result += number;
            System.out.println("===============");
            System.out.println("Sonuç: "+result);
        }
    }

    static void minus(){
        Scanner scan = new Scanner(System.in);
        int number,result,i=1;
        System.out.println("ÇIKARTMA");
        System.out.println("-------------");
        System.out.print(i++ +".Sayı: ");
        result = scan.nextInt();
        while(true){
            System.out.println("-------------");
            System.out.print(i++ +".Sayı: ");
            number = scan.nextInt();
            if (number == 0){
                break;
            }
            result -= number;
            System.out.println("===============");
            System.out.println("Sonuç: "+result);
        }

    }

    static void times(){
        Scanner scan = new Scanner(System.in);
        int number,result=1,i=1;
        System.out.println("ÇARPMA");
        while(true){
            System.out.println("-------------");
            System.out.print(i++ +".Sayı: ");
            number = scan.nextInt();
            if (number == 0){
                System.out.println("Sonuç: 0");
                break;
            }
            result *= number;
            System.out.println("===============");
            System.out.println("Sonuç: "+result);
        }

    }
    static void div(){
        double num,result=0.0;
        int i=1;

        Scanner scan = new Scanner(System.in);
        System.out.println("BÖLME");
        while(true){
            System.out.println("-------------");
            System.out.print(i++ +".Sayı: ");
            num = scan.nextInt();
            if(num == 0){
                System.out.println("Bir sayı 0 ile bölünemez!");
                break;
            }
            if(i == 2){
                result = num;
                continue;
            }
            result /= num;
            System.out.println("===============");
            System.out.println("Sonuç: "+result);
        }

    }
    static void pow(){
        int num,powNum,result=1,i;
        Scanner scan = new Scanner(System.in);
        System.out.println("ÜS ALMA");

            System.out.print("1.Sayıyı Giriniz: ");
            num = scan.nextInt();
            System.out.print("Üssü Giriniz: ");
            powNum = scan.nextInt();

            for(i=1;i<=powNum;i++){
                result *= num;
            }
            System.out.println("===============");
            System.out.println("Sonuç: "+result);
    }
    static void factorial(){
        int num,result=1;
        Scanner scan = new Scanner(System.in);
        System.out.println("FAKTORİYEL");
        System.out.println("-------------");
        System.out.print("Sayı Giriniz: ");
        num = scan.nextInt();

        for(int i=1;i<=num;i++){
            result*=i;
        }
        System.out.println("===============");
        System.out.println("Sonuç: "+result);

    }

    static void mod(){
        int num1,num2,result;
        Scanner scan = new Scanner(System.in);
        System.out.println("MOD ALMA");

        System.out.print("1.Sayıyı Giriniz: ");
        num1 = scan.nextInt();
        System.out.print("2.Sayıyı Giriniz: ");
        num2 = scan.nextInt();

        result = num1%num2;
        System.out.println("===============");
        System.out.println("Sonuç: "+result);

    }
    static void area(){
        int longSide,shortSide,area,environment;
        Scanner scan = new Scanner(System.in);
        System.out.println("DİKDÖRTGEN ALAN VE ÇEVRE HESAPLAMA");

        System.out.print("Uzun Kenarı Giriniz: ");
        longSide = scan.nextInt();
        System.out.print("Kısa Kenarı Giriniz: ");
        shortSide = scan.nextInt();

        area = longSide * shortSide;
        environment = (longSide + shortSide)*2;

        System.out.println("===============");
        System.out.println("Alan: "+area+" Çevre: "+environment);

    }

    public static void main(String[] args) {
        int select;
        Scanner scan = new Scanner(System.in);


        String menu =
                  "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap";

        while(true){
            System.out.println("===============");
            System.out.println(menu);
            System.out.println("===============");
            System.out.print("İşlem Seçiminiz: ");
            select = scan.nextInt();
            if (select == 0){
                System.out.print("Görüşmek Üzere!");
                break;
            }
            switch (select){
                case 1:
                    plus();
                case 2:
                    minus();
                case 3:
                    times();
                case 4:
                    div();
                case 5:
                    pow();
                case 6:
                    factorial();
                case 7:
                    mod();
                case 8:
                    area();

            }
        }
    }
}