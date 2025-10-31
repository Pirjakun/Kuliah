public class PrismaSegitiga extends Bentuk implements BangunRuang {
    private int alas;
    private int tinggi;
    private int tinggiPrisma;

    public PrismaSegitiga(String nama, int alas, int tinggi, int tinggiPrisma) {
        super(nama);
        this.alas = alas;
        this.tinggi = tinggi;
        this.tinggiPrisma = tinggiPrisma;
    }

    @Override
    public void info() {
        System.out.println("Nama Prisma Segitiga: " + super.getNama());
        System.out.println("Alas Segitiga: " + alas);
        System.out.println("Tinggi Segitiga: " + tinggi);
        System.out.println("Tinggi Prisma: " + tinggiPrisma);
    }

    @Override
    public double hitungLuasPermukaan() {
        return (0.5 * this.alas * this.tinggi) + 2 * (0.5 * this.alas * this.tinggiPrisma);
    }

    @Override
    public double hitungVolume() {
        double luasAlas = 0.5 * alas * tinggi;
        return luasAlas * tinggiPrisma;
    }

}
