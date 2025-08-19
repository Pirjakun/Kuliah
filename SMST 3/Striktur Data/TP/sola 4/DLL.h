#ifndef DLL_H
#define DLL_H

#include <iostream>
using namespace std;

// Struktur Node untuk singly linked list
struct Node {
    char data;
    Node* next;
};

// Deklarasi fungsi
Node* createNode(char c);
void append(Node** head, char c);
Node* reverseList(Node* head);
bool isPalindrome(Node* head);
void printList(Node* head);

#endif
