<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Tambah Makanan</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">
    <nav class="navbar navbar-dark bg-dark mb-4">
        <div class="container">
            <span class="navbar-brand mb-0 h1">Silih Asih</span>
        </div>
    </nav>

    <div class="container">
        <div class="card mx-auto shadow-sm" style="max-width: 800px;">
            <div class="card-body">
                <h5 class="card-title mb-4">Tambah Makanan Baru</h5>
                
                <form action="{{ url('/create') }}" method="POST">
                    @csrf
                    
                    <div class="mb-3">
                        <label for="nama_makanan" class="form-label">Nama Makanan</label>
                        <input type="text" class="form-control" id="nama_makanan" name="nama_makanan" placeholder="Ex: Nasi Goreng" required>
                    </div>

                    <div class="mb-3">
                        <label for="harga" class="form-label">Harga</label>
                        <input type="number" class="form-control" id="harga" name="harga" placeholder="Ex: 10000" required>
                    </div>

                    <div class="mb-3">
                        <label for="deskripsi" class="form-label">Deskripsi</label>
                        <textarea class="form-control" id="deskripsi" name="deskripsi" rows="3" placeholder="Ex: Nasi, telur, dan bumbu" required></textarea>
                    </div>

                    <div class="mb-3">
                        <label for="stock" class="form-label">Stok</label>
                        <input type="number" class="form-control" id="stock" name="stock" placeholder="Ex: 100" required>
                    </div>

                    <div class="d-flex justify-content-end gap-2">
                        <a href="{{ url('/') }}" class="btn btn-secondary">Batal</a>
                        <button type="submit" class="btn btn-primary">Simpan Data</button>
                    </div>
                </form>
            </div>
        </div>
    </div>
</body>
</html>