package com.mycompany.jurnal09;
import java.util.Scanner;

public class Jurnal09 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan jumlah bangun datar: ");
        int n = in.nextInt();
        in.nextLine();

        BangunDatar[] data = new BangunDatar[n];

        for (int i = 0; i < n; i++) {

            System.out.println("\n1. Lingkaran");
            System.out.println("2. Persegi Panjang");
            System.out.println("3. Segitiga Sama Kaki");
            System.out.print("Pilih tipe bangun datar ke-" + (i + 1) + ": ");
            int pilih = in.nextInt();
            in.nextLine();

            System.out.print("Masukkan nama bangun datar: ");
            String nama = in.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Masukkan jari-jari: ");
                    int r = in.nextInt();
                    data[i] = new Lingkaran(nama, r);
                    break;

                case 2:
                    System.out.print("Masukkan panjang: ");
                    int p = in.nextInt();
                    System.out.print("Masukkan lebar: ");
                    int l = in.nextInt();
                    data[i] = new PersegiPanjang(nama, p, l);
                    break;

                case 3:
                    System.out.print("Masukkan alas: ");
                    int a = in.nextInt();
                    System.out.print("Masukkan tinggi: ");
                    int t = in.nextInt();
                    data[i] = new Segitiga(nama, a, t);
                    break;
            }
        }

        // Output
        System.out.println("\n==============================\n");
        for (BangunDatar bd : data) {
            System.out.println("Nama BangunDatar : " + bd.getNama());

            if (bd instanceof PersegiPanjang pp) {
                System.out.println("Panjang          : " + pp.getPanjang());
                System.out.println("Lebar            : " + pp.getLebar());
            } else if (bd instanceof Segitiga sg) {
                System.out.println("Alas             : " + sg.getAlas());
                System.out.println("Tinggi           : " + sg.getTinggi());
            } else if (bd instanceof Lingkaran lk) {
                System.out.println("Jari-jari        : " + lk.getJariJari());
            }

            System.out.println("Luas             : " + bd.hitungLuas());
            System.out.println("Keliling         : " + bd.hitungKeliling());
            System.out.println();
        }

        in.close();
    }
}
