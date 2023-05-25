public class Main {
    public static void main(String[] args) {
        int num1=0,num2=1,sum;


        for (int i = 0; i <= 9; i++) {
            System.out.print(num1+" ");
            sum = num1+num2;
            num1 = num2;
            num2 = sum;
            }
        }
    }

