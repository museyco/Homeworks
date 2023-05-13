import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int heat;
        Scanner inp = new Scanner(System.in);

        System.out.print("Bugün Hava Kaç Derece?\nCevap: ");
        heat = inp.nextInt();

        if (heat <= 5){
           System.out.print("Bugün Kayak Yapmanızı Öneririm");
        }
        else if (heat <=25){
            if (heat<15) {
                System.out.print("Bugün Sinemaya Gitmenizi Öneririm");
            }
            else {
                System.out.print("Bugün Piknik Yapmanızı Öneririm");
            }
        }
        else{
            System.out.print("Bugün Yüzmeye Gitmenizi Öneririm");
        }


    }
}