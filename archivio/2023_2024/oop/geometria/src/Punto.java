import java.util.Objects;

public class Punto {
    private int x;
    private int y;
    public Punto(){
        this.x = 0;
        this.y = 0;
    }

    public Punto(int x, int y){
        this.x = x;
        this.y = y;
    }

    /**
     * Costruttore di copia
     * @param punto Il punto che deve essere copiato
     */
    public Punto(Punto punto){
        this.x = punto.x;
        this.y = punto.y;
    }
    @Override
    public String toString(){
        return "(" + this.x + "," + this.y + ")";
    }

    /**
     * Metodo speciale che serve a confrontare se due oggetti della classe sono concettualmente uguali
     * @param o L'oggetto con il quale verrà confrontato this
     * @return true se i due oggetti sono considerati uguali, false altrimenti
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Punto punto = (Punto) o;
        return this.x == punto.x && this.y == punto.y;
    }

    /**
     * Calcola la distanza tra due punti
     * @param a il punto dal quale bisogna calcolare la distanza
     * @return La distanza euclidea tra i due punti
     */
    public double distanza(Punto a){
        return Math.sqrt (Math.pow(this.x - a.x , 2) + Math.pow(this.y - a.y , 2));
    }


}
