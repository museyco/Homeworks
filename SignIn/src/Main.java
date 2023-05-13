import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        String id,pw,newPw,choice;
        Scanner inp = new Scanner(System.in);

        System.out.print("Kullanıcı Adınızı Giriniz: ");
        id = inp.nextLine();
        System.out.print("Şifrenizi Giriniz: ");
        pw = inp.nextLine();

        if (id.equals("museyco")&&pw.equals("123456")){
            System.out.print("Başarıyla Giriş Yaptınız");}

        else{
            System.out.print("Girdiğiniz Bilgiler Uyuşmuyor!!\nŞifrenizi Yenilemek İçin Y\nÇıkış Yapmak İçin N\nSeçiniz...");

            choice = inp.nextLine();

                if (choice.equals("Y")) {
                    pw = ("123456");
                        System.out.print("Yeni Şifrenizi Giriniz: ");
                        newPw = inp.nextLine();

                            if (newPw.equals(pw)) {
                                System.out.print("Yeni Şifreniz Eski Şifreniz İle Aynı Olamaz!!");

                            } else {
                            System.out.print("Şifreniz Değiştirildi");
                        }
                }
                else { System.out.print("Program Sonlandırıldı...");
                }
        }
    }
}