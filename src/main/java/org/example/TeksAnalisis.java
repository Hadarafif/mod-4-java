package org.example;

import java.util.Scanner;

public class TeksAnalisis {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String teks = "";
        int pilihan, jumlahKarakter, jumlahKata;
        String[] kata;

        do {
            System.out.println("=== MENU TEKS ANALYZER ===");
            System.out.println("1. Masukkan Teks");
            System.out.println("2. Hitung Jumlah Karakter");
            System.out.println("3. Hitung Jumlah Kata");
            System.out.println("4. Cari Kata dalam Teks");
            System.out.println("5. Keluar");

            System.out.print("Pilihan Anda: ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan teks: ");
                    input.nextLine();
                    teks = input.nextLine();
                    System.out.println("Teks telah dimasukkan!\n");
                    break;
                case 2:
                    jumlahKarakter = teks.length();
                    System.out.println("Jumlah karakter dalam teks: " + jumlahKarakter + "\n");
                    break;
                case 3:
                    kata = teks.split("\\s+");
                    jumlahKata = kata.length;
                    System.out.println("Jumlah kata dalam teks: " + jumlahKata + "\n");
                    break;
                case 4:
                    System.out.print("Masukkan kata yang ingin dicari: ");
                    input.nextLine();
                    String cari = input.nextLine();
                    int count = 0;
                    kata = teks.split("\\s+");
                    for (String s : kata) {
                        if (s.equalsIgnoreCase(cari)) {
                            count++;
                        }
                    }
                    System.out.println("Kata '" + cari + "' ditemukan sebanyak " + count + " kali dalam teks.\n");
                    break;
                case 5:
                    System.out.println("Terima kasih telah menggunakan program Teks Analisis!\n");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!\n");
                    break;
            }
        } while (pilihan != 5);
    }
}