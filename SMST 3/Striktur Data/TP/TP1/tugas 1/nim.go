package main

import (
	"fmt"
)

const nMax = 51

// Definisi struct mahasiswa
type Mahasiswa struct {
	NIM   string
	Nama  string
	Nilai int
}

// Tipe data arrayMahasiswa
type ArrayMahasiswa [nMax]Mahasiswa

// Fungsi untuk mencari nilai pertama berdasarkan NIM
func nilaiPertama(T ArrayMahasiswa, N int, NIM string) int {
	for i := 0; i < N; i++ {
		if T[i].NIM == NIM {
			return T[i].Nilai
		}
	}
	return -1 // NIM tidak ditemukan
}

func main() {
	// Contoh data mahasiswa
	var mahasiswa ArrayMahasiswa
	var N int

	// Menambahkan data mahasiswa
	mahasiswa[0] = Mahasiswa{"114", "Nana", 97}
	mahasiswa[1] = Mahasiswa{"113", "Jojo", 70}
	mahasiswa[2] = Mahasiswa{"118", "Rere", 88}
	mahasiswa[3] = Mahasiswa{"116", "Koko", 40}
	mahasiswa[4] = Mahasiswa{"117", "Keke", 90}
	mahasiswa[5] = Mahasiswa{"116", "Koko", 60}
	mahasiswa[6] = Mahasiswa{"113", "Jojo", 50}
	mahasiswa[7] = Mahasiswa{"113", "Jojo", 80}
	mahasiswa[8] = Mahasiswa{"118", "Rere", 88}
	mahasiswa[9] = Mahasiswa{"119", "Roro", 100}

	N = 10 // Jumlah data mahasiswa yang ada

	// Minta input NIM dari pengguna
	var nimToFind string
	fmt.Print("Masukkan NIM yang ingin dicari: ")
	fmt.Scan(&nimToFind)

	// Mencari nilai pertama untuk NIM yang dimasukkan
	nilai := nilaiPertama(mahasiswa, N, nimToFind)

	if nilai != -1 {
		fmt.Printf("Nilai pertama mahasiswa dengan NIM %s adalah %d\n", nimToFind, nilai)
	} else {
		fmt.Printf("NIM %s tidak ditemukan.\n", nimToFind)
	}
}
