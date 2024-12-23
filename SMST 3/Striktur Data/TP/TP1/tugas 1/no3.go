package main

import (
	"fmt"
)

func main() {
	var n float64
	var sum, i, average float64

	// Scan pertama sebelum masuk loop
	fmt.Scan(&n)

	if n == -999 {
		fmt.Println(0)
	} else {
		for n != -999 {
			// Tambahkan n ke sum
			sum += n
			// Hitung berapa kali user memasukkan angka
			i++

			// Minta input lagi
			fmt.Scan(&n)
		}

		// Jika tidak ada angka yang diinput (hanya -999)

		average = sum / i
		fmt.Println(average)
	}
	// Selama n bukan -999, loop akan terus berjalan

}
