#include <iostream>

using namespace std;

int main()
{
    float n, sum, i, hasil;
    cin >> n ;

    if (n==-999){
        cout << 0;
    }else{
        while (n != -999){
            sum+=n;
            i++;
            cin >>n;
        }
        hasil = sum/i;
        cout << hasil <<endl;
    }

    return 0;
}
