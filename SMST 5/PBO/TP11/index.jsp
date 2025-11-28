<%@page import="java.util.*"%>
<%@page import="jurnal11.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%

    // (#2.1) Buatlah objek ArrayList of Book
    ...

    // (#2.2) Tambahkan minimal 3 data buku dummy
    ...
    ...
    ...

    // Logic tambah buku (POST method)
    if ("POST".equalsIgnoreCase(request.getMethod())) {
        try {

            // (#2.3) Ambil parameter title, author, genre, year, dan rating dari URL
            String title = ...
            String author = ...
            String genre = ...
            int year = ...
            double rating = ...

            // (#2.4) Tambahkan data tersebut ke array list
            ...
            
        } catch (Exception e) {
            out.println("<div class='alert alert-danger'>Invalid input. Please try again.</div>");
        }
    }

    // Logic filter (GET method)
    double minRating = 0;
    try {
        // (#2.5) Ambil parameter "minRating", kemudian cek apakah nilainya null atau tidak
        if (...) {
            // (#2.6) Ganti nilai minRating dengan parameter minParameter yang sudah diubah ke double
            minRating = ...
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
                                ...
                                
                                <!-- (#1.2) Tambahkan input selection untuk field genre -->
                                ...
                                
                                <!-- (#1.3) Tambahkan input number untuk field year -->
                                ...
                                
                                <!-- (#1.4) Tambahkan input number untuk field rating -->
                                ...
                                
                                <!-- (#1.5) Tambahkan button submit sebagai tombol menambahkan data -->
                                ...
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
                                    for (...) {
                                        if (...) {
                                %>
                                <tr>
                                    <!-- (#3.2) Tampilkan seluruh property buku menggunakan getter -->
                                    <td><%= b.getTitle()%></td>
                                    ...
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
