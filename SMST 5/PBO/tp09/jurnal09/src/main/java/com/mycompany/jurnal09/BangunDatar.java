package com.mycompany.jurnal09;

public abstract class BangunDatar {
    protected String nama;

    public BangunDatar(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public abstract double hitungKeliling();

    public abstract double hitungLuas();
}
