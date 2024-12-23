#include <iostream>
#include "header.h"
using namespace std;

int main()
{
    //Soal 1-6
    List RMA;
    infotype data;
    allocate(data);
    createList(RMA);
    cout << "Masukkan digit ke-1: ";
    insertFirst(RMA,allocate(data));
    printInfo(RMA);
    cout << "Masukkan digit ke-2: ";
    insertFirst(RMA,allocate(data));
    printInfo(RMA);
    cout << "Masukkan digit ke-3: ";
    insertFirst(RMA,allocate(data));
    cout << "Contoh Penulisan Nomor 6 yang Mengisi Nilai NIM: " << endl;
    printInfo(RMA);
    cout << "" << endl;
    cout << "Sekarang Bagian Soal 7 yang Sesi Fun menggunakan procedure insertLast" << endl;
    cout << "Sekarang Pemasukan NIM dari Insert Last " << endl;
    cout << "Masukkan nilai digit nim anda " << endl;
    createList(RMA);
    for (int i = 1; i <= 12; i++) {
        cout << "Digit " << i << ": ";
        InsertLast(RMA,allocate(data));
    }
    cout << "Isi NIM: ";
    printInfo2(RMA);





}
