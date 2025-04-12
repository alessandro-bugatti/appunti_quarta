public class AlberoBinario {
    Nodo root;
    int n_items;

    public AlberoBinario(int n) {
        root = new Nodo(n);
        n_items++;
    }

    private boolean addR (Nodo n, int v){
        if(v == n.info){
            return false;
        }
        if(v < n.info){
            if(n.sx == null){
                n.sx = new Nodo(v);
                n_items ++;
                return true;
            } else{
                return addR(n.sx, v);
            }
        }
        else{
            if(n.dx == null){
                n.dx = new Nodo(v);
                n_items ++;
                return true;
            } else{
                return addR(n.dx, v);
            }
        }
    }

    public boolean add(int v){

    }
}
