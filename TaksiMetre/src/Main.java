//Taksimetre KM başına 2.20 TL tutmaktadır.
//Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
//Taksimetre açılış ücreti 10 TL'dir.

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double km,kmBasi,min,acilis,tutar;
            Scanner inp = new Scanner(System.in);
            System.out.print("Gidilecek Mesafe (Km olararak): ");
            km = inp.nextDouble();
            kmBasi = 2.20;
            min = 20;
            acilis = 10;

            tutar = acilis + (km * kmBasi);

            tutar = (tutar < min) ? 20 : tutar;
            System.out.print("Ödenecek Tutar: " + tutar);


    }
    }
