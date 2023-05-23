import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int num,total=0;

        Scanner inp = new Scanner(System.in);

        do{
            System.out.print("Sayı Giriniz: ");
            num = inp.nextInt();
            System.out.println("-----------------------");
            if(num % 4 == 0){
                System.out.println(num+", 4'ün katıdır");
                System.out.println("-----------------------");
                total += num;
            }

        }while(num%2 != 1);
        System.out.println(num+ " Tek Sayı olduğu için Çıkış Yapılıyor!");
        System.out.println("*************************");
        System.out.println("Toplam: "+total);
        System.out.println("*************************");
    }
}