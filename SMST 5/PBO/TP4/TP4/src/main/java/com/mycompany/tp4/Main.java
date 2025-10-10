/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tp4;

/**
 *
 * @author Fyrza
 */
public class Main {

    public static void main(String[] args) {
        Dokter dt1 = new Dokter("Grisha", "Mata");
        Dokter dt2 = new Dokter("Faye", "Gigi");
        Dokter dt3 = new Dokter("Zeke", "Telinga");
        
        Pasien ps1 = new Pasien("historia", 20);
        Pasien ps2 = new Pasien("Sasha", 37);
        Pasien ps3 = new Pasien("Petra", 55);
        
        Pemesanan[] arr = new Pemesanan[5];
        arr[0] = new Pemesanan(dt1, ps1, "Selasa");
        arr[1] = new Pemesanan(dt2, ps1, "Kamis");
        arr[2] = new Pemesanan(dt2, ps2, "Selasa");
        arr[3] = new Pemesanan(dt3, ps2, "Jumat");
        arr[4] = new Pemesanan(dt1, ps3, "Senin");
        
        for (int i=0; i < arr.length; i++){
            Pemesanan p = arr[i];
            System.out.println("Urutan ke-"+(i+1));
            System.out.println("Nama Dokter     : "+ p.getDokter().getNama());
            System.out.println("Spesialis       : "+ p.getDokter().getSpesialis());
            System.out.println("Nama Pasien     : "+ p.getPasien().getNama() + " (" + p.getPasien().getUmur() + ")");
            System.out.println("Hari            : "+p.getHari());
            System.out.println("");
        }
    }
}
