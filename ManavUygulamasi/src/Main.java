import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        double peer,app,tom,ban,aub,kg,price,tutar;
        Scanner inp = new Scanner(System.in);

        peer = 2.14;
        app = 3.67;
        tom = 1.11;
        ban= 0.95;
        aub= 5;

        System.out.print("Kaç kilo armut aldığınızı giriniz: ");
        kg = inp.nextDouble();
        double peerKg = kg;

        System.out.print("Kaç kilo elma aldığınızı giriniz: ");
        kg = inp.nextDouble();
        double appKg = kg;

        System.out.print("Kaç kilo domates aldığınızı giriniz: ");
        kg = inp.nextDouble();
        double tomKg = kg;

        System.out.print("Kaç kilo muz aldığınızı giriniz: ");
        kg = inp.nextDouble();
        double banKg = kg;

        System.out.print("Kaç kilo patlıcan aldığınızı giriniz: ");
        kg = inp.nextDouble();
        double aubKg= kg;

        tutar = (peerKg*peer) + (appKg*app) + (tomKg*tom) + (banKg*ban) + (aubKg*aub);

        System.out.print(peerKg+"Kg Armut\n"+appKg+"Kg Muz\n"+tomKg+"Kg Domates\n"
                +banKg+"Kg Muz\n"+aubKg+"Kg Patlıcan\n------------\nToplam Tutar: "+tutar+" TL");






    }
}