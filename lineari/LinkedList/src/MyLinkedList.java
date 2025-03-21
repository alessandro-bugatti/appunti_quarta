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

    @Override
    public String toString(){
        String s = "";
        Nodo temp = head;
        while(temp != null){
            s += temp.info + " ";
            temp = temp.next;
        }
        return s;
    }
}
