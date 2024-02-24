package stçobu;

import java.util.Scanner;

public class stçbu {
    public static void main(String[] args) {
        System.out.println("Sayinin Tek Mi Cift Mi Oldugunu Bulma Uygulamasi");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dizinin Eleman Sayisini Giriniz: ");
        int diziLength = scanner.nextInt();
        scanner.nextLine();

        int[] sayilar = new int[diziLength];

        for (int i = 0; i < sayilar.length; i++) {
            System.out.println("Dizinin " + i + ". index degerini giriniz: ");
            sayilar[i] = scanner.nextInt();
            scanner.nextLine();
            tekMiCiftMi(sayilar[i]);
        }
    }

    public static void tekMiCiftMi(int sayi) {
        if (sayi % 2 == 0) {
            System.out.println("Sayi: " + sayi + " Cifttir");
        } else {
            System.out.println("Sayi: " + sayi + " Tektir");
        }
    }
}

