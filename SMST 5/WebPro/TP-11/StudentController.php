<?php
namespace App\Http\Controllers;
use Illuminate\Http\Request;
use Illuminate\Support\Facades\Session;
class StudentController extends Controller
{
    public function index()
    {
        $students = Session::get('mahasiswa', []);
        $totalStudents = count($students);
        return view('student.index', compact('students', 'totalStudents'));
    }
    public function create()
    {
        return view('student.create');
    }
    public function store(Request $request)
    {
        $validated = $request->validate([
            'nama' => 'required|string',
            'nim' => 'required|numeric|digits:12',
            'web' => 'required|numeric|between:0,100',
            'mobile' => 'required|numeric|between:0,100',
            'project' => 'required|numeric|between:0,100',
        ]);
        $student = [
            'nama' => $validated['nama'],
            'nim' => $validated['nim'],
            'nilai' => [
                'Pemrograman Web' => $validated['web'],
                'Pemrograman Perangkat Bergerak' => $validated['mobile'],
                'Manajemen Proyek' => $validated['project'],
            ]
        ];
        Session::push('mahasiswa', $student);
        return redirect()->route('student.index')->with('success', 'Data berhasil disimpan!');
    }
}