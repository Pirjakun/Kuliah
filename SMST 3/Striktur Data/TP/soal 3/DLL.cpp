#include "DLL.h"

void createQueue_103032330094(Queue &Q) {
    head(Q) = NULL;
    tail(Q) = NULL;
}

void createNewElmt_103032330094(Infotype X, ElmQueue* &P) {
    P = new ElmQueue;
    info(P) = X;
    next(P) = NULL;
    prev(P) = NULL;
}

void enqueue_103032330094(Queue &Q, ElmQueue *P) {
    if (head(Q) == NULL) {
        head(Q) = P;
        tail(Q) = P;
    } else {
        // aturan prioritas: Lansia > Nakes > Umum
        ElmQueue *Qtemp = head(Q);
        while (Qtemp != NULL) {
            if ((info(P).kategori == "Lansia" && info(Qtemp).kategori != "Lansia") ||
                (info(P).kategori == "Nakes" && info(Qtemp).kategori == "Umum")) {
                // sisip sebelum Qtemp
                if (Qtemp == head(Q)) {
                    next(P) = Qtemp;
                    prev(Qtemp) = P;
                    head(Q) = P;
                } else {
                    prev(P) = prev(Qtemp);
                    next(P) = Qtemp;
                    next(prev(Qtemp)) = P;
                    prev(Qtemp) = P;
                }
                return;
            }
            Qtemp = next(Qtemp);
        }
        // kalau tidak ada prioritas, taruh di belakang
        next(tail(Q)) = P;
        prev(P) = tail(Q);
        tail(Q) = P;
    }
}

void dequeue_103032330094(Queue &Q, ElmQueue* &P) {
    if (head(Q) == NULL) {
        P = NULL;
        cout << "Queue kosong" << endl;
    } else {
        P = head(Q);
        head(Q) = next(head(Q));
        if (head(Q) != NULL) {
            prev(head(Q)) = NULL;
        } else {
            tail(Q) = NULL;
        }
        next(P) = NULL;
        prev(P) = NULL;
    }
}

void printQueue_103032330094(Queue Q) {
    ElmQueue *P = head(Q);
    cout << "Daftar antrean vaksinasi:" << endl;
    while (P != NULL) {
        cout << info(P).nomor_antrean << " | "
             << info(P).nama << " | "
             << info(P).usia << " tahun | "
             << info(P).kategori << endl;
        P = next(P);
    }
    cout << endl;
}
