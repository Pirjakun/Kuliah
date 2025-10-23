public class PremiumUser extends User {
    private int playtime;
    private int repeatCount;

    public PremiumUser(String username, int repeatCount) {
        super(username);
        this.repeatCount = repeatCount;
    }

    public void setRepeatCount(int repeatCount) {
        this.repeatCount = repeatCount;
    }

    public String getPlaytime() {
        int totalSeconds = playtime;
        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = totalSeconds % 60;
        return String.format("%d:%02d:%02d", hours, minutes, seconds);
    }

    @Override
    public void playPlaylist() {
        System.out.println("Semua lagu diputar tanpa iklan");
        for (int i = 1; i <= repeatCount; i++) {
            System.out.println("Pemutaran ke-" + i);
            for (Song song : playlist) {
                song.playMusic();
                playtime += song.getDurationSeconds();
            }
        }
        System.out.println("Jumlah durasi lagu yang telah dimainkan: " + getPlaytime());
    }
}
