public class Orario implements Comparable{
    private int ore, minuti, secondi;

    public Orario(int ore, int minuti, int secondi) {
        this.ore = ore;
        this.minuti = minuti;
        this.secondi = secondi;
    }



    @Override
    public String toString() {
        return ore +
                ":" + minuti +
                ":" + secondi;
    }

    @Override
    public int compareTo(Object o) {
        Orario orario = (Orario) o;
        if (this.ore < orario.ore) return -1;
        if (this.ore > orario.ore) return 1;
        if (this.minuti < orario.minuti) return -1;
        if (this.minuti > orario.minuti) return 1;
        return (this.secondi - orario.secondi);
    }
}
