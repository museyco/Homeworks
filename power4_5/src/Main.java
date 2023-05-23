import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int num;
        Scanner imp = new Scanner(System.in);

        System.out.print("Sayı Giriniz: ");
        num = imp.nextInt();

        System.out.println(num+" sayısına kadar 4'ün kuvvetleri");
        System.out.println("------------------------");
        for(int i = 1; i <= num; i *=4){

            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("------------------------");
        System.out.println(num+" sayısına kadar 5'in kuvvetleri");
        System.out.println("------------------------");
        for(int i = 1; i<= num; i *= 5){
            System.out.print(i+" ");
        }
    }
}