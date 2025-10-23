/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

/**
 *
 * @author Fyrza
 */
public class Main {
    public static void main(String[] args) {
        SepedaMotor sp = new SepedaMotor("Hitam");
        HondaBaet hb = new HondaBaet("Biru");
        YahamaMoi ym = new YahamaMoi("Merah");

        System.out.println("Status Awal Sepeda Motor:");
        System.out.println(sp.jalan());
        System.out.println();

        System.out.println("Status Awal HondoBaet:");
        System.out.println(hb.jalan());
        System.out.println();

        System.out.println("Status Awal YahamaMoi:");
        System.out.println(ym.jalan());
        System.out.println();

        System.out.println("-----------------------------");

        sp.isTangkiFull();
        hb.isTangkiFull();
        ym.isTangkiFull();

        System.out.println("Status Terbaru Sepeda Motor:");
        System.out.println("Waktu Saat ini: " + sp.formatWaktu(sp.waktuIsiBensin));
        sp.jalan();
        System.out.println(sp.formatWaktu(sp.cekKapanHabis()));
        System.out.println();

        System.out.println("Status Terbaru HondoBaet:");
        System.out.println("Waktu Saat ini: " + hb.formatWaktu(hb.waktuIsiBensin));
        hb.jalan();
        System.out.println();

        System.out.println("Status Terbaru YahamaMoi:");
        System.out.println("Waktu Saat ini: " + ym.formatWaktu(ym.waktuIsiBensin));
        ym.jalan();
    }
}
