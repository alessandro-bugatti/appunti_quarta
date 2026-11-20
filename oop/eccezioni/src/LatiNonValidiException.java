//Il nome della classe eccezione individua il problema
//che potrebbe generarsi

public class LatiNonValidiException extends Exception {

    @Override
    public String toString(){
        return "Lati non validi";
    }
}
