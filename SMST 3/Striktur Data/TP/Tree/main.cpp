#include "Tree.h"

int main() {
    adrNode root = nullptr;

    int nodes[] = {8, 9, 12, 13, 15, 17, 7, 6, 4};
    cout << "Node yang dimasukkan: ";
    for (int i = 0; i < 9; i++) {
        cout << nodes[i] << " ";
        adrNode p = newNode(nodes[i]);
        insertNode(root, p);
    }
    cout << endl;

    cout << "In-order traversal: ";
    printInOrder(root);
    cout << endl;

    adrNode leftNode = mostLeftNode(root);
    if (leftNode != nullptr) {
        cout << "Most left node: " << leftNode->info << endl;
    } else {
        cout << "Most left node: (tree kosong)" << endl;
    }

    adrNode rightNode = mostRightNode(root);
    if (rightNode != nullptr) {
        cout << "Most right node: " << rightNode->info << endl;
    } else {
        cout << "Most right node: (tree kosong)" << endl;
    }

    return 0;
}
