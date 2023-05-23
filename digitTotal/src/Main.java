import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int num,digit,total;

        Scanner inp = new Scanner(System.in);

        System.out.print("Sayıyı Giriniz: ");
        num = inp.nextInt();

        total = 0;
        while(num != 0){
            digit = num % 10;
            System.out.println("  "+digit);
            total += digit;
            num /= 10;
        }
        System.out.println("+");
        System.out.println("----------------------");
        System.out.println("Sonuç: "+total);


    }
}
