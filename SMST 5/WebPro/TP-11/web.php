<?php

use Illuminate\Support\Facades\Route;
use App\Http\Controllers\StudentController; 


Route::get('/', function () {
    return redirect()->route('student.index');
});


Route::controller(StudentController::class)->group(function () {
    Route::get('/student', 'index')->name('student.index');
    Route::get('/student/create', 'create')->name('student.create');
    Route::post('/student', 'store')->name('student.store');
});