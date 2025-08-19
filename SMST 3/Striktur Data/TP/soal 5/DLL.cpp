#include "dll.h"

// Buat node baru
Node* createNode(int val) {
    Node* newNode = new Node();
    newNode->data = val;
    newNode->next = NULL;
    return newNode;
}

// Tambahkan node di akhir list
void append(Node** head, int val) {
    Node* newNode = createNode(val);
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

// Print list
void printList(Node* head) {
    while (head != NULL) {
        cout << head->data << " -> ";
        head = head->next;
    }
    cout << "NULL\n";
}

// Reverse linked list
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

// Tambah dua linked list
Node* addTwoLists(Node* l1, Node* l2) {
    // Balikkan biar mulai dari digit terakhir
    l1 = reverseList(l1);
    l2 = reverseList(l2);

    Node* result = NULL;
    int carry = 0;

    while (l1 != NULL || l2 != NULL || carry > 0) {
        int sum = carry;
        if (l1 != NULL) {
            sum += l1->data;
            l1 = l1->next;
        }
        if (l2 != NULL) {
            sum += l2->data;
            l2 = l2->next;
        }

        append(&result, sum % 10);
        carry = sum / 10;
    }

    // Balik lagi biar format sama
    result = reverseList(result);
    return result;
}
