/*kullanıcıdan kaç ürün almak istediğini soran,her ürünün fiyatını
alarak toplam alışveriş tutarını hesaplayan bir algoritma yazınız. */

import java.util.Scanner;
public class getProducts {
    public static void main(String[] args) {
        double unitPrice;
        double totalPrice = 0.0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Almak istediğiniz ürün adedi: ");
        int productCount = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < productCount; i++) {
            int j = i + 1;
            System.out.print("Almak istediğiniz " + j + ". ürünün adı: ");
            String productName = scanner.nextLine();

            System.out.print(productName + " ürününün fiyatı: ");
            unitPrice = scanner.nextDouble();
            scanner.nextLine();

            totalPrice += unitPrice;
        }

        System.out.println("Toplam Alışveriş tutarınız: " + totalPrice + " Türk Lirası");
        scanner.close();
    }
}
