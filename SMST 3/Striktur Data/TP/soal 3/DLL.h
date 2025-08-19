#ifndef DLL_H_INCLUDED
#define DLL_H_INCLUDED
#include <iostream>
using namespace std;

struct Infotype {
    int nomor_antrean;
    string nama;
    int usia;
    string kategori; // "Lansia", "Nakes", "Umum"
};

struct ElmQueue {
    Infotype info;
    ElmQueue *next;
    ElmQueue *prev;
};

struct Queue {
    ElmQueue *head;
    ElmQueue *tail;
};

#define info(P) (P)->info
#define next(P) (P)->next
#define prev(P) (P)->prev
#define head(Q) (Q).head
#define tail(Q) (Q).tail

void createQueue_103032330094(Queue &Q);
void createNewElmt_103032330094(Infotype X, ElmQueue* &P);
void enqueue_103032330094(Queue &Q, ElmQueue *P);
void dequeue_103032330094(Queue &Q, ElmQueue* &P);
void printQueue_103032330094(Queue Q);

#endif
