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
        if (cercato == null)
            return false;
        cercato.figli.add(new Nodo(n));
        n_items++;
        return true;
    }


    private void visitaAnticipataR(Nodo n){
        System.out.print(n.info + " ");
        for (Nodo i: n.figli) {
            visitaAnticipataR(i);
        }
    }

    private void visitaDifferitaR(Nodo n){
        for (Nodo i: n.figli) {
            visitaDifferitaR(i);
        }
        System.out.print(n.info + " ");
    }

    public void visitaAnticipata() {
        if (root != null)
            visitaAnticipataR(root);
    }
    public void visitaDifferita(){
        if (root != null)
            visitaDifferitaR(root);
    }

    private int massimoR(Nodo n){
        int max=n.info;
        for(Nodo i: n.figli){
            int temp=massimoR(i);
            if(temp>max){
                max=temp;
            }
        }
        return max;
    }
    //si suppone che il nodo radice ci sia sempre
    public int massimo(){
        return massimoR(root);
    }

}
