package com.mycompany.jurnal09;

public class Segitiga extends BangunDatar {
    private int alas;
    private int tinggi;

    public Segitiga(String nama, int alas, int tinggi) {
        super(nama);
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public int getAlas() {
        return alas;
    }

    public int getTinggi() {
        return tinggi;
    }

    public void setAlas(int alas) {
        this.alas = alas;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    @Override
    public double hitungKeliling() {
        double sisiMiring = Math.sqrt(Math.pow(alas / 2.0, 2) + Math.pow(tinggi, 2));
        return alas + 2 * sisiMiring;
    }

    @Override
    public double hitungLuas() {
        return 0.5 * alas * tinggi;
    }
}

