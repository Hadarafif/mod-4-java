package org.example;

import java.util.Scanner;

public class kalkulator
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double bil1, bil2, hasil;
        int pilihan;
        do  {
        System.out.println("=== Calculator ===");
        System.out.println("1. Akar Kuadrat");
        System.out.println("2. Pangkat");
        System.out.println("3. Logaritma");
        System.out.println("4. Faktorial");
        System.out.println("5. Keluar");


            System.out.print("Pilih operasi (1/2/3/4/5): ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan angka: ");
                    bil1 = input.nextDouble();
                    hasil = Math.sqrt(bil1);
                    System.out.println("Hasil akar kuadrat dari " + bil1 + " adalah " + hasil);
                    break;
                case 2:
                    System.out.print("Masukkan angka: ");
                    bil1 = input.nextDouble();
                    System.out.print("Masukkan pangkat: ");
                    bil2 = input.nextDouble();
                    hasil = Math.pow(bil1, bil2);
                    System.out.println(bil1 + " pangkat " + bil2 + " adalah " + hasil);
                    break;
                case 3:
                    System.out.print("Masukkan angka: ");
                    bil1 = input.nextDouble();
                    hasil = Math.log(bil1);
                    System.out.println("Logaritma natural dari " + bil1 + " adalah " + hasil);
                    break;
                case 4:
                    System.out.print("Masukkan angka: ");
                    bil1 = input.nextDouble();
                    hasil = 1;
                    for (int i = 1; i <= bil1; i++) {
                        hasil *= i;
                    }
                    System.out.println("Faktorial dari " + bil1 + " adalah " + hasil);
                    break;
                case 5:
                    System.out.println("Terima kasih telah menggunakan kalkulator ini.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
                    break;
            }
        } while (pilihan != 5);
    }
}
