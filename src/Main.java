import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan Fibonacci serisinin eleman sayısını al
        System.out.print("Fibonacci serisinin eleman sayısını girin: ");
        int elemanSayisi = scanner.nextInt();

        int sayi1 = 0, sayi2 = 1;

        // İlk iki sayı ekrana yazdırılır
        System.out.print("Fibonacci serisi: " + sayi1 + " " + sayi2 + " ");

        // Fibonacci serisinin diğer elemanları hesaplanır ve ekrana yazdırılır
        for (int i = 2; i < elemanSayisi; i++) {
            int gecici = sayi1 + sayi2;
            System.out.print(gecici + " ");
            sayi1 = sayi2;
            sayi2 = gecici;
        }
    }
}
