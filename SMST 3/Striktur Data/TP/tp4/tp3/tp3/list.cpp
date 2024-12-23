#include <iostream>
#include "list.h"

using namespace std;

void createList(List &L) {
    first(L) = NULL;
}


address allocate(infotype x) {

    address P = new elmtList;
    info(P) = x;
    next(P) = NULL;

    return P;
}

void insertFirst(List &L, address P) {
    next(P) = first(L);
    first(L)= P;
}

void insertLast(List &L, address P) {
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


void deleteLast(List &L) {
    if (L.first == NULL) return;
    if (next(L.first) == NULL) {
        L.first = NULL;
        return;
    }
    address secondLast = L.first;
    while (next(secondLast)->next != NULL) {
        secondLast = next(secondLast);
    }
    next(secondLast) = NULL;
}

void deleteAfter(List &L, address P) {
    if (P != NULL && next(P) != NULL) {
        address temp = next(P);
        next(P) = next(temp);
        delete temp;
    }
}


address searchInfo(List L, infotype x) {
    address P = L.first;
    while (P != NULL) {
        if (info(P) == x) {
            return P;
        }
        P = next(P);
    }
    return NULL;
}


void printInfo(List L) {
    address P = L.first;
    while (P != NULL) {
        cout << info(P) << "";
        P = next(P);
    }
    cout << endl;
}
