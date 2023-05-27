import java.util.Scanner;

public class Main {

    static boolean isAsal(int num1,int i){
        if (num1 <= 2){
            return num1 == 2;
        }
        else if(num1 % i == 0 ) {
            return false;
        }
        else if(i * i > num1){
            return true;
        }
        return isAsal(num1,(i+1));
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı Giriniz: ");
        int num1 = scan.nextInt();

        if (isAsal(num1,2)){
            System.out.println(num1+" Asal Bir Sayıdır");
        }
        else{
            System.out.println(num1+" Asal Bir Sayı Değildir!");
        }
    }
}