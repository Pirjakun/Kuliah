import java.util.ArrayList;

public class Mahasiswa {
    private String nim;
    private String nama;
    private int noKelasNumeric;
    private String kelas;
    private String prodi;
    private ArrayList<AmbilMK> ambilMK;

    public Mahasiswa(String nim, String nama, int noKelasNumeric) {
        this.ambilMK = new ArrayList<>();
        setNim(nim);
        this.nama = nama;
        this.noKelasNumeric = noKelasNumeric;
        this.kelas = "";
    }

    public String getNim() { return nim; }
    public void setNim(String nim) { setNimDirect(nim); }

    public void setNimDirect(String nim) {
        this.nim = nim;
        if (nim != null && nim.length() >= 5) {
            String prefix = nim.substring(0, 5);
            switch (prefix) {
                case "10301": this.prodi = "IF"; break;
                case "10302": this.prodi = "SE"; break;
                case "10303": this.prodi = "IT"; break;
                case "10305": this.prodi = "DS"; break;
                default: this.prodi = "UNKNOWN"; break;
            }
        } else {
            this.prodi = "UNKNOWN";
        }
    }

    public String getNama() { return nama; }
    public void setNama(String nama) { this.nama = nama; }

    public String getKelas() { return kelas; }

    public void setKelas(String noMasukAngkatan, int noKelas) {
        String kodeProdi = (this.prodi != null && !this.prodi.isEmpty()) ? this.prodi : "XX";
        String noKelasStr = String.format("%02d", noKelas);
        this.kelas = kodeProdi + "-" + noMasukAngkatan + "-" + noKelasStr;
    }

    public void setKelasDefault(int noKelas) {
        setKelas("00", noKelas);
    }

    public void setProdi(String prodi) { this.prodi = prodi; }
    public String getProdi() { return prodi; }

    public void tambahMK(AmbilMK amk) { this.ambilMK.add(amk); }
    public ArrayList<AmbilMK> getDaftarAmbilMK() { return ambilMK; }

    public double hitungIPK(String tahunAjaran) {
        double totalBobot = 0.0;
        int totalSks = 0;
        for (AmbilMK amk : ambilMK) {
            if (amk.getTahunAjaran().equals(tahunAjaran)) {
                double point = nilaiToPoint(amk.getNilai());
                int sks = amk.getMataKuliah().getSks();
                totalBobot += point * sks;
                totalSks += sks;
            }
        }
        if (totalSks == 0) return -1.0;
        return totalBobot / totalSks;
    }

    private double nilaiToPoint(String n) {
        if (n == null) return 0.0;
        n = n.trim().toUpperCase();
        switch (n) {
            case "A": return 4.0;
            case "AB": return 3.5;
            case "B": return 3.0;
            case "BC": return 2.5;
            case "C": return 2.0;
            case "D": return 1.0;
            default: return 0.0;
        }
    }
}
