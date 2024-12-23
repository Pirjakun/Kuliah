#include <iostream>
#include "header.h"

using namespace std;

int main() {
    List L;
    createList_103032330094(L);
    int choice;

    do {
        cout << "======MENU=======\n";
        cout << "1. Menambah N data baru\n";
        cout << "2. Menampilkan semua data\n";
        cout << "3. Menemukan nilai terkecil\n";
        cout << "4. Menyisipkan data di tengah\n";
        cout << "0. Exit\n";
        cout << "Masukkan menu : ";
        cin >> choice;

        switch (choice) {
            case 1: {
                int n;
                cout << "Jumlah data yang akan ditambahkan: ";
                cin >> n;

                for (int i = 0; i < n; i++) {
                    infotype data;
                    cout << "Masukkan data baru: ";
                    cin >> data;
                    address P = allocate_103032330094(data);
                    insertLast_103032330094(L, P);
                }
                break;
            }
            case 2:
                cout << "Isi list: ";
                printInfo_103032330094(L);
                break;
            case 3: {
                address minAddress = findMin_103032330094(L);
                if (minAddress != NULL) {
                    cout << "Nilai terkecil: " << info(minAddress) << endl;
                } else {
                    cout << "List kosong." << endl;
                }
                break;
            }
            case 4: {
                infotype value;
                cout << "Masukkan nilai untuk disisipkan di tengah: ";
                cin >> value;
                insertMiddle_103032330094(L, value);
                break;
            }
            case 0:
                cout << "ANDA TELAH KELUAR DARI PROGRAM\n";
                break;
            default:
                cout << "Pilihan tidak valid. Silakan coba lagi.\n";
                break;
        }

    } while (choice != 0);

    return 0;
}
