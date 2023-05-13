import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int mat,phy,tr,chem,msc,total,check,invCount=0;
        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik Notunuzu Giriniz: ");
        mat = inp.nextInt();
        if (mat > 100 || mat < 0){
            mat = 0;
            invCount++;
        }
        System.out.print("Fizik Notunuzu Giriniz: ");
        phy = inp.nextInt();
        if (phy > 100 || phy < 0){
            phy = 0;
            invCount++;
        }
        System.out.print("Türkçe Notunuzu Giriniz: ");
        tr = inp.nextInt();
        if (tr > 100 || tr < 0){
            tr = 0;
            invCount++;
        }
        System.out.print("Kimya Notunuzu Giriniz: ");
        chem = inp.nextInt();
        if (chem > 100 || chem < 0){
            chem = 0;
            invCount++;
        }
        System.out.print("Müzik Notunuzu Giriniz: ");
        msc = inp.nextInt();
        if (msc > 100 || msc < 0){
            msc = 0;
            invCount++;
        }

        total = (mat+phy+tr+chem+msc);
        check = (total/(5-invCount));

        if (check >= 55){
            System.out.print("Tebrikler "+check+" ile sınıfı geçtiniz");
        }
        else{
            System.out.print("Ne yazık ki "+check+" ile sınıfta kaldınız..");
        }

    }
}