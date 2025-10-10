/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.belajar4;

/**
 *
 * @author Fyrza
 */
public class AmbilMK {
    private MataKuliah mk;
    private String nilaiHuruf;
    private String thnAjar;

    public AmbilMK(MataKuliah mk, String nilaiHuruf, String thnAjar) {
        this.mk = mk;
        this.nilaiHuruf = nilaiHuruf;
        this.thnAjar = thnAjar;
    }

    public MataKuliah getMK() {
        return mk;
    }

    public String getThnAjar() {
        return thnAjar;
    }

    public double nilaiAngka() {
        switch (nilaiHuruf) {
            case "A":  return 4.0;
            case "AB": return 3.5;
            case "B":  return 3.0;
            case "BC": return 2.5;
            case "C":  return 2.0;
            case "D":  return 1.0;
            default:   return 0.0;
        }
    }
}
