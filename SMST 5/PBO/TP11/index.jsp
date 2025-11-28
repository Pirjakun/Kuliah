<%@page import="java.util.*"%>
<%@page import="jurnal11.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%

    // (#2.1) Buatlah objek ArrayList of Book
    ArrayList<Book> books = new ArrayList<>();

    // (#2.2) Tambahkan minimal 3 data buku dummy
    books.add(new Book("1984", "George Orwell", "Fiction", 1949, 4.2));
    books.add(new Book("Atomic Habits", "James Clear", "Non-Fiction", 2018, 4.3));
    books.add(new Book("Salvation of a Saint", "Keigo Higashino", "Fiction", 2008, 4.0));

    // Logic tambah buku (POST method)
    if ("POST".equalsIgnoreCase(request.getMethod())) {
        try {

            // (#2.3) Ambil parameter title, author, genre, year, dan rating dari URL
            String title = request.getParameter("title");
            String author = request.getParameter("author");
            String genre = request.getParameter("genre");
            int year = Integer.parseInt(request.getParameter("year"));
            double rating = Double.parseDouble(request.getParameter("rating"));

            // (#2.4) Tambahkan data tersebut ke array list
            books.add(new Book(title, author, genre, year, rating));
            
        } catch (Exception e) {
            out.println("<div class='alert alert-danger'>Invalid input. Please try again.</div>");
        }
    }

    // Logic filter (GET method)
    double minRating = 0;
    try {
        // (#2.5) Ambil parameter "minRating", kemudian cek apakah nilainya null atau tidak
        // (#2.5) Ambil parameter "minRating", kemudian cek apakah nilainya null atau tidak
        if (request.getParameter("minRating") != null && !request.getParameter("minRating").isEmpty()) {
            // (#2.6) Ganti nilai minRating dengan parameter minParameter yang sudah diubah ke double
            minRating = Double.parseDouble(request.getParameter("minRating"));
        }
    } catch (Exception e) {
        minRating = 0;
    }
%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Book Dashboard</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
    </head>
    <body>
        <nav class="navbar navbar-expand-lg navbar-dark bg-primary mb-4">
            <div class="container">
                <span class="navbar-brand">📚 JSP Book Dashboard</span>
            </div>
        </nav>

        <div class="container">
            <div class="row g-4">
                <!-- Form Column -->
                <div class="col-md-4">
                    <div class="card shadow-sm">
                        <div class="card-body">
                            <h5 class="card-title">Add a New Book</h5>
                            <form method="post">
                                <div class="mb-3">
                                    <label class="form-label">Title</label>
                                    <input type="text" name="title" class="form-control" required>
                                </div>
                                
                                <!-- (#1.1) Tambahkan input text untuk field author -->
                                <!-- (#1.1) Tambahkan input text untuk field author -->
                                <div class="mb-3">
                                    <label class="form-label">Author</label>
                                    <input type="text" name="author" class="form-control" required>
                                </div>
                                
                                <!-- (#1.2) Tambahkan input selection untuk field genre -->
                                <div class="mb-3">
                                    <label class="form-label">Genre</label>
                                    <select name="genre" class="form-select" required>
                                        <option value="Fiction">Fiction</option>
                                        <option value="Non-Fiction">Non-Fiction</option>
                                        <option value="Sci-Fi">Sci-Fi</option>
                                    </select>
                                </div>
                                
                                <!-- (#1.3) Tambahkan input number untuk field year -->
                                <div class="mb-3">
                                    <label class="form-label">Year</label>
                                    <input type="number" name="year" class="form-control" required>
                                </div>
                                
                                <!-- (#1.4) Tambahkan input number untuk field rating -->
                                <div class="mb-3">
                                    <label class="form-label">Rating</label>
                                    <input type="number" step="0.1" name="rating" class="form-control" required>
                                </div>
                                
                                <!-- (#1.5) Tambahkan button submit sebagai tombol menambahkan data -->
                                <div class="d-grid">
                                    <button type="submit" class="btn btn-primary">Add Book</button>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>

                <!-- Dashboard Column -->
                <div class="col-md-8">
                    <div class="d-flex justify-content-between align-items-center mb-3">
                        <h4>Book List</h4>
                        <form method="get" class="d-flex gap-2">
                            <input type="number" step="0.1" name="minRating" placeholder="Min Rating" class="form-control" style="width: 200px" min="0" max="5">
                            <button class="btn btn-outline-secondary" type="submit">Filter</button>
                        </form>
                    </div>

                    <div class="table-responsive">
                        <table class="table table-hover">
                            <thead class="table-light">
                                <tr>
                                    <th>Title</th><th>Author</th><th>Genre</th><th>Year</th><th>Rating</th>
                                </tr>
                            </thead>
                            <tbody>
                                <%
                                    // (#3.1) Looping, kemudian buat kondisi untuk menampilkan 
                                    // buku yang ratingnya lebih besar dari minRating
                                    // (#3.1) Looping, kemudian buat kondisi untuk menampilkan 
                                    // buku yang ratingnya lebih besar dari minRating
                                    for (Book b : books) {
                                        if (b.getRating() >= minRating) {
                                %>
                                <tr>
                                    <!-- (#3.2) Tampilkan seluruh property buku menggunakan getter -->
                                    <td><%= b.getTitle()%></td>
                                    <td><%= b.getAuthor()%></td>
                                    <td><%= b.getGenre()%></td>
                                    <td><%= b.getYear()%></td>
                                    <td><%= b.getRating()%></td>
                                </tr>
                                <%
                                        }
                                    }
                                %>
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
