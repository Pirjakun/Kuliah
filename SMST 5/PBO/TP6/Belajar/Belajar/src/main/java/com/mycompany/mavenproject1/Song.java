public class Song {
    private String title;
    private String artist;
    private int durationSeconds;

    public Song(String title, String artist, int durationSeconds) {
        this.title = title;
        this.artist = artist;
        this.durationSeconds = durationSeconds;
    }

    public int getDurationSeconds() {
        return durationSeconds;
    }

    public int getDurationMM() {
        return durationSeconds / 60;
    }

    public int getDurationDD() {
        return durationSeconds % 60;
    }

    public void playMusic() {
        System.out.println("Lagu " + title + " oleh " + artist + " diputar dengan durasi " +
                getDurationMM() + ":" + String.format("%02d", getDurationDD()));
    }

    public void playMusic(int repeatCount) {
        for (int i = 1; i <= repeatCount; i++) {
            System.out.println("Pemutaran ke-" + i);
            playMusic();
        }
    }
}
