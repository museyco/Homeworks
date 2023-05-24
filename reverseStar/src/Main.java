import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int step,i,j,k;

        Scanner inp = new Scanner(System.in);

        System.out.print("Basamak Sayısı: ");
        step = inp.nextInt();

        for(i = step;i>=0;i--){
            for(j = 0;j<=(step-i);j++){
                System.out.print(" ");
            }
            for(k = 0;k<=(2*i);k++){
                System.out.print("*");
            }
            System.out.println();

        }


    }
}