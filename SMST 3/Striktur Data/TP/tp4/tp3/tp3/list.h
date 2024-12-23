#include <iostream>
#define first(L) L.first
#define next(P) P->next
#define info(P) P->info

using namespace std;
typedef int infotype;
typedef struct elmtList *address;

struct elmtList {
    infotype info;
    address next;
};

struct List {
    address first;
};

void createList(List &L);

address allocate(infotype X);

void insertFirst(List &L, address P);

void insertLast(List &L, address P);

void deleteLast(List &L);

void deleteAfter(List &L, address P);

address searchInfo(List L, infotype x);

void printInfo(List L);
