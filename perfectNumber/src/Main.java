import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num, div = 0, temp;

        Scanner inp = new Scanner(System.in);
        do {
            div = 0;
            System.out.print("Sayıyı Giriniz: ");
            num = inp.nextInt();

            for (int i = 1; i < num; i++) {

                if (num % i == 0) {
                    div += i;
                }
            }
            if (div == num) {
                System.out.println(num + " Mükemmel Sayıdır!");

            } else {
                System.out.println(num + " Mükemmel Sayı Değildir!");

            }
        }
        while (num > 0);
    }
}


