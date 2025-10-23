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

public class HondaBaet extends SepedaMotor {

    public HondaBaet(String warnaMotor) {
        super(warnaMotor);
        this.ukuranTangki = 4;
    }

    @Override
    public boolean jalan() {
        if (waktuIsiBensin == null) {
            System.out.println("Bensin habis, sepeda motor tidak dapat jalan");
            return false;
        } else {
            System.out.println("Sepeda motor sedang berjalan");
            System.out.println("Motor Baet akan habis bensin pada " + formatWaktu(cekKapanHabis()));
            return true;
        }
    }
}
