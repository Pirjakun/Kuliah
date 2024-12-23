#include <iostream>
#include "list.h"
using namespace std;

int main() {
List L;
    createList(L);
    int input;

    cout << "Masukkan NIM perdigit" << endl;

    for (int i = 1; i <= 10; i++) {
        cout << "Digit " << i << " : ";
        cin >> input;

        address P = allocate(input);
        insertLast(L, P);
    }

    cout << "Isi list : ";
    printInfo(L);

    return 0;
}
