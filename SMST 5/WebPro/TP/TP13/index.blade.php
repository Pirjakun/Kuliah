<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>CloseLibrary Management System</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>

<body>
    <div class="container mt-4">
        <h1 class="mb-3">CloseLibrary Management System</h1>

        @if (session('success'))
            <div class="alert alert-success">
                {{ session('success') }}
            </div>
        @endif

        <!-- Add Book Form -->
        <div class="card mb-4">
            <div class="card-header">
                <h4>Add New Book</h4>
            </div>
            <div class="card-body">
                <form action="{{ route('books.store') }}" method="POST">
                    @csrf
                    <div class="row">
                        <div class="col-md-3">
                            <div class="form-group">
                                <label for="title">Title</label>
                                <input type="text" class="form-control" name="title" required>
                            </div>
                        </div>
                        <div class="col-md-3">
                            <div class="form-group">
                                <label for="author">Author</label>
                                <input type="text" class="form-control" name="author" required>
                            </div>
                        </div>
                        <div class="col-md-2">
                            <div class="form-group">
                                <label for="published_year">Published Year</label>
                                <input type="number" class="form-control" name="published_year" required>
                            </div>
                        </div>
                        <div class="col-md-2 d-flex align-items-end">
                            <button type="submit" class="btn btn-primary">Add Book</button>
                        </div>
                    </div>
                </form>
            </div>
        </div>

        <!-- Books List -->
        <div class="card">
            <div class="card-header">
                <h4>Books List</h4>
            </div>
            <div class="card-body">
                <div class="table-responsive">
                    <table class="table table-bordered">
                        <thead>
                            <tr>
                                <th>Title</th>
                                <th>Author</th>
                                <th>Published Year</th>
                                <th>Status</th>
                                <th>Actions</th>
                            </tr>
                        </thead>
                        <tbody>
                            @foreach ($books as $book)
                                <tr>
                                    <td>{{ $book->title }}</td>
                                    <td>{{ $book->author }}</td>
                                    <td>{{ $book->published_year }}</td>
                                    <td>
                                        @if ($book->status === 'available')
                                            <span class="badge bg-success">Available</span>
                                        @else
                                            <span class="badge bg-danger">Checked Out</span>
                                        @endif
                                    </td>
                                    <td>
                                        {{-- Lengkapi kode yang ada disini. Buat 2 buah tombol untuk edit dan delete --}}
                                        <a href="{{ route('books.edit', $book->id) }}" class="btn btn-warning btn-sm">Edit</a>
                                        <form action="{{ route('books.destroy', $book->id) }}" method="POST" style="display:inline;" onsubmit="return confirm('Are You Sure?');">
                                            @csrf
                                            @method('DELETE')
                                            <button type="submit" class="btn btn-danger btn-sm">Delete</button>
                                        </form>
                                    </td>
                                </tr>
                            @endforeach
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    </div>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>

</html>
