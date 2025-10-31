public abstract class Bentuk {
    private String nama;

    public Bentuk(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public abstract void info();

}
