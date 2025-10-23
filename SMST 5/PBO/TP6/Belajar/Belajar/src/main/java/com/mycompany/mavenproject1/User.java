public class User {
    protected String username;
    protected Song[] playlist;

    public User(String username) {
        if (username == null || username.isEmpty()) {
            this.username = "anonymous";
        } else {
            this.username = username;
        }
    }

    public String getUsername() {
        return username;
    }

    public void setPlaylist(Song[] arrSong) {
        if (arrSong == null || arrSong.length == 0) {
            System.out.println("Play list kosong");
        } else {
            this.playlist = arrSong;
        }
    }

    public Song[] getPlaylist() {
        return playlist;
    }

    public void playPlaylist() {
        for (Song song : playlist) {
            System.out.println("Iklan dulu karena akun gratisan, makanya premium");
            song.playMusic();
        }
    }
}
