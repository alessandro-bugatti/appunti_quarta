import java.util.Random;
public class Dado {
    private int facce;
    private int ultimoLancio = -1;
    private int contatore = 0;
    private int somma = 0;

    public Dado(){
        this.facce = 6;
    }
    public Dado(int n){
        if (n < 2 || n == 3){
            this.facce = 6;
        } else {
            this.facce = n;
        }
    }
    public Dado(Dado d){
        this.facce = d.facce;
    }
    public int lancia(){
        Random r = new Random();
        this.ultimoLancio = r.nextInt(facce) + 1;
        this.contatore ++;
        this.somma += this.ultimoLancio;
        return this.ultimoLancio;
    }

    public int getUltimoLancio(){
        return this.ultimoLancio;
    }

    @Override
    public String toString(){
        return "Dado con " + facce + " facce. Finora sono stati fatti "
                + contatore + " lanci e la loro somma è " + somma;
    }
}
