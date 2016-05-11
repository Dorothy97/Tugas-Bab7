package Praktikum_Polimorfisme;

import java.util.Scanner;

public abstract class Salon {

    public String diskon, lagi;
    public int pilihan, pilih;
    public double bayar, cost;
    public static String layanan[] = new String[100];
    public static double harga[] = new double[100];
    public static int i = 0;
    public static double hargatotal = 0;
    public static double newharga, newharga1, jumlah;
    Scanner in = new Scanner(System.in);

    public void setTotal() {
        System.out.println();
        System.out.println("Jumlah layanan yang dipesan sebanyak " + i + ", yaitu : ");
        for (int a = 0; a < i; a++) {
            System.out.println(layanan[a] + ",");
        }
        for (int b = 0; b < i; b++) {
            hargatotal = (int) (hargatotal + harga[b]);
        }
        System.out.println("Total yang harus Anda bayar = Rp. " + hargatotal);
    }

    public void setPembayaran() {
        System.out.println();
        System.out.print("Masukkan uang pembayaran : Rp. ");
        bayar = in.nextDouble();
    }

    public void getCost() {
        cost = bayar - jumlah;
        System.out.println();
        System.out.println("Uang kembalian : Rp. " + cost);
        if (cost < 0) {
            System.out.println("Maaf, uang Anda tidak mencukupi untuk melakukan pembayaran.");
            setPembayaran();
            getCost();
        } else {
            System.out.println("\n ~~~~~~~~~~ Terima Kasih ~~~~~~~~~~ \n");
        }
    }

    public void getDiri() {
        System.out.print("Apakah Anda mempunyai kartu member (Ya/Tidak) ? ");
        String jawab = in.next();
        switch (jawab) {
            case "Ya":
                member();
                diskon();
                jumlah = ((hargatotal - newharga) - newharga1);
                System.out.println("\n Jadi, total pembayaran\t = " + jumlah);
                break;
            case "Tidak":
                diskon();
                jumlah = (hargatotal - newharga1);
                System.out.println("\n Jadi, total pembayaran\t = " + jumlah);
                break;
        }
    }

    public abstract void member();
    public abstract void diskon();
}