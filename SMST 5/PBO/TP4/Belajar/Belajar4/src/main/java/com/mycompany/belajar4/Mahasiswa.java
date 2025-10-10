/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.belajar4;

/**
 *
 * @author Fyrza
 */
import java.util.ArrayList;

public class Mahasiswa {
    private String nim;
    private String nama;
    private int noUrut;
    private String kelas;
    private ArrayList<AmbilMK> ambilMK = new ArrayList<>();

    public Mahasiswa(String nim, String nama, int noUrut) {
        this.nim = nim;
        this.nama = nama;
        this.noUrut = noUrut;
    }

    public void setKelas(String kodeKelas, int noUrut) {
        this.kelas = "IF-" + kodeKelas + "-" + String.format("%02d", noUrut);
    }

    public String getKelas() {
        return kelas;
    }

    public String getNama() {
        return nama;
    }

    public void tambahMK(AmbilMK mk) {
        ambilMK.add(mk);
    }

    // === versi historical: akumulasi sampai tahun ajaran tertentu ===
    public double hitungIPK(String thnAjar) {
        double totalNilai = 0.0;
        int totalSKS = 0;

        for (AmbilMK ambil : ambilMK) {
            // hanya hitung nilai yg tahun ajarnya persis sama dengan input
            if (ambil.getThnAjar().equals(thnAjar)) {
                totalNilai += ambil.getMK().getSks() * ambil.nilaiAngka();
                totalSKS += ambil.getMK().getSks();
            }
        }

        if (totalSKS == 0) return -1.0;
        return totalNilai / totalSKS;
    }
}
