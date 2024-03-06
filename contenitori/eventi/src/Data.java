public class Data implements Comparable {
    private int giorno;
    private int mese;
    private int anno;

    public Data(int giorno, int mese, int anno) {
        this.giorno = giorno;
        this.mese = mese;
        this.anno = anno;
    }

    @Override
    public String toString() {
        return "" + giorno +
                "-" + mese +
                "-" + anno ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Data data = (Data) o;

        if (giorno != data.giorno) return false;
        if (mese != data.mese) return false;
        return anno == data.anno;
    }

    @Override
    public int hashCode() {
        int result = giorno;
        result = 31 * result + mese;
        result = 31 * result + anno;
        return result;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
