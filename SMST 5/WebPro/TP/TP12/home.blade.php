<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Daftar Makanan</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">
    <nav class="navbar navbar-dark bg-dark mb-4">
        <div class="container">
            <span class="navbar-brand mb-0 h1">Silih Asih</span>
        </div>
    </nav>

    <div class="container">
        @if(session('success'))
            <div class="alert alert-success mb-3">
                {{ session('success') }}
            </div>
        @endif

        <div class="card shadow-sm">
            <div class="card-body">
                <div class="d-flex justify-content-between align-items-center mb-3">
                    <h5 class="card-title mb-0">Daftar Makanan</h5>
                    <a href="{{ url('/create') }}" class="btn btn-primary">Tambah</a>
                </div>

                <table class="table table-striped table-hover">
                    <thead class="table-light">
                        <tr>
                            <th>ID</th>
                            <th>Nama Makanan</th>
                            <th>Harga</th>
                            <th>Deskripsi</th>
                            <th>Stok</th>
                        </tr>
                    </thead>
                    <tbody>
                        @forelse($makanans as $makanan)
                            <tr>
                                <td>{{ $makanan->id }}</td>
                                <td class="fw-bold">{{ $makanan->nama_makanan }}</td>
                                <td>Rp {{ number_format($makanan->harga, 0, ',', '.') }}</td>
                                <td>{{ $makanan->deskripsi }}</td>
                                <td>{{ $makanan->stock }}</td>
                            </tr>
                        @empty
                            <tr>
                                <td colspan="5" class="text-center">No data available</td>
                            </tr>
                        @endforelse
                    </tbody>
                </table>
            </div>
        </div>
    </div>
</body>
</html>