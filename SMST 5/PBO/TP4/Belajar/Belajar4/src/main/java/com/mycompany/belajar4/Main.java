/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.belajar4;
/**
 *
 * @author Fyrza
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MataKuliah pbo = new MataKuliah("CII3B4", "Pemrograman Berorientasi Objek", 4);
        MataKuliah kalkulus = new MataKuliah("CII2A3", "Kalkulus", 3);
        MataKuliah dka = new MataKuliah("CII1F4", "Dasar Kecerdasan Artifisial", 4);
        MataKuliah kwu = new MataKuliah("UKI2A2", "Kewirausahaan", 2);

        Mahasiswa mhs1 = new Mahasiswa("103012330004", "Tanjiro", 1);
        Mahasiswa mhs2 = new Mahasiswa("103012310024", "Spongebob", 12);
        Mahasiswa mhs3 = new Mahasiswa("103012320012", "Naruto", 5);

        mhs1.setKelas("47", 1);
        mhs2.setKelas("47", 12);
        mhs3.setKelas("47", 5);

        // Tanjiro
        mhs1.tambahMK(new AmbilMK(pbo, "A", "21/22"));
        mhs1.tambahMK(new AmbilMK(dka, "A", "21/22"));
        mhs1.tambahMK(new AmbilMK(kwu, "A", "21/22"));

        // Spongebob
        mhs2.tambahMK(new AmbilMK(kalkulus, "A", "19/20"));
        mhs2.tambahMK(new AmbilMK(dka, "BC", "19/20"));
        mhs2.tambahMK(new AmbilMK(pbo, "A", "21/22")); // hanya 1 MK di 21/22

        // Naruto
        mhs3.tambahMK(new AmbilMK(kalkulus, "D", "21/22"));
        mhs3.tambahMK(new AmbilMK(dka, "B", "21/22"));

        Mahasiswa[] daftar = new Mahasiswa[] { mhs1, mhs2, mhs3 };

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Masukkan Tahun Ajaran (ketik q untuk exit program): ");
            String input = sc.nextLine().trim();
            if (input.equalsIgnoreCase("q")) break;
            boolean any = false;
            for (Mahasiswa m : daftar) {
                double ipk = m.hitungIPK(input);
                if (ipk >= 0.0) {
                    any = true;
                    System.out.printf("IPK %s (%s): %.2f%n", m.getNama(), m.getKelas(), ipk);
                }
            }
            if (!any) {
                System.out.println("Tidak ada histori nilai pada Tahun Ajaran ini");
            }
            System.out.println();
        }
    }
}
