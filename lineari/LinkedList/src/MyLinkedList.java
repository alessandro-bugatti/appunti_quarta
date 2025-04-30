public class MyLinkedList{
    private Nodo head;
    private int n_items;

    public MyLinkedList(){
        this.head = null;
        this.n_items = 0;
    }

    public void add(int n){
        Nodo temp = this.head;
        this.head = new Nodo(n,temp);
        this.n_items++;
    }

    /**
     * Aggiunge un elemento nella posizione indicata da index
     * @param index Posizione di inserimento, come per i vettori
     * @param n Elemento da inserire
     * @return True se l'inserimento è riuscito, False se l'indice non è valido
     */
    public boolean add(int index, int n){
        if (index < 0 || index > this.n_items){
            return false;
        } else if (index == 0){
            this.add(n);
            return true;
        }
        else{
            Nodo temp = this.head;
            for (int i = 1; i < index; i++) {
                temp = temp.next;
            }
            Nodo nodo = new Nodo(n, temp.next);
            temp.next = nodo;
            this.n_items++;
            return true;

        }
    }

    public boolean remove() {
        if (this.n_items == 0)
            return false;

        this.head = this.head.next;
        this.n_items--;

        return true;
    }

    public boolean remove(int index){
        if (index<0 || index > this.n_items-1){
            return false;
        } else if (index == 0){
            return this.remove();
        } else{
            Nodo temp = this.head;
            for (int i = 0; i < index-1; i++) {
                temp = temp.next;
            }
            Nodo t2 = temp.next;
            temp.next = t2.next;
            this.n_items--;
            return true;
        }
    }

    public int size () {
        return n_items;
    }
    
    public boolean empty () {
        return n_items == 0;
    }
    
    public int get  (int index) throws ArrayIndexOutOfBoundsException {
        if(index < 0 || index >= n_items) {
            throw new ArrayIndexOutOfBoundsException("Indice non valido");
        }
        Nodo temp = head;
        for(int i = 0; i < index; i++){
            temp = temp.next;
        }
        return temp.info;
    }

    public boolean contains(int cercato){
        Nodo temp = head;
        while (temp != null){
            if (temp.info == cercato)
                return true;
            temp = temp.next;
        }
        return false;
    }

    @Override
    public String toString(){
        if (n_items == 0)
            return "[]";
        String s = "[";
        Nodo temp = head;
        while(temp != null){
            s += temp.info + ", ";
            temp = temp.next;
        }

        return s.substring(0, s.length() - 2) + "]";
    }

    public void clear(){
        this.head = null;
        this.n_items = 0;
    }
}
