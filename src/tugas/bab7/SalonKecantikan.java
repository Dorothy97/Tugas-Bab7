package Praktikum_Polimorfisme;

import java.util.Scanner;

public class SalonKecantikan {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int pilih;
        PaketPremium data = new PaketPremium();
        PaketGold data1 = new PaketGold();
        PaketSilver data2 = new PaketSilver();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("  SELAMAT DATANG DI SALON HITZ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        do {
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("\tMENU SALON HITZ");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println();
            System.out.println("\t1. Paket Premium");
            System.out.println("\t2. Paket Gold");
            System.out.println("\t3. Paket Silver");
            System.out.println();
            System.out.print("Masukkan pilihan Anda : ");
            pilih = in.nextInt();
            switch (pilih) {
                case 1:
                    data.setMenu();
                    break;
                case 2:
                    data1.setMenu();
                    break;
                case 3:
                    data2.setMenu();
                    break;
            }
        } while (pilih <= 1 && pilih < 3);
    }
}