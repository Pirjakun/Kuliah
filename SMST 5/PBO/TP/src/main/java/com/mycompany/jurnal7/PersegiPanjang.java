public class PersegiPanjang extends Bentuk implements BangunDatar {
    private int panjang;
    private int lebar;

    public PersegiPanjang(String nama, int panjang, int lebar) {
        super(nama);
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    public void info() {
        System.out.println("Nama Persegi Panjang: " + super.getNama());
        System.out.println("Panjang: " + panjang);
        System.out.println("Lebar: " + lebar);
    }

    @Override
    public double hitungKeliling() {
        return 2 * (panjang + lebar);
    }

    @Override
    public double hitungLuas() {
        return panjang * lebar;
    }

}
