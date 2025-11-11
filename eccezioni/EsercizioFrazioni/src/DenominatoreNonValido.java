public class DenominatoreNonValido extends Exception{
    private String messaggio;
    private int numeratore;
    public DenominatoreNonValido(String messaggio, int numeratore){
        this.messaggio = messaggio;
        this.numeratore = numeratore;
    }

    public int getNumeratore(){
        return this.numeratore;
    }
    @Override
    public String toString(){
        return  messaggio;
    }
}
