package net.imparando.alberi;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Questa classe ha visibilità completa solo per la classe Albero
 * che si trova nello stesso package, le classi al di fuori,
 * come il main, non possono vederla
 */
class Nodo {
    int info;
    LinkedList<Nodo> figli;

    Nodo(int info) {
        this.info = info;
        figli = new LinkedList<>();
    }

}
