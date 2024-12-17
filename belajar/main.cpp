#include "edge.h"

int main() {
    Graf G;
    G.firstNode = nullptr;

    infotype data1 = {"lovelySun", "Chika"};
    infotype data2 = {"gummyS", "Ghea"};
    infotype data3 = {"jake123", "Jaka"};

    insertLastNode(G, createNode(data1));
    insertLastNode(G, createNode(data2));
    insertLastNode(G, createNode(data3));

    cout << "Daftar Akun:" << endl;
    showAkun(G);

    follow(G, "gummyS", "lovelySun");
    follow(G, "jake123", "lovelySun");
    follow(G, "jake123", "gummyS");

    cout << "\nDaftar Akun Setelah Follow:" << endl;
    showAkun(G);

    cout << "\nAkun yang diikuti oleh ID lovelySun:" << endl;
    showFollowing(G, "lovelySun");

    cout << "Akun yang diikuti oleh ID gummyS:" << endl;
    showFollowing(G, "gummyS");

    cout << "Akun yang diikuti oleh ID jake123:" << endl;
    showFollowing(G, "jake123");

    return 0;
}
