<?php
// Inisialisasi sesi
/* Kode ini memulai sesi PHP untuk memastikan data dapat disimpan dan digunakan selama sesi pengguna berlangsung.
Jika sesi belum diinisialisasi, maka akan diinisialisasi oleh script ini. */
session_start();

// Mengambil data pengguna
/* Kode ini memeriksa apakah terdapat data pengguna yang disimpan dalam session.
Jika ada, maka data tersebut akan di-loop dan ditampilkan dalam format HTML dengan nama, email, 
dan tombol hapus untuk setiap pengguna. Jika tidak ada data pengguna, akan menampilkan pesan 
'Tidak ada pengguna'. */
//CODE DISINI
if (isset($_SESSION['users']) && !empty($_SESSION['users'])) {
    foreach ($_SESSION['users'] as $id => $user) {
        echo '<div class="user-item">';
        echo htmlspecialchars($user['nama']) . ' (' . htmlspecialchars($user['email']) . ') ';
        echo '<button class="hapus-btn" data-id="' . $id . '">Hapus</button>';
        echo '</div>';
    }
} else {
    echo '<div class="user-item">Tidak ada pengguna.</div>';
}
?>