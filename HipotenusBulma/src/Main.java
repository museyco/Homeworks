import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        float a,b;
        double c;

        //Verilerin alındığı kısım
        Scanner inp = new Scanner(System.in);
        System.out.print("A Kenarını Giriniz: ");
        a = inp.nextFloat();
        System.out.print("B Kenarını Giriniz: ");
        b = inp.nextFloat() ;

        //Hesaplama
        c = Math.sqrt((a*a) + (b*b));
        System.out.print("Hipotenüs: " + c);

        }
    }
