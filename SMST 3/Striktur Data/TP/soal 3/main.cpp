#include "DLL.h"

int main() {
    Queue Q;
    createQueue_103032330094(Q);

    Infotype X;
    ElmQueue *P;

    // Data input manual
    X = {1, "Budi", 70, "Lansia"};
    createNewElmt_103032330094(X, P);
    enqueue_103032330094(Q, P);

    X = {2, "Ani", 30, "Umum"};
    createNewElmt_103032330094(X, P);
    enqueue_103032330094(Q, P);

    X = {3, "Siti", 40, "Nakes"};
    createNewElmt_103032330094(X, P);
    enqueue_103032330094(Q, P);

    X = {4, "Joko", 65, "Lansia"};
    createNewElmt_103032330094(X, P);
    enqueue_103032330094(Q, P);

    printQueue_103032330094(Q);

    cout << "Proses dequeue (pemanggilan vaksin):" << endl;
    dequeue_103032330094(Q, P);
    if (P != NULL) {
        cout << "Dipanggil: " << info(P).nama << " (" << info(P).kategori << ")" << endl;
    }

    printQueue_103032330094(Q);

    return 0;
}
