/*Bir sayının mükemmel sayı olup olmadığı kontrol eden algoritma yazınız.*/

import java.util.Scanner;

public class perfectNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int sayi = scanner.nextInt();
        int toplam = 0;


        if (sayi <= 1) {
            System.out.println("Birden büyük bir sayı giriniz");
        } else {

            for (int i = 1; i < sayi; i++) {
                if (sayi % i == 0) {
                    toplam += i;
                }
            }

            if (toplam == sayi) {
                System.out.println(sayi + " mükemmel bir sayıdır.");
            } else {
                System.out.println(sayi + " mükemmel bir sayı değildir.");
            }
        }

        scanner.close();
    }
}
