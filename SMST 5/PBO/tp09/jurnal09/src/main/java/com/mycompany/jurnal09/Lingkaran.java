package com.mycompany.jurnal09;


public class Lingkaran extends BangunDatar {
    private int jariJari;

    public Lingkaran(String nama, int jariJari) {
        super(nama);
        this.jariJari = jariJari;
    }

    public int getJariJari() {
        return jariJari;
    }

    public void setJariJari(int jariJari) {
        this.jariJari = jariJari;
    }

    @Override
    public double hitungKeliling() {
        return 2 * Math.PI * jariJari;
    }

    @Override
    public double hitungLuas() {
        return Math.PI * jariJari * jariJari;
    }
}
