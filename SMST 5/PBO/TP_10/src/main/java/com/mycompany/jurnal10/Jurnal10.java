/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.jurnal10;
import java.text.ParseException;
import java.util.Scanner;

public class Jurnal10 {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Mahasiswa m = new Mahasiswa();
        String s;
        System.out.println("Validator Mahasiswa");
        boolean valid = false;

        do {
            try {
                System.out.print("NIM: ");
                s = sc.nextLine();

                m.setNim(s);

                valid = true;
                System.out.println("NIM valid");
            } catch (NumberFormatException e) {
                System.out.println("NIM harus semua angka");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (!valid);
        System.out.println("");
        valid = false;

        do {
            try {
                System.out.print("Nama: ");
                s = sc.nextLine();

                m.setNama(s);

                valid = true;
                System.out.println("Nama valid");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (!valid);
        System.out.println("");
        valid = false;

        do {
            try {
                System.out.print("Tanggal Lahir: ");
                s = sc.nextLine();

                m.setTanggalLahir(s);

                valid = true;
                System.out.println("Tanggal lahir valid");
            } catch (ParseException e) {
                System.out.println("Format tanggal harus yyyy-MM-dd");
            }
        } while (!valid);
        System.out.println("");
        valid = false;

        do {
            try {
                System.out.print("IPK: ");
                s = sc.nextLine(); 
                double ipk = Double.parseDouble(s);

                m.setIPK(ipk);

                valid = true;
                System.out.println("IPK valid");
            } catch (NumberFormatException e) {
                System.out.println("IPK harus berupa angka");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (!valid);
    }
}
