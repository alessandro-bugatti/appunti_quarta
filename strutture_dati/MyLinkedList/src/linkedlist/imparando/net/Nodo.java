package linkedlist.imparando.net;

class Nodo {
    int info;
    Nodo next;

    Nodo(){};

    Nodo(int n){
        this.info = n;
        this.next = null;
    }

    Nodo(int n, Nodo next){
        this.info = n;
        this.next = next;
    }
}
