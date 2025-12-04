<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;
use App\Models\Makanan;

class MakananController extends Controller
{
    public function index()
    {
        $makanans = Makanan::all();
        return view('home', ['makanans' => $makanans]);
    }

    public function createView()
    {
        return view('create');
    }

    public function store(Request $request)
    {
        $request->validate([
            'nama_makanan' => 'required',
            'harga' => 'required|numeric',
            'deskripsi' => 'required',
            'stock' => 'required|numeric'
        ]);

        Makanan::create([
            'nama_makanan' => $request->nama_makanan,
            'harga' => $request->harga,
            'deskripsi' => $request->deskripsi,
            'stock' => $request->stock
        ]);

        return redirect('/')->with('success', 'Data berhasil ditambahkan');
    }
}