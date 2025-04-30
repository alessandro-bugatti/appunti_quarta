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
        return false;
    }

    private int altezzaR(Nodo n){
        if (n == null)
            return 0;
        int alt_destra = altezzaR(n.dx);
        int alt_sinistra = altezzaR(n.sx);
        if (alt_destra > alt_sinistra)
            return 1 + alt_destra;
        else
            return 1 + alt_sinistra;
    }

    public int altezza(){
        return altezzaR(root) - 1;
    }
}
