import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int num,sum,divider;
        System.out.print("Sayı Giriniz: ");
        num = inp.nextInt();
        sum = 0;
        divider=0;

        for(int i=1 ; i <= num ; i++){
            if(i % 3 == 0 && i % 4 == 0){
                System.out.println("i: "+ i);
                sum += i;
                divider++;
            }
        }
        System.out.print(num +"' a kadar olan sayıların ortalaması; "+(sum/divider)+"'dır");

    }
}