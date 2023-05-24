import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int totalNum,numCount=1,numBig=0,numS=0,num;
        boolean on = true;
        Scanner inp = new Scanner(System.in);

        System.out.print("Kaçtane Sayı Gireceksiniz: ");
        totalNum = inp.nextInt();

        do{
            System.out.print(numCount+". Sayıyı Giriniz: ");
            num = inp.nextInt();

            if(on) {
            numBig = num;
            numS = num;
            on = false;
            }
            else {
                if(num >= numBig){
                    numBig = num;
                }
                else if(num <= numS){
                    numS = num;
                }
            }
            numCount++;
            totalNum--;

        }while(totalNum != 0);

        System.out.print("En Büyük Sayı: "+numBig+"\nEn Küçük Sayı: "+numS);



    }
}
