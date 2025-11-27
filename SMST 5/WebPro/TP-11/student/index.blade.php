<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Daftar Mahasiswa</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">
    <div class="container mt-5">
        <h2 class="text-center mb-4">Daftar Mahasiswa</h2>
        @if(session('success'))
            <div class="alert alert-success">
                {{ session('success') }}
            </div>
        @endif
        <div class="mb-3">
            <a href="{{ route('student.create') }}" class="btn btn-primary">Tambah Mahasiswa</a>
        </div>
        <div class="card mb-4 shadow-sm" style="width: fit-content;">
            <div class="card-body text-center">
                <h6 class="card-title text-muted">Total Mahasiswa</h6>
                <h3 class="card-text">{{ $totalStudents }}</h3>
            </div>
        </div>
        <div class="card shadow-sm">
            <div class="card-body p-0">
                <table class="table table-striped mb-0">
                    <thead class="table-light">
                        <tr>
                            <th>Nama</th>
                            <th>NIM</th>
                            <th>Nilai</th>
                        </tr>
                    </thead>
                    <tbody>
                        @forelse($students as $student)
                            <tr>
                                <td>{{ $student['nama'] }}</td>
                                <td>{{ $student['nim'] }}</td>
                                <td>
                                    <ul class="list-unstyled mb-0">
                                        @foreach($student['nilai'] as $course => $score)
                                            <li><strong>{{ $course }}:</strong> {{ $score }}</li>
                                        @endforeach
                                    </ul>
                                </td>
                            </tr>
                        @empty
                            <tr>
                                <td colspan="3" class="text-center py-3">Daftar kosong.</td>
                            </tr>
                        @endforelse
                    </tbody>
                </table>
            </div>
        </div>
    </div>
</body>
</html>