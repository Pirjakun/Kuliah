/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Fyrza
 */
public class YahamaMoi extends SepedaMotor {

    public YahamaMoi(String warnaMotor) {
        super(warnaMotor);
        this.ukuranTangki = 5;
    }

    @Override
    public boolean jalan() {
        if (waktuIsiBensin == null) {
            System.out.println("Bensin habis, sepeda motor tidak dapat jalan");
            return false;
        } else {
            System.out.println("Sepeda motor sedang berjalan");
            System.out.println("Bensin akan habis pada " + formatWaktu(cekKapanHabis()));
            return true;
        }
    }
}
