#include <iostream>
#include "list.h"

using namespace std;

void createList_103032330094(List &L) {
    first(L) = NULL;
}

address allocate_103032330094(infotype x) {
    address P = new elmtList;
    info(P) = x;
    next(P) = NULL;
    return P;
}

void insertLast_103032330094(List &L, address P) {
    if (L.first == NULL) {
        L.first = P;
    } else {
        address last = L.first;
        while (next(last) != NULL) {
            last = next(last);
        }
        next(last) = P;
    }
}

void printInfo_103032330094(List L) {
    address P = L.first;
    while (P != NULL) {
        cout << info(P) << " ";
        P = next(P);
    }
    cout << endl;
}

address findMin_103032330094(List L) {
    if (L.first == NULL) return NULL;
    address minAddress = L.first;
    address current = L.first->next;

    while (current != NULL) {
        if (info(current) < info(minAddress)) {
            minAddress = current;
        }
        current = next(current);
    }
    return minAddress;
}

void insertMiddle_103032330094(List &L, infotype value) {
    address newNode = allocate_103032330094(value);
    if (L.first == NULL) {
        L.first = newNode;
        return;
    }

    int length = 0;
    address current = L.first;

    while (current != NULL) {
        length++;
        current = next(current);
    }

    int midIndex = length / 2;
    current = L.first;

    for (int i = 0; i < midIndex - 1; i++) {
        current = next(current);
    }

    newNode->next = current->next;
    current->next = newNode;
}
