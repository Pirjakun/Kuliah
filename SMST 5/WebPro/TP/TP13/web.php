<?php

use App\Http\Controllers\BookController;
use Illuminate\Support\Facades\Route;

Route::get('/', [BookController::class, 'index'])->name('books.index');
Route::post('/books', [BookController::class, 'store'])->name('books.store');

//Bikin routes untuk ke halaman edit. URL dapat berupa "/books/{book}/edit"
Route::get('/books/{book}/edit', [BookController::class, 'edit'])->name('books.edit');
//Bikin routes untuk melakukan update. URL dapat berupa "/books/{book}"
Route::put('/books/{book}', [BookController::class, 'update'])->name('books.update');
//Bikin routes untuk hapus. URL dapat berupa "/books/{book}"
Route::delete('/books/{book}', [BookController::class, 'destroy'])->name('books.destroy');