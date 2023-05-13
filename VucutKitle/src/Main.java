// Formül
//Kilo (kg) / Boy(m) * Boy(m)
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double weight,height;

        Scanner inp = new Scanner(System.in);
        System.out.print("Kg Cinsinden Kilonuzu Giriniz: ");
        weight = inp.nextDouble();
        System.out.print("M Cinsinden Boyunuzu Giriniz: ");
        height = inp.nextDouble();

        double index = weight / (height * height);

        System.out.println("Bilgileriniz: \nBoy:"+height+ "\nKilo: "+weight+"\n----------------------\nVücut Kitle Endeksiniz: "+index);



    }
}