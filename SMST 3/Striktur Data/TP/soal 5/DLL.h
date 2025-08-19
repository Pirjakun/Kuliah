#ifndef DLL_H
#define DLL_H

#include <iostream>
using namespace std;

// Struktur Node
struct Node {
    int data;
    Node* next;
};

// Deklarasi fungsi
Node* createNode(int val);
void append(Node** head, int val);
void printList(Node* head);

Node* reverseList(Node* head);
Node* addTwoLists(Node* l1, Node* l2);

#endif
