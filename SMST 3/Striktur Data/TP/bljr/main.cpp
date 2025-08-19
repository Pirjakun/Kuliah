#include <iostream>
using namespace std;

int main() {
    int x, y, z;
    int *p1, *p2, *p3;

    x = 23;
    y = 48;
    p2 = &z;
    p1 = p2;
    x = 11;
    p1 = &x;
    y = *p1;
    p3 = &x;
    *p2 = 5;

    cout << "x = " << x << endl;
    cout << "y = " << y << endl;
    cout << "z = " << z << endl;
    cout << "p1 menunjuk ke alamat " << p1 << " dengan nilai " << *p1 << endl;
    cout << "p2 menunjuk ke alamat " << p2 << " dengan nilai " << *p2 << endl;
    cout << "p3 menunjuk ke alamat " << p3 << " dengan nilai " << *p3 << endl;

    return 0;
}
