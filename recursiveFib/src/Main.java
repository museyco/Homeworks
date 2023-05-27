import java.util.Scanner;

public class Main {

    static int fib(int n){
        if(n == 0){
            return 0;
        }
        else if(n == 1 || n==2){
            return 1;
        }
        else return fib(n-1)+fib(n-2);
    }


    public static void main(String[] args) {
        int num;
        Scanner inp = new Scanner(System.in);
        System.out.print("Uzunluk Giriniz: ");
        num = inp.nextInt();
        inp.close();

        for (int i = 0;i<num;i++){
            System.out.print(fib(i)+" ");
        }

    }
}