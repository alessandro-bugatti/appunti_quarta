//Il nome della classe eccezione individua il problema
//che potrebbe generarsi

public class LatiNonValidiException extends Exception {
    private String messaggio;

    public LatiNonValidiException(String messaggio){
        this.messaggio = messaggio;
    }

    @Override
    public String toString(){
        return "Lati non validi: " + this.messaggio;
    }
}
