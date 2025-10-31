/*
public class Lingkaran extends Bentuk implements BangunDatar {
    private int jariJari;

    public Lingkaran(String nama, int jariJari) {
        super(nama);
        this.jariJari = jariJari;
    }

    @Override
    public void info() {
        System.out.println("Nama Lingkaran: " + super.getNama());
        System.out.println("Panjang jari-jari: " + this.jariJari);
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
