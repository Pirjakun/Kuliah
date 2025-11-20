<?php
// Inisialisasi sesi
/* Kode ini memulai sesi PHP untuk memastikan data dapat disimpan dan digunakan selama sesi pengguna berlangsung.*/
session_start();

// Proses penambahan data pengguna
/* Kode ini memeriksa apakah data 'nama' dan 'email' dikirim melalui metode POST.
Jika data diterima, maka data baru akan disimpan ke dalam array session pengguna. 
Data nama dan email yang dimasukkan juga akan divalidasi untuk menghindari kesalahan input.
Setelah proses selesai, akan menampilkan pesan berhasil atau error. */
//CODE DISINI
if ($_SERVER['REQUEST_METHOD'] === 'POST') {
        $_SESSION['users'] = [];
    }
    $nama = htmlspecialchars($_POST['nama']);
    $email = htmlspecialchars($_POST['email']);
    if (!empty($nama) && !empty($email)) {
        $new_user = [
            'nama' => $nama,
            'email' => $email
        ];
        $_SESSION['users'][] = $new_user;
        echo "Berhasil menambah pengguna";
    } else {
        echo "Data tidak lengkap";
    }
?>