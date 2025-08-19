#include "dll.h"

// Fungsi membuat node baru
Node* createNode(char c) {
    Node* newNode = new Node();
    newNode->data = c;
    newNode->next = NULL;
    return newNode;
}

// Fungsi untuk menambahkan node di akhir linked list
void append(Node** head, char c) {
    Node* newNode = createNode(c);
    if (*head == NULL) {
        *head = newNode;
        return;
    }
    Node* temp = *head;
    while (temp->next != NULL) {
        temp = temp->next;
    }
    temp->next = newNode;
}

// Fungsi untuk reverse linked list
Node* reverseList(Node* head) {
    Node* prev = NULL;
    Node* curr = head;
    Node* nextNode = NULL;

    while (curr != NULL) {
        nextNode = curr->next;
        curr->next = prev;
        prev = curr;
        curr = nextNode;
    }

    return prev;
}

// Fungsi cek apakah linked list palindrome (tanpa stack)
bool isPalindrome(Node* head) {
    if (!head || !head->next) return true;

    // 1. Cari middle pakai slow & fast pointer
    Node* slow = head;
    Node* fast = head;
    while (fast->next != NULL && fast->next->next != NULL) {
        slow = slow->next;
        fast = fast->next->next;
    }

    // 2. Reverse bagian kedua linked list
    Node* secondHalf = reverseList(slow->next);

    // 3. Bandingkan
    Node* p1 = head;
    Node* p2 = secondHalf;
    bool palindrome = true;
    while (p2 != NULL) {
        if (p1->data != p2->data) {
            palindrome = false;
            break;
        }
        p1 = p1->next;
        p2 = p2->next;
    }

    // (Opsional) Kembalikan linked list ke bentuk semula
    slow->next = reverseList(secondHalf);

    return palindrome;
}

// Fungsi print linked list
void printList(Node* head) {
    while (head != NULL) {
        cout << head->data << " -> ";
        head = head->next;
    }
    cout << "NULL\n";
}
