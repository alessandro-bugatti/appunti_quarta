public class Albero {
    Nodo root;
    int n_items;
    public Albero(){
        root=null;
        n_items=0;
    }
    public Albero(int n){
        root=new Nodo(n);
        n_items=1;
    }
    private Nodo cercaNodo(int cercato,Nodo n){
        if (n==null){
            return null;
        }
        if(n.info==cercato){
            return n;
        }
        for(Nodo figlio: n.figli){
            Nodo trovato= cercaNodo(cercato, figlio);
            if (trovato!= null){
                return trovato;
            }
        }
        return null;
    }
    public boolean add(int n, int padre){
        Nodo cercato=cercaNodo(padre,root);
    }
}
