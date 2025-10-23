/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author Fyrza
 */
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SepedaMotor {
    protected String warnaMotor;
    protected int ukuranTangki;
    protected LocalDateTime waktuIsiBensin;
    
    public SepedaMotor(String warnaMotor) {
        this.warnaMotor = warnaMotor;
        this.ukuranTangki = 3;
        this.waktuIsiBensin = null;
    }

    public void isTangkiFull() {
        this.waktuIsiBensin = LocalDateTime.now();
    }
    public LocalDateTime cekKapanHabis() {
        if (waktuIsiBensin == null) {
            return null;
        }
        return waktuIsiBensin.plusHours(ukuranTangki + 1);
    }
    public boolean jalan() {
        if (waktuIsiBensin == null) {
            System.out.println("Bensin habis, sepeda motor tidak dapat jalan");
            return false;
        } else {
            System.out.println("Sepeda motor sedang berjalan");
            return true;
        }
    }
    protected String formatWaktu(LocalDateTime waktu) {
        if (waktu == null) return "Belum diisi";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        return waktu.format(formatter);
    }
}
