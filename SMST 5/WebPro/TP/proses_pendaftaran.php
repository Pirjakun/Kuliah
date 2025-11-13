<!-- proses_pendaftaran.php -->
<!DOCTYPE html>
<html>

<head>
    <title>Hasil Pendaftaran Kursus</title>
    <link rel="stylesheet" href="style.css">
</head>

<body>
    <div class="container">
        <?php
        // Buatkan Array Assosiatif untuk Kursus beserta harga nya. Lihat modul
        // Sesuaikan dengan value yang ada di HTML
        $harga_kursus = [
            "Web Development" => 2000000,
            "Mobile Development" => 2500000,
            "Data Science" => 3000000,
            "UI/UX Design" => 1500000
        ];

        // Terima data dari form. Gunakan nama sebagai contoh. 
        // Ambil data lain nya (email, kursus_dipilih, dan metode_pembayaran)
        $nama = $_POST['nama'];
        $email = $_POST['email'];
        $kursus_dipilih = isset($_POST['kursus']) ? $_POST['kursus'] : [];
        $metode_pembayaran = $_POST['pembayaran'];


        // Hitung total biaya. Silahkan gunakan looping untuk menghitung
        $total_biaya = 0;
        foreach ($kursus_dipilih as $k) {
            if (isset($harga_kursus[$k])) {
                $total_biaya += $harga_kursus[$k];
            }
        }



        // Hitung diskon/tambahan biaya berdasarkan metode pembayaran
        // Jika dibayar full, maka mendapatkan diskon 10%
        // Jika dibayar cicilan, maka akan ada biaya tambahan 5%
        // Gunakan IF 
        $biaya_akhir = $total_biaya;
        if ($metode_pembayaran == "full") {
            $biaya_akhir = $total_biaya - ($total_biaya * 0.10);
            $keterangan = "Full Payment (Diskon 10%)";
        } else {
            $biaya_akhir = $total_biaya + ($total_biaya * 0.05);
            $keterangan = "Cicilan 3x (Tambahan 5%)";
        }

        // Tampilkan hasil
        // Gunakan echo
        echo "<h2>Hasil Pendaftaran</h2>";

        echo "<div class='hasil-section'>";
        echo "<h3>Data Pendaftar</h3>";

        //echo nama dan email
        echo "Nama: $nama<br>";
        echo "Email: $email<br>";
        echo "</div>";

        echo "<div class='hasil-section'>";
        echo "<h3>Kursus yang Dipilih</h3>";

        //echo kursus yang dipilih. Cek terlebih dahulu apakah kursus ada atau tidak dengan IF
        if (!empty($kursus_dipilih)) {
            foreach ($kursus_dipilih as $k) {
                echo "- $k (Rp " . number_format($harga_kursus[$k], 0, ',', '.') . ")<br>";
            }
        } else {
            echo "Tidak ada kursus yang dipilih.<br>";
        }

        echo "</div>";

        echo "<div class='hasil-section'>";
        echo "<h3>Rincian Biaya</h3>";
        echo "<div class='rincian-biaya'>";
        //echo data sesuai dengan contoh soal 
        //Total harga, keterangan biaya (diskon atau cicilan), dan Total akhir setelah diskon atau cicilan.
        echo "Total Harga Kursus: Rp " . number_format($total_biaya, 0, ',', '.') . "<br>";
        echo "Metode Pembayaran: $keterangan<br>";
        echo "<strong>Total yang Harus Dibayar: Rp " . number_format($biaya_akhir, 0, ',', '.') . "</strong><br><br>";

        //Ada bagian tambahan jika pengguna memilih opsi cicilan
        //Disini harus menampilkan cicilan pengguna (dicicil selama 3x)
        if ($metode_pembayaran == 'cicilan') {
            echo "<div class='cicilan'>";
            echo "Rincian Cicilan (3x):<br>";
            //Berarti biaya akhir / 3. Kemudian looping sebanyak 3x untuk menampilkan Biaya cicilan.
            $angsuran = $biaya_akhir / 3;
            for ($i = 1; $i <= 3; $i++) {
                echo "Cicilan $i: Rp " . number_format($angsuran, 0, ',', '.') . "<br>";
            }

            echo "</div>";
        }
        echo "</div>";
        echo "</div>";

        echo "<a href='form_pendaftaran.html' class='back-button'>Kembali ke Form</a>";
        ?>
    </div>
</body>

</html>