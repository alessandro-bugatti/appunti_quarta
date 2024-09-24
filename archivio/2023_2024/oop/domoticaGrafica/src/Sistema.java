public class Sistema {
    private Lampadina[] lampadine;

    private int n_lampadine;

    private int max_lampadine;

    private Picture sfondo;

    /**
     * Costruttore vuoto che crea un sistema che può
     * contenere fino a 100 lampadine, attualmente senza lampadine
     */
    public Sistema(Picture p){
        this.max_lampadine = 100;
        this.lampadine = new Lampadina[this.max_lampadine];
        this.n_lampadine = 0;
        this.sfondo = p;
    }

    /**
     * Costruttore che permette di creare un sistema con
     * un numero arbitrario di lampadine compreso tra 2 e 1000
     * @param max_lampadine
     */
    public Sistema(int max_lampadine){
        this.max_lampadine = max_lampadine;
        if (this.max_lampadine <= 1 || this.max_lampadine > 1000)
            this.max_lampadine = 100;
        this.lampadine = new Lampadina[this.max_lampadine];
        this.n_lampadine = 0;
    }

    /**
     * Metodo che permette di aggiungere una lampadina al sistema
     * @param l La lampadina che verrà aggiunta
     * @return Vero se la lampadina è stata aggiunta, falso altrimenti
     */
    public boolean aggiungiLampadina(Lampadina l){
        if (this.n_lampadine == this.max_lampadine)
            return false;
        this.lampadine[this.n_lampadine] = l;
        this.n_lampadine++;
        return true;
    }

    public Lampadina cerca(String nome){
        for (int i = 0; i < this.n_lampadine; i++) {
            Lampadina l = this.lampadine[i];
            String nomeLampadina = l.getNome();
            if (nomeLampadina.equals(nome))
                return l;
        }
        return null;
    }

    @Override
    public String toString(){
        String s;
        s = "Numero di lampadine presenti nel sistema: " + this.n_lampadine + "\n";
        for (int i = 0; i < this.n_lampadine; i++) {
            s += this.lampadine[i].toString() + "\n";
        }
        return s;
    }

    public void disegna(){
        this.sfondo.draw();
        for (int i = 0; i < this.n_lampadine; i++) {
            this.lampadine[i].disegna();
        }
        Canvas.getInstance().repaint();
    }

}
