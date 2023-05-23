import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        int n,r=1;
        Scanner inp = new Scanner(System.in);

        System.out.print("Faktöriyelini almak istediğiniz sayı: ");
        n = inp.nextInt();

        int i = 1;
        while(i <= n){
            r *= i;
            i++;
        }
        System.out.print(n+"! = "+r);
    }
}