/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.jurnal7;

/**
 *
 * @author Fyrza
 */

public class Main {
    public static void main(String[] args) {
        Kubus k = new Kubus("Kiub", 5);
        Lingkaran l = new Lingkaran("Sirkel", 14);
        PersegiPanjang pp = new PersegiPanjang("Rektenggel", 8, 9);
        PrismaSegitiga ps3 = new PrismaSegitiga("Prismarine", 6, 7, 10);

        // Lingkaran
        l.info();
        System.out.printf("Luas: %.1f%n", l.hitungLuas());
        System.out.printf("Keliling: %.1f%n%n", l.hitungKeliling());

        // Persegi Panjang
        pp.info();
        System.out.printf("Luas: %.1f%n", pp.hitungLuas());
        System.out.printf("Keliling: %.1f%n%n", pp.hitungKeliling());

        // Kubus
        k.info();
        System.out.printf("Luas Permukaan: %.1f%n", k.hitungLuasPermukaan());
        System.out.printf("Volume: %.1f%n%n", k.hitungVolume());

        // Prisma Segitiga
        ps3.info();
        System.out.printf("Luas Permukaan: %.1f%n", ps3.hitungLuasPermukaan());
        System.out.printf("Volume: %.1f%n", ps3.hitungVolume());
    }
}
