<?php

namespace App\Http\Controllers;

use App\Models\Book;
use Illuminate\Http\Request;

class BookController extends Controller
{
    public function index()
    {
        $books = Book::all();
        return view('index', compact('books'));
    }

    public function store(Request $request)
    {
        $request->validate([
            'title' => 'required',
            'author' => 'required',
            'published_year' => 'required|integer',
        ]);

        Book::create($request->all());

        return redirect()->route('books.index')
            ->with('success', 'Book added successfully.');
    }

    // paramter fungsi dapat diubah sesuai dengan kebutuhan anda
    public function edit(Book $book)
    {
        // lengkapi fungsi ini
        return view('edit', compact('book'));
    }

    // paramter fungsi dapat diubah sesuai dengan kebutuhan anda
    public function update(Request $request, Book $book)
    {
        // lengkapi fungsi ini
        $request->validate([
            'title' => 'required',
            'author' => 'required',
            'published_year' => 'required|integer',
            'status' => 'required|in:available,checkout',
        ]);

        $book->update($request->all());

        return redirect()->route('books.index')->with('success', 'Book updated successfully.');
    }

    // paramter fungsi dapat diubah sesuai dengan kebutuhan anda
    public function destroy(Book $book)
    {
        // lengkapi fungsi ini
        $book->delete();

        return redirect()->route('books.index')->with('success', 'Book deleted successfully');
    }
}
