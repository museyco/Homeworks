import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num1,num2,num3;
        Scanner inp = new Scanner(System.in);

        System.out.print("1.Sayıyı Giriniz: ");
        num1 = inp.nextInt();
        System.out.print("2.Sayıyı Giriniz: ");
        num2 = inp.nextInt();
        System.out.print("3.Sayıyı Giriniz: ");
        num3 = inp.nextInt();

        if (num1>num2 && num1>num3){
            if (num2 > num3){
                System.out.print("En büyük sayı: "+num1+"\nOrtanca sayı: "+num2+"\nEn küçük sayı: "+num3);
            }
            else if (num2 == num3){
                System.out.print("En büyük sayı: "+num1+"\nDiğer sayılar eşit");
            }
            else{
                System.out.print("En büyük sayı: "+num1+"\nOrtanca sayı: "+num3+"\nEn küçük sayı: "+num2);
            }

        }

        else if (num2>num1 && num2>num3){
            if (num1 > num3){
                System.out.print("En büyük sayı: "+num2+"\nOrtanca sayı: "+num1+"\nEn küçük sayı: "+num3);
            }
            else if (num1 == num3){
                System.out.print("En büyük sayı: "+num2+"\nDiğer sayılar eşit");
            }
            else {
                System.out.print("En büyük sayı: " + num2 + "\nOrtanca sayı: " + num3 + "\nEn küçük sayı: " + num1);

            }
        }
        else if (num3>num1 && num3>num2){
            if (num1 > num2){
                System.out.print("En büyük sayı: "+num3+"\nOrtanca sayı: "+num1+"\nEn küçük sayı: "+num2);
            }
            else if (num1 == num2){
                System.out.print("En büyük sayı: "+num3+"\nDiğer sayılar eşit");
            }
            else {
                System.out.print("En büyük sayı: " + num3 + "\nOrtanca sayı: " + num2 + "\nEn küçük sayı: " + num1);

            }
        }
        else {
            if (num1 > num3 && num1 == num2){
                System.out.print("En büyük sayı: "+num1+"\nEn küçük sayı: "+num3);
            }
            else if (num2 > num1 && num2 == num3){
                System.out.print("En büyük sayı: "+num2+"\nEn küçük sayı: "+num1);
            }
            else if (num3 > num2 && num3 == num1){
                System.out.print("En büyük sayı: "+num3+"\nEn küçük sayı: "+num2);
            }
            else{
                System.out.print("Tüm sayılar eşit!");
            }
        }

    }
}