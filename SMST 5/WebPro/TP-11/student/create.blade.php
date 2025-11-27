<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Form Input Mahasiswa</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">
    <div class="container mt-5">
        <h2 class="text-center mb-4">Form Input Mahasiswa</h2>
        <div class="card shadow-sm">
            <div class="card-body">
                <form action="{{ route('student.store') }}" method="POST">
                    @csrf
                    
                    <div class="mb-3">
                        <label for="nama" class="form-label">Nama</label>
                        <input type="text" class="form-control @error('nama') is-invalid @enderror" id="nama" name="nama" value="{{ old('nama') }}" placeholder="Masukkan Nama">
                        @error('nama')
                            <div class="invalid-feedback">{{ $message }}</div>
                        @enderror
                    </div>
                    <div class="mb-3">
                        <label for="nim" class="form-label">NIM</label>
                        <input type="text" class="form-control @error('nim') is-invalid @enderror" id="nim" name="nim" value="{{ old('nim') }}" placeholder="Masukkan NIM">
                        @error('nim')
                            <div class="invalid-feedback">{{ $message }}</div>
                        @enderror
                    </div>
                    <h5 class="mt-4 mb-3">Nilai Mata Kuliah</h5>
                    <div class="mb-3">
                        <label for="web" class="form-label">Pemrograman Web</label>
                        <input type="number" class="form-control @error('web') is-invalid @enderror" id="web" name="web" value="{{ old('web') }}" placeholder="0-100">
                        @error('web')
                            <div class="invalid-feedback">{{ $message }}</div>
                        @enderror
                    </div>
                    <div class="mb-3">
                        <label for="mobile" class="form-label">Pemrograman Perangkat Bergerak</label>
                        <input type="number" class="form-control @error('mobile') is-invalid @enderror" id="mobile" name="mobile" value="{{ old('mobile') }}" placeholder="0-100">
                        @error('mobile')
                            <div class="invalid-feedback">{{ $message }}</div>
                        @enderror
                    </div>
                    <div class="mb-4">
                        <label for="project" class="form-label">Manajemen Proyek</label>
                        <input type="number" class="form-control @error('project') is-invalid @enderror" id="project" name="project" value="{{ old('project') }}" placeholder="0-100">
                        @error('project')
                            <div class="invalid-feedback">{{ $message }}</div>
                        @enderror
                    </div>
                    <button type="submit" class="btn btn-primary w-100">Simpan</button>
                </form>
            </div>
        </div>
    </div>
</body>
</html>