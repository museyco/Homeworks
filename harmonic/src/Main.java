import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int num;
        double result = 0;

        Scanner inp = new Scanner(System.in);
        System.out.print("Sayıyı Giriniz: ");
        num = inp.nextInt();

        for(double i = 1;i<=num;i++){
            result += (1/i);
        }
        System.out.print(result);
    }
}