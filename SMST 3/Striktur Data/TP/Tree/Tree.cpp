#include "Tree.h"

adrNode newNode(infotype x) {
    adrNode p = new Node;
    p->info = x;
    p->left = nullptr;
    p->right = nullptr;
    return p;
}

void insertNode(adrNode &root, adrNode p) {
    if (root == nullptr) {
        root = p;
    } else if (p->info < root->info) {
        insertNode(root->left, p);
    } else {
        insertNode(root->right, p);
    }
}

void printInOrder(adrNode root) {
    if (root != nullptr) {
        printInOrder(root->left);
        cout << root->info << " ";
        printInOrder(root->right);
    }
}

adrNode mostLeftNode(adrNode root) {
    if (root == nullptr || root->left == nullptr) {
        return root;
    }
    return mostLeftNode(root->left);
}

adrNode mostRightNode(adrNode root) {
    if (root == nullptr || root->right == nullptr) {
        return root;
    }
    return mostRightNode(root->right);
}
