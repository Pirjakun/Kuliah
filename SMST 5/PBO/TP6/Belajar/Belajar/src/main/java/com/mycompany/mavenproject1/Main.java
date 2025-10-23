public class Main {
    public static void main(String[] args) {
        User user = new User("sadboy123");
        PremiumUser premium = new PremiumUser("ngopimass999", 2);

        Song[] list1 = {
                new Song("Lost Boy", "Ruth B", 261),
                new Song("Apa Mungkin", "Bernadya", 215),
                new Song("Komang", "Rain Kaode", 206),
                new Song("Waktu Yang Salah", "Fiersa Besari", 316),
                new Song("Happier", "Olivia Rodrigo", 154),
                new Song("Happiness", "Rex Orange County", 264)
        };

        Song[] list2 = {
                new Song("I Love You", "Billie Eilish", 271),
                new Song("Let Her Go", "Passenger", 247)
        };

        user.setPlaylist(list1);
        premium.setPlaylist(list2);

        System.out.println("Pengguna Umum:");
        System.out.println("Akun: " + user.getUsername());
        user.playPlaylist();

        System.out.println("=====================");
        System.out.println("Pengguna Premium:");
        System.out.println("Akun: " + premium.getUsername());
        premium.playPlaylist();
    }
}

