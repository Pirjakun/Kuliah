#include <iostream>
using namespace std;

int main() {
    int a, b, c;
    int *p1, *p2, *p3;

    // Baris 1-3
    a = 17;
    b = 8;
    c = 45;
    cout << "Baris 1-3: a=" << a << " b=" << b << " c=" << c << endl;

    // Baris 4
    p2 = &a;
    cout << "Baris 4: *p2=" << *p2 << endl;

    // Baris 5
    p3 = &a;
    cout << "Baris 5: *p3=" << *p3 << endl;

    // Baris 6
    p1 = &c;
    cout << "Baris 6: *p1=" << *p1 << endl;

    // Baris 7
    b = *p2;
    cout << "Baris 7: b=" << b << endl;

    // Baris 8
    *p2 = c;
    cout << "Baris 8: a=" << a << " *p2=" << *p2 << endl;

    // Baris 9
    a = 80;
    cout << "Baris 9: a=" << a << endl;

    // Baris 10
    *p3 = *p1;
    cout << "Baris 10: a=" << a << " *p3=" << *p3 << endl;

    // Baris 11
    *p1 = *p3;
    cout << "Baris 11: c=" << c << " *p1=" << *p1 << endl;

    // Baris 12
    *p3 = 60;
    cout << "Baris 12: a=" << a << " *p3=" << *p3 << endl;

    // Hasil akhir
    cout << "\n=== Hasil Akhir ===" << endl;
    cout << "a = " << a << endl;
    cout << "b = " << b << endl;
    cout << "c = " << c << endl;
    cout << "*p1 = " << *p1 << endl;
    cout << "*p2 = " << *p2 << endl;
    cout << "*p3 = " << *p3 << endl;

    return 0;
}
