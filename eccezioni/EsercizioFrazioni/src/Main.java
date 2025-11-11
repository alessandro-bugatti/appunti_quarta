//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)  {
        try {
            Frazione a = new Frazione(1, 0);
            Frazione b = new Frazione(3, 4);

            Frazione c = a.somma(b);
        }catch (DenominatoreNonValido d){
            System.out.println("L'errore è :" + d);
            System.out.println("Il numeratore della frazione problematica è " + d.getNumeratore());
            System.out.println("C'è un problema con il denominatore di una frazione");
        }
    }
}