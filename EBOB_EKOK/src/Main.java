import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num1,num2,select,ebob=1,ekok=1;
        Scanner inp = new Scanner(System.in);

        System.out.print("1. Sayıyı Giriniz: ");
        num1 = inp.nextInt();
        System.out.print("2. Sayıyı Giriniz: ");
        num2 = inp.nextInt();

        int i= 1;
        while(i <= num1){
            if(num1 % i == 0 && num2 % i == 0){
                ebob = i;
            }
            i++;
        }

        while(i<=num1*num2){
            if(i%num1==0 && i%num2==0){
                ekok = i;
                break;
            }
            i++;

        }
        System.out.println("EBOB DEĞERİ: "+ebob+"\nEKOK DEĞERİ: "+ekok);

    }
}