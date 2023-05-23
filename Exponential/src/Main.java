import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int num,expo,total=1;

        Scanner inp = new Scanner(System.in);
        System.out.print("Sayıyı Giriniz: ");
        num = inp.nextInt();
        System.out.print("Üssü Giriniz: ");
        expo = inp.nextInt();

        for(int i = 1; i<= expo ; i++){
            total *= num;
        }
        System.out.println(num+" üssü "+expo+" = "+total);
    }
}