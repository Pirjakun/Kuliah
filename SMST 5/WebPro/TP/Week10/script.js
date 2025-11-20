// Fungsi untuk memuat daftar pengguna
function loadUsers() {
    $.ajax({
        url: 'ambil_data.php',
        type: 'GET',
        success: function(response) {
            $('#daftar_pengguna').html(response);
        },
        error: function() {
            alert('Gagal memuat data pengguna.');
        }
    });
}

// Menangani pengiriman form tambah pengguna
/* Kode ini menangani pengiriman form dengan mencegah reload halaman,
mengambil data 'nama' dan 'email' dari input, lalu mengirim data tersebut 
ke 'proses_tambah.php' melalui AJAX. Setelah berhasil, data pengguna 
akan diperbarui dan input akan dikosongkan. Jika gagal, akan menampilkan
pesan error kepada pengguna. */
//CODE DISINI
$('#form-tambah-pengguna').on('submit', function(e) {
    e.preventDefault();
    let nama = $('#nama').val();
    let email = $('#email').val();

    $.ajax({
        url: 'proses_tambah.php',
        type: 'POST',
        data: {
            nama: nama,
            email: email
        },
        success: function(response) {
            loadUsers();
            $('#email').val('');
        },
        error: function() {
            alert('Gagal menambah pengguna.');
        }
    });
});
// Menangani penghapusan pengguna
/* Kode ini menangani klik pada tombol hapus untuk menghapus pengguna. 
AJAX akan mengirimkan ID pengguna ke 'proses_hapus.php', yang akan menghapus 
data dari session. Setelah proses selesai, daftar pengguna akan diperbarui.
Jika ada error, pesan kesalahan akan ditampilkan. */
//CODE DISINI
$(document).on('click', '.hapus-btn', function() {
    let id = $(this).data('id');
    
    if(confirm('Apakah Anda yakin ingin menghapus pengguna ini?')) {
        $.ajax({
            url: 'proses_hapus.php',
            type: 'POST',
            data: {
                id: id
            },
            success: function(response) {
                loadUsers();
            },
            error: function() {
                alert('Gagal menghapus pengguna.');
            }
        });
    }
});
// Memuat daftar pengguna saat halaman dimuat
/* Kode ini memastikan bahwa setelah halaman selesai dimuat, fungsi 
loadUsers() akan dijalankan secara otomatis untuk mengambil dan menampilkan 
data pengguna dari session tanpa perlu reload halaman. */
//CODE DISINI
$(document).ready(function() {
    loadUsers();
});