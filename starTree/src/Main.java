import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int num;

        Scanner inp = new Scanner(System.in);
        System.out.print("Sıra sayısı giriniz: ");
        num = inp.nextInt();

        for (int i = 0; i <= num; i++) {
            for (int j = 0; j <= (num - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = num; i >= 0; i--) {
            for (int j = 0; j <= (num - i); j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= (2 * i); k++) {
                System.out.print("*");
            }
            System.out.println();
        }



    }
}