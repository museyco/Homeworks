import java.util.Scanner;

public class Main {

    static int pow(int num1,int num2) {
        if(num2 == 0){
            return 1;
        }
        else{
            return num1 * pow(num1,(num2-1));
        }
    }


    public static void main(String[] args) {
        int num1,num2;
        Scanner scan = new Scanner(System.in);

        System.out.print("Sayıyı Giriniz: ");
        num1= scan.nextInt();
        System.out.print("Üssü Giriniz: ");
        num2= scan.nextInt();
        System.out.print("Sonuç: "+pow(num1,num2));


    }
}