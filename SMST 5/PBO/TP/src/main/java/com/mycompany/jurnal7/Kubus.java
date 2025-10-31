/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jurnal7;

/**
 *
 * @author Fyrza
 */
public class Kubus extends Bentuk implements BangunRuang {
    private int sisi;

    public Kubus(String nama, int sisi) {
        super(nama);
        this.sisi = sisi;
    }

    @Override
    public void info() {
        System.out.println("Nama Kubus: " + super.getNama());
        System.out.println("Panjang Sisi: " + sisi);
    }

    @Override
    public double hitungLuasPermukaan() {
        return 6 * sisi * sisi;
    }

    @Override
    public double hitungVolume() {
        return sisi * sisi * sisi;
    }
}