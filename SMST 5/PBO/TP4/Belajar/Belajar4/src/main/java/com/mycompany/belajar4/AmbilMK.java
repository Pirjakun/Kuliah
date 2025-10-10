public class AmbilMK {
    private MataKuliah mataKuliah;
    private String nilai;
    private String tahunAjaran;

    public AmbilMK(MataKuliah mk, String nilai, String tahunAjaran) {
        this.mataKuliah = mk;
        this.nilai = nilai;
        this.tahunAjaran = tahunAjaran;
    }

    public MataKuliah getMataKuliah() { return mataKuliah; }
    public void setMataKuliah(MataKuliah mk) { this.mataKuliah = mk; }

    public String getNilai() { return nilai; }
    public void setNilai(String nilai) { this.nilai = nilai; }

    public String getTahunAjaran() { return tahunAjaran; }
    public void setTahunAjaran(String tahunAjaran) { this.tahunAjaran = tahunAjaran; }
}
