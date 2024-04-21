public class stringMethods {
    public static void main(String[] args) {

        String str = "Merhaba";
        int uzunluk = str.length();
        System.out.println("Uzunluk: " + uzunluk);

        char karakter = str.charAt(2);
        System.out.println("3. karakter: " + karakter);

        String altString = str.substring(2, 5);
        System.out.println("Alt String: " + altString);

        String str1 = "etiya";
        String buyukHarf = str1.toUpperCase();
        System.out.println("Büyük harf: " + buyukHarf);

        String str2 = "TEST";
        String kucukHarf = str2.toLowerCase();
        System.out.println("Küçük harf: " + kucukHarf);

        String str3 = "Merhaba dünya";
        int indeks = str3.indexOf("dünya");
        System.out.println("İndeks: " + indeks);

        String str4 = "deneme";
        String str5 = " deneme";
        boolean isEqual = str4.equals(str5);
        System.out.println("Dizgeler eşit mi?: " + isEqual);

        String str6 = "dünya";
        String str7 = "dünya";
        boolean isEquall = str6.equals(str7);
        System.out.println("Dizgeler eşit mi?: " + isEquall);



    }
}
