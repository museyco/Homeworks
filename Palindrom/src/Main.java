import java.util.Scanner;

public class Main {

    static boolean isPalindrome(int Number){
        int temp = Number,reverseNumber=0,lastNumber=0;

        while(temp!=0){
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber *10) + lastNumber;
            temp /= 10;

        }
        if(Number == reverseNumber){
            return true;
        }
        else
            return false;

    }

    public static void main(String[] args) {
        int num1;
        Scanner inp = new Scanner(System.in);

        System.out.print("Konrol Etmek İstediğiniz Sayıyı Girin: ");
        num1 = inp.nextInt();
        if (isPalindrome(num1)){
            System.out.print(num1+" Palindromdur!");
        }
        else{
            System.out.print(num1+ " Palindrom Değildir!");
        }

    }
}