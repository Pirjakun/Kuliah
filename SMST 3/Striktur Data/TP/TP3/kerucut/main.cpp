#include <iostream>
#include <cmath>
using namespace std;

class Kerucut {

    double radius;
    double tinggi;

    double hitungVolume() {
        return (M_PI * radius * radius * tinggi) / 3;
    }

    double hitungLuas() {
        double s = sqrt((radius * radius) + (tinggi * tinggi));
        return (M_PI * radius * (radius + s));
    }

public:

    void setData(double r, double t) {
        radius = r;
        tinggi = t;
    }


    void tampilkanInfo() {
        cout << "Radius: " << radius << endl;
        cout << "Tinggi: " << tinggi << endl;
        cout << "Volume: " << hitungVolume() << endl;
        cout << "Luas Permukaan: " << hitungLuas() << endl;
    }
};

int main() {
    Kerucut k;

    k.setData(9, 19);
    k.tampilkanInfo();

    return 0;
}
