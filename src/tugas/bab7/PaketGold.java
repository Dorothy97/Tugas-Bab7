package Praktikum_Polimorfisme;

import java.util.Scanner;

public class PaketGold extends Salon {

    Scanner in = new Scanner(System.in);

    public void setMenu() {
        do {
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("\tPaket Gold");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("1.\tPaket Totok Aura");
            System.out.println("2.\tPaket Body Treatment");
            System.out.println("3.\tPaket Hair Spa Special");
            System.out.println("4.\tSelesai");
            System.out.print("Masukkan pilihan Anda : ");
            pilihan = in.nextInt();
            switch (pilihan) {
                case 1:
                    do {
                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        System.out.println("\tPaket Totok Aura");
                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        System.out.println();
                        System.out.println("1. Facial Alami + Totok Aura  Rp. 156.000");
                        System.out.println("2. Sariayu  Rp. 69.000");
                        System.out.println("3. Alami + Vitamin E + Hotstone Therapy  Rp. 89.000");
                        System.out.println("4. Facial Galvanic  Rp. 300.000");
                        System.out.println("5. Penambahan P.Mata/Telinga/Back Therapy Rp. 35.000");
                        System.out.println("6. Penambahan Galvanic    Rp. 300.000");
                        System.out.print("Masukkan pilihan Anda : ");
                        pilih = in.nextInt();
                        if (pilih == 1) {
                            layanan[i] = "Facial Alami + Totok Aura";
                            harga[i] = 156000;
                        } else if (pilih == 2) {
                            layanan[i] = "Sariayu";
                            harga[i] = 69000;
                        } else if (pilih == 3) {
                            layanan[i] = "Alami + Vitamin E + Hotstone Therapy";
                            harga[i] = 89000;
                        } else if (pilih == 4) {
                            layanan[i] = "Facial Galvanic";
                            harga[i] = 300000;
                        } else if (pilih == 5) {
                            layanan[i] = "Penambahan P.Mata/Telinga/Back Therapy";
                            harga[i] = 35000;
                        } else if (pilih == 6) {
                            layanan[i] = "Penambahan Galvanic";
                            harga[i] = 300000;
                        } else {
                            System.out.println("Pilihan tidak valid !");
                        }
                        System.out.println("Pelayanan yang Anda pesan   : " + layanan[i]);
                        System.out.println("Harga yang harus Anda bayar : " + harga[i]);
                        System.out.print("\n Ingin memilih lagi ? (Ya/Tidak) : ");
                        lagi = in.next();
                        i++;
                    } while (lagi.equals("Ya") || (lagi.equals("ya")));
                    setTotal();
                    getDiri();
                    setPembayaran();
                    getCost();
                    break;
                case 2:
                    do {
                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        System.out.println("\t Paket Body Treatment");
                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        System.out.println("1. Black Coffee Herbs Rp. 185.000");
                        System.out.println("2. Lulur Ratu Rp. 185.000");
                        System.out.println("3. Lulur Prana Rp. 185.000");
                        System.out.println("4. Lulur Kireina Rp. 185.000");
                        System.out.println("5. Body Massage Rp. 98.000");
                        System.out.println("6. Masker Tubuh Cleo Rp. 185.000");
                        System.out.println("7. Milk Bath Rp. 50.000");
                        System.out.println("8. Kerokkan Rp. 33.500");
                        System.out.println("9. Penambahan PM/PT/BT Rp. 40.000");
                        System.out.println("10. Body Spa Treatment Rp. 220.000");
                        System.out.println("11. Body Spa & Face Treatment Rp. 218.000");
                        System.out.println("12. All About Chocolate Rp. 350.000");
                        System.out.println("13. All About Coffee Rp. 253.000");
                        System.out.print("Masukkan pilihan Anda : ");
                        pilih = in.nextInt();
                        if (pilih == 1) {
                            layanan[i] = "Black Coffee Herbs";
                            harga[i] = 185000;
                        } else if (pilih == 2) {
                            layanan[i] = "Lulur Ratu";
                            harga[i] = 185000;
                        } else if (pilih == 3) {
                            layanan[i] = "Lulur Prana";
                            harga[i] = 185000;
                        } else if (pilih == 4) {
                            layanan[i] = "Lulur Kireina";
                            harga[i] = 185000;
                        } else if (pilih == 5) {
                            layanan[i] = "Body Massage";
                            harga[i] = 98000;
                        } else if (pilih == 6) {
                            layanan[i] = "Masker Tubuh Cleo";
                            harga[i] = 185000;
                        } else if (pilih == 7) {
                            layanan[i] = "Milk Bath";
                            harga[i] = 50000;
                        } else if (pilih == 8) {
                            layanan[i] = "Kerokkan";
                            harga[i] = 33500;
                        } else if (pilih == 9) {
                            layanan[i] = "Penambahan PM/PT/BT";
                            harga[i] = 40000;
                        } else if (pilih == 10) {
                            layanan[i] = "Body Spa Treatment";
                            harga[i] = 220000;
                        } else if (pilih == 11) {
                            layanan[i] = "Body Spa & Face Treatment";
                            harga[i] = 218000;
                        } else if (pilih == 12) {
                            layanan[i] = "All About Chocolate";
                            harga[i] = 350000;
                        } else if (pilih == 13) {
                            layanan[i] = "All About Coffee";
                            harga[i] = 253000;
                        } else {
                            System.out.println("Pilihan tidak valid !");
                        }
                        System.out.println("Pelayanan yang Anda pesan   : " + layanan[i]);
                        System.out.println("Harga yang harus Anda bayar : " + harga[i]);
                        System.out.print("\n Ingin memilih lagi ? (Ya/Tidak) : ");
                        lagi = in.next();
                        i++;
                    } while (lagi.equals("Ya") || (lagi.equals("ya")));
                    setTotal();
                    getDiri();
                    setPembayaran();
                    getCost();
                    break;
                case 3:
                    do {
                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        System.out.println("\t Paket Hair Spa Special");
                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        System.out.println("1. Cutting ( cuci blow + hair tonic   Rp. 55.000");
                        System.out.println("2. Blow Variasi/Natural/Catox + Vitamin + Hair Tonic   Rp. 81.000");
                        System.out.println("3. Cuci Blow Variasi   Rp. 65.000");
                        System.out.println("4. Blow Natural   Rp. 58.000");
                        System.out.println("5. Creambath   Rp. 63.000");
                        System.out.println("6. Masker Rambut   Rp. 86.000");
                        System.out.println("7. Hair Spa Makarizo   Rp. 102.000");
                        System.out.println("8. Hair Spa Coffee   Rp. 102.000");
                        System.out.println("9. Make Up   Rp. 155.000");
                        System.out.println("10. Rebonding Makarizo   Rp. 300.000");
                        System.out.println("11. Smooting (short)   Rp. 400.000");
                        System.out.println("12. Coloring Matrix + Highlight   Rp. 200.000");
                        System.out.print("Masukkan pilihan Anda : ");
                        pilih = in.nextInt();
                        if (pilih == 1) {
                            layanan[i] = "Cutting ( cuci blow + hair tonic";
                            harga[i] = 55000;
                        } else if (pilih == 2) {
                            layanan[i] = "Blow Variasi/Natural/Catox + Vitamin + Hair Tonic";
                            harga[i] = 81000;
                        } else if (pilih == 3) {
                            layanan[i] = "Cuci Blow Variasi";
                            harga[i] = 65000;
                        } else if (pilih == 4) {
                            layanan[i] = "Blow Natural";
                            harga[i] = 58000;
                        } else if (pilih == 5) {
                            layanan[i] = "Creambath";
                            harga[i] = 63000;
                        } else if (pilih == 6) {
                            layanan[i] = "Masker Rambut";
                            harga[i] = 86000;
                        } else if (pilih == 7) {
                            layanan[i] = "Hair Spa Makarizo";
                            harga[i] = 102000;
                        } else if (pilih == 8) {
                            layanan[i] = "Hair Spa Coffee";
                            harga[i] = 102000;
                        } else if (pilih == 9) {
                            layanan[i] = "Make Up";
                            harga[i] = 155000;
                        } else if (pilih == 10) {
                            layanan[i] = "Rebonding Makarizo";
                            harga[i] = 300000;
                        } else if (pilih == 11) {
                            layanan[i] = "Smooting (short)";
                            harga[i] = 400000;
                        } else if (pilih == 12) {
                            layanan[i] = "Coloring Matrix + Highlight";
                            harga[i] = 200000;
                        } else {
                            System.out.println("Pilihan tidak valid !");
                        }
                        System.out.println("Pelayanan yang Anda pesan   : " + layanan[i]);
                        System.out.println("Harga yang harus Anda bayar : " + harga[i]);
                        System.out.print("\n Ingin memilih lagi ? (Ya/Tidak) : ");
                        lagi = in.next();
                        i++;
                    } while (lagi.equals("Ya") || (lagi.equals("ya")));
                    setTotal();
                    getDiri();
                    setPembayaran();
                    getCost();
                    break;
                case 4:
                    System.out.println("Terima Kasih Atas Kepercayaan Anda Kepada Kami");
            }
        } while (pilihan <= 1 && pilihan < 4);
    }

    @Override
    public void member() {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("\t\tData Member");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.print("\n Masukkan Nama Member : ");
        String nama = in.next();
        System.out.print("\n Masukkan Nomor ID : ");
        String id = in.next();
        System.out.println();
        System.out.println("Selamat ! Anda mendapatkan diskon sebesar 15%");
        newharga = hargatotal * (15 / 100);
        System.out.println("Diskon Member : Rp. " + newharga);
    }

    @Override
    public void diskon() {
        System.out.println("Selamat ! Anda mendapatkan diskon sebesar 10%");
        newharga1 = hargatotal * (10 / 100);
        System.out.println("Diskon Paket Premium : Rp. " + newharga1);
    }
}