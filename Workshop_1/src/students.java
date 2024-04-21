/*kullanıcıdan öğrenci sayısını isteyen her öğrenci için
öğrenci adı,öğrenci soyadı,1.sınav notu,2.sınav notu,3.sınav notu isteyen ve
daha sonra not ortalamasını hesaplayıp ekrana yazdıran algoritma yapınız.
(For döngüsü kullanınız)*/
import java.util.Scanner;

public class students {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Öğrenci sayısını giriniz: ");
        int studentCount = scanner.nextInt();

        double totalGrade = 0;

        for (int i = 1; i <= studentCount; i++) {

            System.out.println("Öğrenci " + i + " bilgilerini giriniz:");
            System.out.print("Adı: ");
            String firstName = scanner.next();
            System.out.print("Soyadı: ");
            String lastName = scanner.next();
            System.out.print("1. Sınav Notu: ");
            double grade1 = scanner.nextDouble();
            System.out.print("2. Sınav Notu: ");
            double grade2 = scanner.nextDouble();
            System.out.print("3. Sınav Notu: ");
            double grade3 = scanner.nextDouble();

            double average = (grade1 + grade2 + grade3) / 3;


            totalGrade += average;


            System.out.println("Öğrenci: " + firstName + " " + lastName);
            System.out.println("Not Ortalaması: " + average);
            System.out.println();
        }


        double classAverage = totalGrade / studentCount;


        System.out.println("Sınıf Ortalaması: " + classAverage);


        scanner.close();
    }
}
