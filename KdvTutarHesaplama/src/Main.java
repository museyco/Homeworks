import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        float kdv = 18;
        float kdvTutar = 1+(kdv/100);
        float fiyat;
        System.out.print("Fiyat'ı Giriniz: ");
        fiyat = inp.nextFloat();
        float kdvli = fiyat * kdvTutar;



        System.out.print("Kdv Tutarı: "+kdvTutar+"\nKdv'siz Fiyat: "+fiyat+"\nKdv'li Fiyat : "+kdvli );


        }
    }
