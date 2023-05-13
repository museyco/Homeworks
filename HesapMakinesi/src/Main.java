import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int num1,num2,secim;
        Scanner inp = new Scanner(System.in);

        System.out.print("Birinci Sayıyı Giriniz: ");
        num1= inp.nextInt();
        System.out.print("İkinci Sayıyı Giriniz: ");
        num2=inp.nextInt();

        System.out.print("İşlem Menüsü\n-----------------------\n1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme\n-----------------------\nSeçiminiz:");
        secim = inp.nextInt();

        switch (secim) {
            case 1 : System.out.print("Birinci Sayı: "+num1+"\nİkinci Sayı: "+num2+"\nİşleminizin Sonucu: " + (num1 + num2));
                break;

            case 2: System.out.print("İşleminizin Sonucu: "+ (num1 - num2));
                break;

            case 3 : System.out.print("İşleminizin Sonucu: " + (num1 * num2));
                break;

            case 4 : 
                if (num2 == 0){
                    System.out.print("Bir Sayı 0 İle Bölünemez!");
                }
                else {
                    System.out.print("İşleminizin Sonucu: " + (num1 / num2));
                }
                break;

            default: System.out.print("Hatalı Seçim Yaptınız");
                break;
        }


    }
}