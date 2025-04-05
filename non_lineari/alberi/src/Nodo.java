import java.util.LinkedList;

public class Nodo {
    int info;
    LinkedList<Nodo> figli;

    Nodo (int info){
        this.info=info;
        this.figli=new LinkedList<>();
    }
}
