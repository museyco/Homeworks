import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String id,pw;
        int right= 3,balance = 10000,balanceChange,select;

        Scanner inp = new Scanner(System.in);

        while(right>0) {
            System.out.print("Kullanıcı Adınızı Giriniz: ");
            id = inp.nextLine();
            System.out.print("Parolanızı Giriniz: ");
            pw = inp.nextLine();

            if(id.equals("patika")&&pw.equals("dev123")){
                System.out.println("Merhaba Bankamıza Hoşgeldiniz");
                do{
                    System.out.println("-----------------------------------------");
                    System.out.println("1-Para Yatırma\n2-Para Çekme\n3-Bakiye Sorgulama\n4-Çıkış Yapma");
                    System.out.println("-----------------------------------------");
                    System.out.print("Yapmak İstediğiniz işlemi Seçiniz: ");
                    select = inp.nextInt();

                    switch (select){
                        case 1:
                            System.out.println("Güncel Bakiyeniz: "+balance+" TL");
                            System.out.print("Yatırmak İstediğiniz Tutarı Giriniz: ");
                            balanceChange = inp.nextInt();
                            balance += balanceChange;
                            System.out.print("Yeni Bakiyeniz: "+balance+" TL");

                        case 2:
                            System.out.println("Bakiyeniz: "+balance+" TL");
                            System.out.print("Çekmek İstediğiniz Tutarı Giriniz: ");
                            balanceChange = inp.nextInt();
                            balance -= balanceChange;
                            System.out.print("Yeni Bakiyeniz: "+balance+" TL");

                        case 3:
                            System.out.println("Bakiyeniz: "+balance+" TL");
                    }
                }while(select !=4 );
                System.out.println("Bizi Tercih Ettiğiniz İçin Teşekkür Ederiz, Görüşmek Üzere!");
                break;
            }
            else {
                right--;
                System.out.println("Hatalı Kullanıcı Adı & Şifre, Tekrar Deneyiniz!");
                if(right==0){
                    System.out.println("Hesabınız Bloke Olmuştur, Müşteri Temsilcisi İle İletişime Geçiniz!");
                }
                else {System.out.println("Kalan Giriş Hakkı: "+right);
                }
            }
        }
    }
}