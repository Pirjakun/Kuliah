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

void createList_103032330094(List &L);
address allocate_103032330094(infotype x);
void insertLast_103032330094(List &L, address P);
void printInfo_103032330094(List L);
address findMin_103032330094(List L);
void insertMiddle_103032330094(List &L, infotype value);
