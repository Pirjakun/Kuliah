package controllers;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Product;

@WebServlet(name = "ProductController", urlPatterns = {"/product"})
public class ProductController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // (#3.1 lengkapi 2 line dibawah ini)
        // lakukan request parameter menu
        String menu = ...
        
        // buat objek Product
        ...

        if ("view".equals(menu)) {
            // (#3.2 lengkapi 3 line dibawah ini)
            // melakukan get data dari db dengan memanggil func get
            ArrayList<Product> products = ...
            
            // dari data yang telah di get diatas, lakukan set atribut ke products 
            ...
            // (mengarahkan ke halaman dashbord (view.jsp))
            request.getRequestDispatcher("...").forward(request, response);

        } else if ("add".equals(menu)) {
            // (#3.3 mengarahkan ke halaman tambah barang (add.jsp))
            request.getRequestDispatcher("...").forward(request, response);

        } else if ("edit".equals(menu)) {
            // (#3.4 lengkapi 6 line dibawah ini)
            // lakukan request parameter id
            String id = ...
            
            // lakukan search id sebelumnya menggunakan func find pada objek yang telah dibuat
            Product product = ...
            if (product != null) {
                // lakukan set atribut product
                ...
                
                // mengarahkan ke halaman edit barang (edit.jsp)
                request.getRequestDispatcher("...").forward(request, response);
            } else {
                // mengarahkan ke halaman dashboard (view.jsp)
                response.sendRedirect("...");
            }

        } else {
            // mengarahkan ke halaman dashboard (view.jsp)
            response.sendRedirect("...");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // (#3.5 lengkapi 2 line dibawah ini)
        // lakukan request parameter action
        String action = ...
        
        // buat objek Product
        ...

        if ("add".equals(action)) {
            // (#3.6 lengkapi 4 line dibawah ini)
            // lakukan request parameter nama
            String name = ...
            
            // lakukan request parameter harga
            double price = ...

            // set kolom nilai form dari objek yang telah dibuat menggunakan func set
            ...
            ...
            
            // panggil func insert pada objek yang telah dibuat
            ...

        } else if ("edit".equals(action)) {
            // (#3.7 lengkapi 5 line dibawah ini)
            // lakukan request parameter id
            int id = ...
            // lakukan request parameter nama
            String name = ...
            
            // lakukan request parameter harga
            double price = ...

            // set kolom nilai form dari objek yang telah dibuat menggunakan func set
            ...
            ...
            ...
            
            // panggil func update pada objek yang telah dibuat
            ...
        }
        
        // mengarahkan ke halaman dashboard (view.jsp)
        response.sendRedirect("...");
    }
}
