#include "dll.h"

int main() {
    Node* l1 = NULL;
    Node* l2 = NULL;
    string num1, num2;

    cout << "Masukkan angka pertama: ";
    cin >> num1;

    cout << "Masukkan angka kedua: ";
    cin >> num2;

    // Buat linked list dari angka pertama
    for (char c : num1) {
        if (isdigit(c)) append(&l1, c - '0');
    }

    // Buat linked list dari angka kedua
    for (char c : num2) {
        if (isdigit(c)) append(&l2, c - '0');
    }

    cout << "\nLinked List 1: ";
    printList(l1);

    cout << "Linked List 2: ";
    printList(l2);

    Node* result = addTwoLists(l1, l2);

    cout << "\nHasil Penjumlahan: ";
    printList(result);

    return 0;
}
