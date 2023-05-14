import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int year;
        Scanner inp = new Scanner(System.in);
        System.out.print("Sorgulamak istediğiniz yıl: ");
        year = inp.nextInt();

        if(year % 100 == 0){
            if(year % 400 == 0){
                System.out.print(year+" bir artık yıldır !");
            }
            else{
                System.out.print(year+ " bir artık yıl değildir!");
            }
        }
        else if(year % 4==0){
            System.out.print(year+" bir artık yıldır !");
        }
        else{
            System.out.print(year+ " bir artık yıl değildir!");
        }
    }
}