import net.imparando.*;

public class Main {
    static void datiStub(Banca b){
        b.creaConto("Piero", "Paletti");
        b.creaConto("Silvia", "Ardicci");
        b.creaConto("Luisa", "Perloni");

    }
    public static void main(String[] args) {
       Banca b = new Banca();
       datiStub(b);
       System.out.println(b.numeroConti());

    }
}