<?php

use Illuminate\Support\Facades\Route;
use App\Http\Controllers\MakananController;

Route::get('/', [MakananController::class, 'index']);
Route::get('/create', [MakananController::class, 'createView']);
Route::post('/create', [MakananController::class, 'store']);