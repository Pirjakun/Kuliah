<?php
// Inisialisasi sesi
/* Kode ini memulai sesi PHP untuk memastikan data dapat disimpan dan digunakan selama sesi pengguna berlangsung.*/
session_start();

// Proses penghapusan data pengguna
/* Kode ini memeriksa apakah terdapat 'id' yang dikirim melalui metode POST.
Jika ada, maka data dengan ID tersebut akan dihapus dari array session pengguna.
Jika berhasil dihapus, akan menampilkan pesan sukses, dan jika gagal, akan menampilkan pesan error. */
//CODE DISINI
if ($_SERVER['REQUEST_METHOD'] === 'POST' && isset($_POST['id'])) {
    $id = $_POST['id'];
    if (isset($_SESSION['users'][$id])) {
        unset($_SESSION['users'][$id]);
        echo "Berhasil menghapus data";
    } else {
        echo "Data tidak ditemukan";
    }
}
?>