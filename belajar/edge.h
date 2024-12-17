#ifndef GRAF_H_INCLUDED
#define GRAF_H_INCLUDED

#include <iostream>
#include <string>
using namespace std;

typedef struct Node *adrNode;
typedef struct Edge *adrEdge;


struct infotype {
    string id;
    string nama;
};

struct Edge {
    string idFollowed;
    adrEdge nextEdge;
    adrEdge prevEdge;
};

struct Node {
    infotype data;
    int followers;
    int following;
    adrEdge firstEdge;
    adrNode nextNode;
    adrNode prevNode;
};


struct Graf {
    adrNode firstNode;
};

adrNode createNode(infotype data);
void insertLastNode(Graf &G, adrNode N);
adrEdge createEdge(string id);
void insertLastEdge(adrNode N, adrEdge E);
adrNode findNode(Graf G, string idAkun);
void follow(Graf &G, string idA, string idB);
void showAkun(Graf G);
void showFollowing(Graf G, string id);

#endif // GRAF_H_INCLUDED
