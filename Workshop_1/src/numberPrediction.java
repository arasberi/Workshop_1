import java.util.Scanner;
import java.util.Random;

public class numberPrediction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();


        int rastgeleSayi = random.nextInt(10) + 1;

        int tahmin = 0;
        int tahminSayisi = 0;


        while (tahmin != rastgeleSayi) {
            System.out.print("(1 ile 10 arasında) bir sayı tahmin ediniz: ");
            tahmin = scanner.nextInt();
            tahminSayisi++;

            if (tahmin < rastgeleSayi) {
                System.out.println("Lütfen daha büyük bir sayı giriniz.");
            } else if (tahmin > rastgeleSayi) {
                System.out.println("Lütfen daha küçük bir sayı girin.");
            } else {
                System.out.println("Tebrikler! Doğru sayıyı buldunuz.");
                System.out.println("Tahmin sayınız: " + tahminSayisi);
            }
        }

        scanner.close();
    }
}
