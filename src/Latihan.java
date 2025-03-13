

import java.util.Scanner;

public class Latihan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan sebuah kalimat: ");
        String kalimat = scanner.nextLine().toLowerCase();

        int jumlahVokal = 0;

        for (char c : kalimat.toCharArray()) {
            if (c == 'a') {
                jumlahVokal++;
            } else if (c == 'i') {
                jumlahVokal++;
            } else if (c == 'u') {
                jumlahVokal++;
            } else if (c == 'e') {
                jumlahVokal++;
            } else if (c == 'o') {
                jumlahVokal++;
            }
        }

        switch (jumlahVokal % 2) {
            case 0:
                System.out.println("Jumlah vokal genap");
                break;
            case 1:
                System.out.println("Jumlah vokal ganjil");
                break;
        }

        System.out.print("Kalimat terbalik: ");
        char[] karakter = kalimat.toCharArray();
        for (int i = karakter.length - 1; i >= 0; i--) {
            System.out.print(karakter[i]);
        }
        System.out.println();

        scanner.close();
    }
}