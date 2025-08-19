#include "dll.h"

int main() {
    Node* head = NULL;
    string input;

    cout << "Masukkan kata: ";
    cin >> input;

    // Buat linked list dari string input
    for (char c : input) {
        append(&head, c);
    }

    cout << "Linked List: ";
    printList(head);

    if (isPalindrome(head))
        cout << "Output: true (Palindrome)\n";
    else
        cout << "Output: false (Bukan Palindrome)\n";

    return 0;
}
