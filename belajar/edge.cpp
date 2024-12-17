#include "edge.h"

adrNode createNode(infotype data) {
    adrNode newNode = new Node;
    newNode->data = data;
    newNode->followers = 0;
    newNode->following = 0;
    newNode->firstEdge = nullptr;
    newNode->nextNode = nullptr;
    newNode->prevNode = nullptr;
    return newNode;
}

void insertLastNode(Graf &G, adrNode N) {
    if (G.firstNode == nullptr) {
        G.firstNode = N;
    } else {
        adrNode temp = G.firstNode;
        while (temp->nextNode != nullptr) {
            temp = temp->nextNode;
        }
        temp->nextNode = N;
        N->prevNode = temp;
    }
}

adrEdge createEdge(string id) {
    adrEdge newEdge = new Edge;
    newEdge->idFollowed = id;
    newEdge->nextEdge = nullptr;
    newEdge->prevEdge = nullptr;
    return newEdge;
}

void insertLastEdge(Graf &G, adrNode N, adrEdge E) {
    if (N != nullptr) {
        if (N->firstEdge == nullptr) {
            N->firstEdge = E;
        } else {
            adrEdge temp = N->firstEdge;
            while (temp->nextEdge != nullptr) {
                temp = temp->nextEdge;
            }
            temp->nextEdge = E;
            E->prevEdge = temp;
        }
    } else {
        cout << "Node tidak valid!" << endl;
    }
}

adrNode findNode(Graf G, string idAkun) {
    adrNode temp = G.firstNode;
    while (temp != nullptr) {
        if (temp->data.id == idAkun) {
            return temp;
        }
        temp = temp->nextNode;
    }
    return nullptr;
}

void follow(Graf &G, string idA, string idB) {
    adrNode akunA = findNode(G, idA);
    adrNode akunB = findNode(G, idB);

    if (akunA != nullptr && akunB != nullptr) {
        adrEdge newEdge = createEdge(idB);
        insertLastEdge(G, akunA, newEdge);
        akunA->following++;
        akunB->followers++;
    } else {
        cout << "Akun tidak ditemukan!" << endl;
    }
}

void showAkun(Graf G) {
    adrNode temp = G.firstNode;
    while (temp != nullptr) {
        cout << "ID: " << temp->data.id << ", Nama: " << temp->data.nama
             << ", Followers: " << temp->followers
             << ", Following: " << temp->following << endl;
        temp = temp->nextNode;
    }
}

void showFollowing(Graf G, string id) {
    adrNode akun = findNode(G, id);
    if (akun != nullptr) {
        cout << "Akun yang diikuti oleh " << akun->data.id << ": ";
        adrEdge temp = akun->firstEdge;
        if (temp == nullptr) {
            cout << "Tidak mengikuti akun manapun.";
        } else {
            while (temp != nullptr) {
                cout << temp->idFollowed << " ";
                temp = temp->nextEdge;
            }
        }
        cout << endl;
    } else {
        cout << "Akun tidak ditemukan!" << endl;
    }
}
