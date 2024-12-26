#ifndef TREE_H
#define TREE_H

#include <iostream>
using namespace std;

typedef int infotype;

struct Node {
    infotype info;
    Node *left;
    Node *right;
};

typedef Node* adrNode;

adrNode newNode(infotype x);
void insertNode(adrNode &root, adrNode p);
void printInOrder(adrNode root);
adrNode mostLeftNode(adrNode root);
adrNode mostRightNode(adrNode root);

#endif
